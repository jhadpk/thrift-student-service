package com.inmobi.thriftself.service.module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Names;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.inmobi.thriftself.service.configuration.Configuration;
import com.inmobi.thriftself.service.dao.impl.AbstractDaoImpl;
import com.inmobi.thriftself.service.dao.impl.CourseDaoImpl;
import com.inmobi.thriftself.service.dao.impl.StudentDaoImpl;
import com.inmobi.thriftself.service.serviceImpl.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;


@RequiredArgsConstructor
@Slf4j
public class StudentModule extends AbstractModule {

    private final Configuration configuration;

    @Override
    protected void configure() {
        final JpaPersistModule jpaPersistModule = getJpaPersistModule(configuration);
        install(jpaPersistModule);
        bind(PersistenceInitializer.class).asEagerSingleton();
        bind(AbstractDaoImpl.class).annotatedWith(Names.named("StudentsDao")).to(StudentDaoImpl.class);
        bind(AbstractDaoImpl.class).annotatedWith(Names.named("CoursesDao")).to(CourseDaoImpl.class);
        bind(StudentService.class).asEagerSingleton();
    }

    private JpaPersistModule getJpaPersistModule(final Configuration configuration) {
        final JpaPersistModule jpaPersistModule = new JpaPersistModule("DBConfigurationMapping");

        final Map<String, String> properties = new HashMap<>();
        properties.put("hibernate.connection.url",
                "jdbc:postgresql://" + configuration.getHost() + ":" + configuration.getPort()
                        + "/" + configuration.getDbName() + "?stringtype=unspecified");

        properties.put("hibernate.connection.username", configuration.getUsername());
        properties.put("hibernate.connection.password", configuration.getPassword());

        log.debug("DB properties : `{}`", properties);
        jpaPersistModule.properties(properties);
        return jpaPersistModule;
    }

    @SuppressWarnings("unused")
    static class PersistenceInitializer {
        private final PersistService persistService;

        @Inject
        PersistenceInitializer(final PersistService persistService) {
            this.persistService = persistService;
        }

        @PostConstruct
        public void start() {
            persistService.start();
        }

        @PreDestroy
        public void stop() {
            persistService.stop();
        }
    }

}

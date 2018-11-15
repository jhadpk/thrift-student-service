package com.inmobi.thriftself.service.server;

import com.google.common.collect.Maps;
import com.inmobi.indis.core.CliService;
import com.inmobi.indis.core.ServiceBuilder;
import com.inmobi.indis.core.module.CliLifecycleControllerModule;
import com.inmobi.indis.recipes.ThriftHttpNettyServiceRecipe;
import com.inmobi.indis.recipes.internal.ServiceInfo;
import com.inmobi.indis.thrift.module.ThriftServiceContext;
import com.inmobi.thriftself.service.configuration.Configuration;
import com.inmobi.thriftself.service.handler.StudentHandler;
import com.inmobi.thriftself.service.module.StudentModule;
import com.inmobi.thriftself.thrift.models.TStudentService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;


@Slf4j
public class Server {

    private static final String SERVICE_PATH = "/studentService/";


    private static ServiceBuilder createServiceBuilder(final Configuration configuration) {
        final ThriftHttpNettyServiceRecipe thriftRecipe = new ThriftHttpNettyServiceRecipe();
        final ServiceInfo serviceInfo = getServiceInfo();

        thriftRecipe.serviceInfo(serviceInfo);
        thriftRecipe.addModules(new StudentModule(configuration));
        thriftRecipe.mainPURecipe().handlerRecipe().addPathToServiceCtxMap(getPathServiceMap());
        return thriftRecipe.cook();
    }


    private static ServiceInfo getServiceInfo() {
        return new ServiceInfo("thrift-self", "1.0", "localhost", 9090, 9091);
    }


    private static Map<String, ThriftServiceContext<?>> getPathServiceMap() {
        Map<String, ThriftServiceContext<?>> pathToServiceContext = Maps.newHashMap();
        pathToServiceContext.put(SERVICE_PATH, getStudentServiceContext());
        return pathToServiceContext;
    }


    private static ThriftServiceContext<?> getStudentServiceContext() {
        return ThriftServiceContext.fromInterfaceAndImplClass(TStudentService.Iface.class, StudentHandler.class);
    }


    public static void main(String[] args) throws Exception {
        try {
            final Configuration configuration = new Configuration("localhost", 5432, "postgres", "postgres",
                    "mechanics");
            ServiceBuilder serviceBuilder = createServiceBuilder(configuration).addModules(
                    new CliLifecycleControllerModule());
            log.info("Service built successfully, starting server now...");
            new CliService(serviceBuilder).run();
            log.info("Server Started on 9090");
        } catch (Exception e) {
            log.error("Exception occurred while starting Server", e);
        }

    }
}

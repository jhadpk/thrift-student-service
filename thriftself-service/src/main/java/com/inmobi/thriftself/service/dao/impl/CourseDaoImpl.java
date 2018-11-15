package com.inmobi.thriftself.service.dao.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.inmobi.thriftself.service.dao.CourseDao;
import com.inmobi.thriftself.thrift.models.TInternalServerException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class CourseDaoImpl extends AbstractDaoImpl<CourseDao, Integer> {

    @Inject
    protected CourseDaoImpl(Provider<EntityManager> entityManagerProvider) {
        super(entityManagerProvider, CourseDao.class);
    }

    public List<CourseDao> fetchCourses() throws TInternalServerException, TException {
        log.debug("CourseDaoImpl called fetchCourses");
        return getEntityManager().createNamedQuery("Courses.getList", CourseDao.class).getResultList();
    }


    public List<CourseDao> fetchCourseByName(final String courseName) throws TInternalServerException, TException {
        log.debug("CourseDaoImpl called fetchCourseByName");
        if (StringUtils.isBlank(courseName)) { return new ArrayList<>(); }
        return getEntityManager().createNamedQuery("Courses.getListByName", CourseDao.class).setParameter("courseName",
                courseName).getResultList();
    }


    public List<CourseDao> fetchCoursesBySemester(final Integer semester)
            throws TInternalServerException, TException {
        log.debug("CourseDaoImpl called fetchCoursesBySemester");
        return getEntityManager().createNamedQuery("Courses.getListBySem", CourseDao.class).setParameter(
                "courseSemester", semester).getResultList();
    }
}

package com.inmobi.thriftself.service.dao.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.inmobi.thriftself.service.dao.StudentDao;
import com.inmobi.thriftself.thrift.models.TInternalServerException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class StudentDaoImpl extends AbstractDaoImpl<StudentDao, Integer> {

    @Inject
    protected StudentDaoImpl(Provider<EntityManager> entityManagerProvider) {
        super(entityManagerProvider, StudentDao.class);
    }


    public List<StudentDao> fetchStudents() throws TInternalServerException, TException {
        log.debug("StudentDaoImpl called fetchStudents");
        return getEntityManager().createNamedQuery("Students.getList", StudentDao.class).getResultList();
    }


    public List<StudentDao> fetchStudentByName(final String studentName) throws TInternalServerException, TException {
        log.debug("StudentDaoImpl called fetchStudentByName");
        if (StringUtils.isBlank(studentName)) { return new ArrayList<>(); }
        return getEntityManager().createNamedQuery("Students.getListByName", StudentDao.class).setParameter("name",
                studentName).getResultList();
    }


    public List<StudentDao> fetchStudentsByDepartment(final String department)
            throws TInternalServerException, TException {
        log.debug("StudentDaoImpl called fetchStudentsByDepartment");
        return getEntityManager().createNamedQuery("Students.getListByDepartment", StudentDao.class).setParameter(
                "department", department).getResultList();
    }
}

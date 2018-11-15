package com.inmobi.thriftself.service.serviceImpl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.persist.Transactional;
import com.inmobi.thriftself.service.dao.CourseDao;
import com.inmobi.thriftself.service.dao.StudentDao;
import com.inmobi.thriftself.service.dao.impl.AbstractDaoImpl;
import com.inmobi.thriftself.service.dao.impl.CourseDaoImpl;
import com.inmobi.thriftself.service.dao.impl.StudentDaoImpl;
import com.inmobi.thriftself.thrift.models.TInternalServerException;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;

import java.util.List;


@Slf4j
@Singleton
@NoArgsConstructor
public class StudentService {
    @Inject
    @Named("StudentsDao")
    private AbstractDaoImpl studentsDao;
    @Inject
    @Named("CoursesDao")
    private AbstractDaoImpl coursesDao;


    @Transactional
    public boolean insertStudent(final StudentDao studentDao) throws TInternalServerException {
        log.debug("Studentservice called insertStudent");
        if (null == studentDao) { return false; }
        try {
            studentsDao.save(studentDao);
        } catch (final Exception e) {
            final String exceptionMessage = e.getMessage();
            log.error("Exception while inserting data : `{}`", exceptionMessage);
            throw new TInternalServerException(exceptionMessage);
        }
        return true;
    }


    @Transactional
    public boolean updateStudent(final StudentDao studentDao) throws TInternalServerException {
        log.debug("Studentservice called updateStudent");
        if (null == studentDao) { return false; }
        try {
            studentsDao.update(studentDao);
        } catch (final Exception e) {
            final String exceptionMessage = e.getMessage();
            log.error("Exception while inserting data : `{}`", exceptionMessage);
            throw new TInternalServerException(exceptionMessage);
        }
        return true;
    }


    @Transactional
    public StudentDao fetchStudentByIndex(final int studentIndex) throws TInternalServerException {
        log.debug("Studentservice called fetchStudent");
        return ((StudentDaoImpl) studentsDao).getById(studentIndex);
    }


    @Transactional
    public boolean insertCourse(final CourseDao courseDao) throws TInternalServerException {
        log.debug("Studentservice called insertCourse");
        if (null == courseDao) { return false; }
        try {
            coursesDao.save(courseDao);
        } catch (final Exception e) {
            final String exceptionMessage = e.getMessage();
            log.error("Exception while inserting data : `{}`", exceptionMessage);
            throw new TInternalServerException(exceptionMessage);
        }
        return true;
    }


    @Transactional
    public boolean updateCourse(final CourseDao courseDao) throws TInternalServerException {
        log.debug("Studentservice called updateCourse");
        if (null == courseDao) { return false; }
        try {
            coursesDao.update(courseDao);
        } catch (final Exception e) {
            final String exceptionMessage = e.getMessage();
            log.error("Exception while inserting data : `{}`", exceptionMessage);
            throw new TInternalServerException(exceptionMessage);
        }
        return true;
    }


    @Transactional
    public CourseDao fetchCourseByIndex(final int courseIndex) throws TInternalServerException {
        log.debug("Studentservice called fetchStudent");
        return ((CourseDaoImpl) coursesDao).getById(courseIndex);
    }


    @Transactional
    public List<StudentDao> fetchStudents() throws TInternalServerException, TException {
        log.debug("Studentservice called fetchStudents");
        return ((StudentDaoImpl) studentsDao).fetchStudents();
    }

    @Transactional
    public List<StudentDao> fetchStudentByName(final String name) throws TInternalServerException, TException {
        log.debug("Studentservice called fetchStudentByName");
        return ((StudentDaoImpl) studentsDao).fetchStudentByName(name);
    }


    @Transactional
    public List<StudentDao> fetchStudentsByDepartment(final String department) throws TInternalServerException, TException {
        log.debug("Studentservice called fetchStudentsByDepartment");
        return ((StudentDaoImpl) studentsDao).fetchStudentsByDepartment(department);
    }


    @Transactional
    public List<CourseDao> fetchCourses() throws TInternalServerException, TException {
        log.debug("Studentservice called fetchCourses");
        return ((CourseDaoImpl) coursesDao).fetchCourses();
    }

    @Transactional
    public List<CourseDao> fetchCourseByName(final String name) throws TInternalServerException, TException {
        log.debug("Studentservice called fetchCourseByName");
        return ((CourseDaoImpl) coursesDao).fetchCourseByName(name);
    }


    @Transactional
    public List<CourseDao> fetchCoursesBySemester(final Integer semester) throws TInternalServerException, TException {
        log.debug("Studentservice called fetchCoursesBySemester");
        return ((CourseDaoImpl) coursesDao).fetchCoursesBySemester(semester);
    }

}

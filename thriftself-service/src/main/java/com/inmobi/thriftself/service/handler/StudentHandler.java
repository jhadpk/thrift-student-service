package com.inmobi.thriftself.service.handler;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.inmobi.thriftself.service.dao.CourseDao;
import com.inmobi.thriftself.service.dao.StudentDao;
import com.inmobi.thriftself.service.serviceImpl.StudentService;
import com.inmobi.thriftself.service.transformers.ThriftTransformer;
import com.inmobi.thriftself.thrift.models.TInternalServerException;
import com.inmobi.thriftself.thrift.models.TStudent;
import com.inmobi.thriftself.thrift.models.TStudentCourses;
import com.inmobi.thriftself.thrift.models.TStudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class StudentHandler implements TStudentService.Iface {
    @SuppressWarnings("unused")
    @Inject
    private StudentService studentService;


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public boolean insertStudent(TStudent studentToBeInserted) throws TInternalServerException, TException {
        try {
            StudentDao studentDao = ThriftTransformer.getStudentDaoFromTStudent(studentToBeInserted);
            return studentService.insertStudent(studentDao);
        } catch (final Exception ex) {
            log.error("Exception while inserting students : {}", ex.getMessage());
        }
        return false;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public boolean updateStudent(TStudent studentToBeUpdated) throws TInternalServerException, TException {
        try {
            StudentDao studentDao = ThriftTransformer.getStudentDaoFromTStudent(studentToBeUpdated);
            return studentService.updateStudent(studentDao);
        } catch (final Exception ex) {
            log.error("Exception while inserting students : {}", ex.getMessage());
        }
        return false;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public TStudent fetchStudent(int studentIndex) throws TInternalServerException, TException {
        StudentDao studentDao = studentService.fetchStudentByIndex(studentIndex);
        return ThriftTransformer.getTStudentFromStudentDao(studentDao);
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public boolean insertCourse(TStudentCourses courseToBeInserted) throws TInternalServerException, TException {
        try {
            CourseDao courseDao = ThriftTransformer.getCourseDaoFromTStudentCourse(courseToBeInserted);
            return studentService.insertCourse(courseDao);
        } catch (final Exception ex) {
            log.error("Exception while inserting students : {}", ex.getMessage());
        }
        return false;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public boolean updateCourse(TStudentCourses courseToBeUpdated) throws TInternalServerException, TException {
        try {
            CourseDao courseDao = ThriftTransformer.getCourseDaoFromTStudentCourse(courseToBeUpdated);
            return studentService.updateCourse(courseDao);
        } catch (final Exception ex) {
            log.error("Exception while inserting students : {}", ex.getMessage());
        }
        return false;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public TStudentCourses fetchCourse(int courseIndex) throws TInternalServerException, TException {
        CourseDao courseDao = studentService.fetchCourseByIndex(courseIndex);
        return ThriftTransformer.getTStudentCourseFromCourseDao(courseDao);
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudent> fetchStudents() throws TInternalServerException, TException {
        List<StudentDao> studentDaoList = studentService.fetchStudents();
        List<TStudent> tStudents = new ArrayList<>();
        for (final StudentDao studentDao : studentDaoList) {
            tStudents.add(ThriftTransformer.getTStudentFromStudentDao(studentDao));
        }
        return tStudents;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudent> fetchStudentsByName(String name) throws TInternalServerException, TException {
        List<StudentDao> studentDaoList = studentService.fetchStudentByName(name);
        List<TStudent> tStudents = new ArrayList<>();
        for (final StudentDao studentDao : studentDaoList) {
            tStudents.add(ThriftTransformer.getTStudentFromStudentDao(studentDao));
        }
        return tStudents;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudent> fetchStudentsByDepartment(String department) throws TInternalServerException, TException {
        List<StudentDao> studentDaoList = studentService.fetchStudentsByDepartment(department);
        List<TStudent> tStudents = new ArrayList<>();
        for (final StudentDao studentDao : studentDaoList) {
            tStudents.add(ThriftTransformer.getTStudentFromStudentDao(studentDao));
        }
        return tStudents;
    }

    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudentCourses> fetchCourses() throws TInternalServerException, TException {
        List<CourseDao> courseDaoList = studentService.fetchCourses();
        List<TStudentCourses> tStudentCourses = new ArrayList<>();
        for (final CourseDao courseDao : courseDaoList) {
            tStudentCourses.add(ThriftTransformer.getTStudentCourseFromCourseDao(courseDao));
        }
        return tStudentCourses;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudentCourses> fetchCoursesByName(String name) throws TInternalServerException, TException {
        List<CourseDao> courseDaoList = studentService.fetchCourseByName(name);
        List<TStudentCourses> tStudentCourses = new ArrayList<>();
        for (final CourseDao courseDao : courseDaoList) {
            tStudentCourses.add(ThriftTransformer.getTStudentCourseFromCourseDao(courseDao));
        }
        return tStudentCourses;
    }


    @Timed(name = "timer")
    @ExceptionMetered(name = "exception")
    @Override
    public List<TStudentCourses> fetchCoursesBySemester(int semester) throws TInternalServerException, TException {
        List<CourseDao> courseDaoList = studentService.fetchCoursesBySemester(semester);
        List<TStudentCourses> tStudentCourses = new ArrayList<>();
        for (final CourseDao courseDao : courseDaoList) {
            tStudentCourses.add(ThriftTransformer.getTStudentCourseFromCourseDao(courseDao));
        }
        return tStudentCourses;
    }


}

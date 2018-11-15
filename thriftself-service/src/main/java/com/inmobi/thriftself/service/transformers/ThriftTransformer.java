package com.inmobi.thriftself.service.transformers;

import com.inmobi.thriftself.service.dao.CourseDao;
import com.inmobi.thriftself.service.dao.StudentDao;
import com.inmobi.thriftself.service.enums.StudentStatusEnum;
import com.inmobi.thriftself.thrift.models.TStudent;
import com.inmobi.thriftself.thrift.models.TStudentCourses;
import com.inmobi.thriftself.thrift.models.TStudentStatus;


public class ThriftTransformer {

    private static StudentStatusEnum getStatusFromTStudent(TStudentStatus studentStatus){
        return StudentStatusEnum.valueOf(studentStatus.name());
    }

    private static TStudentStatus getTStatusFromStudentDao(StudentStatusEnum studentStatusEnum){
        return TStudentStatus.valueOf(studentStatusEnum.name());
    }
    public static StudentDao getStudentDaoFromTStudent(final TStudent tStudent) {
        final StudentDao studentDao = new StudentDao();
        studentDao.setIndex(tStudent.getIndex());
        studentDao.setName(tStudent.getName());
        studentDao.setDepartment(tStudent.getDepartment());
        studentDao.setAge(tStudent.getAge());
        studentDao.setAddress(tStudent.getAddress());
        studentDao.setStatus(getStatusFromTStudent(tStudent.getStatus()));
        return studentDao;
    }

    public static TStudent getTStudentFromStudentDao(final StudentDao studentDao) {
        final TStudent tStudent = new TStudent();
        tStudent.setIndex(studentDao.getIndex());
        tStudent.setName(studentDao.getName());
        tStudent.setDepartment(studentDao.getDepartment());
        tStudent.setAge(studentDao.getAge());
        tStudent.setAddress(studentDao.getAddress());
        tStudent.setStatus(getTStatusFromStudentDao(studentDao.getStatus()));
        return tStudent;
    }

    public static CourseDao getCourseDaoFromTStudentCourse(final TStudentCourses tStudentCourses) {
        final CourseDao courseDao = new CourseDao();
        courseDao.setIndex(tStudentCourses.getIndex());
        courseDao.setCourseName(tStudentCourses.getName());
        courseDao.setCourseDepartment(tStudentCourses.getDepartment());
        courseDao.setCourseSemester(tStudentCourses.getSemester());
        return courseDao;
    }

    public static TStudentCourses getTStudentCourseFromCourseDao (final CourseDao courseDao) {
        final TStudentCourses tStudentCourses = new TStudentCourses();
        tStudentCourses.setIndex(courseDao.getIndex());
        tStudentCourses.setName(courseDao.getCourseName());
        tStudentCourses.setDepartment(courseDao.getCourseDepartment());
        tStudentCourses.setSemester(courseDao.getCourseSemester());
        return tStudentCourses;
    }


}

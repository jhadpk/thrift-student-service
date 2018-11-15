package com.inmobi.thriftself.util;

import com.inmobi.thriftself.client.StudentServiceClient;
import com.inmobi.thriftself.thrift.models.TInternalServerException;
import com.inmobi.thriftself.thrift.models.TStudent;
import com.inmobi.thriftself.thrift.models.TStudentCourses;
import com.inmobi.thriftself.thrift.models.TStudentStatus;
import org.apache.thrift.TException;


public class StudentServiceUtil {

    public static void main(String[] args) throws TException, TInternalServerException {
        StudentServiceClient client = new StudentServiceClient("http://localhost", 9090);
        TStudent student = new TStudent();
        student.setName("inserting2");
        student.setDepartment("cse");
        student.setAge(1);
        student.setAddress("insert");
        student.setStatus(TStudentStatus.ACTIVE);


        TStudentCourses courses = new TStudentCourses();
        courses.setName("courseentry");
        courses.setDepartment("cse");
        courses.setSemester(4);

        System.out.println("Inserting student: " + client.insertStudent(student));
        System.out.println("Inserting course : " + client.insertCourse(courses));
        System.out.println("Students" + client.fetchStudents());
        System.out.println("Courses" + client.fetchCourses());

    }
}

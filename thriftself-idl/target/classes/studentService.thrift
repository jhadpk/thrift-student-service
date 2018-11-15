include "studentModels.thrift"
include "studentException.thrift"

namespace java com.inmobi.thriftself.thrift.models
namespace py thriftself_thrift_models

service TStudentService {

    bool insertStudent(1: required studentModels.TStudent studentToBeInserted) throws (1: studentException.TInternalServerException ise),
    bool updateStudent(1: required studentModels.TStudent studentToBeUpdated) throws (1: studentException.TInternalServerException ise),
    studentModels.TStudent fetchStudent(1: required i32 studentIndex) throws (1: studentException.TInternalServerException ise),

    bool insertCourse(1: required studentModels.TStudentCourses courseToBeInserted) throws (1: studentException.TInternalServerException ise),
    bool updateCourse(1: required studentModels.TStudentCourses courseToBeUpdated) throws (1: studentException.TInternalServerException ise),
    studentModels.TStudentCourses fetchCourse(1: required i32 courseIndex) throws (1: studentException.TInternalServerException ise),


    list<studentModels.TStudent> fetchStudents() throws (1: studentException.TInternalServerException ise),
    list<studentModels.TStudent> fetchStudentsByName(1: required string name) throws (1: studentException.TInternalServerException ise),
    list<studentModels.TStudent> fetchStudentsByDepartment(1: required string departmentName) throws (1: studentException.TInternalServerException ise),

    list<studentModels.TStudentCourses> fetchCourses() throws (1: studentException.TInternalServerException ise),
    list<studentModels.TStudentCourses> fetchCoursesByName(1: required string name) throws (1: studentException.TInternalServerException ise),
    list<studentModels.TStudentCourses> fetchCoursesBySemester(1: required i32 semester) throws (1: studentException.TInternalServerException ise),

}
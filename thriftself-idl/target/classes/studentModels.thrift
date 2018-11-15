namespace java com.inmobi.thriftself.thrift.models
namespace py thriftself_thrift_models

typedef i32 int

enum TStudentStatus {
    ACTIVE,
    ALUMNI
}

struct TStudent {
    1: int index,
    2: string name,
    3: string department,
    4: int age,
    5: string address,
    6: TStudentStatus status
}

struct TStudentCourses {
    1: int index,
    2: string name,
    3: string department,
    4: i32 semester
}


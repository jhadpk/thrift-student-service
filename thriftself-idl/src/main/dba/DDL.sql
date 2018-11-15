create sequence index_seq;

CREATE TYPE StudentStatusEnum AS ENUM ('ACTIVE','ALUMNI');


create table students(
    index integer default nextval('index_seq'),
    name text,
    department text,
    age integer,
    address text,
    status StudentStatusEnum
);



create table courses(
    index integer default nextval('index_seq'),
    course_name text,
    course_department text,
    course_semester integer
);


 INSERT INTO students (name, department, age, address, status) VALUES
    ('jazz','cse', 24,'indore', 'ALUMNI');

 INSERT INTO courses (course_name, course_department, course_semester) VALUES
    ('compo','cse', 1);

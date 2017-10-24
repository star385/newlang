ns org.newchuang.newlang.test;

class Student {
    num id
    str name
    Grade grade
    num age
}

class Main {
    Student s = {id:1,name:"zhuguoyin", grade:{id:1,name:"grade1"}, age:12};
    sysout(s.name)
    sysout(s.grade.name)
}
ns org.newchuang.newlang.test;

class Student {
    num id
    str name
    Grade grade
    num age
}

class Main {
	+ main(str[] args) {
	    Student s = {id:1,name:"zhuguoyin", grade:{id:1,name:"grade1"}, age:12};
	    sys.out(s.name)
	    sys.out(s.grade.name)
    }
}
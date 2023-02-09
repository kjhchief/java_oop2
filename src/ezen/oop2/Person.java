package ezen.oop2;

public class Person {
	String name;
	int age;
}

class Worker extends Person{
	String employeeId;
	
	@Override
	public String toString() {
		return "직장인입니다.";
	}
}
class Student2 extends Person{
	String no;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학생입니다.";
	}
}

class MiddleStudent extends Student2{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "중학생입니다";
	}
}

class HighStudent extends Student2{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "고등학생입니다";
	}
}

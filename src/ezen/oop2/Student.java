package ezen.oop2;

import java.util.List;

public class Student<T, Y> {
	private String name;
	private T no;
	private Y birthda;
	public Student() {}
	public Student(String name, T no, Y birthda) {
		super();
		this.name = name;
		this.no = no;
		this.birthda = birthda;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNo() {
		return no;
	}
	public void setNo(T no) {
		this.no = no;
	}
	public Y getBirthda() {
		return birthda;
	}
	public void setBirthda(Y birthda) {
		this.birthda = birthda;
	}
	
	public static void main(String[] args) {
		Student<Integer, String> student = 
				new Student<>("김재훈", new Integer(87887889), "1968.3.13"); // 뒤에 <> 안에 원래 넣어야 하는데 생략가능.
		System.out.println(student.getNo());
		
		
	}
	
	
}

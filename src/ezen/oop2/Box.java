package ezen.oop2;

/**
 * Java5 이전에 사용하는 방식
 * 모든 자바 객체를 저장할 수 있는 Box (제네릭 타입)
 * @Author 김재훈
 * @Date 2023. 1. 18.
 */

public class Box {
	Object item;
	
	public Box() {}
	public Box(Object item) {
		this.item =item;
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		box.setItem(new String("김기정"));
		box.setItem(new Integer(10));
		box.setItem(new TV());
		box.setItem(new Radio());
		
		Object obj = box.getItem();
		// 다운캐스팅(형변환). 이게 일반화다. 불러올 때는 다운캐스팅을 해야하는 번거로움.
		Radio radio = (Radio) obj;
		
	}
	
	
	
}

class TV{
	
}

class Radio{
	
}
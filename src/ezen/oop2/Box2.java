package ezen.oop2;

public class Box2<T> {

//	Object item; 옛날 방식

	private T item;

	public Box2() {}

	public Box2(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public static void main(String[] args) {
		Box2<String> box = new Box2<String>();
		box.setItem("안녕 디지몬"); // String 타입이 됨
		String message = box.getItem();
		System.out.println(message);
		
		Box2<TV> box2 = new Box2<TV>();
		box2.setItem(new TV());
		TV tv = box2.getItem();
		
	}

}


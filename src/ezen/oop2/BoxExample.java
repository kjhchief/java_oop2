package ezen.oop2;

public class BoxExample {
	// 제너릭 메소드 정의
	public static <T> Box2<T> boxing(T name){
		Box2<T> box = new Box2<>();
		box.setItem(name);
		return box; 
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		Box2<TV> box= boxing(tv);
		TV t = box.getItem();
//		t.turnOn();
	}

}

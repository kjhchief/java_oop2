package ezen.oop2;

public class AutoBoxingExample {

	public static void main(String[] args) {
		// Autoboxing(기본타입 -> 객체)
		Integer in = 10;
		// Integer in = new Integer(10); 내부적으로 이렇게 생성됨. 똑같아.
		float f = in.floatValue();
		System.out.println(f);
		
		// Auto UnBoxing(객체 -> 기본타입)
		int x = new Integer(300);
//		int x = new Integer(300).intValue();를 자동 호출.
		
		doTask(10);
	}
	
	public static void doTask(Integer x) {
		// 남이 만든 여러 코드들.
	}

}

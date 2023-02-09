package ezen.oop2;
// 표준 애노테이션 사용
public class AnnotationExample {
	// 컴파일러에게 알려줌.
	@Override
	public String toString() {
		return "오버라이딩";	
		
	}
	
	
	
	@SuppressWarnings(value = {"",""})
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.doTask();
	}

}

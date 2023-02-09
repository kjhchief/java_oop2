package ezen.oop2;

// enum은 결과적으로 클래스이다. 
public enum Direction {
	FRONT("앞"), BACK("뒤"), RIGHT("우"), LEFT("좌"); //생성자 호출같이
	
	private String name;
	
	private Direction(String name){ //꼭 private으로. 외부에서 생성 못 하게.
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

package ezen.oop2;

class Robot {
//	public static final int FRONT = 0;
//	public static final int BACK = 1;
//	public static final int RIGHT = 2;
//	public static final int LEFT = 3;
	
	// 상수 이용
//	public void move(int direct) {
//		switch (direct) {
//		case FRONT: System.out.println("앞으로 이동 합니다."); break;
//		case BACK: System.out.println("뒤로 이동 합니다."); break;
//		case RIGHT: System.out.println("우로 이동 합니다."); break;
//		case LEFT: System.out.println("좌로 이동 합니다."); break;
//		}
//	}
	
	// enum 이용
	public void move(Direction direct) {
		switch (direct) {
		case FRONT: System.out.println("앞으로 이동 합니다."); break;
		case BACK: System.out.println("뒤로 이동 합니다."); break;
		case RIGHT: System.out.println("우로 이동 합니다."); break;
		case LEFT: System.out.println("좌로 이동 합니다."); break;
		}
	}
}

public class EnumExample {

	public static void main(String[] args) {
		Robot robot = new Robot();
//		robot.move(Robot.FRONT);
//		robot.move(Robot.BACK);
//		robot.move(Robot.RIGHT);
//		robot.move(Robot.LEFT);
//		
//		// 타입에 안전하지 않다.
//		robot.move(1004);
		
		// 
		robot.move(Direction.FRONT);
		robot.move(Direction.BACK);
		robot.move(Direction.RIGHT);
		robot.move(Direction.LEFT);
		
		// 타입에 안전하다.
//		robot.move(1004);
		
		// 컴파일 시 자동 추가되는 static 메소드
		// enum의 상수 목록 출력
		Direction[] list= Direction.values();
		for (Direction direction : list) {
			System.out.println(direction);
		}
		
		String name = "FRONT";
		Direction d = Direction.valueOf(name);
		System.out.println(d);
		
		// enum의 부모클래스인 Enum의 메소드 재사용
		System.out.println(d.ordinal());
		System.out.println(d.name());
		
		// enum은 생성자 호출을 통해 생성할 수 없다. 이넘들 중에 골라야지 새로 생성하는게 아니니까. 
		// Direction myDeDirection = new Direction();
		
		System.out.println(Direction.FRONT.getName());
		
		
	}

}

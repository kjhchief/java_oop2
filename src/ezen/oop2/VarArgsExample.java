package ezen.oop2;

import java.util.Calendar;

public class VarArgsExample {
	
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public static int sum(int[] args) {
		int sum = 0;
		for(int i : args) {
			sum += i;
		}
		return sum;
	}
	
	// 비정형 인자
	public static int sum2(int... args) { //내부적으로 배열 처리
		int sum = 0;
		for(int i : args) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(10,20);
		System.out.println(result);
		result = sum(10, 20, 30);
		System.out.println(result);
		
		int x =10, y=20, z=30, a=60;
		int[] nums = {x, y, z, a};
		
		result = sum(nums);
		System.out.println(result);
		
		result= sum2(x, y, z, a);
		System.out.println(result);
		
		Calendar today = Calendar.getInstance();
		String name ="김기정";
		System.out.printf("%1$tF %1$tT %2$10s", today, name); //뒤에 인자 쭉 쓰는게 바로 Object... 인 것이다.
		
	}

}

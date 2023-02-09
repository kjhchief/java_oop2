package ezen.oop2;

/**
 * Java5 버전에 추가된 향상된 for문
 * @Author 김재훈
 * @Date 2023. 1. 13.
 */
public class ForExample {

	public static void main(String[] args) {
		int[] scores = {10, 30, 50, 70, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 향상된 for문
		for(int score : scores) {
			System.out.println(score);
		}
	}

}

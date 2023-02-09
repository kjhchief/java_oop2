package ezen.oop2;

public interface Rentable<P> {
	public P rent();
}

class Tvv{
	public void turnon() {
		System.out.println("TV를 켭니다");
	}
}

class Car{
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}
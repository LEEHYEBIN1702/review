package oop;

public class Prof extends Member {
	//교수
	String dept;

	@Override //부모 클래스인 Member에 있는 추상메소드 sal을 오버라이드 해서 재정의 해줌.
	public void sal() {
		System.out.println("교수 급여");
	}

	@Override 
	public void print() {
		super.print();
		System.out.println("교수");
	}
	
}

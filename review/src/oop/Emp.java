package oop;

public class Emp extends Member {
	
	String dept;
	String ho; // 호봉

	@Override
	public void sal() {
		System.out.println("직원 급여");
	}
	
	@Override 
	public void print() {
		System.out.println("직원");
	}
	
	public void meth() {
		System.out.println("자재 관리");
	}
	
}

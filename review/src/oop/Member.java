package oop;

public abstract class Member {
	
    // 캡슐화
	private String name;
	String id;

	//getter :read
	//setter :write
		
	public Member() {
		super();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal(); 
	// 어차피 자식 클래스마다 급여계산 내용은 다 달라질 테니까
    // 메소드 바디가 필요 없음.
	// 그렇기 때문에 빈 껍데기인 추상 메소드만 선언.

	public void print() {
		System.out.println(name);	
	}

}
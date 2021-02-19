package oop;

import java.util.ArrayList;

/**
 * 다형성 
 * 1. 부모 타입의 참조 변수가 자식 객체를 참조 할 수 있다.
 * 2. 실행되는 메서드는 참조하는 객체의 메서드를 호출 (같은 코드를 쓰지만 결과는 다를 수 있다. 이게 다형성)
 */
public class OOPTest {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		// Member를 상속 받는 모든 자식 객체는 다 list에 담을 수 있다. 
		Member member;
		
		member = new Prof();
		member.setName("김유신");
		member.print();
		member.sal();
		list.add(member);
		
		member = new Emp();
		member.setName("홍길동");
		member.print();
		member.sal();
		list.add(member);
		
		System.out.println("----------");
		
		long a = 10;
		int b = (int)a; // 원래는 인트에 롱을 담을 수 없음.. 롱이 더 크니까 근데 형변환해주면 가능
		                // 기본 연산자끼리는 형변환 가능.
		
		for( Member m : list) {
			m.sal();
			m.print();
			if (m instanceof Emp) {
				//객체간의 형변환 부모-자식 간에만 가능
				// member에는 Emp에 있는 meth가 없음. 
				// 근데 부르고 싶을 땐 이런 식으로 부르면 됨.
				((Emp)m).meth(); //다운캐스팅 (형변환) 
			}
		}
		
//		System.out.println("----------");
//		
//		for(int i = 0; i<list.size(); i++) {
//			Member m = list.get(i);
//			m.sal();
//			m.print();
//			
//		}

	}

}

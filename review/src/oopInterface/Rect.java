package oopInterface;

import java.awt.Point;

public class Rect 
       extends Shape                    // 속성, 메서드 클래스는 단일상속
       implements Drawalbe, Movable {   // 추상메서드 인터페이스는 다중상속
	
	Point p1;
	Point p2;
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}

}

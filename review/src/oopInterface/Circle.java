package oopInterface;

public class Circle implements Drawalbe, Movable {

	@Override
	public void move() {
		System.out.println("원 이동");
		
	}

	@Override
	public void draw() {
		System.out.println("원 그리기");
		
	}

}

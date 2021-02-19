package lambda;

public class ThreadTest {
	public static void main(String[] args) {
		//for문 두개 동시에 돌리기
		//multi Thread
		
		Thread thread = new Thread(new Thread1());
		thread.start();
		
		//무명클래스
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i=2000; i<2999; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}});
		thread2.start();
		
		//람다식( 클래스선언과 객체생성 == 무명클래스 ) .메서드 하나 뿐일때만 사용 가능.
		Thread thread3 = new Thread(
				() -> {
					for (int i=3000; i<3999; i++) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(i);
					}
				}
				);
		thread3.start();
		
		for (int i=1000; i<1999; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}

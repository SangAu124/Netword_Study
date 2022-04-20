package kr.hs.dgsw.network.students.sangeun;

public class ThreadMain {
	public static void main(String[] args) {
		// Todo Auto-generated method stub
		
		System.out.println("main 실행");
		
		Thread t1 = new Thread();
		
		Thread2 mi2 = new Thread2();
		Thread t2 = new Thread(mi2);
		

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 500; i++) {
					System.out.printf("t3 Thread: %d \n", i);
				}
			}
		});
		System.out.println("t1 실행");
		t1.start();
		System.out.println("t2 실행");
		t2.start();
		System.out.println("t3 실행");
		t3.start();		
		
		
		new Thread(() -> {
			for(int i = 0; i < 500; i++) {
				System.out.printf("t4 Thread: %d \n", i);
			}
		}).start();
		
		
		for(int i = 0; i < 500; i++) {
			System.out.printf("main Thread: %d \n", i);
		}
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("전체 종료");
	}
}

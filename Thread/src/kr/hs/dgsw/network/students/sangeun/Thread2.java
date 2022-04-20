package kr.hs.dgsw.network.students.sangeun;

public class Thread2 implements Runnable{
	
	//작업 구현
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.printf("t2 Thread: %d \n", i);
		}
	}
	
}

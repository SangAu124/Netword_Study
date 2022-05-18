package kr.hs.dgsw.network.sangau;

import java.net.Socket;

public class ChattingClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket sc = new Socket("10.80.162.72",5001);
			
			Output_Message om = new Output_Message(sc);
			om.start();
			
			Input_Message im = new Input_Message(sc);
			im.start();
		} catch(Exception e) {
			System.out.println("연결 종료");
			e.printStackTrace();
		}
	}

}
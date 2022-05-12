package kr.hs.dgsw.network.sangau;

import java.io.BufferedReader;
import java.io.IOException;

public class OutputThread extends Thread {

	BufferedReader br = null;
	
	public OutputThread(BufferedReader br) {
		this.br = br;
	}
	public void run() {
		while(true) {
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

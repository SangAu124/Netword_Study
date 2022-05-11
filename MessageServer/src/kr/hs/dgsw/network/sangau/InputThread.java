package kr.hs.dgsw.network.sangau;

import java.io.PrintWriter;
import java.util.Scanner;

public class InputThread extends Thread {

	PrintWriter pw = null;
	public InputThread(PrintWriter pw) {
		this.pw = pw;
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			pw.println(scan.next());
		}
	}
	
}

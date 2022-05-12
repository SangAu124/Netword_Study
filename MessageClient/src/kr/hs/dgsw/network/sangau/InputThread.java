package kr.hs.dgsw.network.sangau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputThread extends Thread {

	PrintWriter pw = null;
	public InputThread(PrintWriter pw) {
		this.pw = pw;
	}
	public void run() {
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String msg = "";
			while((msg=br.readLine()) != null) {
				pw.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

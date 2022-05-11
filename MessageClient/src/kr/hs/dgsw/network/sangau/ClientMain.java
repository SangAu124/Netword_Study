package kr.hs.dgsw.network.sangau;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	
	public static void main(String[] args) {
		try {
			Socket sc = new Socket("10.80.162.244", 5000);
			
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			
			pw.println("Hiiiii!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

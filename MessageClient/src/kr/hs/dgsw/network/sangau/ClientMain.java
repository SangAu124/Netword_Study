package kr.hs.dgsw.network.sangau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Socket sc = new Socket("10.80.161.24", 1004);
			
			OutputStream os = sc.getOutputStream();
			InputStream is = sc.getInputStream();
			PrintWriter pw = new PrintWriter(os, true);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			Thread ot = new OutputThread(br);
			Thread it = new InputThread(pw);
			
			it.start();
			ot.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

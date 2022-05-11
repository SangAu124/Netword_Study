package kr.hs.dgsw.network.sangau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Socket sc = ss.accept();
			
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			Thread it = new InputThread(pw);
			Thread ot = new OutputThread(br);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

package kr.hs.dgsw.network.sangau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OutputThread extends Thread {
	private static List<OutputThread> ClientList = Collections.synchronizedList(new ArrayList<OutputThread>());

	Socket sc = null;
	
	OutputStream os = null;
	PrintWriter pw = null;

	public OutputThread(Socket sc) {
		this.sc = sc;
		ClientList.add(this);
		
		try {
			os = sc.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw = new PrintWriter(os, true);
		
	}
	
	public void sendMessage(String msg) {
		pw.println(msg);
	}

	public void run() {
		InputStream is = null;
		try {
			is = sc.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		try {
			String msg = "";
			while (true) {
				msg = br.readLine();
				for(OutputThread tmpOT : ClientList) {
					if(msg != null && tmpOT != this) {
						System.out.println(msg);
						tmpOT.sendMessage(msg);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

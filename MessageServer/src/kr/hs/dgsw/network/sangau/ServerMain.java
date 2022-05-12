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
		System.out.println("서버가 시작되었습니다.");
		
		try {
			ServerSocket ss = new ServerSocket(1004);// 서버 시작(클라이언트 접속 대기)
			
			while(true) {
				Socket sc = ss.accept();
				Thread ot = new OutputThread(sc);
				ot.start();
			}
		} catch(Exception e) {
			System.out.println("연결 종료");
			e.printStackTrace();
		}
	}
}
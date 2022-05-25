package kr.hs.dgsw.network.fileCopy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileCopyServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1004);
		Socket sc = ss.accept();
		
		InputStream is = sc.getInputStream();
		BufferedInputStream bir = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(bir);
		
		String fileName = dis.readUTF();
		FileOutputStream fos = new FileOutputStream("/Users/gimsang-eun/공부/2.2학년/네트/file/" + fileName);
		
		int readSize = 0;
		
		byte[] bytes = new byte[1024];
		
		while((readSize = dis.read(bytes)) != -1) {
			fos.write(bytes, 0, readSize);
		}
	}
}

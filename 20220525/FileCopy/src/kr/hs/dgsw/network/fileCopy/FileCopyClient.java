package kr.hs.dgsw.network.fileCopy;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class FileCopyClient {
	public static void main(String[] args) throws IOException {
		Socket sc = new Socket("10.80.162.233", 5000);
		
		OutputStream os = sc.getOutputStream();
		BufferedOutputStream bor = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bor);
		
		File fl = new File("/Users/gimsang-eun/공부/2.2학년/네트/file/woojae2.JPG");
		FileInputStream fis = new FileInputStream(fl);
		
		int readSize = 0;
		
		byte[] bytes = new byte[1024];
		
		dos.writeUTF(fl.getName());
		while((readSize = fis.read(bytes)) != -1) {
			dos.write(bytes, 0, readSize);
		}
	}
}

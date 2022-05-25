package kr.hs.dgsw.network.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		File fl = new File("/Users/gimsang-eun/공부/2.2학년/네트/file/hi.JPG");
		FileInputStream fis = new FileInputStream(fl);
		
		FileOutputStream fos = new FileOutputStream("/Users/gimsang-eun/공부/2.2학년/네트/file/bye.JPG");
		
		int readSize = 0;
		
		byte[] bytes = new byte[1024];
		
		while((readSize = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, readSize);
		}
	}
}

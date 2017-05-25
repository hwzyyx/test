package com.topregion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\test.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		int len = 0;
		byte[] b = new byte[1024 * 1024];
		
		while((len = fis.read(b)) != -1) {
			
			System.out.println(new String(b,0,len));
			
		}
		
		
	}

}

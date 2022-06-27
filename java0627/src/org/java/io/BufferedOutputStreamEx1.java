package org.java.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\web1\\ioex\\123.txt");
				// BufferedOutputStream의 버퍼 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
				// 파일
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
			if(fos !=null) fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

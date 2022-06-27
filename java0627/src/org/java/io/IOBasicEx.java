package org.java.io;

import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class IOBasicEx {
	public static void main(String[] args) {
		
//		InputStream in=System.in;
//		in.read();
		
		try {
			System.out.println("입출력");
			InputStream inputStream = System.in;
			int n = inputStream.read(); // read()  파일입력
			System.out.println("출력문자: " + (char)n);
			inputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

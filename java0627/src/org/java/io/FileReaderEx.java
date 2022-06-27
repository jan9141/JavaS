package org.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		String fileUrl="D:\\\\web1\\\\ioex\\\\test.txt";
		
		try {
			FileReader fR = new FileReader("D:\\web1\\ioex\\test.txt"); //File 객체 생성 후 파일 경로 연결
			
			int ch=0;//문자 하나
						//문자열의 끝 -1
			while((ch=fR.read()) != -1 ) {
				System.out.print((char)ch);
			}
			fR.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력예외");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

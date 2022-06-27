package org.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream in=null;
		
		
		try {
			in = new FileInputStream("C:\\Windows\\system.ini");
			int ch;
			
			while((ch=in.read()) != -1) {
				System.out.print((char)ch);
			}
			if(in!=null) in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파이리 없다");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package org.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\web1\\ioex\\test.out");
			FileInputStream fin=null;
			for(int i=0; i<10;i++) {
				int n=10-i;
				fout.write(n);
			}
			if(fout!=null) fout.close();
			
			fin= new FileInputStream("D:\\web1\\ioex\\test.out");
			
			int ch;
			while((ch=fin.read()) != -1) {
				System.out.print(ch+" ");
			}
			if(fin!=null) fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

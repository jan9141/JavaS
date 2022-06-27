package org.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		String fileUrl="D:\\\\web1\\\\ioex\\\\test.txt";
		
		try {
			FileReader fR = new FileReader("D:\\web1\\ioex\\test.txt"); //File ��ü ���� �� ���� ��� ����
			
			int ch=0;//���� �ϳ�
						//���ڿ��� �� -1
			while((ch=fR.read()) != -1 ) {
				System.out.print((char)ch);
			}
			fR.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ����.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����¿���");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

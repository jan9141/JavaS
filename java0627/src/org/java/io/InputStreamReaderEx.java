package org.java.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	
	public static void main(String[] args) {
		
		InputStreamReader inRd = new InputStreamReader(System.in); //콘솔에 입력
		
		while(true) {
			System.out.println("문자를 입력:");
			try {
				int ch= inRd.read();
				// ctr+z
				if(ch==-1) break;
//				inRd.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}

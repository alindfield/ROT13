package com.rot13.test;

import com.rot13.Processor;

public class LongTest {

	private static final long SIZE = 100000000;
	
	public static void main(String[] args) {
		try{
			
			StringBuilder sb = new StringBuilder();
			
			char c = 'A';
			for(int i = 1 ; i <= SIZE ; i++) {
				sb.append(c);
				c += 1;
				c = (char)((c <= 'Z') ? c : (c - 26));
			}

			String input = sb.toString();
			
			Processor processor = new Processor();
			
			processor.start(input);
			
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}

}

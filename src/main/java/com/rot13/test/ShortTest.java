package com.rot13.test;

import com.rot13.Processor;

public class ShortTest {

	private static final String INPUT = "Ceboyrz fbyivat vf 35 creprag bs gur wbo";
	
	public static void main(String[] args) {
		try{
		
			Processor processor = new Processor();
			
			processor.start(INPUT);
		
		} catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
}

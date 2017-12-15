package com.rot13.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rot13.AsciiDecrypter;
import com.rot13.MapDecrypter;
import com.rot13.Processor;

public class TestAll {

	private static final String INPUT = "Ceboyrz fbyivat vf 35 creprag bs gur wbo";
	private static final String OUTPUT = "Problem solving is 80 percent of the job";
	
	@Test
	public void testAsciiArray(){
		Processor processor = new Processor();
		processor.setDecrypter(new AsciiDecrypter());
		String output = processor.decrypt(INPUT);
		assertTrue(output.equals(OUTPUT));
	}
	
	@Test
	public void testMapArrayEncrypter(){
		Processor processor = new Processor();
		processor.setDecrypter(new MapDecrypter());
		String output = processor.decrypt(INPUT);
		assertTrue(output.equals(OUTPUT));
	}
}

package com.rot13;

public class Processor {

	private Decrypter decrypter;
	
	private static Decrypter[] decrypters = new Decrypter[]{new AsciiDecrypter(), new MapDecrypter()};
	
	public void setDecrypter(Decrypter decrypter) {
		this.decrypter = decrypter;
	}

	public String decrypt(String input) {
		return decrypter.decrypt(input);
	}
	
	public void start(String input){
		for(Decrypter decrypter : decrypters) {
			process(decrypter, input);
		}
	}

	private void process(Decrypter crypter, String input) {

		System.out.println("\r\nCrypto  [" + crypter + "]");
			
		Processor processor = new Processor();
		
		processor.setDecrypter(crypter);
			
		System.out.println("Size    [" + input.length() + "]");
		
		System.out.println("Input   [" + (input.length() > 50 ? input.substring(0,  50) + "..." : input) + "]");

		long start = System.nanoTime();
		
		String output = processor.decrypt(input);
		
		long end = System.nanoTime();
		
		System.out.println("Result  [" + (output.length() > 50 ? output.substring(0,  50) + "..." : output) + "]");
		
		System.out.println("Took    [" + (end - start) + "] nanoseconds [" + 
					((int)(end / 1000000) - (int)(start / 1000000)) + "] milliseconds");
		
	}
}

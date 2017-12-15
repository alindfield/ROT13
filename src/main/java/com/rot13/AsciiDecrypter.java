package com.rot13;

public class AsciiDecrypter implements Decrypter {

	private char decodeChar(char in){
		char out = in;
		if((in >= 'A' && in <= 'M') || (in >= 'a' && in <= 'm')) out += 13;
		if((in >= 'N' && in <= 'Z') || (in >= 'n' && in <= 'z')) out -= 13;
		if(in >= '0' && in <= '4') out += 5;
		if(in >= '5' && in <= '9') out -= 5;
		return out;
	}

	@Override
	public String decrypt(String input) {
		char[] arr = input.toCharArray();
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = decodeChar(arr[i]);
		}
		return new String(arr);
	}
	
}

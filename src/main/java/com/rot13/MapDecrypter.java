package com.rot13;

import java.util.HashMap;
import java.util.Map;

public class MapDecrypter implements Decrypter {

	private static Map<Character, Character> decodeMap = new HashMap<Character, Character>();
	
	static {
		for(char i = 'A' ; i <= 'Z' ; i++) decodeMap.put(new Character(i), new Character((char) (i <= 'M' ? (i + 13) : (i - 13))));
		for(char i = 'a' ; i <= 'z' ; i++) decodeMap.put(new Character(i), new Character((char) (i <= 'm' ? (i + 13) : (i - 13))));
		for(char i = '0' ; i <= '9' ; i++) decodeMap.put(new Character(i), new Character((char) (i <= '4' ? (i + 5) : (i - 5))));
	}

	private char decodeChar(char in) {
		if(decodeMap.containsKey(in)) {
			return decodeMap.get(in);
		} else {
			return ' ';
		}
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

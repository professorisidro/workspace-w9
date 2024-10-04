package br.com.meli.morse.util;

import java.util.HashMap;

public class MorseDecoder {
	private HashMap<String, Character> mapaMorse = new HashMap<String,Character>() {{
		put(".-",'A');
		put("-...",'B');
		put("-.-.",'C');
		put("-..",'D');
		put(".",'E');
		put("..-.",'F');
		put("--.",'G');
		put("....",'H');
		put("..",'I');
		put(".---",'J');
		put("-.-",'K');
		put(".-..",'L');
		put("--",'M');
		put("-.",'N');
		put("---",'O');
		put(".--.",'P');
		put("--.-",'Q');
		put(".-.",'R');
		put("...",'S');
		put("-",'T');
		put("..-",'U');
		put("...-",'V');
		put(".--",'W');
		put("-..-",'X');
		put("-.--",'Y');
		put("--..",'Z');
		
		
		put("-----",'0');
		put(".----",'1');
		put("..---",'2');
		put("...--",'3');
		put("....-",'4');
		put(".....",'5');
		put("-....",'6');
		put("--...",'7');
		put("---..",'8');
		put("----.",'9');
		
		put("-.-.--",'!');
		put("..--..",'?');
		put("--..--",',');
		put(".-.-.-",'.');
	}};
	
	
	public String decodeWord(String morseWord) {
		StringBuilder strBuilder = new StringBuilder();
		String[] letras = morseWord.split(" ");
		for (String codigo: letras) {
			strBuilder.append(mapaMorse.get(codigo));
		}
		return strBuilder.toString();
	}
	
	public String decodePhrase(String morsePhrase) {
		StringBuilder strBuilder = new StringBuilder();
		String palavras[] = morsePhrase.split("   ");
		for (String palavra: palavras) {
			strBuilder.append(decodeWord(palavra)).append(" ");			
		}
		return strBuilder.toString().trim();
	}
}

package br.com.meli.morse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.morse.util.MorseDecoder;
import br.com.meli.morse.util.MorseMessage;

@RestController
public class MorseController {
	
	private MorseDecoder decoder = new MorseDecoder();
	
	@PostMapping("/decode")
	public String decode(@RequestBody MorseMessage message) {
		return decoder.decodePhrase(message.getMessage());
	}

}

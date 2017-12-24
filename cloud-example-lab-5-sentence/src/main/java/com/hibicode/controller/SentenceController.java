package com.hibicode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

	@Autowired
	private RestTemplate template;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return getWord("LAB-4-SUBJECT") + " " + 
				getWord("LAB-4-VERB") + " " + 
				getWord("LAB-4-ARTICLE") + " " +
				getWord("LAB-4-ADJECTIVE") + " " + 
				getWord("LAB-4-NOUN") + ".";
	}

	public String getWord(String service) {
		return template.getForObject("http://" + service, String.class);
	}
}

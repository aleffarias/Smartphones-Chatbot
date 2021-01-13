package com.chatbot.chatbot;

import org.alicebot.ab.utils.IOUtils;
import org.jeasy.rules.api.Facts;

public class Questions {
	
	// Define facts
		Facts facts = new Facts();
		
	public void executeQuestions() {
		chatbotQuestions();
	}
	
	public void chatbotQuestions() {
		String textLine = "";
		
		System.out.println("Robot: Você está procurando por um Smartphone?");
		textLine = IOUtils.readInputTextLine();
		checkBoolean(textLine, "smartphone");
		
	}
	
	public void checkBoolean(String textLine, String variable) {
		if (textLine.equals("sim") || textLine.equals("s")) {
			facts.put(variable, true);
		} else {
			facts.put(variable, false);
		}	
	}
}

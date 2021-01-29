package com.chatbot.chatbot;

import java.io.FileReader;
import java.io.Reader;

import org.alicebot.ab.utils.IOUtils;
import org.jeasy.rules.api.Facts;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Questions {
	
	private JSONObject questions;
	
	public Questions(JSONObject questions) {
		this.questions = questions;
	}
	
	// Define facts
		Facts facts = new Facts();
		
	public void execute() throws JSONException {
		System.out.println(this.questions.get("A"));
		
		if (checkBoolean("smartphone") == true) {
			System.out.println(this.questions.get("B"));
			if (checkBoolean("smartphone") == true) {
				System.out.println(this.questions.get("E"));
			} else {
				System.out.println(this.questions.get("C"));
			}
		} else {
			System.out.println(this.questions.get("G"));
		}
		
	}
	
	// A + a -> B
	public void B() throws JSONException {
		String textLine = "";
		
		System.out.println(this.questions.get("B"));
		textLine = IOUtils.readInputTextLine();
		checkBoolean("smartphone");
		
	}
	
	// A + !a -> G
	public void G() throws JSONException {
		String textLine = "";
		
		System.out.println(this.questions.get("G"));
		textLine = IOUtils.readInputTextLine();
		checkBoolean("smartphone");
		
	}
	
	// A + !a -> G
	public void rule(String variable) throws JSONException {
		String textLine = "";
		
		System.out.println(this.questions.get("\"" +variable+ "\""));
		textLine = IOUtils.readInputTextLine();
		checkBoolean("smartphone");
		
	}
	
	public boolean checkBoolean(String variable) {
		String textLine = "";
		textLine = IOUtils.readInputTextLine();
		
		if (textLine.equals("sim") || textLine.equals("s")) {
			facts.put(variable, true);
			return true;
		} else {
			facts.put(variable, false);
			return false;
		}	
	}
}

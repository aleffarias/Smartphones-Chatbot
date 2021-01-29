package com.inferenceEngine.rules;

import java.io.FileReader;
import java.io.Reader;

import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class Rule_ {
	
	private JSONObject questions;
	private JSONObject smartphones;
	
	
	public void setQuestions(JSONObject questions) {
		this.questions = questions;
	}
	
	public JSONObject getQuestions() {
		try {
			Reader readerQuestions = new FileReader("C:\\Users\\alef_\\git\\Smartphones-Chatbot\\chatBot-Smartphones\\src\\main\\java\\com\\chatbot\\chatbot\\questions.json");
			
			JSONTokener tokener = new JSONTokener(readerQuestions);
			JSONObject jsonObject = new JSONObject(tokener);
			setQuestions(jsonObject);	
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return questions;
	}
	
	public JSONObject getSmartphones() {
		return smartphones;
	}

	public void setSmartphones(JSONObject smartphones) {
		this.smartphones = smartphones;
	}
	
}

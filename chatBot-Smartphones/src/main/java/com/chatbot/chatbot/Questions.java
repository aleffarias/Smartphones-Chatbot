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
	private JSONObject smartphones;
	
	private double smartphone = 0.8;
	private double MP3 = 0.8;
	private double dualSim = 0.9;
	private double colorScreen = 0.8;
	
	public Questions(JSONObject questions, JSONObject smartphones) {
		this.questions = questions;
		this.smartphones = smartphones;
	}
	
	// Define facts
	Facts facts = new Facts();
		
	public Facts execute() throws JSONException {
		
		System.out.println(this.questions.get("A"));
		
		if (checkBoolean("smartphone") == true) {
			// A + a => B
			System.out.println(this.questions.get("B"));
			
		} else {
			// A + !a => L
			System.out.println(this.questions.get("L"));
			
			if (checkBoolean("MP3") == true) {
				
				//L + l => M
				System.out.println(this.questions.get("M"));
				
				if (checkBoolean("dualSim") == true) {
					
					// M + m => C5
					System.out.println(this.smartphones.get("C5"));
					System.out.printf("CNF: %.1f", (MP3 * dualSim ) * 100);
				} else {
					
					// M + !m => C6
					System.out.println(this.smartphones.get("C6"));
				}
			} else {
				
				//L + !l => N
				System.out.println(this.questions.get("N"));
				
				if (checkBoolean("colorScreen") == true) {
					
					//N + n => C7
					System.out.println(this.smartphones.get("C7"));
					System.out.printf("CNF: %.1f", (dualSim * colorScreen) * 100);
					
				} else {
					
					//N + n => C7
					System.out.println(this.smartphones.get("C8"));	
				}
			}
		}
		
		return facts;	
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

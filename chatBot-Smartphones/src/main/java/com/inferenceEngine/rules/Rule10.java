package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule10 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean frontalCamera = facts.get("frontalCamera");
			boolean hdScreen = facts.get("hdScreen");
			boolean smartphone = facts.get("smartphone");
			
			return (technology == "Menor" 
					&& frontalCamera == true 
						&& smartphone == true 
							&& hdScreen == true); 
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nGoogle Pixel XL");
		System.exit(0);
	}
}
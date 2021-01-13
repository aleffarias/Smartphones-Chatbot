package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule6 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean frontalCamera = facts.get("frontalCamera");
			boolean flash3g = facts.get("flash3g");
			boolean smartphone = facts.get("smartphone");
			boolean keyboard = facts.get("keyboard");
						
			return (technology == "Menor" 
					&& frontalCamera == false 
						&& flash3g == false 
							&& smartphone == true 
								&& keyboard == true);
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nBlackBerry Q10");
		System.exit(0);
	}
}
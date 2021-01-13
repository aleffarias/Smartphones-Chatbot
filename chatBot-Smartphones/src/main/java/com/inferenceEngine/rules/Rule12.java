package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule12 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean flash4g = facts.get("flash4g");
			boolean smartphone = facts.get("smartphone");
			boolean fingerprintScanner = facts.get("fingerprintScanner");
			
			return (technology == "4g" 
					&& flash4g == true 
						&& smartphone == true
						 && fingerprintScanner == true); 
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nMoto G4");
		System.exit(0);
	}
}
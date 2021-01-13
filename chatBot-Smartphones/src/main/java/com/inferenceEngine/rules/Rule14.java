package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule14 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean smartphone = facts.get("smartphone");
			boolean screenQuality = facts.get("screenQuality");
			boolean battery = facts.get("battery");
			boolean processor = facts.get("processor");
			
			return (technology == "4g/5g" 
					&& smartphone == true 
						&& screenQuality == true
						 && battery == true
						 	&& processor == true); 
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nSamsung Galaxy Note 20");
		System.exit(0);
	}
}
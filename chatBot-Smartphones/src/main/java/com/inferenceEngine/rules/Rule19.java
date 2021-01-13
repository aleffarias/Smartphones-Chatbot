package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule19 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean smartphone = facts.get("smartphone");
			boolean storage = facts.get("storage");
			boolean processor = facts.get("processor");
			boolean android = facts.get("android");
			
			return (technology == "4g/5g" 
					&& smartphone == true 
						 && storage == false
						 	&& android == true
						 		&& processor == false); 
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nXiaomi Redmi 9A");
		System.exit(0);
	}
}
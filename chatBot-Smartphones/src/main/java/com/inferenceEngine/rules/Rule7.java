package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule7 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean frontalCamera = facts.get("frontalCamera");
			boolean flah3g = facts.get("flah3g");
			boolean smartphone = facts.get("smartphone");
			boolean gyroscope = facts.get("gyroscope");
			
			return technology == "Menor" &&
					(frontalCamera && gyroscope) == false &&
							(smartphone && flah3g) == true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nXioami Mi Mix");
		System.exit(0);
	}
	
	@Priority
	public int getPriority() {
		return 1;
	}

}
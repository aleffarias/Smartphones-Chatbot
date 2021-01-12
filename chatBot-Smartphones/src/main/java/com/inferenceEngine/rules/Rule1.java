package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule1 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			boolean smartphone = facts.get("smartphone");
			boolean mp3 = facts.get("mp3");
			boolean colorScreen = facts.get("colorScreen");
			
			return (smartphone == false 
					&& mp3 == false 
						&& colorScreen == false);
			
		} catch (Exception e) {
			return false;
		}

	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nMotorola C115");
		System.exit(0);
	}
	
	@Priority
	public int getPriority() {
		return 1;
	}
}

package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule3 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			boolean smartphone = facts.get("smartphone");
			boolean mp3 = facts.get("mp3");
			boolean dualSim = facts.get("dualSim");
			
			return (smartphone == false 
						&& dualSim == false 
							&& mp3 == true);
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nSiemens GS55-6");
		System.exit(0);
	}
}
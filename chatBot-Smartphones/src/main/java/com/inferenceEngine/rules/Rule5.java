package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class Rule5 {
	
	@Condition
	public boolean when(Facts facts) {
		try {
			String technology = facts.get("technology");
			boolean frontalCamera = facts.get("frontalCamera");
			boolean flah3g = facts.get("flah3g");
			boolean smartphone = facts.get("smartphone");
			boolean keybord = facts.get("keybord");
			
			return technology == "Menor" &&
					(frontalCamera && flah3g && keybord) == false &&
							smartphone == true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nNokia N8");
		System.exit(0);
	}
	
	@Priority
	public int getPriority() {
		return 1;
	}

}
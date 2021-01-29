package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class RuleA {
	
	@Condition
	public boolean when(Facts facts) {
		return facts.get("A") == "a";

	}
	
	@Action
	public void then() {
		System.out.println("O Smartphone recomendado é:\nMotorola C115");
		System.exit(0);
	}
	
}

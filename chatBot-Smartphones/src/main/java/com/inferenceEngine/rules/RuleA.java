package com.inferenceEngine.rules;

import com.inferenceEngine.rules.Rule_;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule
public class RuleA extends Rule_ {
	
	@Condition
	public boolean when(Facts fact) {
		super.getQuestions();
		
		return fact.get("A") == "a";

	}
	
	@Action
	public void then(Facts facts) {
		facts.put("B", "B");
	}
	
}

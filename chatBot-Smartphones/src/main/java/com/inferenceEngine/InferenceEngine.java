package com.inferenceEngine;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.InferenceRulesEngine;

import com.inferenceEngine.rules.Rule1;

public class InferenceEngine {
	public static void main(String[] args) {
		// Define facts
		Facts facts = new Facts();
		
		// Create a rules engine
		RulesEngineParameters parameters = new RulesEngineParameters();
			// Continuously applies rules on known facts until no more rules are applicable.
		RulesEngine smartphonesEngine = new InferenceRulesEngine();
		
		// Create rules		
		Rules rules = new Rules();
		rules.register(new Rule1());
		
		// Fire rules
		facts.put("isSmartphone", true);
		smartphonesEngine.fire(rules, facts);
		
	}
}

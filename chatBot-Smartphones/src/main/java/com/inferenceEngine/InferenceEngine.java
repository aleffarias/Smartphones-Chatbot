package com.inferenceEngine;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.InferenceRulesEngine;

import com.inferenceEngine.rules.Rule1;
import com.inferenceEngine.rules.Rule2;
import com.inferenceEngine.rules.Rule3;
import com.inferenceEngine.rules.Rule4;
import com.inferenceEngine.rules.Rule5;
import com.inferenceEngine.rules.Rule6;
import com.inferenceEngine.rules.Rule7;
import com.inferenceEngine.rules.Rule8;

public class InferenceEngine {
	
	public void executeInferenceEngine() {
		// Create a rules engine
		RulesEngineParameters parameters = new RulesEngineParameters()
			    .skipOnFirstAppliedRule(true);

		// Continuously applies rules on known facts until no more rules are applicable.
		RulesEngine smartphonesEngine = new InferenceRulesEngine(parameters);
		
		Facts facts = new Facts();
		facts.put("technology", "Menor");
		facts.put("frontalCamera", false);
		facts.put("flah3g", false);
		facts.put("keybord", true);
		facts.put("smartphone", true);
		
		smartphonesEngine.fire(registerRules(), facts);
	}
	
	public Rules registerRules() {
		// Create rule	
		Rules rules = new Rules();
		
		// Register rules	
		rules.register(new Rule1());
		rules.register(new Rule2());
		rules.register(new Rule3());
		rules.register(new Rule4());
		rules.register(new Rule5());
		rules.register(new Rule6());
		rules.register(new Rule7());
		rules.register(new Rule8());
		
		return rules;
	}
}

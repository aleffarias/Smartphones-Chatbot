package com.inferenceEngine;

import java.io.FileReader;
import java.io.Reader;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.InferenceRulesEngine;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.inferenceEngine.rules.Rule1;
import com.inferenceEngine.rules.Rule10;
import com.inferenceEngine.rules.Rule11;
import com.inferenceEngine.rules.Rule12;
import com.inferenceEngine.rules.Rule13;
import com.inferenceEngine.rules.Rule14;
import com.inferenceEngine.rules.Rule15;
import com.inferenceEngine.rules.Rule16;
import com.inferenceEngine.rules.Rule17;
import com.inferenceEngine.rules.Rule18;
import com.inferenceEngine.rules.Rule19;
import com.inferenceEngine.rules.Rule2;
import com.inferenceEngine.rules.Rule20;
import com.inferenceEngine.rules.Rule3;
import com.inferenceEngine.rules.Rule4;
import com.inferenceEngine.rules.Rule5;
import com.inferenceEngine.rules.Rule6;
import com.inferenceEngine.rules.Rule7;
import com.inferenceEngine.rules.Rule8;
import com.inferenceEngine.rules.Rule9;

public class InferenceEngine {
	
	public void executeInferenceEngine() {
		// Create a rules engine
		RulesEngineParameters parameters = new RulesEngineParameters()
			    .skipOnFirstAppliedRule(false);

		// Continuously applies rules on known facts until no more rules are applicable.
		RulesEngine smartphonesEngine = new InferenceRulesEngine(parameters);
		
		Facts facts = new Facts();
		
		//Rule 02 test
		facts.put("smartphone", false);
		facts.put("mp3", false);
		facts.put("colorScreen", true);
		
		
		try {
			Reader readerQuestions = new FileReader("C:\\Users\\alef_\\git\\Smartphones-Chatbot\\chatBot-Smartphones\\src\\main\\java\\com\\chatbot\\chatbot\\questions.json");
			
			JSONTokener tokener = new JSONTokener(readerQuestions);
			JSONObject jsonObject = new JSONObject(tokener);
			//System.out.println(jsonObject.get("A"));	
				
		} catch (Exception e) {
			e.printStackTrace();
		}

        
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
		rules.register(new Rule9());
		rules.register(new Rule10());
		rules.register(new Rule11());
		rules.register(new Rule12());
		rules.register(new Rule13());
		rules.register(new Rule14());
		rules.register(new Rule15());
		rules.register(new Rule16());
		rules.register(new Rule17());
		rules.register(new Rule18());
		rules.register(new Rule19());
		rules.register(new Rule20());
		
		return rules;
	}
}

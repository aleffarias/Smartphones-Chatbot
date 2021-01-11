package com.inferenceEngine.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;

@Rule
public class Rule1 {
	private Variables variable;
	
	@Condition
	public boolean when() {
//		if ((variable.isSmartphone() == false)
//				&& (variable.isMp3() == false)
//				&& (variable.isColorScreen() == false)) {
//			return true;
//		}
		return true;
	}
	
	@Action
	public void then() {
		System.out.println("ok!");
	}
	
//	@Priority
//	public int getPriority() {
//		return 1;
//	}
}

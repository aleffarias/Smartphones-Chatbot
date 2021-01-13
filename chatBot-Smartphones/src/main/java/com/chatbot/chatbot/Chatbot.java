package com.chatbot.chatbot;

import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;

import com.inferenceEngine.InferenceEngine;

public class Chatbot {
	
	public static void main(String[] args) {
		try {
			
			InferenceEngine inferenceEngine = new InferenceEngine();
			
			String textLine = "";
			
			// Welcome Screen
			welcomeScreen();
			
			while(true) {
				System.out.print("Humano : ");
				textLine = IOUtils.readInputTextLine();
				
				// Stop chatbot conditions 
				if ((textLine == null) || (textLine.length() < 1))
					textLine = MagicStrings.null_input;
				if (textLine.equals("q") || textLine.equals("sair")) {
					System.exit(0);
				} else {
					String request = textLine;
					inferenceEngine.executeInferenceEngine();
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void welcomeScreen() {
		System.out.println("***************************************************");
		System.out.println("******************** BEM VINDO ********************");
		System.out.println("***************************************************");
		System.out.println("\nPara sair do chatbot, digite q ou sair\n\n");
		System.out.println("Bot: Olá, para responder as perguntas digite Sim/Não ou s/n!");
		System.out.println("     Sou um sistema de recomendação de Smartphones e irei te ajudar na sua escolha!");
	}
	
}

package controller;

import javax.swing.JOptionPane;
import Model.chatBotModel;

public class controllerChatBot
{
	
	public controllerChatBot() {
		
	}
	
	public void start() {
		askName();
		while(!userText.equalsIgnoreCase("quit")) {
			userText = JOptionPane.showInputDialog(null, "Type 'quit' to exit");
		}
	}
	
	public void interactWithChatBot(){
		
	}
	
	public void get() {
		
	}
	
	public void set() {

	}
}

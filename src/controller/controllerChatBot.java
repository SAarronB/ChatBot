package controller;

import javax.swing.JOptionPane;
import Model.chatBotModel;

public class controllerChatBot
{
	
	private chatBotModel simpleBot;
	
	public controllerChatBot() {
		simpleBot = new chatBotModel();
	}
	 
	public void start() {
		String userText = JOptionPane.showInputDialog(null, "type anything");
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

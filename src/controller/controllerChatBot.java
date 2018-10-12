package controller;

import javax.swing.JOptionPane;

public class controllerChatBot
{
	
	public controllerChatBot() {
		
	}
	
	public void start() {
		String userText = JOptionPane.showInputDialog(null, "");
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

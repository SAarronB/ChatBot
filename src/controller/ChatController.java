package controller;

import javax.swing.JOptionPane;
import Model.ChatBot;

public class ChatController
{
	
	private ChatBot simpleBot;
	
	public ChatController() {
		simpleBot = new ChatBot();
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

package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class ChatController
{
	
	private Chatbot simpleBot;
	
	public ChatController() {
		simpleBot = new Chatbot();
	}
	 
	public void start() {
		String userText = JOptionPane.showInputDialog(null, "type anything");
		while(!userText.equalsIgnoreCase("quit")) {
			userText = JOptionPane.showInputDialog(null, "Type 'quit' to exit");
		}
	}
	
	public String interactWithChatbot(){
		String userResponse = JOptionPane.showInputDialog(null, "type");
		String output = simpleBot.processText(userResponse);
		return output;
	}
	
	public String getChatbot() {
		return "";
	}
	
	public void set() {

	}

	public String useChatbotCheckers(String string)
	{
		// TODO Auto-generated method stub
		return null;
	}
}

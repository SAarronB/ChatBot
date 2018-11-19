package chat.controller;


//------------------------------IMPORT STATMENTS------------------------
import javax.swing.JOptionPane;
import chat.model.Chatbot;
//------------------------------IMPORT STATMENTS------------------------


public class ChatController{
	
//-------------------------------METHOD CALLS----------------------------
	private Chatbot spookyChecker;
	private Chatbot spookyList;
	private Chatbot simpleBot;
	private Chatbot processText;
	private Chatbot askName;
//-------------------------------METHOD CALLS----------------------------

	
//-------------------------------CONSTRUCTOR-----------------------------
 	public ChatController() {
		simpleBot = new Chatbot();
	}
//-------------------------------CONSTRUCTOR-----------------------------

	
//-------------------------------START HERE------------------------------
	public void start() {
		Chatbot myGuy = new Chatbot();
		myGuy.askName();
		myGuy.getCurrentUser(null);
		myGuy.simpleBot(null);
	}
//--------------------------------START HERE----------------------------

//---------------------------CHATBOT INTERATION-------------------------
	public String interactWithChatbot(String string){
		String userResponse = JOptionPane.showInputDialog(null, "type");
		String output = simpleBot.processText(userResponse);
		JOptionPane.showMessageDialog(null, output);
		return output;
	}
//---------------------------CHATBOT INTERATION-------------------------

//---------------------------GETTER AND SETTER-------------------------
	public String getChatbot() {
		return "";
	}
	
	public void set() {

	}
//--------------------------GETTER AND SETTER----------------------------
	

//---------------------------CHATBOT CHECKER------------------------------
	public String useChatbotCheckers(String str)
	{
		String inform = "";
		if(spookyList.equals("Halloween")) {
			inform = "SpookyList has Halloween in first Place";
		}else {
			inform = "null";
		}
		return inform;
	}
//---------------------------CHATBOT CHECKER------------------------------

}

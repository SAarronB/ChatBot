package chat.controller;


//------------------------------IMPORT STATMENTS------------------------
import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;
//------------------------------IMPORT STATMENTS------------------------


public class ChatController{

//-------------------------------METHOD CALLS----------------------------
	private Chatbot spookyChecker;
	private Chatbot spookyList;
	private Chatbot simpleBot;
	private Chatbot processText;
	private Chatbot askName;
	private ChatFrame appFrame;
//-------------------------------METHOD CALLS----------------------------


//-------------------------------CONSTRUCTOR-----------------------------
 	public ChatController() {
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
//-------------------------------CONSTRUCTOR-----------------------------


//-------------------------------START HERE------------------------------
	public void start() {
		
		
		
//		Chatbot myGuy = new Chatbot();
//		myGuy.askName();
//		myGuy.getCurrentUser(null);
//		myGuy.simpleBot();
	}
//--------------------------------START HERE----------------------------

//---------------------------CHATBOT INTERATION-------------------------
	public String interactWithChatbot(String string){
		
		String output = simpleBot.processText(string);
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
	
//---------------------------HANDEL ERRORS--------------------------------
	public void handelErrors(Exception error) {
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}

}

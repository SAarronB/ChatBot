package chat.model;

//------------------------------IMPORT STATMENTS------------------------
import java.util.ArrayList;
import javax.swing.JOptionPane;
//------------------------------IMPORT STATMENTS------------------------


public class Chatbot{
//-----------------------------DATA MEMBERS----------------------------
	// private String theJoke;
	private String currentUser;
	private String joke;
	private String content;
	private ArrayList<String> spookyList;
	private ArrayList responseList;
//----------------------------DATA MEMBERS------------------------------


//---------------------------CONSTRUCTOR---------------------------
	public Chatbot(String string){
		this.content = new String("sample text");
	}

	public Chatbot() {
		this.joke = "Insert Joke Here";
		this.currentUser = new String("default user - boring");
		this.content = new String("empty of all content but not null");

		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		getResponseList();
	}
//--------------------------CONSTRUCTOR---------------------------


//-----------------------------LISTS------------------------------

	public ArrayList<String> getSpookyList(){
		ArrayList<String> spookyList = new ArrayList<String>();
		spookyList.add(0, "Halloween");
		spookyList.add(1, "Halloween");
		spookyList.add(2, "Halloween");
		spookyList.add(3, "Halloween");
		spookyList.add(4, "Halloween");
		spookyList.add(5, "Halloween");
		spookyList.add(6, "Halloween");
		spookyList.add(7, "Halloween");
		spookyList.add(8, "Easter");

		return spookyList;
	}

	public ArrayList<String> getResponseList(){
		ArrayList<String> theResponseList = new ArrayList<String>();
		theResponseList.add(0, "Hello");
		theResponseList.add(1, "What");
		theResponseList.add(2, "is");
		theResponseList.add(3, "Your");
		theResponseList.add(4, "Name");
		theResponseList.add(5, "?");
		theResponseList.add(6, "How");
		theResponseList.add(7, "You");
		theResponseList.add(8, "Spell");
		theResponseList.add(9, "Your");
		theResponseList.add(10, "Name");
		theResponseList.add(11, "?");
		theResponseList.add(12, "Yellow");
		theResponseList.add(13, "Red");
		theResponseList.add(14, "Dog");
		theResponseList.add(15, "Pupper");

		return theResponseList;
	}
//-----------------------------LISTS------------------------------


//-----------------------------TASKS------------------------------
	String nameAnswer = JOptionPane.showInputDialog(null, "What is your name?");
	
	private String joke() {
		String theJoke = "This is joke";
		return theJoke;
	}

	public String askName(String nameAnswer) {
		

		if(nameAnswer == null) {
			JOptionPane.showMessageDialog(null, "Fine Dont Answer!!");
		}else if(nameAnswer.equalsIgnoreCase("quit")){

		}else {
			JOptionPane.showMessageDialog(null, "ChatBot said:" + nameAnswer + ", thats a nice name");
		}
		return nameAnswer;
	}

	public String getCurrentUser(){
		return nameAnswer;
	}
//-----------------------------TASKS------------------------------


//----------------------------RUN TASK-----------------------------
	public String simpleBot(String theJoke) {
		String jokeAnswer = JOptionPane.showInputDialog("Would You Like To Hear A Joke?");
		String out = "";
		if (jokeAnswer.equals("YES") || jokeAnswer.equals("yes") || jokeAnswer.equals("yea")) {
			out = theJoke;
		}else if(jokeAnswer.equals("NO") || jokeAnswer.equals("no")) {
			out = "OK, sheesh";
		}
		return out;
	}

	public String getContent() {
		return content;
	}
//----------------------------RUN TASK------------------------------


//----------------------------CHECKERS-------------------------------

	public boolean contentChecker(String check){
		Boolean ans = false;
		if(check.contains(content)) {
			//WHERE THE START OF WORD IS
			int indexWord = content.indexOf(check);

			//INDEX OF CHECK PLUSE THE LENGTH OF CHECK
			int endIndexWord = indexWord + check.length();

			int whiteSpace = content.indexOf(" ");

			if(content.endsWith(check) && indexWord - 1 == whiteSpace) {
				ans = true;
			}else if(indexWord - 1 == whiteSpace && endIndexWord + 1 == whiteSpace) {
				ans = true;
			}else {
			ans = false;
			}
		}
		return ans;
	}

	public String processText(String spookyPhrase){
		int randomIndex = ((int)(Math.random() * (responseList.size())));
		String outPut1 = "You said: the spooky phrase -> \n" + spookyPhrase;
		if(spookyPhrase.equals("")) {
			String output = outPut1 + "Chatbot says: \n" + randomIndex;
			return output;
		}else {
		String outPut = outPut1 + "Chatbot says: \n" + randomIndex;
		return outPut;
		}
		
	}
		

	public Boolean spookyChecker(String listString){

		Boolean result = false;
		if(listString.contains("Halloween")) {
			result = true;
		}else if(listString.contains("Easter")){
			result = false;
		}else {
			result = null;
		}
		return result;
	}

	public boolean legitimacyChecker(String input){
		boolean isValid = true;
		if(input == null) {
			isValid = false;
		}else if(input.equals("") || input.equals("asdfghjkl")) {
			isValid = false;
		}else if(input.contains("dfg") || input.contains("cvb")) {
		    isValid = false;
		}
		return isValid;
	}
	
//---------------------------CHECKERS--------------------------------
}

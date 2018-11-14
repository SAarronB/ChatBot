package chat.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Chatbot
{
	
	
	private String theJoke;
	private String[] currentUser;
	private String content;
	private ArrayList<String> spookyList;
	private ArrayList responseList;
	
	public Chatbot(String string)
	{
		// TODO Auto-generated constructor stub
	}
	
	public Chatbot() {
		
	
	}

	public String simpleBot(String userText) 
	{
		if (userText.equals("Tell Joke")) {
			return joke();
		}
		return "";
	}
	
	private String joke() {
		this.theJoke = "This is joke";
		return theJoke;	
	}
	
	public String getContent() {
		String check = "sample content";
		
		
		return check;
	}

	public boolean contentChecker(String getContent)
	{
		if(getContent.contains(content)) {
			boolean ans = false;
			int index = content.indexOf(";");
			String str = content.substring(0, index);
			String word = str.contains("disk");
			if(word + 1 == " " && word - 1 == " ") {
				ans = true;
			}else if(word.endsWit
					
					
					
					
					
					
					
					
					
					h("disk") && word - 1 == " ") {
				ans = true;
			}
		}else {
			return false;
		}
		
		
		return false;
	}
	
	public void get() {
		
	}

	public void set() {
		
	}
	
	public String askName() {
		String nameAnswer = JOptionPane.showInputDialog(null, "What is your name?");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		if(nameAnswer == null) {
			JOptionPane.showMessageDialog(null, "Fine Dont Answer!!");
		}else {
			JOptionPane.showMessageDialog(null, nameAnswer + " , thats a nice name");
		}
		return nameAnswer;
	}
	
	public String[] getCurrentUser() {
		String hairAnswer = JOptionPane.showInputDialog(null, "What is your hair Color?");
		String ageAnswer = JOptionPane.showInputDialog(null, "What is your age?");
		String langAnswer = JOptionPane.showInputDialog(null, "What is your name?");
		
		String user[] = new String[2];
		user[0] = hairAnswer;
		user[1] = ageAnswer;
		user[2] = langAnswer;
		return user;
	}

	public String processText(String spookyPhrase)
	{
		String outPut = "";
		int randomIndex = (int)(Math.random() * (responseList.size()));
		
		String outPut1 = "You said: the spooky phrase -> " + spookyPhrase;
		outPut = outPut1 + "Chatbot says: " + randomIndex;
		return outPut;
	}
	
	public Boolean spookyChecker(String phrase){
		 Boolean result = false;
		 String magicWord = "Halloween";
		 String wrongWord = "Easter";
			 if(phrase.contains(magicWord)) {
				 result = true;
			 }else if(phrase.contains(wrongWord)){
				 result = false;
			 }
			 
			 for(String str: spookyList) {
			 	if(str.contains(magicWord)) {
			 		result = true;
			 	}
			 }
		 
		 
//		 if(phrase.contains(magicWord)) {
//			result = true; 
//		 }
//		 for(String word: spookyList) {
//			 if(word.contains(magicWord)) {
//				 result = true;
//			 }
//		 }
//		 if(phrase.contains("easter")) {
//			 	result = false;
//		 	}
		return result;
	}

	public ArrayList<String> getSpookyList()
	{
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

	public boolean legitimacyChecker(String input)
	{
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

	public ArrayList<String> getResponseList()
	{
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
}

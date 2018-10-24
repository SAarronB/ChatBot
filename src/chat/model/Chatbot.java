package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	
	
	private String theJoke;
	private String[] currentUser;
	private String content;
	private ArrayList responseList;
	
	
	public String simpleBot(String userResponse) 
	{
		if (userResponse.equals("Tell Joke")) {
			return joke();
		}
		return "";
	}
	
	private String joke() {
		this.theJoke = "This is joke";
		return theJoke;	
	}
	
	private String content() {
		
		return"";
	}

	public String ChatBot() {
		
		return"";
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
	
	private String[] currentUser() {
		String hairAnswer = JOptionPane.showInputDialog(null, "What is your hair Color?");
		String ageAnswer = JOptionPane.showInputDialog(null, "What is your age?");
		//int ageInt = Integer.parseInt(ageAnswer);
		String langAnswer = JOptionPane.showInputDialog(null, "What is your name?");
		
		String user[] = new String[2];
		user[0] = hairAnswer;
		user[1] = ageAnswer;
		user[2] = langAnswer;
		return user;
	}

	public String processText(String userResponse)
	{
		
		
		
		return userResponse ;
	}

	public Object getSpookyList()
	{
		ArrayList<String> spookyList [];
		
		return null;
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
	
}

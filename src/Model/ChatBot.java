package Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	
	
	private String joke;
	private String currentUser;
	private String content;
	private ArrayList responseList;

	public void simpleBot() 
	{
			
		this.joke = "This is joke";
		this.currentUser = new String("new string");
		this.content = new String("Empty content");
		this.responseList = new ArrayList();
	}
	
	private String joke() {
		return null;	
	}
	
	private String content() {
		
		return"";
	}

	public String chatBotModel() {
		
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
	
}

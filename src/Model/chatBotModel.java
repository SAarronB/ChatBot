package Model;

import javax.swing.JOptionPane;

public class chatBotModel
{
	

	
	public chatBotModel() {
		
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
	
	private String joke() {
		return null;	
	}
	
	private String content() {
		
		return"";
	}
	
}

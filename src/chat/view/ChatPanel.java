package chat.view;

import chat.controller.ChatController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatPanel extends JPanel{
	
//---------------------DATA MEMBERS------------------------
//------------------------BUTTONS--------------------------
	private ChatController appController;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;

	private JTextArea chatArea;
	private JTextField chatField;
	private JScrollPane chatPane;
	private SpringLayout appLayout;

//-------------------------Constructor-----------------------
	public ChatPanel(ChatController appController) {
		super();
		this.appController = appController;
		//BUTTONS
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		
		setupScrollPane();
		setupLayout();
		setupListener();
	}
	
//------------------------SETUPS-----------------------------
	private void setupScrollPane() {
		//SETS UP THE SCROLL
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		//TELLS THE SCROLL WHAT TO DO
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupLayout() {
		
	}
	
	private void setupListener() {
		
	}
	
	
	//-------------------EXTRA CODE---------------------------
//	private void changeBackgroundColor() {
//		int red = (int) (Math.random()*256);
//		int green = (int) (Math.random()*256);
//		int blue = (int) (Math.random()*256);
//		int alfa = (int) (Math.random()*256);
//		chatArea.setBackground(new Color(red,green,blue,alfa));
//		//textLabel.setText("");
//	}
}

package chat.view;

import chat.controller.ChatController;
import java.awt.Color;
import java.awt.Dimension;
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
	private JButton resetButton;
	private JButton saveButton;

	private JTextArea chatArea;
	private JTextField chatField;
	private JScrollPane chatPane;
	private SpringLayout appLayout;

//-------------------------Constructor-----------------------
	public ChatPanel(ChatController appController) {
		super();
		setBackground(Color.DARK_GRAY);
		this.appController = appController;
		//BUTTONS
		chatButton = new JButton("Chat");
		
		checkerButton = new JButton("Check Text");
		loadButton = new JButton("Load");
		resetButton = new JButton("Reset");
		saveButton = new JButton("Save");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatArea.setBackground(Color.GRAY);
		chatPane = new JScrollPane();
		
		setupPanel();
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
	
	private void setupPanel() {
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.MAGENTA);
		
		//add all buttons
		//EXCEPT FOR AREA!!!!!
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(resetButton);
		this.add(chatField);
		
		
	}
	
	private void setupLayout() {
		
	}
	
	private void setupListener() {
		//Code for chat button
		chatButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			String usertext = chatField.getText();
			String respond = "";
			respond = appController.interactWithChatbot(usertext);
			chatArea.append(respond);
			chatArea.setCaretPosition(chatArea.getDocument().getLength());
			chatField.setText("");}});
		
		//Code for reset button
		resetButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			chatArea.setText("");
		}
		
	});
	
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
}

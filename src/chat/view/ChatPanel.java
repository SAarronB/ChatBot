package chat.view;

import chat.controller.ChatController;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import chat.controller.IOController;

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
		appLayout = new SpringLayout();
		//BUTTONS
		chatButton = new JButton("Chat");
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 46, SpringLayout.WEST, this);
		
		checkerButton = new JButton("Check Text");
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 0, SpringLayout.NORTH, chatButton);
		loadButton = new JButton("Load");
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 22, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 0, SpringLayout.NORTH, chatButton);
		resetButton = new JButton("Reset");
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 15, SpringLayout.EAST, checkerButton);
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 25, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 17, SpringLayout.EAST, chatButton);
		
		chatField = new JTextField("Talk to the bot here", 50);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 90, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatField, -33, SpringLayout.NORTH, chatButton);
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
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupPanel() {
		
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.MAGENTA);
		
		//add all buttons
		//EXCEPT FOR AREA!!!!!
		this.add(chatField);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(resetButton);
		chatArea = new JTextArea("Chat Area", 20, 50);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 111, SpringLayout.SOUTH, chatArea);
		add(chatArea);
		chatArea.setBackground(Color.GRAY);
		
		
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
		
		//Code for checker button
		checkerButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			chatArea.setText("");
		}
		
	});
		//Code for save button
		saveButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			String chatText = chatArea.getText();
			String path = ".";
			IOController.saveText(appController, "", "");
			chatArea.setText("Chat saved!");
		}
		
	});
		//Code for reset button
		loadButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
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

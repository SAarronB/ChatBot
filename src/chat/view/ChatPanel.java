package chat.view;

import chat.controller.ChatController;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import chat.controller.IOController;
import java.awt.GridLayout;

public class ChatPanel extends JPanel{
	
//---------------------DATA MEMBERS------------------------
//------------------------BUTTONS--------------------------
	private ChatController appController;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton resetButton;
	private JButton saveButton;
	private JPanel buttonPanel;
	private JButton tweetButton;
	private JButton searchTwitterButton;
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
		checkerButton = new JButton("Check Text");
		loadButton = new JButton("Load");
		resetButton = new JButton("Reset");
		saveButton = new JButton("Save");
		tweetButton = new JButton("Sent Tweet");
		searchTwitterButton = new JButton("Search Twitter");
		
		chatField = new JTextField("Talk to the bot here", 50);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 90, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatField, -33, SpringLayout.NORTH, chatButton);
		chatPane = new JScrollPane();
		buttonPanel = new JPanel(new GridLayout(1,0));
		
		setupPanel();
		setupScrollPane();
		setupLayout();
		setupListener();
	}
	
//-------------------------------HELPER METHOD--------------------------------
	
	private String getPath(String choice) {
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if(choice.equals("save")) {
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}else {
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		return path;
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
		this.setPreferredSize(new Dimension(1024,768));
		this.setBackground(Color.MAGENTA);
		
		//add all buttons
		//EXCEPT FOR AREA!!!!!
		this.add(chatField);
		this.add(chatPane);
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
			String userText = chatField.getText();
			String response = "";
			response = appController.interactWithChatbot(userText);
			chatArea.append(response);
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
			IOController.saveText(appController, path, chatText);
			chatArea.setText("Chat saved!");
		}
		
	});
		//Code for reset button
		loadButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			chatArea.setText("");
		}
		
	});
		//Code for reset button
		loadButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent click){
			String path = getPath("load");
			String chatText = IOController.loadFile(appController, path);
			chatArea.setText(chatText);
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

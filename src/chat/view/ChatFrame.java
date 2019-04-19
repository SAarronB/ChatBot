package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import chat.view.ChatPanel;
public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;

	public ChatFrame(ChatController chatController) {
		super();
		this.appController = chatController;
		this.appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(1024, 768);
		this.setTitle("Bears, Beats, BattelStar Galactica and Twitter");
		this.setResizable(false);
//+---------SETVISIBLE MUST BE THE LAST LINE IN A FRAME SETUP METHOD-----------+
		this.setVisible(true);
	}
}

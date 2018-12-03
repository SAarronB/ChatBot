package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
public class ChatFrame extends JFrame
{
	public ChatFrame(ChatController appController) {
		super();
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Bears, Beats, BattelStar Galactica");
		this.setResizable(false);
//+---------SETVISIBLE MUST BE THE LAST LINE IN A FRAME SETUP METHOD-----------+
		this.setVisible(true);
	}
}

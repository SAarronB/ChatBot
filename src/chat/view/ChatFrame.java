package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import chat.view.ChatPanel;
public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPane;

	public ChatFrame(ChatController chatController) {
		super();
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPane);
		this.setSize(1000, 500);
		this.setTitle("Bears, Beats, BattelStar Galactica");
		this.setResizable(false);
//+---------SETVISIBLE MUST BE THE LAST LINE IN A FRAME SETUP METHOD-----------+
		this.setVisible(true);
	}
}

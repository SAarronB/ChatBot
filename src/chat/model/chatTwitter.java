package chat.model;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import chat.controller.ChatController;
public class chatTwitter{
	private Twitter chatTwitter;
	private ChatController app;
	public chatTwitter(ChatController app) {
		this.app = app;
		this.chatTwitter = TwitterFactory.getSingleton();
	}
}

package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotView;

public class ChatBotAppController
{

	private ChatBotView applicationView;
	private ChatBot mySillyChatBot;
	
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		mySillyChatBot = new ChatBot("DumbleDoob");
	}
	
	public void start()
	{
		String result = applicationView.showChatBot("Ricky");
		
		while(!mySillyChatBot.quitChecker(result))
		{
			result = applicationView.showChatBot(result);
		}
		
		quit();
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Good bye cruel world!");
		System.exit(0);
	}
		
}
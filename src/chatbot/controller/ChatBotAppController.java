package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotView;

public class ChatBotAppController
{

	private ChatBotView applicationView;
	private ChatBot mySillyChatBot;
	

	/**
	 * gives a name to the ChatBot.
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		mySillyChatBot = new ChatBot("DumbleDoob");
	}

	/**
	 * Starts the method that begins the while loop.
	 */
	public void start()
	{
		String result = applicationView.showChatBot("Ricky");
		
		/**
		 * Keeps the program running until the quit command,"Bai", is typed.
		 */
		while(!mySillyChatBot.quitChecker(result))
		{
			result = applicationView.showChatBot(result);
		}
		
		quit();
	}
	
	/**
	 * Gives the message,"Goodbye cruel world!", when the quit command is typed.
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Goodbye cruel world!");
		System.exit(0);
	}
		
}
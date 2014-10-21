package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotFrame;
import chatbot.view.ChatBotView;


/**
 * Runs the ChatBot project. Owns the model and associated views.
 * @author Richard Jones
 * @version 1.2 10/9/14 - Cleaned the quit method.
 */
public class ChatBotAppController
{

	private ChatBotView applicationView;
	private ChatBot mySillyChatBot;
	private String startMessage;
	private String quitMessage;
	/**
	 * Reference to the GUI JFrame object for the app.
	 */
	private ChatBotFrame appFrame;

	/**
	 * gives a name to the ChatBot.
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		appFrame = new ChatBotFrame(this);
		mySillyChatBot = new ChatBot("DumbleDoob");
		startMessage = "Welcome to the " + mySillyChatBot.getName() + "ChatBot9001. What is your name?";
		quitMessage = "goodbye cruel user :(";
	}
	
	public ChatBot getMySillyChatBot()
	{
		return mySillyChatBot;
	}
	/**
	 * Starts the method that begins the while loop.
	 */
	public void start()
	{
		String result = applicationView.showChatBot(startMessage);
		
		/**
		 * Keeps the program running until the quit command,"Bai", is typed.
		 */
//		while(!mySillyChatBot.quitChecker(result))
//		{
//			result = mySillyChatBot.proccessText(result);
//			result = applicationView.showChatBot(result);
//		}
//		
//		quit();
	}
	
	/**
	 * Gives the message,"Goodbye cruel world!", when the quit command is typed.
	 */
	private void quit()
	{
		applicationView.showChatBotMessage(quitMessage);
		System.exit(0);
	}
		
}

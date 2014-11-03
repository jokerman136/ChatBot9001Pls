package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotFrame;
import chatbot.view.ChatBotPanel;
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
	 * Constructor for the chatbot appcontroller.
	 * TO SEND MESSAGES TO OTHER PACKAGES
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
		
		((ChatBotPanel) appFrame.getContentPane()).showTextMessage(startMessage);
		
		//ChatBotPanel testPanel = (ChatBotPanel) appFrame.getContentPane();
		// testPanel.showTextMessage(startMessage);
		
		/**
		 * Keeps the program running until the quit command,"Bai", is typed.
		 */
		
	}
	
	public String getChatBotDialog(String input)
	{
		String result = "";
		if(mySillyChatBot.quitChecker(input))
		{
			quit();
		}	
		result = mySillyChatBot.proccessText(input);
			
		return result;
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

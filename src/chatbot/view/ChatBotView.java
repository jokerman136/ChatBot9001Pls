package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotAppController;

/**
 * 
 * @author rjon7928
 *
 */
public class ChatBotView
{
	private ChatBotAppController baseController;
	
	public ChatBotView(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Shows a String from the ChatBot with the availability of user input.
	 * @param currentInput The supplied String.
	 * @return The users typed response.
	 */
	public String showChatBot(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatBot() + " says: " + currentInput);
				
		return result;
	}
	
	
	/**
	 * Shows a String from the ChatBot as a popup window.
	 * @param currentInput The string from the ChatBot.
	 */
	public void showChatBotMessage(String currentInput)
	{
		JOptionPane.showInputDialog(null, baseController.getMySillyChatBot() + " says: " + currentInput);
	}
}
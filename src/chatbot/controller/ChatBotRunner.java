package chatbot.controller;

/**
 * The runner for the ChatBot.
 * @author rjon7928
 * @version 10/1/14
 */
public class ChatBotRunner
{
	/**
	 * Starting point for all Java programs.
	 * @param args Unused!
	 */
	public static void main(String[] args)
	{
		ChatBotAppController appController = new ChatBotAppController();
		appController.start();
	}
}
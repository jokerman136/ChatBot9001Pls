package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.view.ChatBotView;

public class ChatBotAppController
{

	private ChatBotView applicationView;
	
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
	}
	
	public void start()
	{
		String result = applicationView.showChatBot("Ricky");
		
		if(result.equalsIgnoreCase("exit"))
		{
			quit();
		}
	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Good bye cruel world!");
		System.exit(0);

	}
}
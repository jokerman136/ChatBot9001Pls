package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotAppController;

public class ChatBotFrame extends JFrame
{
	private ChatBotPanel basePanel;
	
	public ChatBotFrame(ChatBotAppController baseController) 
	{
		basePanel = new ChatBotPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		setVisible(true);
	}
}

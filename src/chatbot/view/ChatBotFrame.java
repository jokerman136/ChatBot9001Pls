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
	
	/**
	 * Changes the setup and size of the frame.
	 */
	private void setupFrame()
	{
		
		this.setContentPane(basePanel);
		this.setSize(600, 350);
		setVisible(true);
	}
}

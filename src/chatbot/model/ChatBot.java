package chatbot.model;

import java.util.ArrayList;

/**
 * 
 * @author rjon7928
 * @version 1.1 9/26/14
 */
public class ChatBot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;

	/**
	 * Creates a ChatBot object with supplied name and initializes current # chats to 0.
	 * @param name The supplied name for the ChatBot.
	 */
	public ChatBot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	/**
	 * Processes input from the user against the checker methods. Returns the next output for the view.
	 * @param currentInput The supplied text.
	 * @return The processed text based on the checker or other methods.
	 */
	public String proccessText(String currentInput)
	{
		String result = "";
		
		return result;
	}

	/**
	 * Returns the name of the ChatBot object.
	 * @return The current name of the ChatBot.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 *
	 * @return
	 */
	public int getChatCount()
	{
		return chatCount;
	}

	/**
	 * Sets the name of the ChatBot.
	 * @param name The new name for the chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Updates the amounts of chats by adding one.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	/**
	 * Uses a boolean to check an input to quit the ChatBot.
	 * @param input Takes the input from the user and checks it.
	 * @return Takes the true/false and returns it.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		/**
		 * Need to have NOT null AND input
		 */
		if(input != null && input.equals("Bai"))
		{
			okToQuit = true;
		}
		return okToQuit;
		
	}
}
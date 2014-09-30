package chatbot.model;

/**
 * 
 * @author rjon7928
 * @version 1.1 9/26/14
 */
public class ChatBot
{

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
	 * Returns the name of the ChatBot object.
	 * @return The current name of the ChatBot.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * This is a really important method. Add lots of lines
	 * see more lines
	 * and even more
	 * wOw...
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
		
		if(input.equals("Bai"))
		{
			okToQuit = true;
			return okToQuit;
		}
		else return okToQuit;
	}
}
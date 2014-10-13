package chatbot.model;

import java.util.ArrayList;

/**
 * The ChatBot model class. Used for checking and manipulating Strings.
 * 
 * @author rjon7928
 * @version 1.1 9/26/14
 */
public class ChatBot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	private ArrayList<String> contentList;

	/**
	 * Creates a ChatBot object with supplied name and initializes current #
	 * chats to 0.
	 * 
	 * @param name
	 *            The supplied name for the ChatBot.
	 */
	public ChatBot(String name)
	{
		memeList = new ArrayList<String>();
		contentList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
		fillTheContentList();
	}
	
	


	/**
	 * Returns the name of the ChatBot object.
	 * 
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
	 * 
	 * @param name
	 *            The new name for the chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("trollface");
		memeList.add("doge");
		memeList.add("me gusta");
		memeList.add("y u no");
		memeList.add("ermahgerd");
		memeList.add("Chuck Noris");
		memeList.add("grumpy cat");
		memeList.add("harlem shake");
		memeList.add("rickrolled");
	}
	
	private void fillTheContentList()
	{
		contentList.add("doom");
		contentList.add("pizza");
		contentList.add("mountain dew");
		contentList.add("computers");
		contentList.add("shoes");
		contentList.add("ivan");
		contentList.add("CSGO");
	}

	/**
	 * Processes input from the user against the checker methods. Returns the
	 * next output for the view.
	 * 
	 * @param currentInput
	 *            The supplied text.
	 * @return The processed text based on the checker or other methods.
	 */
	public String proccessText(String currentInput)
	{
		String result = "";

		int randomPosition = (int) (Math.random() * 3);

		if (randomPosition == 0)
		{
			// stringChecker here
			if(stringChecker(currentInput))
			{
				result = "too long";
			}
			else
			{
				result = "short words";
			}
		}
		else if (randomPosition == 1)
		{
			if (contentChecker(currentInput))
			{
				result = "wow, " + currentInput + " is something I personally love!";
			}
			else
			{
				result = "Meh, I don't really care about " + currentInput;
			}
		}
		else
		{
			if (memeChecker(currentInput))
			{
				result = "wow, " + currentInput + " is a meme trololo!";
			}
			else
			{
				result = "not a meme, try again";
			}
		}
		return result;
	}

	/**
	 * Updates the amounts of chats by adding one.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	private boolean contentChecker(String input)
	{
		boolean contThis = false;
		
		for (String currentContent : contentList)
		{
			if(input.contains(currentContent))
			{
				contThis = true;
			}
		}
		return contThis;
	}
	
	private boolean stringChecker(String input)
	{
		boolean tooLongString = false;
		
		if (input.length() > 21)
		{
			tooLongString = true;
			return tooLongString;
		}
		else return tooLongString;
		
	}
	
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	/**
	 * Uses a boolean to check an input to quit the ChatBot.
	 * 
	 * @param input
	 *            Takes the input from the user and checks it.
	 * @return Takes the true/false and returns it.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		/**
		 * Need to have NOT null AND input
		 */
		{
			if (input != null && input.equals("Bai"))

				okToQuit = true;
		}
		return okToQuit;

	}
}
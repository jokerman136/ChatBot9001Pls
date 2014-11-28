package chatbot.model;

import java.util.ArrayList;

/**
 * The ChatBot model class. Used for checking and manipulating Strings.
 * 
 * @author rjon7928
 * @version 1.5 11/19/14 Updated process text
 */
public class ChatBot
{
	/**
	 * The programmer supplied list of memes.
	 */
	private ArrayList<String> memeList;
	/**
	 * Name of the chatbot.
	 */
	private String name;
	/**
	 * The programmer specified content area for the contentChecker method.
	 */
	private int chatCount;
	private ArrayList<String> contentList;
	private ChatBotUser myUser;
	private ArrayList<String> userInputList;

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
		userInputList = new ArrayList<String>();
		contentList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		myUser = new ChatBotUser();
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
	 * Sets the integer for the chat count.
	 * 
	 * @return
	 */
	public int getChatCount()
	{
		return chatCount;
	}

	public ChatBotUser getMyUser()
	{
		return myUser;
	}

	public void setMyUser(ChatBotUser myUser)
	{
		this.myUser = myUser;
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

	/**
	 * Creates a list of memes that the memechecker will check.
	 */
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
		memeList.add("( ͡° ͜ʖ ͡°)");
	}

	/**
	 * Creates a list of key terms that will be checked by the content checker.
	 */
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

		if (getChatCount() < 7)
		{
			result = introduceUser(currentInput);
		}
		else if (currentInput != null && currentInput.length() > 0)
		{
			result = randomChatConversation(currentInput);
		}
		else
		{
			result = "Don't just sit there and lallygoog about. TYPE!";
			chatCount--;
		}
		updateChatCount();
		return result;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;

		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--; // When removing, manually adjust loop counter back
							 // by one so no skipping.
			}
		}
		return matchesInput;
	}

	/**
	 * Updates the amounts of chats by adding one.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private boolean contentChecker(String input)
	{
		boolean contThis = false;

		for (String currentContent : contentList)
		{
			if (input.contains(currentContent))
			{
				contThis = true;
			}
		}
		return contThis;
	}

	/**
	 * This is the string checker to check if the input is too long or too
	 * short.
	 * 
	 * @param input
	 *            Takes the input from the user to check.
	 * @return Returns the true/false value depending on the input length.
	 */
	private boolean stringChecker(String input)
	{
		boolean tooLongString = false;

		if (input.length() > 21)
		{
			// your mothertooLongString = true;
			return tooLongString;
		}
		else
			return tooLongString;
	}
	
	/**
	 * Creates the meme checker that takes input and check it with the meme
	 * list.
	 * 
	 * @param input
	 *            Take the input from user to match with any memes in the meme
	 *            list.
	 * @return Returns weather the input is a meme or not.
	 */
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
	private String introduceUser(String input)
	{
		String userQuestion = "";
		
		// Ask Questions about all data memebers here
					// you will need ifs or a switch
					if (getChatCount() == 0)
					{
						myUser.setUserName(input);
						userQuestion = "Good name " + myUser.getUserName() + ", how old are you?";
					}
					else if (getChatCount() == 1)
					{
							int userAge = Integer.parseInt(input);
						myUser.setAge(userAge);
						userQuestion = "Well now, don't try and flatter yourself. So are you a wizard?";
					}
					else if (getChatCount() == 2)
					{
						boolean isWizard = Boolean.parseBoolean(input);
						myUser.setWizard(isWizard);
						userQuestion = "Wow, " + myUser.getUserName() + ", Maybe I can teach you my wizard skills. Do you need a cookie?";
					}
					else if (getChatCount() == 3)
					{
						boolean needsACookie = Boolean.parseBoolean(input);
						myUser.setNeedsACookie(needsACookie);
						userQuestion = "Well I have my cookies so that's all that matters. Talking about cookies, how much do you weigh?";
					}
					else if (getChatCount() == 4)
					{
						double weight = Double.parseDouble(input);
						myUser.setWeight(weight);
						userQuestion = "";
					}
					return userQuestion;
	}
	
	private String randomChatConversation(String input)
	{
		String conversation = "";
		
		int randomPosition = (int) (Math.random() * 6);

		if (randomPosition == 0)
		{
			// stringChecker here
			if (stringChecker(input))
			{
				conversation = "too long";
			}
			else
			{
				conversation = "short words";
			}
		}
		else if (randomPosition == 1)
		{
			/**
			 * If statement that checks if the input matches anything from
			 * the content list.
			 */
			if (contentChecker(input))
			{
				conversation = "wow, " + input + " is something I personally love!";
			}
			else
			{
				conversation = "Meh, I don't really care about " + input;
			}
		}
		else if (randomPosition == 2)
		{
			/**
			 * If statement that checks the input if it matches with
			 * anything from the meme list.
			 */
			if (memeChecker(input))
			{
				conversation = "wow, " + input + " is a meme trololo!";
			}
			else
			{
				conversation = "not a meme, try again";
			}
		}
		else if (randomPosition == 3)
		{
			conversation = userTopic(input);
		}
		else if (randomPosition == 4)
		{
			// add to our list
			userInputList.add(input);
			conversation = "Thank you for the comment";
		}
		else if(randomPosition == 5)
		{
			if(mashChecker(input))
			{
				conversation = mashingDetect(input);
			}
			else
			{
				conversation = noMashDetect(input);
			}
		}
		else
		{
			if (userInputChecker(input))
			{
				conversation = "What a day, you removed it from the list";
			}
			else
			{
				conversation = "That wasn't in the conversation before";
			}
			
		}
		return conversation;
	}
	
	private String mashingDetect(String input)
	{
		String mashed = "";
		mashed = input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		return mashed;
	}
	
	private String noMashDetect(String input)
	{
		String noMashing = "Thanks for not going angry german kid on me";
		if(input.length() > 1)
		{
		noMashing += input.substring(input.length()/3, input.length()/2);
		}
		return noMashing;
	}
	
	/**
	 * Checks for keyboard mashing
	 * @param userInput User supplied text.
	 * @return Whether mashing has been dectector.
	 */
	private boolean mashChecker(String userInput)
	{
		
		boolean isMashing = false;
		
		if(userInput.indexOf("fasgd") > -1)
		{
			isMashing = true;
		}
		
		return isMashing;
	}
	private String userTopic(String userInput)
	{
		String userBasedResponse = "";	
		int randomUserTopic = (int) (Math.random() * 6);
		switch(randomUserTopic)
		{
		case 1:
			userBasedResponse = myUser.isWizard() + " Response to wizards";
			break;
		case 0:
			userBasedResponse = myUser.getUserName() + " is a strange name to me.";
			break;
		default:
			userBasedResponse = myUser.getAge() + " is quite old for me.";
			break;
		}
		return userBasedResponse;
	}
}
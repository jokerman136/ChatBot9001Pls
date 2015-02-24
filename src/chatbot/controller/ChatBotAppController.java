package chatbot.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotFrame;
import chatbot.view.ChatBotPanel;
import chatbot.view.ChatBotView;

/**
 * Runs the ChatBot project. Owns the model and associated views.
 * 
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
	 * Constructor for the chatbot appcontroller. TO SEND MESSAGES TO OTHER
	 * PACKAGES
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		appFrame = new ChatBotFrame(this);
		mySillyChatBot = new ChatBot("DumbleDoob");
		startMessage = "Welcome to the " + mySillyChatBot.getName() + ", ChatBot9001. What is your name?";
		quitMessage = "goodbye cruel user :(";
	}

	public void saveText(String conversation, boolean appendToEnd)
	{
		String fileName = "C:/Users/rjon7928/Documents/chatbot/saved text.txt";
		PrintWriter outputWriter;

		if (appendToEnd)
		{
			try
			{
				outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
				outputWriter.println(conversation);
				outputWriter.close();
			}
			catch (FileNotFoundException noExistingFile)
			{
				JOptionPane.showMessageDialog(appFrame, "There is not file bb");
				JOptionPane.showMessageDialog(appFrame, noExistingFile.getMessage());
			}
			catch (IOException inputOutputError)
			{
				JOptionPane.showMessageDialog(appFrame, "There is not file bb");
				JOptionPane.showMessageDialog(appFrame, inputOutputError.getMessage());
			}
		}
		else
		{
			try
			{
				outputWriter = new PrintWriter(fileName);
				outputWriter.println(conversation);
				outputWriter.close();
			}
			catch (FileNotFoundException noFileIsThere)
			{
				JOptionPane.showMessageDialog(appFrame, "There is no file here bb");
			}
		}
	}

	/**
	 * Reads text from a file. Returns the contents of the file as a String
	 * 
	 * @return
	 */
	public String readTextFromFile()
	{
		String fileText = "";
		String filePath = "C:/Users/rjon7928/Documents/chatbot/";
		String fileName = filePath + "saved text.txt";
		File inputFile = new File(fileName);

		try
		{
			Scanner fileScanner = new Scanner(inputFile);
			while (fileScanner.hasNext())
			{
				fileText += fileScanner.nextLine() + "\n";
			}

			fileScanner.close();
		}
		catch (FileNotFoundException fileException)
		{
			JOptionPane.showMessageDialog(appFrame, "The File is not here bb");
		}

		return fileText;
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

		// ((ChatBotPanel)
		// appFrame.getContentPane()).showTextMessage(startMessage);

		ChatBotPanel testPanel = (ChatBotPanel) appFrame.getContentPane();
		testPanel.showTextMessage(startMessage);

		/**
		 * Keeps the program running until the quit command,"Bai", is typed.
		 */

	}

	public String sendTextToChatBot(String userInput)
	{
		String result = "";

		result = mySillyChatBot.proccessText(userInput);

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

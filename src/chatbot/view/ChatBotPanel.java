package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotAppController;


public class ChatBotPanel extends JPanel
{
	private ChatBotAppController baseController;
	
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatBotPanel(ChatBotAppController baseController) 
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Click the button... It clicks ducks.");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(12,45);
		chatPane = new JScrollPane(chatArea);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	
	/**
	 * The settings of the panel and how it is setup. (color, size, etc.)
	 */
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
	}
	
	
	/**
	 * Where you store all the code that deals with the layout of the panel.
	 */
	private void setupLayout()
	{
		/**
		 * ALWAYS PUT THESE IN THE "setupLayout" METHOD.
		 */
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -33, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 1, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -6, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 33, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput= firstTextField.getText();
				String result = baseController.sendTextToChatBot(currentInput);
				showTextMessage(currentInput);
				showTextMessage(result);
				firstTextField.setText("");
				firstTextField.requestFocus();
			}
		});
	}
	
	public void showTextMessage(String userInput)
	{
		chatArea.append("\n" + userInput);
	}
}

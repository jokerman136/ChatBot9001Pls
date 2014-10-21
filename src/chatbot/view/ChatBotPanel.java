package chatbot.view;

import java.awt.Color;

import javax.swing.JPanel;

import chatbot.controller.ChatBotAppController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ChatBotPanel extends JPanel
{
	private ChatBotAppController baseController;
	
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public ChatBotPanel(ChatBotAppController baseController) 
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Click the button... It clicks the chicks.");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -33, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		
	}
	
}

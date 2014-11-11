package chatbot.model;

public class ChatBotUser
{
	// four data members
	// at least two different types (String, int, boolean, double....)
	private String userName;
	private int age;
	private boolean isWizard;
	private boolean needsACookie;
	private double weight;
	
	
	public ChatBotUser()
	{
		this.userName = "";
		this.age = -999;
		this.isWizard = true;
		this.needsACookie = false;
		this.weight = 534.4;
	}
	public String getUserName()
	{
		return userName;
	}
	public int getAge()
	{
		return age;
	}
	public boolean isWizard()
	{
		return isWizard;
	}
	public boolean isNeedsACookie()
	{
		return needsACookie;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public void setWizard(boolean isWizard)
	{
		this.isWizard = isWizard;
	}
	
	public void setNeedsACookie(boolean needsACookie)
	{
		this.needsACookie = needsACookie;
	}
	
}

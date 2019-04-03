package testNG;

import org.testng.annotations.Test;
public class Grouping 
{
	//"check-mail" group test method.
	@Test(groups={"check-mail"}, priority =0) 
	public void logIn()
	{ 
		System.out.println("Log In."); 
    }
	//Do not have any group. 
	@Test
	public void viewNews()
	{
		System.out.println("Viewing News."); 
	}
	//"check-mail" group test method. 
	@Test(groups={"check-mail"}, priority =1) 
	public void checkMail()
	{
		System.out.println("Checking Mail."); 
	}
	//"check-mail" group test method. 
	@Test(groups={"check-mail"}, priority =2) 
	public void logOut()
	{
		System.out.println("Logout."); 
	}
}
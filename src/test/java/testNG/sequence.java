package testNG;

import org.testng.annotations.Test;

public class sequence {
	@Test(priority = 2)
	public void apple()
	{
		System.out.println("apple");
	}
	@Test(priority = 1)
	public void banana()
	{
		System.out.println("banana");
	}
	@Test //.......default priority = 0
	public void chikoo()
	{
		System.out.println("chikoo");
	}
	
}

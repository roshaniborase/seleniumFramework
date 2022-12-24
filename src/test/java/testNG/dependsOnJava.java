package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnJava {
	@Test
	public void sendRequest()
	{
		System.out.println("sending request");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods = "sendRequest")
	public void acceptRequest()
	{
		System.out.println("accepting request");
	}
}

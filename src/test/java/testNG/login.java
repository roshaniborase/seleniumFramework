package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public void m1()
	{
		System.out.println("m1");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before classs");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	
	
}

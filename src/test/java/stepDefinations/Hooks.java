package stepDefinations;

import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@MobileTest")
	public void beforevalidation() 
	{
           System.out.println("Mobile before Hook");
		
	}
}

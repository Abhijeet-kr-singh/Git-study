package com.TY_Rmg.projects;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContactTest() {
		String url=System.getProperty("URL");
		String browser = System.getProperty("Browser");
		System.out.println("URL is: "+url);
		System.out.println("Browser is: "+browser);
	}

}

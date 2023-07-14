package maven_01;

import org.testng.annotations.Test;

public class Class_01 {

	@Test(priority = 1, groups = {"Sanity"})
	public void lauchBrowser() {

		System.out.println("Launch the Browser");
	}

	@Test(priority = 0,  groups = {"Sanity"})
	public void openURL() {
		System.out.println("Open URL");
	}

	@Test(priority = 2,  groups = {"Regression"})
	public void close() {
		System.out.println("Close the Browser");
	}

}

package maven_01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationstenstNG {

	@BeforeTest
	public void btest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void atest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void bSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void aSuite() {
		System.out.println("After Suite");

	}

	@Test (groups = {"Sanity"})
	public void test1() {
		System.out.println("Test 1");
	}

	@Test (groups = {"Regression"})
	public void test2() {
		System.out.println("Test 2");
	}

	@BeforeClass
	public void bclass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void aclass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}

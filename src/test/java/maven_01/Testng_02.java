package maven_01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_02 {

	@BeforeMethod
	public void before() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void after() {
		System.out.println("After Method");
	}

	@Test
	public void method1() {

		System.out.println("method1");
	}

	@Test( groups = {"Sanity"})
	public void method2() {
		System.out.println("method2");
	}
	
	@Test
	public void method3() {
		System.out.println("method3");
	}
	
	
	@Test
	public void method4() {
		System.out.println("method4");
	}
	
	@Test(enabled = true)
	public void method5() {
		System.out.println("method5");
	}

}

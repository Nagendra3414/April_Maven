package maven_01;

import org.testng.annotations.Test;

public class TestNG_3 {

	
	
	@Test
	public void launch()
	{
		System.out.println("Testing1");
	}
	
	@Test
	public void close()
	{
		System.out.println("Testing2");
	}
	
	
	@Test(dependsOnMethods ="launch")
	public void open()
	{
		System.out.println("Testing3");
	}
	
	
	@Test
	public void zzz()
	{
		System.out.println("Testing4");
	}
}

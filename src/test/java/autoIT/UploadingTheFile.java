package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingTheFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//*[text() ='Select PDF file']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Nagendra\\OneDrive\\Desktop\\AutoIT_Upload.exe");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}

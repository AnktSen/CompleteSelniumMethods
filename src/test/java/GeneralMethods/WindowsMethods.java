package GeneralMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsMethods {

	@Test
	public void general() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().fullscreen();
		
		Thread.sleep(4000);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		

	}

}

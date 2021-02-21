package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Demo Start ChromeDriver with SELENIUM.");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		 //driver.quit();
		 System.out.println("Execution complete.");

	}

}

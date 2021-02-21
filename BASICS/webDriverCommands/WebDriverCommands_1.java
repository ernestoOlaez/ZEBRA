package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Start with WebDriver Commands!");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		//Create a new instance for Chrome
		WebDriver driver=new ChromeDriver();
		String URL="https://demoqa.com";
		
		//Launch the WebSite
		driver.get(URL);
		
		//Store the title in a String variable
		String Title=driver.getTitle();
		
		int titleLenght=driver.getTitle().length();
		
		//Printing the Title and titleLenght
		System.out.println("The title of the page is:"+ Title);
		System.out.println("The lenght of the title is:"+ titleLenght);

	}

}

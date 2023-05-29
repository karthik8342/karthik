package Assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	for(int i=0; i<3;i++);
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		
	}
	
	for(int j=0; j<3; j++)
		js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(3000);
	}

}

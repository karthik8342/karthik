package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classwork {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
	WebElement	ele =driver.findElement(By.xpath("//a[.='Login']"));
	String att=ele.getAttribute("href");
	System.out.println(att);
	
		
		

	}
	

}

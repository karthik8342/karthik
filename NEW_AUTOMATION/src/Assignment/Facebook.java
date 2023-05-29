package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7026268342");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("70262683");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}

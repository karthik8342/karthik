package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7026268342");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("70262683");
		driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();

	}

}

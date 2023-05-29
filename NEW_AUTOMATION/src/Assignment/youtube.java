package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf kannada trailer");
	
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		
		
		driver.findElement(By.cssSelector("span[dir='auto']")).click();
		

		

	}

}


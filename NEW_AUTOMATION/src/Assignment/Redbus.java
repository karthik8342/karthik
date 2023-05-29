package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://redbus.com");
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("(//span[.='3'])[1]")).click();
		

	}

}

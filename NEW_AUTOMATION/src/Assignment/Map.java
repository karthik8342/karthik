package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Map {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.googlemaps.com");
	//	driver.findElement(By.xpath("//div[class='gb_Nf gb_s']")).click();
		
driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("bangalore");
	}

}

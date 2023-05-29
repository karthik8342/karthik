package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ilike_u {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://youtube.com");
		driver.findElement(By.xpath("//button[@id='button']")).sendKeys("kgf kannada trailer");
		driver.findElement(By.xpath("//yt-icon[@class='topbar-icons style-scope ytd-masthead']")).click();
	

		
		
		driver.findElement(By.xpath("//span[@dir='auto']")).click();
		driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();
	
		

	}

}

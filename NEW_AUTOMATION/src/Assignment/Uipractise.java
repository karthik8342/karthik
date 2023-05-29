package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uipractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.findElement(By.xpath("//a[.='Form']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@placeholder='Enter LastName']")).sendKeys("U");
		driver.findElement(By.xpath("//input[.='radio']")).click();
		//driver.findElement(By.xpath("//input[@value='cricket']")).click();
		//driver.findElement(By.xpath("//select[@class='form-control dropdown-header']")).click();
		//driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();

		
		
		

	}

}

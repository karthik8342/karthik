package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passdata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/kk.html");
		List<WebElement> links = driver.findElements(By.tagName("input"));
		int count=links.size();
		System.out.println(count);
		for (WebElement webElement : links) {
			
			webElement.sendKeys("karthik");
		
			
			
		}
		
		for (WebElement webElement : links) {
			
			webElement.clear();
			
			
		}
		}

	}
	



package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class images {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.in");
	    List<WebElement> links = driver.findElements(By.xpath("//img")) ;
	    int count=links.size();
	    System.out.println(count);
	    for (WebElement webElement : links) {
	    	
	    	String t=webElement.getAttribute("src");
	    	
	    	System.out.println(t);
	    	
			
		}
	 

	}

}

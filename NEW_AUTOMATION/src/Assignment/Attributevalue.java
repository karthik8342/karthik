package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	List<WebElement>  links=driver.findElements(By.xpath("//a"));
	int count=links.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement we=links.get(i);
		String t=we.getAttribute("href");
		System.out.println(t);
	}
		
	

	}

}

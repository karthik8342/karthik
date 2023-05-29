package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/checkbox.html");
	
	List<WebElement>  links=driver.findElements(By.xpath("//input"));
	int count=links.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement we=links.get(i);
	   we.click();
	   Thread.sleep(2000);
	   System.out.println(we);
	   
	   
	   
	   
	   
	   


	}
	for(int j=count-1;j>=0;j--)
	{
		WebElement we=links.get(j);
		   we.click();
		   
		  System.out.println(we);

		
	}

	}
}

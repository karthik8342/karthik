package Assignment;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Pass_url {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("7026268342");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("70262683");
		driver.findElement(By.name("login")).click();

		

	}

}


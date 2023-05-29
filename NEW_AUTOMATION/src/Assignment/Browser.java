package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[]args)
	{
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver =new ChromeDriver();
		
		//String key1="webdriver.geekodriver.exe";
		//String value2="./software/geekodriver.exe";
		//System.setProperty(key1, value2);
		//FirefoxDriver driver1=new FirefoxDriver();
		
		
		
	}

}

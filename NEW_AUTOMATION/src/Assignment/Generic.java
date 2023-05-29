package Assignment;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic {
	
	public static void getphoto(WebDriver driver) throws IOException {
		String photo= "./failedtcs/";
	Date d= new Date();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(photo+d+".jpeg");
	
	FileHandler.copy(src, dst);
	

	}

}

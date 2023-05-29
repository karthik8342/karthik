import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demoweb {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https:/www.meesho.com/");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("7026268342");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("70262683");
		//driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
//driver.findElement(By.xpath("(//button[text()='Save Info'])"));
//Alert alert = driver.switchTo()	.alert();
//alert.accept();

			
		}

	}



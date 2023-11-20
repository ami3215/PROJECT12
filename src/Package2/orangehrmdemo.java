package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmdemo {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//Amisha Jha//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}

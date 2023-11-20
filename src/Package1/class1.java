package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static String url="https://demo.guru99.com/test/newtours/login.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//Amisha Jha//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}

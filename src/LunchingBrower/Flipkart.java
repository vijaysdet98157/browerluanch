package LunchingBrower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver;
		String driverpath = System.getProperty("user.dir")+"\\brower\\chromedriver_2.exe";
		System.out.println(driverpath);
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		driver.findElement(By.name("q")).sendKeys("vijay");
		//driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.cssSelector("._2AkmmA _29YdH8")).click();
		

	}

}

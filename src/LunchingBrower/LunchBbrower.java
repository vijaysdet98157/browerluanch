package LunchingBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBbrower {

	public static void main(String[] args) {
		String url="https://www.flipkart.com/";
	String driverpath=System.getProperty("user.dir")+"\\brower\\chromedriver_2.exe";
	System.out.println(driverpath);
	System.setProperty("webdriver.chrome.driver", driverpath);
	System.out.println("google");
	WebDriver driver=new ChromeDriver();
	driver.get(url);

	}

}

package googleTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import LunchingBrower.LunchBbrower;
import google_page.Google_page_object;

public class Google_test {

	public static void main(String[] args) {
		WebDriver driver;
		String driverpath = System.getProperty("user.dir") + "\\brower\\chromedriver_2.exe";
		System.out.println(driverpath);
		System.out.println("web");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		System.out.println("new");
		System.out.println("google");
		driver.get("https://www.google.com/");
		Google_page_object.searchbox(driver).sendKeys("flipkart");

	}

}

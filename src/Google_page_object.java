

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_page_object {
	 static WebElement e1=null;
	public static WebElement searchbox(WebDriver driver)
	{
	 e1=driver.findElement(By.name("q"));
	return e1;
	}

}

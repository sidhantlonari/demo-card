package pageOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifylinks {
	WebDriver driver;
	 private By links=By.xpath("//div[@class='col-sm-3']//a");
		public verifylinks(WebDriver driver2) {
			this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
		public List<WebElement> links1()
			{
				return driver.findElements(links);
			}
		private By linktext=By.xpath("//div[@id='content']/h1");
		public WebElement linktext1()
		{
			return driver.findElement(linktext);
		}
}

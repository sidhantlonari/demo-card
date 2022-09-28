package pageOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifycurrency {
	public WebDriver driver; 
	private By cur=By.xpath("//div[@class='pull-left']");
	public verifycurrency(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement cu()
	{
		return driver.findElement(cur);
	}
	private By button=By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	public List<WebElement> button1()
	{
		return driver.findElements(button);
	}

}

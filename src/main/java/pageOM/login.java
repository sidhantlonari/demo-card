package pageOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver driver;
	
	  public login(WebDriver driver) {
		this.driver=driver;
		  // TODO Auto-generated constructor stub
	}
	  private By gmail=By.xpath("//input[@id='input-email']");
	public WebElement gmail1()
		{
			return driver.findElement(gmail);
		}
	private By password=By.xpath("	//input[@id='input-password']");
	public WebElement password1()
	{
		return driver.findElement(password);
	}
	private By submit=By.xpath("//input[@class='btn btn-primary']");
	public WebElement submit1()
	{
		return driver.findElement(submit);
	}
}

package pageOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register {
	WebDriver driver;
	private By myAcc=By.xpath("//a[@class='dropdown-toggle']//i[@class='fa fa-user']");
	private By register=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");
	private By fname=By.xpath("//input[@name='firstname']");
	private By lname=By.xpath("//input[@name='lastname']");
	private By email=By.xpath("//input[@name='email']");
	private By mno=By.xpath("//input[@name='telephone']");
	private By pword=By.xpath("//input[@name='password']");
	private By confi=By.xpath("//input[@name='confirm']");
	private By checkbox=By.xpath("//input[@name='agree']");
	private By submit=By.xpath("//input[@type='submit']");
	public register(WebDriver driver) {
		this.driver=driver;
		// TODOAuto-generated constructor stub
	}
	public WebElement myacc()
	{
		return driver.findElement(myAcc);
	}
	public List<WebElement> register1()
	{
		return driver.findElements(register);
	}
	public WebElement fname()
	{
		return driver.findElement(fname);
	}

	public WebElement lname()
	{
		return driver.findElement(lname);
	}

	public WebElement email()
	{
		return driver.findElement(email);
	}

	public WebElement mno()
	{
		return driver.findElement(mno);
	}

	public WebElement password()
	{
		return driver.findElement(pword);
	}

	public WebElement confirm()
	{
		return driver.findElement(confi);
	}

	public WebElement checkbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement continus()
	{
		return driver.findElement(submit);
	}
	

	
}

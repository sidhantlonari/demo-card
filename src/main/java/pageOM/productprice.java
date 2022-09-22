package pageOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productprice
{
	WebDriver driver;
 
  public productprice(WebDriver driver2) {
	  this.driver=driver2;
	// TODO Auto-generated constructor stub
  } 
  private By search=By.xpath("//input[@class='form-control input-lg']");
  public WebElement search1()
	{
		return driver.findElement(search);
	}
  
  private By searchbb=By.xpath("//i[@class='fa fa-search']");

  public WebElement searchbbb1()
	{
		return driver.findElement(searchbb);
	}
  
  private By pname=By.xpath("//h4");
  public List<WebElement> pname1()
	{
		return driver.findElements(pname);
	}
  private By pprice=By.xpath("//p[@class='price']");
  public List<WebElement> pprice1()
	{
		return  driver.findElements(pprice);
	}
  private By addcard=By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']");
  public List<WebElement> addcard1()
	{
		return driver.findElements(addcard);
	}
  private By carddetail=By.xpath("//div[@id='cart']");
  public WebElement carddetail1()
	{
		return driver.findElement(carddetail);
	}
  private By totalprice=By.xpath("//td[@class='text-right']");
  public List<WebElement> totalprice1()
	{
		return driver.findElements(totalprice);
	}
 // private By price=By.xpath("");

}


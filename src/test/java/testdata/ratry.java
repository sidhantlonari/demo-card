package testdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ratry {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/");
	WebElement d=driver.findElement(By.xpath("//a[@class='dropdown-toggle']//i[@class='fa fa-user']"));
	System.out.println(d.getText());
	d.click();
	List<WebElement> t=driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li"));
	//System.out.println(t.getText());
	for(int i=0;i<t.size();i++)
	{
		String text=t.get(i).getText();
		if(text.equalsIgnoreCase("Register"))
		{
			driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li")).get(i).click();
		}
		
	}
	//Select s=new Select(t);
	//s.selectByIndex(1);
	}
}

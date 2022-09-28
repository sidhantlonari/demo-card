package testdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.bbase;
import org.testng.annotations.Test;

public class verifyheader extends bbase {
	@Test
	public void header() throws InterruptedException 
	{
		System.out.println("Testcase:4 verify header...");
		
		//heard==List<WebElement> c1=driver.findElements(By.xpath("//nav[@id='top']//span[@class='hidden-xs hidden-sm hidden-md']"));
		
		List<WebElement> c1=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown']"));
		System.out.println(""+c1.size());
		Thread.sleep(5000);
		for(int i=0;i<c1.size();i++)
	{
		 WebElement c=c1.get(i);
		System.out.println(""+c.isDisplayed());
	}
		
		
	}

}

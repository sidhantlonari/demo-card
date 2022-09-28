package resources;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CU_for_links {
	public static void brokenlinks1(List<WebElement> links) throws MalformedURLException, IOException
	{
		// List<WebElement> links=   driver.findElements(By.xpath("//div[@class='col-sm-3']//a"));
		 SoftAssert a =new SoftAssert();
		 
		 for(WebElement link : links)

	     {
			  String url= link.getAttribute("href");

		         
	          HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
	          conn.setRequestMethod("HEAD");
	          conn.connect();
	          int respCode = conn.getResponseCode();
	          
	       
	          System.out.println(respCode);

	         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	     }

	     a.assertAll();
	}
	public static void linktext1(List<WebElement> links)
	{
		for(int i=0;i<links.size();i++)
		{
			String text=links.get(i).getText();
			System.out.println(text);
		
	     }
	}
	public static void linkopen1(List<WebElement> links,WebElement linktext) throws InterruptedException
	{
		SoftAssert sa=new SoftAssert();
		for(int i=0;i<links.size();i++)
		{
			String text=links.get(i).getText();
			System.out.println("text"+text);
			if(text.equalsIgnoreCase("About Us"))
			{
				Thread.sleep(5000);
				links.get(i).click();
				//System.out.println(driver.getTitle());
				Thread.sleep(5000);
				String s=linktext.getText();
				System.out.println("actual text"+s);
				
				sa.assertEquals("About Us",s);
				break;
			}
		
		
	     }
		  sa.assertAll();
	}
}

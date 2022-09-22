package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageOM.productprice;

public class CUforprice {
	public static Double iphone=0.0;
	public static void findprice(List<WebElement> pname,List<WebElement> pprice,List<WebElement> addcard,String productname) throws InterruptedException, NumberFormatException
	{
	//	productprice p=new productprice();
		//given method is not stable then using list for store then product naame
		//	WebElement p=driver.findElement(By.xpath("//p[@class='price']"));
			
			String word="";
			for(int i=0;i<pname.size();i++)
			{
				String name=pname.get(i).getText();
				if(name.equalsIgnoreCase(productname))
				{
					//for product price using pname stable or dynamic
					word=pprice.get(i).getText();
					//for add card using pname stable or dynamic
					Thread.sleep(2000);
					//driver.findElements(By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']")).get(i).click();
					addcard.get(i).click();;
				}
				
			}
			//System.out.println(p.getText());

			//String word=p.getText();//store price into word 
			String wordw[]=word.split(" ");//string convert into array 
			System.out.println(wordw[0]);
			String tempp=wordw[0];
			String mainpriceofiphone=tempp.replaceAll("[^\\d.]", "");
			System.out.println(mainpriceofiphone);
			iphone=Double.parseDouble(mainpriceofiphone);
			
	}
	public static void addcardprice(List<WebElement> k,String finaltotal)
	{
		// List<WebElement> k=driver.findElements(By.xpath("//td[@class='text-right']"));
		   for(int i=0;i<k.size();i++) 
		   {
		    String text=k.get(i).getText();
		    if(text.equalsIgnoreCase(finaltotal)) { 
		     System.out.println("price is matching");
		    }
		    else {
		     System.out.println("price is matching");
		    }
		     
		    break;
		   }
	}
}

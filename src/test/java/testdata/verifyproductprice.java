package testdata;

import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageOM.productprice;
import resources.CUforprice;
import resources.bbase;
import resources.pricedata;
import resources.regiterdata;

public class verifyproductprice extends bbase

//extends bba
{
	@Test
	public void price() throws InterruptedException
	{
		System.out.println("Testcase:5 verify product price....");
		productprice p=new productprice(driver);
		p.search1().sendKeys(pricedata.sp1);
		p.searchbbb1().click();
		//p.pname1();
		CUforprice.findprice(p.pname1(),p.pprice1(),p.addcard1(),pricedata.firstpname);
		Double firstproduct=CUforprice.iphone;
		System.out.println("first product price=="+firstproduct);
		Thread.sleep(5000);
		p.search1().clear();
		p.search1().sendKeys(pricedata.sp2);
		p.searchbbb1().click();
		Thread.sleep(5000);
		//p.pname1();
		CUforprice.findprice(p.pname1(),p.pprice1(),p.addcard1(),pricedata.secongpname);
		Double secondproduct=CUforprice.iphone;
		System.out.println("second product price=="+secondproduct);
		Double price=firstproduct+secondproduct;
		String finaltotal="$"+price;
		System.out.println("total price=="+finaltotal);
		
		p.carddetail1().click();
		CUforprice.addcardprice(p.totalprice1(),finaltotal);
		
		
		
}
//normal way 

	/*
	public  static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("iphone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		//given method is not stable then using list for store then product naame
	//	WebElement p=driver.findElement(By.xpath("//p[@class='price']"));
		List <WebElement> pname=driver.findElements(By.xpath("//h4"));
		String word="";
		for(int i=0;i<pname.size();i++)
		{
			String name=pname.get(i).getText();
			if(name.equalsIgnoreCase("iphone"))
			{
				//for product price using pname stable or dynamic
				word=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
				//for add card using pname stable or dynamic
				Thread.sleep(2000);
				driver.findElements(By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']")).get(i).click();
			}
			
		}
		//System.out.println(p.getText());

		//String word=p.getText();//store price into word 
		String wordw[]=word.split(" ");//string convert into array 
		System.out.println(wordw);
		String tempp=wordw[0];
		String mainpriceofiphone=tempp.replaceAll("[^\\d.]", "");
		System.out.println(mainpriceofiphone);
		Double iphone=Double.parseDouble(mainpriceofiphone);
		
		Thread.sleep(5000);
		//for add card not stable
		
		//driver.findElement(By.xpath("(//div[@class='button-group']//button)[1]")).click();
	
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).clear();
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("samsung");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		//WebElement s=driver.findElement(By.xpath("(//p[@class='price'])[2]"));
		List <WebElement> sname=driver.findElements(By.xpath("//h4"));
		String sword="";
		for(int i=0;i<sname.size();i++)
		{
			String name=sname.get(i).getText();
			if(name.equalsIgnoreCase("Samsung SyncMaster 941BW"))
			{
				sword=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
				Thread.sleep(2000);
				driver.findElements(By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']")).get(i).click();
				
			}
			
		}
		//System.out.println(s.getText());

		//String sword=s.getText();//store price into word 
		String swordw[]=sword.split(" ");//string convert into array 
		System.out.println(swordw);
		String stempp=swordw[0];
		String smainpriceofiphone=stempp.replaceAll("[^\\d.]", "");
		System.out.println(smainpriceofiphone);
		Double samsung=Double.parseDouble(smainpriceofiphone);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='button-group']//button)[4]")).click();
		Double total=iphone+samsung;
		String finaltotal="$"+total;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='cart']")).click();
	//***********
	 //check price match or not but stable 
	 
		WebElement tp=driver.findElement(By.xpath("(//td[@class='text-right'])[12]"));
		String carttotal=tp.getText();
		System.out.println(tp.getText());
		if(carttotal.equalsIgnoreCase(finaltotal))
		{
			System.out.println("true");
		}
		//***********
		 //it is stable or dynamic
		Thread.sleep(5000);
		  List<WebElement> k=driver.findElements(By.xpath("//td[@class='text-right']"));
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
		Thread.sleep(5000);
		driver.close();
		//1.20
	}

*/	
}


package resources;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonUtilities {
/*
	public static void dropdown(WebElement dxpath)
	{
		Select s=new Select(dxpath);
		s.selectByIndex(0);
		
	}
	*/
	public static void my(List<WebElement> t,String pagename)
	{
		for(int i=0;i<t.size();i++)
		{
			String text=t.get(i).getText();
			if(text.equalsIgnoreCase(pagename))
			{
				t.get(i).click();
				break;
			}
			
		}
	}
	 
	 public static String randomestring()
	  {
	    //String generatedstring=RandomStringUtils.randomAlphabetic(8);
	    String generatedString2 = RandomStringUtils.randomNumeric(4);
	    String gmail="sidhant"+generatedString2+"@gmail.com";
	    
	    System.out.println(gmail);
	    
	    return gmail;
	 
	   }
		
}

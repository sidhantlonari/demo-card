package resources;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CU_for_currency {
	public static void button11(List<WebElement> b,String cname)
	{
		 for(int i=0;i<b.size();i++) 
		   {
		    String text=b.get(i).getText();
		    if(text.equalsIgnoreCase(cname))
		    {
		    	b.get(i).click();
		    	break;
		    }
		   }
	}

}

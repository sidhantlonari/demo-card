package testdata;

import java.io.IOException;
import org.testng.annotations.Test;

import pageOM.register;
import resources.bbase;
import resources.commonUtilities;
import resources.regiterdata;



public class verifyregister extends bbase{
	@Test
	public void register() throws IOException, InterruptedException
	{
		System.out.println("Testcase:1 verify register page...");
		register re=new register(driver);
		Thread.sleep(5000);
		re.myacc().click();//dropdown
		Thread.sleep(2000);
		//commonUtilities.dropdown(re.myacc());
		commonUtilities.my(re.register1(),regiterdata.myaccount);
		Thread.sleep(5000);
		re.fname().sendKeys(regiterdata.name);
		Thread.sleep(2000);
		re.lname().sendKeys(regiterdata.lname);
		//create ramdom gmail form commonUtilities
		String Gmail=commonUtilities.randomestring();
		re.email().sendKeys(Gmail);
		System.out.println("random gmail="+Gmail);
		Thread.sleep(2000);
		
		re.mno().sendKeys(regiterdata.phone);
		re.password().sendKeys(regiterdata.password);
		re.confirm().sendKeys(regiterdata.password);
		re.checkbox().click();
		Thread.sleep(5000);
		//re.continus().click();;//click
		
		Thread.sleep(5000);
		
	}
}

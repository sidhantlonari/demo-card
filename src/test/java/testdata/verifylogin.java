package testdata;

import org.testng.annotations.Test;

import pageOM.register;
import pageOM.login;
import resources.bbase;
import resources.commonUtilities;
import resources.regiterdata;

public class verifylogin extends bbase{
	@Test
	public void login() throws InterruptedException
	{
	register ra = new register(driver);
	Thread.sleep(5000);
	ra.myacc().click();//dropdown
	Thread.sleep(2000);
	//commonUtilities.dropdown(re.myacc());
	commonUtilities.my(ra.register1(),regiterdata.login);
	login lo=new login(driver);	
	lo.gmail1().sendKeys(regiterdata.gmaillogin);
	lo.password1().sendKeys(regiterdata.password);
	Thread.sleep(5000);
	
	lo.submit1().click();
	Thread.sleep(5000);
	
	}

}

package testdata;

import pageOM.verifycurrency;
import resources.CU_for_currency;
import resources.bbase;
import resources.pricedata;

import org.testng.annotations.Test;

public class verifycurrencydropdown extends bbase{
	@Test
	public void currency() throws InterruptedException
	{
	System.out.println("Testcase:3 verify currency dropdown...");
	verifycurrency vc=new verifycurrency(driver);	
	vc.cu().click();
	CU_for_currency.button11(vc.button1(),pricedata.currancyname);
	Thread.sleep(10000);
	}
}

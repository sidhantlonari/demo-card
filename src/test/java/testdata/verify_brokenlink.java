package testdata;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageOM.verifylinks;
import resources.CU_for_links;
import resources.bbase;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_brokenlink extends bbase{
	//verify any broken link
	@Test
	public void brokenlinks() throws MalformedURLException, IOException
	{
		System.out.println("Testcase:6 verify brokenlinks...");
		verifylinks v2=new verifylinks(driver);
		CU_for_links.brokenlinks1(v2.links1());
	 
	}
}
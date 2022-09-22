package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bbase {
	public WebDriver driver;
	public Properties p=new Properties();  ;
	public WebDriver browserlunch() throws IOException
	{
		//for read the file data1
		//System.getProperty("user.dir") it is use to dynamic path 
		
	FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\datamain.properties");
	//for access the file data1
	
	p.load(f);
	String bname=p.getProperty("b");
	if(bname.equalsIgnoreCase("chrome"))
	{
		//WebDriverManager it is use to script will run any chrome version also add dependency on pom.xml  
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox"))
	{
	//code browser 	firefox
	}
	return driver;
	}
	@BeforeMethod
	public void lunch() throws IOException
	{
		browserlunch();
		driver.get(p.getProperty("url"));
	}
	@AfterMethod
	public void end() throws IOException
	{
		driver.quit();
	}
	
}

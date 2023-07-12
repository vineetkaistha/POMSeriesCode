package com.qa.opencart.base;

//import java.lang.System.LoggerFinder;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

//import com.qa.hubspot.utils.ElementUtil;
import com.qa.opencart.factory.DriverFactory;
//import com.qa.opencart.factory.OptionsManager;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.SearchPage;
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.ExcelUtil;


public class BaseTest {
	
	DriverFactory df;
	protected Properties prop;
	WebDriver driver;
	protected LoginPage loginPage;
	protected AccountPage accPage;
	protected ElementUtil elementUtil;
	protected SearchPage searchPage;
	protected ProductInfoPage productInfoPage;
	protected RegisterPage registerPage;
	protected ExcelUtil excelUtil;
	 protected SoftAssert softAssert;
	//protected OptionsManager optionsManager;
	
	@BeforeTest
	public void setup()
	{
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.init_driver(prop) ;
		loginPage=new LoginPage(driver);
		softAssert=new SoftAssert();
		
		
	} 
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}

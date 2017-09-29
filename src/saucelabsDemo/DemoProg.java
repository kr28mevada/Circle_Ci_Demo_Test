package saucelabsDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoProg 
{
	public static final String USERNAME = "sandeshfalke";
	public static final String ACCESS_KEY = "a696f1a8-8596-4c89-8a90-3a96fe3cfad1";
	public static final String Url = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	  
	@Test
	public void test() throws MalformedURLException
	{
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");	    
		capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability("deviceName","Android GoogleAPI Emulator");
		capabilities.setCapability("platformVersion","6.0");
		
		//URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		//URL url = new URL(URL);
		AndroidDriver<WebElement> driver=new AndroidDriver<>(new URL(Url), capabilities);
		
		//driver.get("http://facebook.com");
		driver.quit();
	}
}











package maven.test.project.group.maven.test.project.artifact;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.ios.*;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

/**
 * Hello world!
 *
 */
public class IOSTest 
{
	IOSDriver<IOSElement> driver;
	
	@Before
	public void SetUp() throws MalformedURLException {
    	
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
    	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
    	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
    	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 240);
    	
    	cap.setCapability(MobileCapabilityType.APP, "//Users/andres/Desktop/tempappadv.app");

    	driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}

	@Test
    public void TestAprender() throws MalformedURLException, InterruptedException
    {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofMinutes(3))
				       .pollingEvery(Duration.ofSeconds(10));
		WebElement aprender = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='Aprende']")));
		aprender = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Aprende']"));
		aprender.click();
		
		
		WebElement flor = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='La Flor de La Vida']")));
		flor = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='La Flor de La Vida']"));
		System.out.println(flor.getText());
		assertEquals("not named as title", "La Flor de La Vida", flor.getText());
		
		Thread.sleep(5000);
		
		WebElement back = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='home Home, tab panel']/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]")));
		back = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='home Home, tab panel']/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]"));
		back.click();
     }
	
	@After
	public void End() {
		driver.close();		
	}
	
}

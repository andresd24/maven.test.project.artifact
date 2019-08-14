package maven.test.project.group.maven.test.project.artifact;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSTest extends Practice {

    public static void main( String[] args ) throws MalformedURLException, InterruptedException 
    {
    
    	IOSDriver<IOSElement> driver = capabilities();
    	WebDriverWait wait = new WebDriverWait(driver, 4000, 5000);
    	WebElement aprender = wait.until(
    	        ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='Aprende']")));
        aprender = driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Aprende']"));
    	aprender.click();
    	
    	Thread.sleep(5000);
    	
    }
}

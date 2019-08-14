package maven.test.project.group.maven.test.project.artifact;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.ios.*;
import io.appium.java_client.ios.IOSElement;

/**
 * Hello world!
 *
 */
public class Practice 
{
	IOSDriver<IOSElement> driver;
	
    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException
    {
    	
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
    	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
    	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
    	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 240);
    	
    	cap.setCapability(MobileCapabilityType.APP, "//Users/andres/Desktop/tempappadv.app");

    	IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    
    	
    	System.out.println( "Hello World!" );
    	return driver;
     }
}

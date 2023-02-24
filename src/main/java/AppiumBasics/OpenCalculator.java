package AppiumBasics;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenCalculator {
    //WebDriver driver;
    //AndroidDriver driver;
    public static void main(String args[]){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","sdk_gphone_x86");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
    }
}

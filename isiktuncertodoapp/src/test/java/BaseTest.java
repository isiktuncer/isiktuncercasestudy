import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.example.android.architecture.blueprints.todomvp.mock");
            capabilities.setCapability("appActivity", "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
            capabilities.setCapability("app", "C:\\Users\\isik.tuncer\\Desktop\\New folder\\todoapp\\app\\build\\outputs\\apk\\mock\\debug\\app-mock-debug.apk");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, capabilities);

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

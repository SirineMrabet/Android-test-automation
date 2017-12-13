package Steps;

import Base.BaseUtile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


/**
 * Created by smrabet on 12/12/2017.
 */

public class Hook extends BaseUtile {

    private BaseUtile base;

    public Hook(BaseUtile base) {
        this.base = base;
        this.driver = base.driver;
    }


    @Before
    public void InitializeTest(Scenario scenario) throws MalformedURLException {
        System.out.println("Opening the Mobile Application");
        System.out.println("Scenario Name: "+scenario.getName());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy Note5");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability(CapabilityType.PLATFORM,"Android");
        capabilities.setCapability("platformVersion","7.0");

        File file = new File("/home/smrabet/CoCoin/APK", "CoCoin.apk");
        capabilities.setCapability("app",file.getAbsolutePath());
        base.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @After
    public void TearDownTest(Scenario scenario) {

         if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Ending test");
        //base.driver.quit();

    }

    public BaseUtile getBase() {
        return base;
    }




}


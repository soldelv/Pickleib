package utils.driver;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Printer;

public class Driver extends WebComponent {

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;

	Printer log = new Printer();

	public void setup(String browserName){
		log.print("Initializing driver", "info");
		driver = DriverFactory.driverSetup(browserName, driver);
		assert driver != null;
		wait = new WebDriverWait(driver, 15);
	}

	public void teardown(){
		log.print("Finalizing driver...", "info");
		driver.quit();
	}
}
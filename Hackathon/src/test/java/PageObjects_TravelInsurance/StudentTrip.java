package PageObjects_TravelInsurance;

import java.time.Duration; 

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentTrip extends BasePage{

	public StudentTrip(WebDriver driver) {
		super(driver);
	}
	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
	JavascriptExecutor js=(JavascriptExecutor)driver;
 
	
	@FindBy(xpath = ("//*[@id=\"studentTrip\"]"))
	WebElement Studenttrip;
	
	public void plans() {
		js.executeScript("window.scrollBy(0,100)", Studenttrip);
		Studenttrip.click();
	}
}

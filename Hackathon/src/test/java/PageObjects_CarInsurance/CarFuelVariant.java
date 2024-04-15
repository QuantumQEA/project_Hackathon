package PageObjects_CarInsurance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarFuelVariant extends BasePage{

	public CarFuelVariant(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"Petrol\"]/b | //*[contains(text(),\"Petrol\")]")
	WebElement fuelType;
 	@FindBy(xpath="//ul//li[starts-with(text(),'1.2 MPI')] | //li//span//b[starts-with(text(),'1.2 MPI')]")
 	WebElement carVariantName;
 	
 	public void carFuel() throws InterruptedException {
		Thread.sleep(3000);
     	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(fuelType));
		fuelType.click();  	
	}
	public void carVariant()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(carVariantName));
		carVariantName.click();
	}
}

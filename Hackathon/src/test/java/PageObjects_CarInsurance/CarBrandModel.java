package PageObjects_CarInsurance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarBrandModel extends BasePage {

	public CarBrandModel(WebDriver driver) {
		super(driver);
	}
	@FindBy(css=".volkswagen")
	WebElement carName;
	@FindBy(xpath="//li[normalize-space()='POLO']")
	WebElement carModelName;
	
	public void carBrand()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(carName));
		carName.click();
	}
	public void carModel()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(carModelName));
		carModelName.click();
	}

}

package PageObjects_CarInsurance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarCityRto extends BasePage{

	public CarCityRto(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[@id='spn6']  | //li //span[contains(text(),'Chennai')]")
	WebElement city;
	@FindBy(xpath="//ul//ul//li[7]")
	WebElement rto;
	public void citySelection()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(city));
		city.click();
	}
	public void carRto()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rto));
		rto.click();
	}
}

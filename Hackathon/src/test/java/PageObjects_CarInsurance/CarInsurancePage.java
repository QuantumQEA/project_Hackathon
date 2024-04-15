package PageObjects_CarInsurance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarInsurancePage extends BasePage {

	public CarInsurancePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a//div//i[@class='icon-bg homeIconsBg car-insurance']")
	WebElement carInsuranceicon;
	@FindBy(xpath="//div[@class='dont-know-number']/a |  //div[@class='headingV3 fontNormal']/span")
	WebElement newCarBtn;
	
	public void carInsurance() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(carInsuranceicon));
		carInsuranceicon.click();
	}
	public void newCar() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(newCarBtn));
		newCarBtn.click();	
	}

}

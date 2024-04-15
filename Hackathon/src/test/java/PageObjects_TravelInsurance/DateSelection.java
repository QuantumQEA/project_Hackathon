package PageObjects_TravelInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DateSelection extends BasePage {
	

	public DateSelection(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/input")
	WebElement dateselect;
	@FindBy(xpath="//button[@aria-label=\"Apr 24, 2024\"]")
	WebElement startDate;
	@FindBy(xpath="//button[@aria-label=\"May 9, 2024\"]")
	WebElement endDate;
	public void date() {
		dateselect.click();
		startDate.click();
		endDate.click();
	}
	}


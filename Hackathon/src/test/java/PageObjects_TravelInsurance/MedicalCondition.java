package PageObjects_TravelInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicalCondition extends BasePage{

	public MedicalCondition(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"ped_no\"]")
	WebElement noButton;
	@FindBy(xpath="//*[@id=\"ped_yes\"]")
	WebElement yesButton;
	String condition;
	public void medicalCondition(String condition)
	{
        	noButton.click(); 
		}
}

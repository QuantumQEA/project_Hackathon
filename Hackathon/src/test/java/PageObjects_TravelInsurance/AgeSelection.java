package PageObjects_TravelInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgeSelection extends BasePage {
public AgeSelection(WebDriver driver) {
	super(driver);
}
	@FindBy(xpath="//label[@for=\"traveller_2\"]")
	   WebElement no_of_people;
	   @FindBy(xpath="//*[contains(text(),'traveller 1')]")
	   WebElement person1Age;
	   @FindBy(xpath="//*[@id=\"optionBox_0_wrapper\"]/div[24]")
	   WebElement age1;
	   @FindBy(xpath="//*[contains(text(),'traveller 2')]")
	   WebElement person2Age;
	   @FindBy(xpath="//*[@id=\"optionBox_1_wrapper\"]/div[23]")
	   WebElement age2;
	   
	   public void age() {
		   no_of_people.click();
		   person1Age.click();
		   age1.click();
		   person2Age.click();
		   age2.click();
	   }
}


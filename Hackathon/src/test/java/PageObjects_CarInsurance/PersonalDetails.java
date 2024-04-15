package PageObjects_CarInsurance;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import factory.BaseClass;

public class PersonalDetails extends BasePage{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public PersonalDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Full name'] | //input[@id='name']")
	WebElement fullName;
	@FindBy(xpath="//input[@placeholder='Your email'] | //input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Mobile number'] | //input[@id='mobileNo']")
	WebElement mob;
	@FindBy(xpath="//div[@class='msg-error show']| //*[@class=\"errorMsg\"]")
	WebElement error;
	
	public void name(String Name) throws IOException 
	{
		fullName.sendKeys(Name);
	}
	public void email(String emailid) throws IOException
	{
		email.sendKeys(emailid);
	}
	public void mobileNum()
	{
		String number="9"+BaseClass.randomAlphaNumeric();
		mob.sendKeys(number);

	}
	public void errorMsg() throws IOException
	{
	  String errormessage=error.getText();
	  System.out.println("_____________________Error Message_____________________");
	  System.out.println();
	  System.out.println(errormessage);
	  System.out.println("_______________________________________________________");
	  
	  WebElement resultElement =driver.findElement(By.xpath("//section[@class='__className_f5c63c'] | //div[@id='app']"));
		File src = resultElement.getScreenshotAs(OutputType.FILE);
		File screenshotFile = new File("C:\\Users\\2318294\\Cucumber\\raw\\Screenshots\\CarInsurance.png");
		FileUtils.copyFile(src, screenshotFile);
	}
	
	
	
}
 	
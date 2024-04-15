package PageObjects_TravelInsurance;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.WriteExcel;

public class LowestThreePlans extends BasePage {

	public LowestThreePlans(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id='Traveller_1']")
	WebElement Traveler1;
	@FindBy(xpath = "//*[@id='Traveller_2']")
	WebElement Traveler2;
	@FindBy(xpath = "//*[@id='feet']")
	WebElement noOfDays;
	@FindBy(xpath = "//*[@id=\"amt-modal\"]/div[3]/button")
	WebElement apply;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
	WebElement sortby;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/ul/li[2]")
	WebElement lowest;
	@FindBy(xpath = "//div//p[@class='quotesCard--insurerName']")
	List<WebElement> Names;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/section/article/div/div/div/div/div")
	List<WebElement> provider;
	@FindBy(xpath = "//div[@class='quotesCard__cta familyPlanPriceContainer']//span")
	List<WebElement> price;
	String three[]=new String[3];
	public void details() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Traveler1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Traveler2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		noOfDays.click();
		Select obj=new Select(noOfDays);
		obj.selectByVisibleText("60 Days");
		apply.click();
		sortby.click();
		lowest.click();
		
		for(int i=0;i<3;i++) {
			System.out.println(provider.get(i).getText());
			System.out.println("Price : "+price.get(i).getText());
			three[i]=provider.get(i).getText()+price.get(i).getText();
		}

		TakesScreenshot ts = (TakesScreenshot)driver;
	    File src =ts.getScreenshotAs(OutputType.FILE);
		File screenshotFile = new File("C:\\Users\\2318294\\Cucumber\\raw\\Screenshots\\TravelInsurance.png");
		FileUtils.copyFile(src, screenshotFile);
	    
	    List<String> ThreePolicy =Arrays.asList(three);
	    try {
	        WriteExcel.TravelListExcel(ThreePolicy, ".\\testData\\TravelInsurance.xlsx", "Sheet1");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
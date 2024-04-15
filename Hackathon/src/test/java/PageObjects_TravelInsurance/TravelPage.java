package PageObjects_TravelInsurance;

import java.time.Duration; 
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TravelPage extends BasePage {

	public TravelPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//p[contains(text(),'Travel')]")WebElement travelbutton;
	public void travelInsurancepage() throws InterruptedException

	{
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,250)", "");
		By tb=By.xpath("//p[contains(text(),'Travel')]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tb));
		 travelbutton.click(); 
	}
	@FindBy(xpath = "//*[@id=\"country\"]")WebElement destination;
	@FindBy(xpath = "//*[@id=\"search-country\"]/ul/li")List<WebElement> listofDestination;

	public void destination(String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		destination.click();
		destination.sendKeys(country);
		String Europeancountry = null;
		for(int i=0;i<listofDestination.size();i++) {
			Europeancountry=listofDestination.get(i).getText();
			if(Europeancountry.equalsIgnoreCase(country)) {
				driver.findElement(By.xpath("//*[@id=\"search-country\"]/ul/li["+i+1+"]")).click();
			}
		} 
			
		}
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")WebElement next;

	public void next() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		next.click();
	}
	}

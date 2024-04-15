package PageObjects_HealthInsurance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WriteExcel;

public class HealthPage extends BasePage{

	public HealthPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[contains(text(),\"Insurance Products \")]")
	WebElement InsuranceProduct;
	@FindBy(xpath="//div[@class='ruby-col-3 hidden-md'][2]//li")
	List <WebElement> HealthList;
	
	public void menuAction() throws IOException
	{
		Actions action=new Actions(driver);
	    action.moveToElement(InsuranceProduct).perform();
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src =ts.getScreenshotAs(OutputType.FILE);
		File screenshotFile = new File("C:\\Users\\2318294\\Cucumber\\raw\\Screenshots\\HealthInsurance.png");
		FileUtils.copyFile(src, screenshotFile);

	}
	public void healthList() throws FileNotFoundException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(HealthList));
		List<WebElement> Healthmenu=HealthList;
	    System.out.println("HealthInsurance List:");
	    for(WebElement Healthlist:Healthmenu)
	    {
	    	System.out.println(Healthlist.getText());
	    	
	    }
	    List<String> healthInsuranceList1 =getHealthInsuranceList();
	    try {
	        WriteExcel.healthListExcel(healthInsuranceList1, ".\\testData\\HealthInsurance.xlsx", "Sheet1");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	   
	}
	 
	public List<String> getHealthInsuranceList() {
	 
	    List<String> healthInsuranceList = new ArrayList<>();
	 
	    for (WebElement Healthlist1 : HealthList) {
	 
	        String insuranceOption = Healthlist1.getText();
	 
	        healthInsuranceList.add(insuranceOption);
	  
	    }
	 
	    return healthInsuranceList;
	 
	}

}

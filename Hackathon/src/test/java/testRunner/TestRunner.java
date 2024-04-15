package testRunner;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//Features"},
					//features= {".//Features/Login.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},
					//features= {".//Features/Travel.feature",},
					//features= {".//Features/CarInsurance.feature"},

					//features= {".//Features/HealthInsurance.feature"},

					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							       
					dryRun=false,    
					monochrome=true,    
					publish=false   
		)
public class TestRunner extends AbstractTestNGCucumberTests  {

		} 
 
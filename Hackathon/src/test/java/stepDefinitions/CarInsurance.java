package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import PageObjects_CarInsurance.CarBrandModel;
import PageObjects_CarInsurance.CarCityRto;
import PageObjects_CarInsurance.CarFuelVariant;
import PageObjects_CarInsurance.CarInsurancePage;
import PageObjects_CarInsurance.PersonalDetails;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DataReader;

public class CarInsurance {
	WebDriver driver;
	CarInsurancePage carInsurancePageobj; 
	CarCityRto carCityRtoobj;
	CarBrandModel CarBrandModelobj;
	CarFuelVariant CarFuelVariantobj;
	PersonalDetails PersonalDetailsobj;
	@Given("Navigate to Car insurance page")
	public void navigate_to_car_insurance_page() {
		carInsurancePageobj=new CarInsurancePage(BaseClass.getDriver());
		carInsurancePageobj.carInsurance();
	}

	@When("Proceed without providing car number")
	public void proceed_without_providing_car_number() {
		carInsurancePageobj=new CarInsurancePage(BaseClass.getDriver());
		carInsurancePageobj.newCar();
	}

	@When("Select city and RTO")
	public void select_city_and_rto() {
		carCityRtoobj=new CarCityRto(BaseClass.getDriver());
		carCityRtoobj.citySelection();
		carCityRtoobj.carRto();
	}

	@When("Select Car Brand")
	public void select_car_brand() {
		CarBrandModelobj=new CarBrandModel(BaseClass.getDriver());
		CarBrandModelobj.carBrand();
	}

	@When("Select Car Model")
	public void select_car_model() throws InterruptedException {
		CarBrandModelobj.carModel();
		CarFuelVariantobj=new CarFuelVariant(BaseClass.getDriver());
		CarFuelVariantobj.carFuel();
	}

	@When("Select Car Variant")
	public void select_car_variant() {
		CarFuelVariantobj.carVariant();
	}

	 List<HashMap<String, String>> datamap; //Data driven
	@When("Fill Details with Invalid Phone number and E-mail {string}")
	public void fill_details_with_invalid_phone_number_and_e_mail(String string) throws IOException {
		 datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\CarInsurance.xlsx", "Sheet1");

	        int index=Integer.parseInt(string)-1;
	        String name= datamap.get(index).get("Name");
	        String email= datamap.get(index).get("email");
	        PersonalDetailsobj=new PersonalDetails(BaseClass.getDriver());
			PersonalDetailsobj.name(name);
			PersonalDetailsobj.email(email);
			PersonalDetailsobj.mobileNum();

	}

	@Then("Print the error message displayed")
	public void print_the_error_message_displayed() throws IOException {
		PersonalDetailsobj.errorMsg();

	}


}

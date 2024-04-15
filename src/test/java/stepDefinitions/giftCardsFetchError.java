package stepDefinitions;

import makeMyTrip_pages_pom.*;
import utilities.*;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class giftCardsFetchError {
	
	@Given("Navigate to the Gift card menu")
	public void navigate_to_the_gift_card_menu() {
		  
		  Gift_card g=new Gift_card();
		  g.hover();
	}

	@When("click on gift card")
	public void click_on_gift_card() {
		 Gift_card g=new Gift_card();
		  g.cardSelect();
	}

	@When("fill the invalid details")
	public void fill_the_invalid_details() throws IOException {
		  Gift_card g=new Gift_card();
		  Property_reader read=new Property_reader();
		  String[] arr= {"Uname","Uphone","Uemail"};
		  String[] arrs=read.property_read(arr);
		  g.enterValues(arrs);
	}

	@Then("Error message is displayed")
	public void error_message_is_displayed() {
	   System.out.println("The lowest cost price of SUV is fetched and printed");
	}






}

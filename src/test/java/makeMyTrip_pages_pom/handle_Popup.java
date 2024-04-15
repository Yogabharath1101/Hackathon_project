package makeMyTrip_pages_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;

public class handle_Popup extends baseClass {
	
	@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']\"")
	WebElement close;
	
	@FindBy(xpath="//*[@id='webklipper-publisher-widget-container-notification-frame']")
	WebElement fram;
	
	public handle_Popup(){
		PageFactory.initElements(driver, this);
	}
	
	public void popup() {

		try {
		driver.switchTo().frame(fram);
	    close.click();
	    driver.switchTo().defaultContent();
	}
		catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}

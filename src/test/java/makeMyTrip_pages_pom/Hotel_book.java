package makeMyTrip_pages_pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;

public class Hotel_book extends baseClass {
	

   
	@FindBy(xpath="//div[@class='chHeaderContainer']")
	WebElement mainheader;
	
	@FindBy(xpath="//a[@class='headerIcons makeFlex hrtlCenter column' and contains(.,'Hotels')]")
	WebElement hotel;
	
	@FindBy(xpath="//input[@id='guest']")
	WebElement guest;
	
	@FindBy(xpath="//span[@class='gstSlct__text' and @data-testid = 'adult_count']")
	WebElement Adult;
	
	@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")
	List<WebElement> AdultList;
	
	
	public Hotel_book() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	
	public void hotel_search() throws InterruptedException
	{   Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();", mainheader);
    	Thread.sleep(2000);
    	
    	hotel.click();
    	guest.click();
    	Adult.click();
	}
	
	public void Adult_list()
	{
		System.out.println("The list of number of adults allowed:");
    	for(WebElement w :AdultList) {
    		System.out.println(w.getText());
    		}
	}
	

}

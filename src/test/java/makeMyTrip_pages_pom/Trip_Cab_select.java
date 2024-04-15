package makeMyTrip_pages_pom;

import java.io.FileReader;
import utilities.*;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;

public class Trip_Cab_select extends baseClass {
	
	@FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chCabs']")
	WebElement cabs;
	
	@FindBy(xpath="//span[@data-cy='CabsLandingPage_387']")
	WebElement oneway;
	
	@FindBy(xpath="//input[@id='fromCity']")
	WebElement from;
	
	@FindBy(xpath="//div[@role='combobox']//input")
	WebElement fromplace;
	
	@FindBy(xpath="//span[@class='sr_city blackText']")
	List<WebElement> board;
	
	@FindBy(xpath="//div[@role='combobox']//input")
	WebElement to;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	List<WebElement> Destination;
	
	@FindBy(xpath="//div[@aria-label='Sat Apr 27 2024']")
	WebElement date;
	
	@FindBy(xpath="//li[contains(.,'06  Hr')]")
	WebElement hour;
	
	
	@FindBy(xpath="//li[contains(.,'30  min')]")
	WebElement min;
	
	
	@FindBy(xpath="//li[contains(.,'AM')]")
	WebElement ampm;
	
	
	@FindBy(xpath="//span[contains(.,'APPLY')]")
	WebElement apply;
	
	
	@FindBy(xpath="//a[contains(.,'Search')]")
	WebElement search;
	
	
	
	
	public Trip_Cab_select()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnCabIcon() {
		
		cabs.click();
	}
	
	public void fromLocation(String fro) throws InterruptedException, IOException {
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		Properties properties = new Properties();
		properties.load(fileReader);
		oneway.click();
		from.click();
		Thread.sleep(2000);
		fromplace.sendKeys(properties.getProperty("fromCity"));
		Thread.sleep(2000);
		
		for(WebElement b:board) {
			System.out.println(b.getText());
			if(b.getText().equalsIgnoreCase(fro)) {
				b.click();
				break;
			}
		}
		Thread.sleep(5000);
		

		}
	
	public void toLocation(String toci) throws  InterruptedException, IOException{
		
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		Properties properties = new Properties();
		properties.load(fileReader);
		Thread.sleep(5000);
		to.sendKeys(properties.getProperty("toCity"));
		Thread.sleep(2000);
		for(WebElement d:Destination) {
			if(d.getText().equalsIgnoreCase(toci)) {
				d.click();
				break;
			}
		}
		Thread.sleep(2000);
			
		
	}
	
	public void SelectDate() throws InterruptedException {
		Thread.sleep(2000);
		date.click();
		Thread.sleep(2000);
	
	}
	
	public void SelectTime() throws InterruptedException {

		hour.click();
	    min.click();
		ampm.click();
		apply.click();
		search.click();
		Thread.sleep(5000);
	}
		  
		   
		   
	
	
	
	
	
	




}

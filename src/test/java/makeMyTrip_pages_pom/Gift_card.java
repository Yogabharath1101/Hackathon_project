package makeMyTrip_pages_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;

public class Gift_card extends baseClass {
	
	@FindBy(xpath="//span[@class='chNavText' and contains(.,'More')]")
	WebElement more;
	
	@FindBy(xpath="//a[@class='appendBottom5 blackText' and contains(.,'Giftcards')]")
	WebElement giftlink;
	
	@FindBy(xpath="//div[@class='card__data' and contains(.,'Diwali')]")
	WebElement card;
	
	@FindBy(xpath="//p[text()='Sender Details']")
	WebElement details;
	
	@FindBy(xpath="//input[@name='senderName']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='senderMobileNo']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@name='senderEmailId']")
	WebElement email;
	
	@FindBy(xpath="//button[@class='prime__btn font16 prime__btn__text']")
	WebElement buy;
	
	@FindBy(xpath="//p[contains(.,'Please enter a valid Email id')]")
	WebElement error;
	

	public Gift_card() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void hover()
	{
		Actions act = new Actions(driver);
    	act.moveToElement(more).moveToElement(giftlink).click().build().perform();
	}
	
	public void cardSelect()
	{
		card.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();",details);
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void enterValues(String[] arr)
	{
		name.click();
    	name.sendKeys(arr[0]);
    	mobile.click();
    	mobile.sendKeys(arr[1]);
    	email.click();
    	email.sendKeys(arr[2]);
    	buy.click();
    	String msg=error.getText();
    	System.out.println(msg);
		
	}
	
	

	
	

}

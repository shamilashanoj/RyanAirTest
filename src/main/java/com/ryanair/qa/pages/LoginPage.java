package com.ryanair.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ryanair.qa.base.TestBase;
import com.ryanair.qa.util.TestUtil;

public class LoginPage extends TestBase {

	// Object Repository

	@FindBy(xpath = "(//*[contains(text(),'Yes, I agree')])[2]")
	WebElement cookies;
	@FindBy(xpath = "//*[contains(text(),'Log in')]")
	WebElement login;

	@FindBy(xpath = "(//input[@type='email'])[2]")
	WebElement emailAddress;
	@FindBy(xpath = "//input[@type='password']") // using : //input[@type or @placeholder='log in']
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginButton;

	
	@FindBy(xpath = "//input[@id='input-button__destination']")
	WebElement destination;
	
	//@FindBy(xpath = "(//span[contains(text(),'Barcelona')])[1]")
	//WebElement airportDuplicateDestination;
	
	@FindBy(xpath = "//span[contains(text(),'Berlin Brandenburg')]")
	WebElement airportDestination;

	
	@FindBy(xpath = "(//div[contains(text(),'Jun')])[1]")
	WebElement flightDepartureMonthDate;
	@FindBy(xpath = "(//div[contains(text(),'4')])[1]")
	WebElement flightDepartureDate;

	
	@FindBy(xpath = "//div[contains(text(),'Choose date')]")
	WebElement flightReturnDateChooseArea;
	@FindBy(xpath = "(//div[contains(text(),'Jun')])[2]")
	WebElement flightReturnMonthDate;
	@FindBy(xpath = "(//div[contains(text(),'5')])[1]")
	WebElement flightReturnDate;

	
	@FindBy(xpath = "//div[contains(text(),'1 Adult')]")
	WebElement passengerCountChooseArea;
	@FindBy(xpath = "(//div[@class='counter__button-wrapper--enabled'])[1]")
	WebElement passengerAdultCount;
	@FindBy(xpath = "(//div[@class='counter__button-wrapper--enabled'])[4]")
	WebElement passengerChildCount;

	
	@FindBy(xpath = "//ry-spinner[contains(text(),'Search')]")
	WebElement searchFlightButton;

	
	@FindBy(xpath = "(//div[@class='duration b2'])[1]")
	WebElement firstFlightSelection;
	@FindBy(xpath = "//span[contains(text(),'Continue with Value fare')]")
	WebElement firstflightBagSelection;

	
	@FindBy(xpath = "(//div[@class='duration b2'])[2]")
	WebElement secondFlightSelection;
	@FindBy(xpath = "//span[@class='fare-card__button-text ng-star-inserted']")
	WebElement secondflightBagSelection;

	
	@FindBy(xpath = "(//icon[@class='dropdown__toggle-chevron'])[1]")
	WebElement firstPassengerTitleDropdownSelection;
	@FindBy(xpath = "(//div[contains(text(),'Mr')])[1]")
	WebElement firstPassengerTitleSelection;
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.name']")
	WebElement firstPassengerFirstName;
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.surname']")
	WebElement firstPassengerSecondName;
	
	
	@FindBy(xpath = "(//icon[@class='dropdown__toggle-chevron'])[2]")
	WebElement secondPassengerTitleDropdownSelection;
	@FindBy(xpath = "//div[contains(text(),'Mrs')]")
	WebElement secondPassengerTitleSelection;
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.name']")
	WebElement secondPassengerFirstName;
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.surname']")
	WebElement secondPassengerSecondName;


	WebElement childPassengerTitleSelection;
	@FindBy(xpath = "//input[@id='formState.passengers.CHD-0.name']")
	WebElement childPassengerFirstName;
	@FindBy(xpath = "//input[@id='formState.passengers.CHD-0.surname']")
	WebElement childPassengerSecondName;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueIcon;
	@FindBy(xpath = "//button[contains(text(),'Okay, got it.')]")
	WebElement okayPopupIcon;


	//First flight seat selection
	@FindBy(xpath = "//div[@data-ref='seat-map__seat-row-22']//button[1]")
	WebElement firstPassengerFirstFlightSeatSelection;
	
	@FindBy(xpath = "//div[@data-ref='seat-map__seat-row-22']//button[2]")
	WebElement secondPassengerFirstFlightSeatSelection;
	
	@FindBy(xpath = "//div[@data-ref='seat-map__seat-row-22']//button[3]")
	WebElement childPassengerFirstFlightSeatSelection;

	//Second flight seat selection
	@FindBy(xpath = "//button[@class='ry-button ry-button--gradient-blue seats-action__button ry-button--flat-blue']")
	WebElement nextFlightButton;
	
	
	
	@FindBy(xpath = "(//button[@color='anchor-blue'])[2]")
	WebElement pickSameSeats;
	
	@FindBy(xpath ="//button[@class='enhanced-takeover-beta__product-dismiss-cta ry-button--anchor-blue ry-button--anchor']")
	WebElement fastTrackButton;
	
	@FindBy(xpath = "(//label[@class='ry-radio-circle-button__label'])[1]")
	WebElement cabinBagSelection;
	
	@FindBy(xpath ="//button[@class='ry-button--gradient-yellow']")
	WebElement continueCabinBagSelectionButton;
	
	@FindBy(xpath ="//button[@class='ry-button--full ng-tns-c170-1 ry-button--gradient-yellow ry-button--large']")
	WebElement extraFacilitiesSelection;
		
	@FindBy(xpath ="//a[contains(text(),'View basket')]")
	WebElement viewBasket;
	
	@FindBy(xpath ="//button[contains(text(),'Check out')]")
	WebElement checkOut;
	
	@FindBy(xpath ="(//input[@class='b2 date-placeholder'])[1]")
	WebElement phoneNumberButton;
	
	@FindBy(xpath ="(//div[@class='_container'])[5]")
	WebElement insuranceButton;
	
	@FindBy(xpath ="(//input[@type='tel'])[2]")
	WebElement paymentCardNumberButton;
		
	@FindBy(xpath ="(//input[@pattern='undefined'])[2]")
	WebElement addressLine1Button;
		
	@FindBy(xpath ="(//button[@class='dropdown__toggle b2'])[1]")
	WebElement expiryDateDropDownButton;
	
	@FindBy(xpath ="(//button[@class='dropdown-item__link dropdown-item__link--highlighted'])[2]")
	WebElement expiryDateButton;
	
	@FindBy(xpath ="(//button[@class='dropdown__toggle b2'])[2]")
	WebElement  expiryYearDropDownButton;
	
	@FindBy(xpath ="(//button[@class='dropdown-item__link dropdown-item__link--highlighted'])[3]")
	WebElement  expiryYearButton;
	
	@FindBy(xpath ="(//input[@class='b2 date-placeholder'])[6]")
	WebElement addressLine2Button;
	
	@FindBy(xpath ="(//input[@class='b2 date-placeholder'])[3]")
	WebElement  cvvButton;
	
	@FindBy(xpath ="(//input[@class='b2 date-placeholder'])[7]")
	WebElement cityButton;
	
	
	@FindBy(xpath ="//input[@class='b2 date-placeholder _error']")
	WebElement  cardHolderName;
	
	@FindBy(xpath ="//input[@class='b2 _autocomplete_input ng-tns-c82-3 _autocomplete_input--dropdown']")
	WebElement countryDropDownButton;

	@FindBy(xpath ="//input[@class='b2 _error']")
	WebElement  postalCode;
	
	
	@FindBy(xpath ="(//div[@class='_background'])[8]")
	WebElement  paynowCheckbox;
	
	@FindBy(xpath ="//button[contains(text(),'Pay now')]")
	WebElement  paynowButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this); // it will initialize all the ObjectRepository elements in this class
	}
		
//Actions//
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}

	public void login(String un, String pwd) throws InterruptedException {
		cookies.click();
		login.click();
		emailAddress.sendKeys(un);
		Thread.sleep(1000);

		password.sendKeys(pwd);
		loginButton.click();
	}

	public void flightSearching() throws InterruptedException {
		
		destination.sendKeys("Berlin");
		airportDestination.click();

		Thread.sleep(2000);
		flightDepartureMonthDate.click();
		flightDepartureDate.click();
	//	System.out.println("reached till here-1st flight date selection");

		Thread.sleep(2000);
		flightReturnDateChooseArea.click();
		flightReturnMonthDate.click();
		flightReturnDate.click();
	//	System.out.println("reached till here-2nd flight date selection");

		Thread.sleep(2000);
		passengerCountChooseArea.click();
		passengerAdultCount.click();
		Thread.sleep(1000);
		passengerChildCount.click();
		searchFlightButton.click();

		Thread.sleep(2000);
		firstFlightSelection.click();
		firstflightBagSelection.click();

		Thread.sleep(2000);
		secondFlightSelection.click();
		secondflightBagSelection.click();

		Thread.sleep(2000);
		firstPassengerTitleDropdownSelection.click();
		firstPassengerTitleSelection.click();
		firstPassengerFirstName.sendKeys("Tom");
		firstPassengerSecondName.sendKeys("Joseph");

		Thread.sleep(2000);
		secondPassengerTitleDropdownSelection.click();
		secondPassengerTitleSelection.click();
		secondPassengerFirstName.sendKeys("Jessy");
		secondPassengerSecondName.sendKeys("Joseph");
		
		Thread.sleep(2000);
		childPassengerFirstName.sendKeys("Aron");
		childPassengerSecondName.sendKeys("Joseph");
		continueIcon.click();
		okayPopupIcon.click();		
		
		Thread.sleep(2000);
		firstPassengerFirstFlightSeatSelection.click();
	//	System.out.println("reached till here -3");
		Thread.sleep(2000);
		secondPassengerFirstFlightSeatSelection.click();
		Thread.sleep(2000);
		childPassengerFirstFlightSeatSelection.click();

		nextFlightButton.click();
		
		pickSameSeats.click();

		fastTrackButton.click();
		
		
		cabinBagSelection.click();
		
	
		continueCabinBagSelectionButton.click();
		
	
		extraFacilitiesSelection.click();
		
		//Thread.sleep(2000);
		viewBasket.click();
		
	//	Thread.sleep(2000);
		checkOut.click();
		
		//Thread.sleep(2000);
		phoneNumberButton.sendKeys("891234567");
		
	//	Thread.sleep(1000);
		insuranceButton.click();
		paymentCardNumberButton.sendKeys("5555 5555 5555 5557");
		
	addressLine1Button.sendKeys("C/O Tom Joseph");
		
		expiryDateDropDownButton.click();
		
		expiryDateButton.click();
		expiryYearDropDownButton.click();
	
		expiryYearButton.click();
		
		Thread.sleep(2000);
		addressLine2Button.sendKeys("Galezi");
		
		Thread.sleep(2000);
		cvvButton.sendKeys("265");
		
		Thread.sleep(2000);
		cityButton.sendKeys("Letterkenny");
				
		Thread.sleep(2000);
		cardHolderName.sendKeys("Tom Joseph");
		
		Thread.sleep(2000);
		countryDropDownButton.sendKeys("Ireland");

		Thread.sleep(2000);
		postalCode.sendKeys("F92 WO0");

		Thread.sleep(2000);
		paynowCheckbox.click();

		Thread.sleep(2000);
	    paynowButton.click();	
	    
	    System.out.println("Payment declined: Wrong Card details");
	
	}
}

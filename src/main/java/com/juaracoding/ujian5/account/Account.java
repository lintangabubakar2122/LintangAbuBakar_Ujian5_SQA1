package com.juaracoding.ujian5.account;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujian5.driver.DriverSingleton;



public class Account {
	
private WebDriver driver;
	
	public Account () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignin;
	
	//isi email
	
	@FindBy(id = "email_create")
	private WebElement btnEmailCreate;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnSubmitCreate;
	
	//isi form
	
//	@FindBy (id = "id_gender1")
//	private WebElement btnTitle;
	
	
	@FindBy (css = "#account-creation_form > div > div.clearfix > div > label")
	private List<WebElement> btnTitle;
	
	@FindBy (id = "customer_firstname")
	private WebElement btnFirstName;
		
	@FindBy (id = "customer_lastname")
	private WebElement btnLastName;
	
	@FindBy (id = "passwd")
	private WebElement btnPassword;
	
	@FindBy (id = "uniform-days")
	private WebElement btnDays;
	
	@FindBy (id = "uniform-months")
	private WebElement btnMonth;
	
	@FindBy (id = "uniform-years")
	private WebElement btnYears;
	
	@FindBy (id="uniform-newsletter")
	private WebElement btnNewsletter;
	
	@FindBy (id="company")
	private WebElement btnCompany;

	@FindBy (id="address1")
	private WebElement btnAddress1;
	
	@FindBy (id="address2")
	private WebElement btnAddress2;
	
	@FindBy (id="city")
	private WebElement btnCity;
	
	@FindBy (id="uniform-id_state")
	private WebElement btnState;
	
	@FindBy (id="postcode")
	private WebElement btnPostcode;
	
	@FindBy (id="uniform-id_country")
	private WebElement btnCountry;
	
	@FindBy (id="other")
	private WebElement btnOther;
	
	@FindBy (id="phone")
	private WebElement btnPhone;
	
	@FindBy (id="phone_mobile")
	private WebElement btnMobile;
	
	@FindBy (id="submitAccount")
	private WebElement btnSubmit;
	
	//method
	
	public void Signin() {
		btnSignin.click();
	}
	
	public void EmailCreate() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnEmailCreate));
		btnEmailCreate.sendKeys("lintang2122@example.com");
		btnSubmitCreate.click();
	}
	
	public void IsiForm() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}		
		btnTitle.get(0).click();
		btnFirstName.sendKeys("Lintang");
		btnLastName.sendKeys("Keren");
		btnPassword.sendKeys("lintang2122");
	}
	
	public void isDays (int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnDays));
		btnDays.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	
	}

	public void isMonth(int selection) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnMonth));
		btnMonth.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void isYears(int selection) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnYears));
		btnYears.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void IsiForm1() {
		btnNewsletter.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
		btnCompany.sendKeys("Lintang's Foundation");
		btnAddress1.sendKeys("Jl. Kura Kura Terbang");
		btnAddress2.sendKeys("Dibalik Tempurung");
		btnCity.sendKeys("Miami");
	}
	
	public void isState(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnState));
		btnState.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void IsiForm2() {
		btnPostcode.sendKeys("96815");
	}
	
	public void isCountry(int selection) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btnCountry));
		btnCountry.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void IsiForm3() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		btnOther.sendKeys("Blok A3");
		btnPhone.sendKeys("1010101010");
		btnMobile.sendKeys("2020202020");
		btnSubmit.click();
	}


}

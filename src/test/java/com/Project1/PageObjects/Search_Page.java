package com.Project1.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search_Page {

	private WebDriver driver;

	

	/*public Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/

	

	public Search_Page(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
	
	}



	@FindBy(id= "twotabsearchtextbox")
	 WebElement sElement;
	public WebElement getSearchBar() {
		return sElement;
	}
	
	@FindBy(css ="input.nav-input") 
	private WebElement searchBtn;
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	@FindBy(css ="a.a-link-normal.s-no-outline ")
	WebElement pageLink;
	public WebElement getPageLink(){ 
		return pageLink;
	}
	
	public void search()throws InterruptedException{
		Thread.sleep(5000);
		getSearchBar().sendKeys("qa testing for beginners");
		Thread.sleep(5000);
		getSearchBtn().submit();
		Thread.sleep(5000);
		getPageLink().click();
	}
   public void searchAssert() throws InterruptedException {
	   driver.findElement(By.cssSelector("i.a-icon.a-accordion-radio.a-icon-radio-active")).click();
	      String expectedPrice ="$47.49" ; 
	      String actualPrice = driver.findElement(By.cssSelector("span#newBuyBoxPrice.a-size-base.a-color-price.header-price.a-text-normal")).getText(); 

	      Assert.assertEquals(actualPrice, expectedPrice, "Verify Price");
	      Thread.sleep(5000);
	     System.out.println("check1"); 
	   
   }
	
	
}
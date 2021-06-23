package com.Project1.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class AddToCartPage {
	
	
		private WebDriver driver;

		

		

		public AddToCartPage(WebDriver driver3) {
		this.driver= driver3;
		PageFactory.initElements(driver, this);
		
		}



		@FindBy(css= "input#add-to-cart-button.a-button-input")
		 WebElement add_ToCart;
		public WebElement getAddTo_Cart() {
			return add_ToCart;
		}
		
		
		public void addToCart()throws InterruptedException{
			
			getAddTo_Cart().submit();
			Thread.sleep(6000);
			
		}
		
		public void cartAssert() throws InterruptedException {
			 String expectedPrice1 = "$47.49"; 
		     String actualPrice1 = driver.findElement(By.cssSelector("span.a-color-price.hlb-price.a-inline-block.a-text-bold")).getText();
		     Assert.assertEquals(actualPrice1, expectedPrice1, "Verify Price");
		      Thread.sleep(6000);
		      System.out.println("check2");
		}
		
}

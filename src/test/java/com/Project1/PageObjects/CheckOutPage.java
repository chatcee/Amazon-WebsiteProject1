package com.Project1.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage {
	
		
			private WebDriver driver;

			

			

			public CheckOutPage(WebDriver driver4) {
			this.driver= driver4;
			PageFactory.initElements(driver, this);
			
			}



			@FindBy(id= "hlb-ptc-btn-native")
			 WebElement ToCheckOut;
			public WebElement get_CheckOut() {
				return ToCheckOut;
			}
			
			
			public void checkOut()throws InterruptedException{
				
				get_CheckOut().click();
				Thread.sleep(8000);
				
			}
	     
			public void checkOutAssert() throws InterruptedException {
			      String expectedPrice2 = "$47.49"; 
			       String actualPrice2 = driver.findElement(By.cssSelector("td.a-text-right.aok-nowrap.a-nowrap")).getText(); 
			       Assert.assertEquals(actualPrice2, expectedPrice2, "Verify Price");
			      Thread.sleep(5000);
			}

}

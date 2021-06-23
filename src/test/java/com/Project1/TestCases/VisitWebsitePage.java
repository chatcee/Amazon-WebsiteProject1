package com.Project1.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project1.PageObjects.AddToCartPage;
import com.Project1.PageObjects.CheckOutPage;
import com.Project1.PageObjects.Search_Page;
public class VisitWebsitePage {

	WebDriver driver;
    @Test
	public void visitWebsitePage() throws InterruptedException {
		
		 String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path  +   "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		
		  Search_Page sp = new Search_Page(driver);
           sp.search();
           sp.searchAssert();
	       Thread.sleep(5000);
	      
	    
	      
	   AddToCartPage cp = new AddToCartPage(driver);
	    cp.addToCart();
	    cp.cartAssert();
	   System.out.println("check3");
	   
	    
	    CheckOutPage cop = new CheckOutPage(driver);


	      cop.checkOut();
	      System.out.println("check4");
	      //cop.checkOutAssert();
	      //
      
        
        driver.close();
        //driver.quit();
     ;
    }
}
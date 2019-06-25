package test;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.BookShopingPage;

public class BookShoping extends BaseTest {
  @Test
  public void Init() throws InterruptedException 
  {
	  System.out.println("in init");
	  BookShopingPage shopingpage = PageFactory.initElements(driver, BookShopingPage.class); 
	  System.out.println("after pagefactory ");
	
	  //<---------------------------- 1st book-------------------------------->
	  
	  //enter book name1 
	  shopingpage.setBookName("Experiences of Test Automation: Case Studies of Software Test Automation");
	  //click on search icon
	  shopingpage.clickOnSearchIcon();
	  //Click on book name
	  shopingpage.clickOnBookName();
	  
	  //switch to tab window
	  Iterator<String>addcartitr = driver.getWindowHandles().iterator();
	  String parent = addcartitr.next();
	  String child = addcartitr.next();
	  driver.switchTo().window(child);
	  
	  //Click on Add cart
	  shopingpage.clickOnAddCart();
	 
	//<---------------------------- 2nd book-------------------------------->
	  
	  //enter book name2
	  shopingpage.setBookName("Agile Testing: A Practical Guide for Testers and Agile Teams");
	 //click on search icon
	  shopingpage.clickOnSearchIcon();
	 //click on papererback edition
	  shopingpage.clickOnBookPaperback();
	   
	  //switch to tab window
	  Iterator<String>agileitr = driver.getWindowHandles().iterator();
	  System.out.println("handle:"+driver.getWindowHandles().size());
	  String agile = agileitr.next();
	  String childagile = agileitr.next();
	  String childagile1=agileitr.next();
 	  driver.switchTo().window(childagile1);  
 	 //click on 'See All buying Option'
	  shopingpage.clickOnAllBuyingOption();
		  
	 //click on add cart for agile
	  shopingpage.clickOnAddCartForAgile();
		  
		//<---------------------------- 3rd book--------------------------------> 
	   
	  //enter book name 3
	  shopingpage.setBookName("'Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition");
	  //click on search icon
	  shopingpage.clickOnSearchIcon(); 
	
	 
	  //Click on paperback
	  shopingpage.clickOnBookPaperback();
	  
	  //switch to window
	  //switch to tab window
	  Iterator<String>seleniumwindowitr = driver.getWindowHandles().iterator();
	  System.out.println("handles:-"+driver.getWindowHandles().size());
	  String selenium = seleniumwindowitr.next();
	  String paperback = seleniumwindowitr.next();
	  String paperback1 = seleniumwindowitr.next();
	  String paperback2 = seleniumwindowitr.next();
	  driver.switchTo().window(paperback2);
	  
	  
	  //Click on Add cart
	  shopingpage.clickOnAddCart();
	  
	  //<---------------------------- Cart Opeartions -------------------------------->
	  
	  //Click on  Cart icon
	  shopingpage.clickOnCartIcon();
	  
	  //click on 'Save for option' for test automation book
	  shopingpage.clickOnSaveForlate();
	  
	  //click on delete for agile
	  shopingpage.clickOnDelete();
	  
	  //Click on quantity dropdown box for selenium
	  Thread.sleep(8000);
	  shopingpage.clickOnDropdownQuantity();
	 
	  
	  //click on required quantity for selenium book(quantity=3)
	  shopingpage.clickOnRequiredQuantity();
	  
	  //Click on mark as gifft for selenium book
	  Thread.sleep(8000);
	  shopingpage.SelctGiftCheckbox();
	  
  }
}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class BookShopingPage {
	WebDriver driver;
	 JavascriptExecutor js;
    public BookShopingPage(WebDriver driver){ 
             this.driver=driver; 
    }

    
  //Using FindBy for locating elements
    //Search Field
    @FindBy(how=How.CSS, using="input#twotabsearchtextbox") WebElement searchField;
    //Search icon
    @FindBy(how=How.CSS, using="input.nav-input") WebElement searchicon;
    //'Experiences of Test Automation: Case Studies of Software Test Automation'book
    @FindBy(how=How.CSS, using="a[title='Experiences of Test Automation: Case Studies of Software Test Automation, 1e']") WebElement clickonbookname;
   //add to cart
    @FindBy(how=How.CSS, using="input#add-to-cart-button") WebElement addcart;
    //'Agile Testing: A Practical Guide for Testers and Agile Teams'book
   @FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div/div/div[2]/div[1]/div[1]/a/h2")WebElement clickonclagilebook;
   //click on 'see all buying option'
   @FindBy(how=How.CSS, using="a#buybox-see-all-buying-choices-announce") WebElement clickonseeallbuyingopt;
   //click on 'add to cart' for agile
   @FindBy(how=How.CSS, using="input.a-button-input") WebElement clickonaddcartforagile;
   //'Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition'book
   @FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li/div/div/div/div[2]/div[1]/div[1]/a/h2") WebElement clickonseleniumbook;
   //click on 'paper back option'
   @FindBy(how=How.CSS, using="a[title='Paperback']") WebElement clickonbookpaperback;
   //click on Cart icon
   @FindBy(how=How.CSS,using="a#nav-cart")WebElement clickoncarticon;
   //click on 'save for later' option for Test automation book
   @FindBy(how=How.CSS,using="input[aria-label='Save for later Experiences of Test Automation: Case Studies of Software Test Automation, 1e']") WebElement clickonsaveforlater;
   //click on 'Delete'option for agile
   @FindBy(how=How.CSS,using="input[aria-label='Delete Agile Testing: A Practical Guide for Testers and Agile Teams, 1e']")WebElement clickondelete;
   //click on dropdown along with selenium book
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div[4]/div/div[4]/div/div[2]/div[3]/form/div[2]/div/div[4]/div/div[3]/div/div/span/span/span/span")WebElement clickonseleniumbookdropdown;
   //click on required qauntity
   @FindBy(how=How.CSS,using="a#dropdown1_2") WebElement clickonrequiredquantity;
   //click on gift checkbox
   @FindBy(how=How.XPATH,using="//div[@class='a-checkbox sc-gift-option a-align-top a-size-small a-spacing-top-micro']//input[@type='checkbox']") WebElement clickongiftcheckbox;
   
  
   //enter book name in search field 
    public void setBookName(String bookname){
   
    	searchField.clear();
    	 searchField.sendKeys(bookname);
  
    	 }
    
    //click on search icon
    public void clickOnSearchIcon(){
    	 searchicon.click();
    	 }
  
    //click on book name
    public void clickOnBookName(){
    	
   
   	 clickonbookname.click();
   	 }
   
    
    //click to add cart
    public void clickOnAddCart() throws InterruptedException{
		//java script intialization
		js= (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)");	
    	
   	Thread.sleep(8000);
   	 addcart.click();
   	 }
   
    //click on agile book name
    public void clickOnAgileBookName(){
    	
   
   	 clickonclagilebook.click();
   	 }
    
  //click on selenium book name
    public void clickOnSeleniumBookName(){
    	
   
   	 clickonseleniumbook.click();
   	 }
    
    //click on paperback option
    public void clickOnBookPaperback() throws InterruptedException{
    	
     Thread.sleep(9000);
   	clickonbookpaperback.click();
     
   }
    //click on see all buying option
    public void clickOnAllBuyingOption(){
    	
   
   	 clickonseeallbuyingopt.click();
   	 }
    
  
  //click on add to cart for agile option
    public void clickOnAddCartForAgile(){
    	
   
   	 clickonaddcartforagile.click();
   	 }
    
    //click on  cart icon 
    public void clickOnCartIcon(){
    	
   
   	 clickoncarticon.click();
   	 }
  //click on save for later option for test automation book
    public void clickOnSaveForlate(){
    	
   
   	 clickonsaveforlater.click();
   	 }
    
    //click on delete for agile book
    public void clickOnDelete() throws InterruptedException{
    	
   Thread.sleep(3000);
   	 clickondelete.click();
   	 }
    
    
    //click on dropdown qauantity for selenium book
    public void clickOnDropdownQuantity() throws InterruptedException{
    	
   
   //	 clickonseleniumbookdropdown.click();
   	 Thread.sleep(3000);
   	clickonseleniumbookdropdown.click();
   	 }
    
    //click on required qauantity for selenium book
    public void clickOnRequiredQuantity() throws InterruptedException{
    	
     Thread.sleep(10000);
   	 clickonrequiredquantity.click();
   	 }
    
    //select gift checkbox for selenium book
    public void SelctGiftCheckbox(){
    	
   
   	 clickongiftcheckbox.click();
   	 }
}

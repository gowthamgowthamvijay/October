package org.star;


import org.king.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Performance extends UtilClass {
      public Performance() {
    	  PageFactory.initElements(driver, this);
	}
    @FindBy(id="email")
    private WebElement user;
	public WebElement getUser() {
		return user;
	}
    @FindBy(id="pass")
    private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	
	}
	
	
	
	
	
	
	


package sumo;
import org.king.*;
import org.star.*;

import java.io.IOException;

import org.junit.After;
import org.king.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AB extends UtilClass {

	@BeforeClass
	private void bc() {
		chromebrowser();
		url("https://www.facebook.com/");

	}
	@AfterClass
	private void bm() {
		driver.quit();

	}
	@Test
	private void t4() throws IOException  {
		Performance p=new Performance();
		passkeys(p.getUser(),exceldata("call",3,1));
		passkeys(p.getPassword(), exceldata("call",4,1));
			}

	@BeforeMethod
	private void any() {
		datetime();
	}
	@AfterMethod
	private void aaa() {
                datetime();
	}
		
}
	
	
		
		
		
		
		
	


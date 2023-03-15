package org.star;



import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.king.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;


public class Junit extends UtilClass{

	@Test
	public void xc() throws IOException {
		chromebrowser();
		maximize();
		url("https://www.facebook.com/");
		Performance p= new Performance();
        passkeys(p.getUser(),exceldata("call",3,1));
        passkeys(p.getPassword(),exceldata("call",4,1));

	}
		
		
		
	}
	
		
		
		
		
		
		
		
		
		
		

	

	



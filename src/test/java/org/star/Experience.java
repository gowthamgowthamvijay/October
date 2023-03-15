package org.star;

import java.io.IOException;

import org.king.UtilClass;
import org.openqa.selenium.WebElement;

public class Experience extends UtilClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		chromebrowser();
		maximize();
		url("https://www.facebook.com/");
		Performance p=new Performance();
		passkeys(p.getUsername(), exceldata("call", 2, 1));
		passkeys(p.getPassword(), exceldata("call", 3, 1));
		Thread.sleep(5000);
		elementclick(p.getLogin());
		
		
		
		
		
	}
	

}

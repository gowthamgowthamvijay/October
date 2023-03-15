package sumo;
import org.king.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.king.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel extends UtilClass{
    public static void main(String[] args) {
		chromebrowser();
		maximize();
		url("https://www.facebook.com/");
		impli(10);
		WebElement user = driver.findElement(By.id("email"));
		passkeys(user, "red");
		WebElement password = driver.findElement(By.id("pass"));
		passkeys(password, "string");
        WebElement create = xpath("//a[text()='Create new account']");	
        elementclick(create);
        WebElement first = xpath("//input[@name='firstname']");
        passkeys(first, "first");
        
    	
    	
    	
    	
	}

}
	  
	  
	  
	  

	



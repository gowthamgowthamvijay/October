package org.king;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilClass {
	 public   static WebDriver driver;
     
		public static  void chromebrowser() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		public static void maximize() {
			driver.manage().window().maximize();
			}
		public static void url(String url) {
			driver.get(url);

		}
		public static void passkeys(WebElement element,String value) {
			element.sendKeys(value);
			

		}
		  public static void elementclick(WebElement element) {
			  element.click();
		  }
		  public static void screenshot(String name) throws IOException {
			TakesScreenshot t=(TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\Gowtham\\New folder\\QW\\scrrrenshot\\"+name+".png");
			FileUtils.copyFile(src, des);
		  }
		  public static String exceldata(String sheetName,int rowno,int cellno) throws IOException {
			
			  File f=new File("C:\\Users\\Gowtham\\New folder\\QW\\round\\value.xlsx");
			  FileInputStream fi=new FileInputStream(f);
			  Workbook book= new XSSFWorkbook(fi);
			  Sheet sheet = book.getSheet(sheetName);
			  Row row = sheet.getRow(rowno);
			  Cell cell = row.getCell(cellno);
			  int type = cell.getCellType();
			  
			  
			  String value="";
			  if (type==1) {
				  
				   value = cell.getStringCellValue();
				  }
			  else if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat s=new  SimpleDateFormat("dd,mm,yyyy");
				 value = s.format(d);
				
			}
			  else {
				
				  double d = cell.getNumericCellValue();
				  long l=(long)d;
				   value = String.valueOf(l);
				  
			}
			  return value;
		  }
		  
			  
		public static WebElement xpath(String name) {
           WebElement a = driver.findElement(By.xpath(name));
           return a;
		}
			
		
			
				public static void datetime() {
					Date d = new Date();
					SimpleDateFormat s=new  SimpleDateFormat("dd,mm,yyyy hh:mm:ss");
					String a = s.format(d);
					System.out.println(a);
					
					}
				 public static void impli(int seconds) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
				}
				
				
}

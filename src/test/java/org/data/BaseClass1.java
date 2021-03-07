package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	public static Actions a;


	public static WebDriver loadBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\DataDrivenFaceBook\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void maxmizeWindow() {
		driver.manage().window().maximize();

	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static String pageUrl() {
		String ulr = driver.getCurrentUrl();
		return ulr;

	}
	public static void fill(WebElement element,String text) {
		element.sendKeys(text);

	}
	public static void btnClick(WebElement element) {
		element.click();

	}
	public static void dragDrop(WebElement source,WebElement dest) {
		a=new Actions(driver);
		a.dragAndDrop(source, dest).perform();



	}

	public static void moveElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();



	}

	public static void rightClick(WebElement element) throws AWTException {
		a=new Actions(driver);
		a.contextClick(element).perform();
		Robot a=new Robot();
		//a.keyPress(KeyEvent.VK_DOWN);
		//a.keyRelease(KeyEvent.VK_DOWN);
		//a.keyPress(KeyEvent.VK_ENTER);
		//a.keyRelease(KeyEvent.VK_ENTER);
		for (int i = 0; i <8; i++) {
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
		}
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);


	}

	public static String textForm(WebElement element) {
		String text = element.getAttribute("value");
		return text;


	}
	public static void pageClose() {
		driver.close();

	}
	public static void takeShot(String file) throws IOException {
		//type casting
		TakesScreenshot t=(TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\FFOutput\\.din.png");
		FileUtils.copyFile( s, d);




	}

	public static void doubleClick(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();




	}
	public static void alertMethod(String text) {

		Alert b = driver.switchTo().alert();
		b.sendKeys(text);
		
	

	}
	   public static void javaExecutor(WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", element);




	}
	public static void javaExecutorClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);


	}
	public static String javaExecutorReturn(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object ss = js.executeScript("return arguments[0].getAttribute('value')",element);
		String s=(String)ss;
		return s;

	}
	public static void scrolDown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);



	}
	public static void scrolup(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void frameId(WebElement element) {
		driver.switchTo().frame(element);

	}
	public static void frameString(String data) {
		driver.switchTo().frame(data);
		

	}
	
	public static void selectByValue(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByValue(text);


	}
	public static void selectByText(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByVisibleText(data);

	}
	public static void selectByIndex(WebElement element,int num) {
		Select s=new Select(element);
		s.selectByIndex(num);

	}
	public static void getOptionBy(WebElement element) {
		Select s= new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement each = options.get(i);
			String ss = each.getText();
			System.out.println(ss);


		}

	}
	public static void getAllSelectedOptions(WebElement element,String text,String text1,int num) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		s.selectByIndex(0);
		s.selectByValue(text1);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement opt = allSelectedOptions.get(i);
			String ss = opt.getText();
			System.out.println(ss);
			
			
		}
		
		
	}
	public static void ismuliple(WebElement element) {
		Select s=new Select(element);
		boolean b = s.isMultiple();
		System.out.println(b);
		
		

	}
	public static String excelReadMethod(int rowNo,int cellNo) throws IOException {
		
		File f=new File("D:\\selenium\\DataDrivenFaceBook\\data\\college.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		
		return value;
		
		
		
	}
	public static String adactinHotel(int rowNo,int cellNo) throws IOException {
		File f=new File("D:\\selenium\\DataDrivenFaceBook\\data\\adactin.xlsx");
		FileInputStream fil=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fil);
		Sheet sheet = w.getSheet("Sheet1");
		
			Row row = sheet.getRow(rowNo);
			
			Cell cell = row.getCell(cellNo);
				
				
				int cellType = cell.getCellType();
				
				String value="";
				
				if (cellType==1) {
					value = cell.getStringCellValue();
					
					
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
					value = s.format(d);
					
					
				}
				else {
					double l = cell.getNumericCellValue();
					long d=(long)l;
					value = String.valueOf(d);
					
					
				}
				
				return value;
				
			}
		

}



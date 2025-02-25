package utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
     
	public static WebDriver driver = new ChromeDriver();
	public static Properties prop;
	public static String filepath1;
	
	public void browser() {
		 //driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void closebrowser() {
		driver.close();
	}
	
	public static String getCellData (String filepath, String sheetName, int rowNum, int colNum ) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(filepath);
		XSSFSheet sheet = book.getSheet(sheetName);
		XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
		String data = cell.toString();
		return data;
		
	}
	
	public static void readFromPropFile(String filepath1) throws IOException{
		FileReader file = new FileReader(filepath1);
		prop = new Properties();
		prop.load(file);
	}
}

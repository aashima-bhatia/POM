package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
			
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\hp\\Documents\\TESTING\\AutoIT Script\\Script1.exe");
		driver.findElement(By.id("processTask")).click();
		driver.findElement(By.id("pickfiles")).click();

	}
	

}

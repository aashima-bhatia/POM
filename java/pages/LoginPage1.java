package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectspecificationMethods;

public class LoginPage1 extends ProjectspecificationMethods{

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage1 Enterlogin(String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public LoginPage1 Enterpas(String pas) {
		driver.findElement(By.id("Password")).sendKeys(pas);
		return this;
	}
	
	public HomePage SubBtn() {
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		return new HomePage(driver);
	}
	
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectspecificationMethods;

public class HomePage extends ProjectspecificationMethods {
       
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
	 }
	 
//	 public RegisterPage clickRegister() {
//		 driver.findElement(By.className("ico-register")).click();
//		 return new RegisterPage(driver);  // constructor chaining
//	 }
//	 
	 public LoginPage1 clickLogin() {
			driver.findElement(By.className("ico-login")).click();
			return new LoginPage1(driver);
		}
	 
	 
	 
}

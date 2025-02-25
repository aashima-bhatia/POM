package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectspecificationMethods;

public class RegisterPage extends ProjectspecificationMethods{
          
	  public RegisterPage(WebDriver driver) {
		  this.driver = driver;
		  
	  }
	  
	  public RegisterPage clickGender() {
		  driver.findElement(By.id("gender-male")).click();
		  return this;
	  }
	  
	  public RegisterPage firstName(String fname) {
		  driver.findElement(By.id("FirstName")).sendKeys(fname);
		  return this;
	  }
	  
	  public RegisterPage lastName(String lname) {
		  driver.findElement(By.id("LastName")).sendKeys(lname);
		  return this;
	  }
	  
	  public RegisterPage Email(String email) {
		  driver.findElement(By.id("Email")).sendKeys(email);
		  return this;
	  }
	  
	  public RegisterPage Password(String pas) {
		  driver.findElement(By.id("Password")).sendKeys(pas);
		  return this;  
	  }
	  
	  public RegisterPage ConPassword(String conpas) {
		  driver.findElement(By.id("ConfirmPassword")).sendKeys(conpas);
		  return this;
	  }
	  
	  public RegisterResult ClickRegisterButton() {
		  driver.findElement(By.id("register-button")).click();
		  return new RegisterResult(driver);
	  }
	  
	  
	 

}

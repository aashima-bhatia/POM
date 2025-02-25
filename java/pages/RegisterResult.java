package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectspecificationMethods;

public class RegisterResult extends ProjectspecificationMethods{

	public RegisterResult(WebDriver driver) {
		this.driver = driver;
	}
	
	public RegisterResult validateRegister() {
		String actualText = driver.findElement(By.className("result")).getText();
		String expectedText = "Your registration completed";
		
		if(actualText.contains(expectedText)) {
			System.out.println("Registration Successfull");
		}else {
			System.out.println("Unsuccessfull Registration");
		}
		return this;
	}
	
	public HomePage clickContinue() {
		driver.findElement(By.xpath("//input[contains(@class,'register-continue-button')]")).click();
		return new HomePage(driver);
	}
	
}

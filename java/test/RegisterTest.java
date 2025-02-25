package test;

import base.ProjectspecificationMethods;
import pages.HomePage;

public class RegisterTest extends ProjectspecificationMethods {

	public static void main(String[] args) {
		
		HomePage obj = new HomePage(driver);
		obj.LaunchingBroswerAndLoadingURL();
		
//		obj.clickRegister()
//		.clickGender()
//		.firstName("Test")
//		.lastName("test2")
//		.Email("test1239878@gmail.com")
//		.Password("Test@991")
//		.ConPassword("Test@991")
//		.ClickRegisterButton()
//		.validateRegister()
//		.clickContinue()
//		.closebrowser();
		
	    obj.clickLogin()
	    .Enterlogin("test1239878@gmail.com")
	    .Enterpas("Test@991")
	    .SubBtn()
	    .closebrowser();
	    

	}

}

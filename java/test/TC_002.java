package test;

import java.io.IOException;

import base.ProjectspecificationMethods;
import pages.HomePage;

public class TC_002 extends ProjectspecificationMethods {

	public static void main(String[] args) throws IOException {
		
//		String filepath = "C:\\Users\\hp\\Documents\\TESTING\\excel files\\TestingData.xlsx";
//		String email = getCellData(filepath,"Data",2,0); // 1st row 1st col
//		String pas = getCellData(filepath,"Data",2,1);
		
		filepath1 = "C:\\Users\\hp\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\Data\\SignUpData.properties";
		readFromPropFile(filepath1);
		
		HomePage obj = new HomePage(driver);
	    obj.LaunchingBroswerAndLoadingURL();
	    
//	    obj.clickLogin()
//	    .Enterlogin(email)
//	    .Enterpas(pas)
//	    .SubBtn()
//	    .closebrowser();
	    
	    obj.clickLogin()
        .Enterlogin(prop.getProperty("email"))
        .Enterpas(prop.getProperty("pass"))
        .SubBtn();
	

	}

}

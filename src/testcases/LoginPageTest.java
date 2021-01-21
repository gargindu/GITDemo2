package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRep.RediffLoginPage;
import objectRep.RediffLoginPageFactory;

public class LoginPageTest { 
	
	
	@Test
	public void LoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installed_app\\chromedriver_win32\\chromedriver.exe");
		System.out.println("hello");
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://mypage.rediff.com/login/dologin");
	RediffLoginPageFactory lp= new RediffLoginPageFactory(driver);
	
	lp.email().sendKeys("hello");
	lp.password().sendKeys("Password");
	lp.loginButton().click();
		
	
			
	}
	
}

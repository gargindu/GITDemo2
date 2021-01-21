package objectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	
	
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	By email=By.id("txtlogin");
	By  password= By.name("num");
	By loginButton= By.xpath("//*[@id='pass_div']/input[3]");
	
	
	
public WebElement email()
{
	 return driver.findElement(email);
	
}

public WebElement password()
{
	return driver.findElement(password);
	
}

public WebElement loginButton()
{
	return driver.findElement(loginButton);
	
}


	

}

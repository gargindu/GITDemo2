package objectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	
WebDriver driver;
	
	
	
	
	public RediffLoginPageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

/*	By email=By.id("txtlogin");
	By  password= By.name("num");
	By loginButton= By.xpath("//*[@id='pass_div']/input[3]");*/
	@FindBy(id="txtlogin")
	WebElement email;
	
	@FindBy(name="num")
	WebElement password;
	
	@FindBy(xpath="//*[@id='pass_div']/input[3]")
	WebElement loginButton;
	
	
	
public WebElement  email()
{
	 return email;
	 
	
}

public WebElement password()
{
	return password;
	
}

public WebElement loginButton()
{
	return loginButton;
	
	
}





}

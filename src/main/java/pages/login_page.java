package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page extends Basepage{

	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "pass")
	WebElement password;
	@FindBy(name = "login")
	WebElement submit;
	
	public login_page(){
		PageFactory.initElements(driver, this);
	}
	
	public void login_credentials(String eml,String pwd)
	{
		super.type_text(email,eml);
		super.type_text(password,pwd);
	}
	
	public void submit()
	{
		super.click_Element(submit);
	}
}

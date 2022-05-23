package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import init.Intialize;


public class Basepage {
    public WebDriver driver;
    
    public Basepage() {
    	this.driver = Intialize.driver;
    }
    
	public void type_text(WebElement element, String text) {
		System.out.println("basepage drver " + driver);
		element.sendKeys(text);
		
	}
	
	public void click_Element(WebElement element) {
		element.click();
	}

	public void get_text(WebElement element) {
		element.getText();
	}

}

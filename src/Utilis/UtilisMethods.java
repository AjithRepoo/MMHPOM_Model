package Utilis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class UtilisMethods {
	    public static void sleep(long milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void switchToFrame(WebDriver driver, String string) {
	        driver.switchTo().frame(string);	
	    }

	    public static void switchToDefaultContent(WebDriver driver) {
	        driver.switchTo().defaultContent();
	    }
	    public static void selectOptionByVisibleText(WebElement element, String visibleText) {
	        Select select = new Select(element);
	        select.selectByVisibleText(visibleText);
	    }
	    
	    public static void Type(WebElement element, String text) {
	        
	        element.sendKeys(text);
	    }
	}



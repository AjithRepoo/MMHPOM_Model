package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	    private WebDriver driver;

	    private WebElement usernameInput;

	    @FindBy(name = "username")
	    private WebElement txtusername;

	    @FindBy(name = "password")
	    private WebElement txtpassword;
	    
	    @FindBy(xpath = "//button[text()=' Login ']")
	    private WebElement btnLogin;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String username) {
	    	txtusername.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	    	txtpassword.sendKeys(password);
	    }

	    public void clickLoginButton() {
	    	btnLogin.click();
	    }
	}



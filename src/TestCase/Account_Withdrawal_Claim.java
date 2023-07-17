package TestCase;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.Withdrawal_Details_29;

public class Account_Withdrawal_Claim {
    private WebDriver driver;
    private LoginPage loginpage;
    private Withdrawal_Details_29 withdraw;

    public Account_Withdrawal_Claim(WebDriver driver) {
        this.driver = driver;
        loginpage = new LoginPage(driver);
        withdraw=new Withdrawal_Details_29 (driver);
        
    }

    public void Login() {
    	loginpage.enterUsername("Ajith");
    	loginpage.enterPassword("fghjk");
    	loginpage.clickLoginButton();
    }
    public void caseHitory() {
		

	}
    public void Withdrawal_Details() {
    	ArrayList<Integer> LoginSteps3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    	withdraw.Execute(LoginSteps3);
    	
    }
}

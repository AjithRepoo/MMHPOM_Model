package main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import TestCase.Account_Withdrawal_Claim;
public class Main {


	
	    private WebDriver driver;
	    private Account_Withdrawal_Claim testActions;

	   
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Hexaware\\TALOS Utility\\JavaCABuild\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        testActions = new Account_Withdrawal_Claim(driver);
	    }

	  
	    public void runTest() {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        testActions.performTestActions();
	    }

	  
	    public void tearDown() {
	        driver.quit();
	    }

	    public static void main(String[] args) {
	    	Main testRunner = new Main();
	        testRunner.setUp();
	        testRunner.runTest();
	        testRunner.tearDown();
	    }
	}



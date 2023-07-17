package PageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilis.UtilisMethods;


public class Withdrawal_Details_29 extends UtilisMethods {
	private static WebDriver driver;
    
    @FindBy(id="mainForm:tabSelecter4")
    public static  WebElement AnduserclickstheWithdrawalDetailsTab;

    @FindBy(id="j_idt436:selectWithdrawalType")
    public static  WebElement AnduserSelectsonWithdrawClaimTypeRETRENCHMENTfromthedropdown;

    @FindBy(id="j_idt436:electionDate_input")
    public static  WebElement AnduserclicksontheElectionDateintheWithdrawalDetails;

    @FindBy(xpath="//button[text()='Current Date']")
    public static  WebElement Anduserclicksonthecurrentdate;

    @FindBy(id="j_idt436:btnWithDet")
    public static  WebElement AnduserclicksontheSubmitintheWithdrawalDetails;

    @FindBy(xpath="(//legend[text()='Disinvestment effective date']//following::label[text()='No'])[1]")
    public static  WebElement AnduserChnoosetheNOintheDisinvestmentEffectiveDate;

    @FindBy(xpath="(//label[text()='Claim form signed by member?']//following::label[text()=' Yes'])[1]")
    public static  WebElement Anduserchooseyesintheclaimformsignedbymember;
    
    public Withdrawal_Details_29(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    static boolean execute = true;
    public static void Execute(ArrayList<Integer> steps) {
        for (int step : steps) {
    if (step == 1&&execute) {
            try {
            	AnduserclickstheWithdrawalDetailsTab.click();
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 2&&execute) {
            try {
            	switchToDefaultContent(driver);
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 3&&execute) {
            try {
            	switchToFrame(driver, "mainArea");
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 4&&execute) {
            try {
            	switchToFrame(driver, "wfBody");
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 5&&execute) {
            try {
            	selectOptionByVisibleText(AnduserSelectsonWithdrawClaimTypeRETRENCHMENTfromthedropdown, "RETRENCHMENT");
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 6&&execute) {
            try {
            	AnduserclicksontheElectionDateintheWithdrawalDetails.click();
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 7&&execute) {
            try {
            	Anduserclicksonthecurrentdate.click();
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 8&&execute) {
            try {
            	AnduserChnoosetheNOintheDisinvestmentEffectiveDate.click();
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 9&&execute) {
            try {
            	Anduserchooseyesintheclaimformsignedbymember.click();
            } catch (Exception e) {
                execute=false;
            }
    }
    if (step == 10&&execute) {
            try {
            	AnduserclicksontheSubmitintheWithdrawalDetails.click();
            } catch (Exception e) {
                execute=false;
            }
    }
        }
    }
}



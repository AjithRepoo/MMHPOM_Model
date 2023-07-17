package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrbitPortal_2 {

    @FindBy(name="jumpToForm:j_idt36")
    public static WebElement AnduserTypetheUpdateFields1Data;

    @FindBy(name="jumpToForm:j_idt37")
    public static WebElement AnduserTypetheUpdateFields2Data;

    @FindBy(name="jumpToForm:j_idt38")
    public static WebElement AndUserClicksontheADDbuttonicon;

    @FindBy(name="jumpToForm:note")
    public static WebElement AnduserTypeReasonintheReasonFields;

    @FindBy(id="jumpToForm:jumpTo")
    public static WebElement AndUserClicksontheJumbToButton;

    @FindBy(xpath="//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c']")
    public static WebElement Anduserclicksonthelastaccountwithdrawalradiobutton;

    @FindBy(id="caseHistoryForm:continueReason_label")
    public static WebElement Anduserclicksonreasondropdown;

    @FindBy(xpath="//ul//li[text()='Other']")
    public static WebElement AnduserclicksonOtherfromthedropdown;

    @FindBy(id="caseHistoryForm:submitButton")
    public static WebElement AnduserclicksonSubmitbutton;

    @FindBy(name="form:j_idt73")
    public static WebElement AndUserclicksonBackbuttoninAuditTrailPage;

    @FindBy(xpath="(//img[@style='border: none'])[4]")
    public static WebElement Anduserclicksonmagnifyingglassicon;

    @FindBy(xpath="(//a[text()='USERNAME']//following::a[text()='change'])[1]")
    public static WebElement Anduserclicksonchangeusername;

    @FindBy(xpath="(//a[text()='USERNSUPERVISOR']//following::a[text()='change'])[1]")
    public static WebElement AnduserclicksonchangeUSERNSUPERVISOR;

    @FindBy(id="jumpToForm:note")
    public static WebElement AndUserProvidereasonintheReasonFields;

    @FindBy(xpath="(//img[@style='border: none'])[1]")
    public static WebElement AnduserClickontheHistoryiconinmaindasbord;

    @FindBy(id="caseHistoryForm:approvalOption")
    public static WebElement AnduserclciksonYESfromthedropdown;

    @FindBy(xpath="(//input[@value='micheleh'])[1]")
    public static WebElement Anduserclearstheusernamedata;

    @FindBy(xpath="(//input[@value='micheleh'])[2]")
    public static WebElement AnduserclearstheUSERNSUPERVISORAfterclicktheclearbuttondata;

    @FindBy(xpath="//*[text()='Jump']")
    public static WebElement AndUserClickontheJumpbutton;
}

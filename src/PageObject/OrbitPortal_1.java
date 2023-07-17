package PageObject;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilis.UtilisMethods;

public class OrbitPortal_1 extends UtilisMethods {
static boolean execute =true;
	 private WebDriver driver;
	 private OrbitPortal_2 orbitPortal_2; 
	
	@FindBy(id="frm:openItem")
    public static  WebElement AndUserClicksontheTryAgain;

 

    @FindBy(xpath="//a[text()='Workflow Menu']")
    public static  WebElement AndUserClickontheWorkFlowButtonintheorbitportal;

 

    @FindBy(xpath="//a[text()='Start Case']")
    public static  WebElement AnduserclickonStartcasefromsidenavigationbar;

 

    @FindBy(xpath="//a[text()='ACC Withdrawal Claim']")
    public static  WebElement AnduserclicksontheACCwithdrawclaimunderstartcase;

 

    @FindBy(id="frm:openItem")
    public static  WebElement AnduserTypetheGroupNointheMemberInformation;

 

    @FindBy(id="search-form:personNumber")
    public static  WebElement AnduserTypePersonNumberintheMemberInformation;

 

    @FindBy(id="search-form:roleNumber")
    public static  WebElement AnduserTypetheRoleNumberintheMemberInformation;

 

    @FindBy(id="search-form:nextButton")
    public static  WebElement AndUserClickontheNextButton;

 

    @FindBy(id="startCaseButton")
    public static  WebElement AnduserClicksontheStartButtonintheUploadingDoument;

 

    @FindBy(id="caseStartConf:caseRef")
    public static  WebElement AnduserCopytheReferencenumberusinggetProbertyintheCaseStratConfirmation;

 

    @FindBy(xpath="//*[@class='message']")
    public static  WebElement AndUserSearchtheReferenaceintheRightofthesearchbar;

 

    @FindBy(id="menuForm:searchRefTxt")
    public static  WebElement AndUserSearchtheReferenaceintheRightofthesearchbar1;

 

    @FindBy(xpath="(//img[@title='Search'])[last()]")
    public static  WebElement AnduserClickthesearchbutton;

 

    @FindBy(xpath="//img[@title='History']")
    public static  WebElement AnduserClickontheHistoryicon;

 

    @FindBy(id="frm:note")
    public static  WebElement AndUserTypeTextintheTakeworkitemField;

 

    @FindBy(id="frm:takeWI")
    public static  WebElement AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation;

 

    @FindBy(xpath="(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[last()]")
    public static  WebElement Anduserclicksonthelastaccountwithdrawalradiobutton;

 

    @FindBy(xpath="//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")
    public static  WebElement Anduserclicksonreasondropdown;

 

    @FindBy(id="caseHistoryForm:submitButton")
    public static  WebElement AnduserclicksonSubmitbutton;

 

    @FindBy(id="wiHdr:release")
    public static  WebElement AnduserclicksonReleasebutton;

 

    @FindBy(id="frm:back")
    public static  WebElement AndUserclicksonBackbuttoninTakeWorkItemConfirmationPage;

 

    @FindBy(xpath="(//input[@class='button back'])[last()]")
    public static  WebElement AndUserclicksonBackbuttoninAuditTrallPage;

 

    @FindBy(xpath="(//img[@style='border: none'])[4]")
    public static  WebElement Anduserclicksonmagnifyingglassicon;

 

    @FindBy(id="cdForm:jumpTo")
    public static  WebElement AnduserclicksonJumpDatabutton;

 

    @FindBy(id="jumpToForm:note")
    public static  WebElement AndUserProvidereasonintheReasonFields;

 

    @FindBy(id="cdForm:back")
    public static  WebElement Anduserclicksonbackbutton;

 

    @FindBy(xpath="//img[@style='border: none'])[1]")
    public static  WebElement AnduserClickontheHistoryiconintheAgain;

 

    @FindBy(xpath="//span[text()='Submit']")
    public static  WebElement AnduserclicksonSubmitbuttonintheorbit;

 

    @FindBy(xpath="//select[@id='caseHistoryForm:approvalOption']")
    public static  WebElement AnduserSelecttheYesusingSelectMethod;

 @FindBy(name="cdForm:back")
 public static  WebElement Backbutton;

    @FindBy(xpath="(//span[starts-with(text(),'Close ACCPEN02')]//following::span[text()='DROIDGENERIC']//following::label)[1]")
    public static  WebElement AndUserClickontheJumbtoCheckboxCloseACCPEN02DROIDGENERIC;

  @FindBy(xpath="(//input[@value='micheleh'])[1]")
  public static  WebElement clearName;

    @FindBy(xpath="//ul//li[text()='Other']")
    public static  WebElement AnduserclicksonOtherfromthedropdown;

    @FindBy(xpath="//a[@title='History']")
    public static  WebElement Anduserclickonhistoryicon;

    @FindBy(name="caseHistoryForm:approvalOption")
    public static  WebElement Anduserclicktoselectanoption;

    @FindBy(xpath="//option[text()='Yes']")
    public static  WebElement Anduserclickonyes;
    @FindBy(name="(//tr[@class='ui-widget-content ui-datatable-even detailField value_center']/td[@role='gridcell'])[1]")
    public static  WebElement latestcasenumber;
    
    @FindBy(xpath="//a[@title='History']")
    public static  WebElement AnduserClickHistoryIcon;
    
    public OrbitPortal_1(WebDriver driver, OrbitPortal_2 orbitPortal_2) {
		this.driver = driver;
		this.orbitPortal_2 =orbitPortal_2;
        PageFactory.initElements(driver, this);
	}
    
    public void CaseHistory(ArrayList<Integer> steps) throws InterruptedException {
    	for (Integer step : steps) {
			
	
//    	 if (step == 1&& execute) {
//             try {
//             	Thread.sleep(5000);
//             	caseHistorySC_27.CaseHistorySC_2();
//                 System.out.println("--------------PASSEDstep27_1--------------");               
//               } catch (Exception e) {
//                 System.out.println("--------------FAILEDstep27_1--------------");
//                 System.out.println(e);
//             	step27_1.setComments(e.getMessage());
//             	execute=false;
//               }
//       }
     if (step == 2&& execute) {
             try {
             	switchToDefaultContent(driver);
    
               } catch (Exception e) {
                 e.getMessage();
       }
     if (step == 3&& execute) {
             try {
             	switchToFrame(driver, "mainArea");
               } catch (Exception e) {
             	execute=false;
               }
            
       }
     if (step == 4&& execute) {
       try {
             	
             	Thread.sleep(4000);
                WebElement note = driver.findElement(By.id("frm:note"));
                if (note.isDisplayed() && note.getCssValue("visibility").equals("visible") && !note.getCssValue("display").equals("none")) {
              	  AndUserTypeTextintheTakeworkitemField.sendKeys("Test");
              	  AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
                    Thread.sleep(3000);
                    AndUserClicksontheTryAgain.click();
                }else {
					
				}
               } catch (Exception e) {
            		execute=false;

               }
       }
     if (step == 5&& execute) {
    		            try {
    		            	switchToDefaultContent(driver);
    		              } catch (Exception e) {
    		            	execute=false;
    		              }
    		      }
     if (step == 6&& execute) {
         try {
         	switchToFrame(driver, "mainArea");
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 7&& execute) {
         try {
        	 String text = latestcasenumber.getText();
           switchToFrame(driver, "wfBody");
           driver.findElement(By.xpath("//td[text()='"+text+"']//following::div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']")).click();
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 8&& execute) {
         try {
        	switchToDefaultContent(driver);
        	switchToFrame(driver, "mainAtrea");
        	switchToFrame(driver, "wfBody");
           } catch (Exception e) {
         	execute=false;
           }
   }
     
     if (step == 9&& execute) {
         try {
        	 Anduserclicksonreasondropdown.click();
        	 AnduserclicksonOtherfromthedropdown.click();
        	 AnduserclicksonSubmitbutton.click();
        	 sleep(5000);
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 10&& execute) {
         try {
         	switchToDefaultContent(driver);
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 11&& execute) {
         try {
         	switchToFrame(driver, "mainArea");
           } catch (Exception e) {
         	execute=false;
           }
   }
     
     if (step == 12&& execute) {
         try {
        	 AnduserclicksonReleasebutton.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 10&& execute) {
         try {
         	switchToDefaultContent(driver);
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 11&& execute) {
         try {
         	switchToFrame(driver, "mainArea");
         	 int count =0;
             int  maximum =20;
              boolean elementFound = false; 
    	while (!elementFound&&count<maximum) {
    	    try {
    	    	WebElement findElement =driver.findElement(By.xpath("(//span[text()='Search 4 existing claims'])[2]//following::span[text()='Case History QC'][3]//following::span[1]"));
    	    	if (findElement.isDisplayed()) {
                   String getText= findElement.getText();
                   driver.findElement(By.xpath("//span[text()='"+getText+"']//following::a[text()='Open Workitem']")).click();
    	    		 elementFound = true; 
    	    		 System.out.println("Element is here So Exit the loop:"+elementFound);
    			}
    	     
    	    } catch (NoSuchElementException e) {
    	    	System.out.println("Element is not here so looping the While ");
    	    	Thread.sleep(5000);
    	    	driver.findElement(By.xpath("(//input[@class='button refresh'])[last()]")).click();
    	      
    	        Thread.sleep(5000);
                count++;
    	    }
    	}
           } catch (Exception e) {
         	execute=false;
           }
   }
     if (step == 12&& execute) {
         try {
         Type(AndUserTypeTextintheTakeworkitemField, "qwerty");
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
     if (step == 13&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     

     if (step == 14&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
     if (step == 15&& execute) {
         try {
        	 sleep(5000);
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 16&& execute) {
         try {
        	 AndUserClicksontheTryAgain.click();
         } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 17&& execute) {
         try {
        	 AndUserclicksonBackbuttoninTakeWorkItemConfirmationPage.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     --------------------
     if (step == 18&& execute) {
         try {
        	 AndUserclicksonBackbuttoninAuditTrallPage.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 19&& execute) {
         try {
        	 Anduserclicksonmagnifyingglassicon.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 20&& execute) {
         try {
        	 Anduserclicksonchangeusername.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 21&& execute) {
         try {
        	sleep(5000);
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 22&& execute) {
         try {
        	 clearName.clear();;
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
     if (step == 23&& execute) {
         try {
        	 AnduserclicksonJumpDatabutton.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 24&& execute) {
         try {
        	 AndUserProvidereasonintheReasonFields.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 25&& execute) {
         try {
        	 AnduserclicksonJumpDatabutton.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 26&& execute) {
         try {
        	 Backbutton.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 27&& execute) {
         try {
        	 AnduserClickHistoryIcon.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 28&& execute) {
         try {
        	 michele_Openworkitem_29.Michele_Openworkitem_2();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 29&& execute) {
         try {
        	 switchToDefaultContent(driver);
        	 switchToFrame(driver, "mainArea");
        	 switchToFrame(driver, "wfBody");
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 30&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 31&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 32&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 33&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 34&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 35&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 36&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
     if (step == 37&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 38&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 39&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
     if (step == 40&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     if (step == 41&& execute) {
         try {
        	 AndUserClicksontheYesTakeItintheTakeWorkItemConfirmation.click();
           } catch (Exception e) {
         	execute=false;
           }
         
   }
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     }
     }
    	
    }

}

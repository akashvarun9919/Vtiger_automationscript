package automate_AllMainComponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate_SalesLeads {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("verifyVT001Salesleads TestCase Started");
	//	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser Launch Succesfully");
		driver.navigate().to("http://localhost:8888/");
		System.out.println("URL Hit Successfully");
		//UserName..
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
	    boolean username_Enable=username.isEnabled();
	     if(username_Enable==true) {
	    	System.out.println("Passed- username text box is enabled ");
	    }
	    else {
	    	System.out.println("Failed- username textbox is Disabled ");
	    }
	    username.sendKeys("admin");
	   String act_usernamepopulated=username.getAttribute("value");
	   String exp_usernamepopulated="admin";
	   if(act_usernamepopulated.equalsIgnoreCase(exp_usernamepopulated)) {
		   System.out.println("Passed- admin is populated in textbox actual-"+act_usernamepopulated+" Expected -"+exp_usernamepopulated);
	   }
	   else {
		   System.out.println("Failed- admin is not populated in textbox actual-"+act_usernamepopulated+"Expected -"+exp_usernamepopulated);
 
	   }
	   //UserPassword..
	   WebElement userpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
	    boolean password_Enable=userpassword.isEnabled();
	    if(password_Enable==true) {
	    	System.out.println("Passed- password textbox is Enabled");
	    }
	    else {
	    	System.out.println("Failed- password textbox is Disabled");
	    }
	    userpassword.sendKeys("admin");
	    String act_userpasswordpopulated=userpassword.getAttribute("value");
	    String exp_act_userpasswordpopulated="admin";
	    if(act_userpasswordpopulated.equalsIgnoreCase(exp_act_userpasswordpopulated)) {
	    	System.out.println("Passed- admin is populated in textbox correct. actual-"+act_userpasswordpopulated+" Expected -"+exp_act_userpasswordpopulated);
	    }
	    else {
	    	System.out.println("Failed- admin is not populated in textbox correct. actual-"+act_userpasswordpopulated+" Expected -"+exp_act_userpasswordpopulated);
        }
	    //ColorTheme..
	    WebElement colortheme= driver.findElement(By.xpath("//select[@name='login_theme']"));
	    Select colorthemeObj=new Select(colortheme);	
	    List<WebElement> colortheme_List=colorthemeObj.getOptions();
	    for(int i=0;i<=colortheme_List.size()-1;i++) {
	    	WebElement get_colortheme=colortheme_List.get(i);
	    	String getcolortext_List=get_colortheme.getText();
	    	System.out.println("Color theme List "+i+"-"+getcolortext_List);
	    }
	    
	    WebElement defaultColorTheme=colorthemeObj.getFirstSelectedOption();
	    String act_defaultColorTheme=defaultColorTheme.getAttribute("value");
	    String exp_defaultColorTheme="softed";
	    if(act_defaultColorTheme.equalsIgnoreCase(exp_defaultColorTheme)) {
	    	System.out.println("Passed- Default color theme selected correct. Actualcolortheme -"+act_defaultColorTheme+" Expectedcolortheme -"+exp_defaultColorTheme);
	    }
	    else {
	    	System.out.println("Failed- Default color theme not selected correct. Actualcolortheme -"+act_defaultColorTheme+" Expectedcolortheme -"+exp_defaultColorTheme);
	    }
	    colorthemeObj.selectByValue("woodspice");
	    WebElement changeColorTheme=colorthemeObj.getFirstSelectedOption();
	    String act_changeColorTheme=changeColorTheme.getAttribute("value");
	    String exp_changeColorTheme="woodspice";
	    if(act_changeColorTheme.equalsIgnoreCase(exp_changeColorTheme)) {
		    System.out.println("Passed- Change color theme selected correct. Actualcolortheme -"+act_changeColorTheme+" Expectedcolortheme -"+exp_changeColorTheme);
        }
	    else {
		    System.out.println("Failed- Change color theme not selected correct. Actualcolortheme -"+act_changeColorTheme+" Expectedcolortheme -"+exp_changeColorTheme);
	    }
	    //Language..
	    WebElement language=driver.findElement(By.xpath("//select[@name='login_language']"));
	    Select languageObj=new Select(language);
	    List<WebElement> langauage_List=languageObj.getOptions();
	    for(int i=0;i<=langauage_List.size()-1;i++) {
	    WebElement getall_Language=langauage_List.get(i);
	    String getLanguage_text=getall_Language.getText();
	    System.out.println("Language theme List "+i+"-"+getLanguage_text);
	    }
	    languageObj.selectByVisibleText("US English");
	    WebElement selectedLanguage=languageObj.getFirstSelectedOption();
	    String act_selectedLanguage=selectedLanguage.getText();
	    String exp_selectedLanguage="US English";
	    if(act_selectedLanguage.equalsIgnoreCase(exp_selectedLanguage)) {
	    	System.out.println("Passed- Selected laguage is correct. Actualselectlanguage -"+act_selectedLanguage+" Expectedselectlanguage -"+exp_selectedLanguage);
	    }
	    else {
	    	System.out.println("Failed- Selected laguage is not correct. Actualselectlanguage -"+act_selectedLanguage+" Expectedselectlanguage -"+exp_selectedLanguage);

	    }
	    //SignIn..
	    WebElement signinButton=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']"));
	    boolean button_Enable=signinButton.isEnabled();
	    if(button_Enable==true) {
	    	System.out.println("Passed- Signin Button is Enabled ");
	    }
	    else {
	    	System.out.println("Failed- Signin Button is Disabled ");
	    }
	    signinButton.click();
	    // HomePage..Lists
	    WebElement sales=driver.findElement(By.xpath("//a[text()='Sales']"));
	     Actions act_Obj= new Actions(driver);
	     act_Obj.moveToElement(sales).build().perform();
	     List<WebElement> allElement=driver.findElements(By.xpath("//table[@class='hdrTabBg']//a[contains(@href,'index.php')]"));
	     for(int i=0;i<=allElement.size()-1;i++) {
	    	WebElement list=allElement.get(i);
	    	String tablist=list.getText();
	    	System.out.println(tablist);
	    	 }
	    // Sales-SubLists
	    Thread.sleep(1000);
	      List<WebElement> sales_SubElement=driver.findElements(By.xpath("//div[@id='Sales_sub']//a"));
	      for(int i=0;i<=sales_SubElement.size()-1;i++) {
	    	 WebElement list_ofSales= sales_SubElement.get(i);
	    	 String list_ofsubSales=list_ofSales.getText();
	    	 System.out.println(list_ofsubSales);
	    	 
	      }
	      sales_SubElement.get(0).click();
       //   check all the checkbox and verify header checkbox should be checked. 
          List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='selected_id']"));
          int size_checkbox= checkbox.size();
          for(int i=0;i<=size_checkbox-1;i++) {
	    	WebElement allchecked_Checkbox= checkbox.get(i);
           	allchecked_Checkbox.click(); 	   
          }   	  
          WebElement hedercheckbox=driver.findElement(By.xpath("//input[@name='selectall']"));
 	     
 	     
          boolean hedercheckbox_Checked =hedercheckbox.isSelected();
	      if(hedercheckbox_Checked==true) {
	    	  System.out.println("Passed- Header checkbox is checked");
	      }
	      else {
	    	  System.out.println("Failed- Header checkbox is unchecked");
	      }
	
	    //   uncheck header checkbox and verify all the checkbox should be unchecked. 
	     hedercheckbox.click();
	     for(int i=0;i<size_checkbox;i++) {
	     boolean act_Uncheckbox=checkbox.get(i).isSelected();
	     boolean exp_Uncheckbox=false;
	     if( act_Uncheckbox==exp_Uncheckbox) {
	    	System.out.println("Passed- All Table checkbox is unchecked");
	     }else {
	    	System.out.println("Failed- All Table checkbox is checked");
	     }
	     }
	      //   check header checkbox and verify all the checkbox should be checked. 
	     hedercheckbox.click();
	     List <WebElement> checked_hedercheckbox=driver.findElements(By.xpath("//input[@name='selected_id']"));
	         for(int i=0;i<checked_hedercheckbox.size();i++) {
	        	boolean act_CheckedheaderCheckbox= checked_hedercheckbox.get(i).isSelected();
	        	boolean exp_CheckedheaderCheckbox=true;
	         
        	 if(act_CheckedheaderCheckbox==exp_CheckedheaderCheckbox) {
	    	  System.out.println("Passed- All table checkbox is automatically checked");
	      }
	      else {
	    	  System.out.println("Failed- All table checkbox is unchecked");
	      }
	         }
	}
}

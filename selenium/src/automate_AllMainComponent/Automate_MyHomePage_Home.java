package automate_AllMainComponent;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate_MyHomePage_Home {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost:8888/");
	    WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
	    boolean username_Enable=username.isEnabled();
	    
	    if(username_Enable==true) {
	    	System.out.println("Passed- username textboxis enabled ");
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
	    WebElement colortheme= driver.findElement(By.xpath("//select[@name='login_theme']"));
	    Select colorthemeObj=new Select(colortheme);	
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
	    WebElement language=driver.findElement(By.xpath("//select[@name='login_language']"));
	    Select languageObj=new Select(language);
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
	    WebElement signinButton=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']"));
	    boolean button_Enable=signinButton.isEnabled();
	    if(button_Enable==true) {
	    	System.out.println("Passed- Signin Button is Enabled ");
	    }
	    else {
	    	System.out.println("Failed- Signin Button is Disabled ");
	    }
	    signinButton.click();
	    Actions act_Obj=new Actions(driver);
	
	    List<WebElement> allElement=driver.findElements(By.xpath("//table[@class='hdrTabBg']//a[contains(@href,'index.php')]"));
	    
	    for(int i=1;i<=allElement.size()-1;i++) {
	    	WebElement list=allElement.get(i);
	    	String tabList=list.getText();
	    	System.out.println(tabList);
	    }
	    WebElement myHomePage=driver.findElement(By.xpath("//a[text()='My Home Page']"));
	    act_Obj.moveToElement(myHomePage).build().perform();
	    List<WebElement> MyHomePage_Element=driver.findElements(By.xpath("//div[@id='My Home Page_sub']//a"));
	    for(int i=0;i<=MyHomePage_Element.size()-1;i++) {
	    	WebElement list_MyHomePage_Element= MyHomePage_Element.get(i);
	    	String list_MyHomePageSub_Element=list_MyHomePage_Element.getText();
	    	System.out.println(list_MyHomePageSub_Element);
	    }
	    MyHomePage_Element.get(1).click();
	    
	    
	    
	    
	}

}

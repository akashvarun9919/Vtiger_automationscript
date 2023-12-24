package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeedsTestCase {

	public static void main(String[] args) {
		 //verify user is able to open login page and all component should be visible.
		 System.setProperty("webdriver.edge.driver", "driver1\\msedgedriver.exe");
		 EdgeDriver driver=new EdgeDriver();
		 driver.get("http://localhost:8888/");
		 //verify browser should be maxmize or not.
		 Window win_obj= driver.manage().window();
		 win_obj.minimize();
		 win_obj.fullscreen();
		 win_obj.maximize();
//		  Dimension dim_size=new Dimension(600,1000);
//			win_obj.setSize(dim_size);
//			dim_size= win_obj.getSize();
//			int x=dim_size.getHeight();
//			int y= dim_size.getWidth();
//			System.out.println(x);
//			System.out.println(y);
//			Point po_position_obj=new Point(10, 10);
//			win_obj.setPosition(po_position_obj);
//			po_position_obj=win_obj.getPosition();
//			int a=po_position_obj.getX();
//			int b=po_position_obj.getY();
//			System.out.println(a);
//			System.out.println(b);
		 
	
		 Dimension dim_size_obj=win_obj.getSize();
		 int act_browser_height= dim_size_obj.getHeight();
		 int act_browser_width=dim_size_obj.getWidth();
		 System.out.println(act_browser_height);
		 System.out.println(act_browser_width);
		 int exp_browser_height=696;
		 int exp_browser_width=1296;
		 if(act_browser_height==exp_browser_height) {
			 System.out.println("Passed- Window height is correct.when window Actual height is "+act_browser_height+" Expected height is "+exp_browser_height);
		 }
		 else {
			 System.out.println("Failed- Window height is incorrect.when window Actual height is "+act_browser_height+" Expected height is "+exp_browser_height);
         }
		 if(act_browser_width==exp_browser_width) {
			 System.out.println("Passed- Window width is correct.when window Actual width is "+act_browser_width+" Expected width is "+exp_browser_width);
		 }
		 else {
			 System.out.println("Passed- Window width is incorrect.when window Actual width is "+act_browser_width+" Expected width is "+exp_browser_width);
		 }
  //    win_obj.setSize(dim_size_obj);
		 Point po_position_obj=win_obj.getPosition();
		 int act_window_horizontalPosition=po_position_obj.getX();
		 int act_window_verticalPosition=po_position_obj.getY();
		 System.out.println(act_window_horizontalPosition);
		 System.out.println(act_window_verticalPosition);
		 int exp_window_horizontalPosition=-8;
		 int exp_window_verticalPosition=-8;
		 if(act_window_horizontalPosition==exp_window_horizontalPosition) {
			 System.out.println("Passed- Window Horizontally position is correct.when Actual horizontal position is "+act_window_horizontalPosition+"Expected horizontal position is"+exp_window_horizontalPosition);
		 }
		 else {
			 System.out.println("Failed- Window Horizontally position is incorrect.when Actual horizontal position is "+act_window_horizontalPosition+"Expected horizontal position is"+exp_window_horizontalPosition);
		 }
		 if(act_window_verticalPosition==exp_window_verticalPosition) {
			 System.out.println("Passed- Window Vertically position is correct.when Actual Vertically position is "+act_window_verticalPosition+"Expected Vertically position is"+exp_window_verticalPosition);
		 }
		 else {
			 System.out.println("Failed- Window Vertically position is incorrect.when Actual Vertically position is "+act_window_verticalPosition+"Expected Vertically position is"+exp_window_verticalPosition); 
		 }
//	     win_obj.setPosition(po_position_obj);
		 //verify username should be visible and enable in login page.
		 WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		 boolean exp_usernameDisplay=true;
		 boolean act_usernameDisplay=username.isDisplayed();
		 if(act_usernameDisplay==exp_usernameDisplay) {
			 System.out.println("Passed- username is visible in login page");
		 }
		 else {
			 System.out.println("Failed- username is invisible in login page");
		 }
		 boolean exp_usernameEnable=true;
		 boolean act_usernameEnable=username.isEnabled();
		 if(act_usernameEnable==exp_usernameEnable) {
			 System.out.println("Passed- username is enabled");
		 }
		 else {
			 System.out.println("Failed- username is disabled");
		 }
		 //verify default username textbox value should be populated blank in username textbox.
		 username.sendKeys("");
		 String exp_usernameDefaultValue=username.getAttribute("value");
		 String act_usernameDefaultValuealue="";
		 if(act_usernameDefaultValuealue.equals(exp_usernameDefaultValue)) {
			 System.out.println("Passed- Default username textbox value is populated blank");
		 }
		 else {
			 System.out.println("Failed- Default username textbox value is not populated blank");
		 }
		 //verify username value should be populated or dispaly in username textbox "admin".
		 username.clear();
		 username.sendKeys("admin");
		 String act_usernamevalue=username.getAttribute("value");
		 String exp_usernamevalue="admin";
		 if(act_usernamevalue.equals(exp_usernamevalue)) {
			 System.out.println("Passed- username textbox value is populated and correct .when Actual name is "+act_usernamevalue+" Expected name is "+exp_usernamevalue);
		 }
		 else {
			 System.out.println("Failed- username textbox value is populated and incorrect .when Actual name is "+act_usernamevalue+" Expected name is "+exp_usernamevalue);
		 }
		 //verify userpassword textbox should be visible and enable.
		 WebElement userpassword=driver.findElement(By.xpath("//input[@type='password']"));
		 boolean exp_userpasswordDisplay=true;
		  boolean act_userpasswordDisplay=userpassword.isDisplayed();
		 if(act_userpasswordDisplay==exp_userpasswordDisplay) {
			 System.out.println("Passed- userpassword is visible");
		 }
		 else {
			 System.out.println("Failed- userpassword is invisible");
		 }
		 boolean exp_userpasswordEnable=true;
		 boolean act_userpasswordEnable=userpassword.isEnabled();
		 if(act_userpasswordEnable==exp_userpasswordEnable) {
			 System.out.println("Passed- userpassword is enabled");
		 }
		 else {
			 System.out.println("Failed- userpassword is disabled");
		 }
		 //verify default userpassword textbox value should be blank.
		 userpassword.sendKeys("");
		 String exp_userpassDefaultValue=userpassword.getAttribute("value");
		 String act_userpassDEfaultValue="";
		 if(act_userpassDEfaultValue.equals(exp_userpassDefaultValue)) {
			 System.out.println("Passed- Default userpassword textbox value is populated blank");
		 }
		 else {
			 System.out.println("Failed- Default userpassword textbox value is not populated blank");
		 }
		 //verify userpassword textbox value should be masked in userpassword textbox "****".
		 userpassword.clear();
		 userpassword.sendKeys("admin");
		 String exp_userpassvalue=userpassword.getAttribute("value");
		 String act_userpassvalue="admin";
		 if(act_userpassvalue.equals(exp_userpassvalue)) {
			 System.out.println("Passed- userpassword textbox value is masked and correct");
		 }
		 else {
			 System.out.println("Failed- userpassword textbox value is not masked and incorrect");
		 }
		 //verify color theme dropdown box should be visibile and enable in login page.
		WebElement logintheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		boolean exp_loginthemeDisplay=true;
		boolean act_loginthemeDisplay=logintheme.isDisplayed();
		if(act_loginthemeDisplay==exp_loginthemeDisplay) {
			System.out.println("Passed- login theme is visible");
		}
		else {
			System.out.println("Failed- login theme is invisible");
		}
		boolean exp_loginthemeEnable=true;
		boolean act_loginthemeEnable=logintheme.isEnabled();
		if(act_loginthemeEnable==exp_loginthemeEnable) {
			System.out.println("Passed- login theme is enabled");
		}
		else {
			System.out.println("Failed- login theme is disabled");
		}
		//verify Default color theme dropdown box value should be populated "softed".
		Select select_colortheme=new Select(logintheme);
		WebElement select_defaulttheme=select_colortheme.getFirstSelectedOption();
        String act_select_defaulttheme=select_defaulttheme.getText();
        String exp_select_defaulttheme="softed";
        if(act_select_defaulttheme.equals(exp_select_defaulttheme)) {
        	System.out.println("Passed- Default color theme dropdown box value populated correct");
        }
        else {
        	System.out.println("Failed- Default color theme dropdown box value populated incorrect");
        }
		//verify selected color theme dropdown value should be populated "alphagrey".
        select_colortheme.selectByVisibleText("alphagrey");
        WebElement selected_colortheme=select_colortheme.getFirstSelectedOption();
        String act_logthemeValue=selected_colortheme.getText();
		String exp_logthemeValue="alphagrey";
		if(act_logthemeValue.equals(exp_logthemeValue)) {
			System.out.println("Passed- login theme value is populated correct. when Actual color theme is "+act_logthemeValue+"Expected color theme is"+exp_logthemeValue);
		}
		else {
			System.out.println("Failed- login theme value is populated incorrect. when Actual color theme is "+act_logthemeValue+"Expected color theme is"+exp_logthemeValue);
		}
		//verify language dropdown box should be visible and enable in login page.
		WebElement language=driver.findElement(By.xpath("//select[@name='login_language']"));
		boolean exp_languageDisplay=true;
		boolean act_languageDisplay=language.isDisplayed();
		if(act_languageDisplay==exp_languageDisplay) {
			System.out.println("Passed- Language is visible");
		}
		else {
			System.out.println("Failed- Language is invisible");
		}
		boolean exp_languageEnable=true;
		boolean act_languageEnable=language.isEnabled();
		if(act_languageEnable==exp_languageEnable) {
			System.out.println("Passed- Language is enabled");
		}
		else {
		System.out.println("Failed- Language is disabled");
		}
		//verify Default selected language dropdown value should be paopulated "US English"
		Select language_obj=new Select(language);
		WebElement select_language=language_obj.getFirstSelectedOption();
		String act_select_language=select_language.getText();
		String exp_select_language="US English";
		if(act_select_language.equalsIgnoreCase(exp_select_language)) {
			System.out.println("Passed- Default selected language dropdown value is paopulated correct. when Actual language is "+act_select_language+" Expected language is "+exp_select_language);
		}
		else {
			System.out.println("Failed- Default selected language dropdown value is paopulated incorrect. when Actual language is "+act_select_language+" Expected language is "+exp_select_language);
		}
		//verify selected language dropdown value should be paopulated "US English"
		language_obj.selectByVisibleText("US English");
		WebElement select_USLanguage=language_obj.getFirstSelectedOption();
		String act_langauageValue=select_USLanguage.getText();
		String exp_langauageValue="US English";
		if(act_langauageValue.equals(exp_langauageValue)) {
			System.out.println("Passed- Selected Language value is populated correct.when Actual language is "+act_langauageValue+" Expected language is "+exp_langauageValue);
		}
		else {
			System.out.println("Failed- Selected Language value is populated correct.when Actual language is "+act_langauageValue+" Expected language is "+exp_langauageValue);
		}
		//verify sign in button is visible and enable in login page
		WebElement loginbutton=driver.findElement(By.xpath("//input[@name='Login']"));
		boolean exp_loginbuttonDisplay=true;
		boolean act_loginbuttonDisplay=loginbutton.isDisplayed();
		if(act_loginbuttonDisplay==exp_loginbuttonDisplay) {
			System.out.println("Passed- login button is visible in login page");
		}
		else {
			System.out.println("failed- login button is invisible login page");
		}
		boolean exp_loginbuttonEnable=true;
		boolean act_loginbuttonEnable=loginbutton.isEnabled();
		if(act_loginbuttonEnable==exp_loginbuttonEnable) {
			System.out.println("Passed- login button is enabled in login page");
		}
		else {
			System.out.println("Failed- login button is disabled in login page");
		}
		//verify login button should be correct size and location.
		Dimension dim_signin=loginbutton.getSize();
		int act_hight_signin=dim_signin.getHeight();
		int act_width_signin=dim_signin.getWidth();
		System.out.println(act_hight_signin);
		System.out.println(act_width_signin);
		int exp_hight_signin=40;
		int exp_width_signin=138;
		if(act_hight_signin==exp_hight_signin) {
			System.out.println("Passed- Hight of signin button is correct. when Actual hight is "+act_hight_signin+" Expexted hight is "+exp_hight_signin);
		}
		else {
			System.out.println("Failed- Hight of signin button is incorrect. when Actual hight is "+act_hight_signin+" Expexted hight is "+exp_hight_signin);
		}
		if(act_width_signin==exp_width_signin) {
			System.out.println("Passed- Width of signin button is correct. when Actual width is "+act_width_signin+" Expexted width is "+exp_width_signin);
		}
		else {
			System.out.println("Failed- Width of signin button is incorrect. when Actual width is "+act_width_signin+" Expexted width is "+exp_width_signin);
		}
		Point button_location=loginbutton.getLocation();
		int act_buttonLocationHorizontal=button_location.getX();
		int act_buttonLocationVertical=button_location.getY();
		System.out.println(act_buttonLocationHorizontal);
		System.out.println(act_buttonLocationVertical);
		int exp_buttonLocationHorizontal=735;
		int exp_buttonLocationVertical=348;
		if(act_buttonLocationHorizontal==exp_buttonLocationHorizontal) {
			System.out.println("Passed- Location of signin button is correct horizontally. when Actual horizontal location is "+act_buttonLocationHorizontal+" Expected Horizontal location is "+exp_buttonLocationHorizontal);
		}
		else {
			System.out.println("Failed- Location of signin button is incorrect horizontally. when Actual horizontal location is "+act_buttonLocationHorizontal+" Expected Horizontal location is "+exp_buttonLocationHorizontal);
		}
		if(act_buttonLocationVertical==exp_buttonLocationVertical) {
			System.out.println("Passed- Location of signin button is correct vertically. when Actual Vertical location is "+act_buttonLocationVertical+" Expected Vertical location is "+exp_buttonLocationVertical);
		}
		else {
			System.out.println("Failed- Location of signin button is incorrect vertically. when Actual Vertical location is "+act_buttonLocationVertical+" Expected Vertical location is "+exp_buttonLocationVertical);
		}
		loginbutton.click();
		//verify Home page should be open and home page title should be >admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM.
		String exp_hometitle="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String act_hometitle=driver.getTitle();
		if (act_hometitle.equals(exp_hometitle)) {
			System.out.println("Passed- Home page title is correct.when Actual Title is "+act_hometitle+" Expected Title is "+exp_hometitle);
		}
		else {
			System.out.println("Failed- Home page title is incorrect.when Actual Title is "+act_hometitle+" Expected Title is "+exp_hometitle);
		}
		//verify on home page marketing link should be visible and enable.
		WebElement marketinglink=driver.findElement(By.xpath("//a[text()='Marketing']"));
		boolean exp_marketinglinkEnable=true;
		boolean act_marketinglinkEnable=marketinglink.isEnabled();
		if(act_marketinglinkEnable==exp_marketinglinkEnable) {
			System.out.println("Passed- marketing link enabled in Home page");
		}
		else {
			System.out.println("Failed- marketing link disabled in Home page");
			
		}
		marketinglink.click();
		//verify on marketing page leads link should be visible and enable.
		WebElement leadslink=driver.findElement(By.xpath("(//a[text()='Leads'])[1]"));
		boolean exp_leadlinkEnable=true;
		boolean act_leadlinkEnable=leadslink.isEnabled();
		if(act_leadlinkEnable==exp_leadlinkEnable) {
			System.out.println("Passed- lead link is enabled in marketing page");
		}
		else {
			System.out.println("Failed- lead link is disabled in marketing page");
		}
		leadslink.click();
		//verify on Marketing<lead page in search box heading text should be "Search".
		String act_searchValue=driver.findElement(By.xpath("//span[text()='Search']")).getText();
		String exp_serachValue="Search";
		if(act_searchValue.equals(exp_serachValue)) {
			System.out.println("Passed- Search heading text is correct ");
		}
		else {
			System.out.println("Failed- Search heading text is incorrect ");
		}
		//verify on Marketing<lead page in search box button text should be "Search now".
		WebElement serchnowButton=driver.findElement(By.xpath("//input[@value=' Search Now ']"));
		String act_serchbuttonValue=serchnowButton.getAttribute("value");
		String exp_serchbuttonValue=" Search Now ";
		if(act_serchbuttonValue.equals(exp_serchbuttonValue)) {
			System.out.println("Passed- Search button text is correct ");
		}
		else {
			System.out.println("Failed- Search button text is incorrect ");
		}
		//verify on lead page Search now button should be correct size and location.
		Dimension dim_searchnow=serchnowButton.getSize();
		int act_searchnow_Hight=dim_searchnow.getHeight();
		int act_searchnow_Width=dim_searchnow.getWidth();
		System.out.println(act_searchnow_Hight);
		System.out.println(act_searchnow_Width);
		int exp_searchnow_Hight=19;
		int exp_searchnow_Width=85;
		if(act_searchnow_Hight==exp_searchnow_Hight) {
			System.out.println("Passed- Search now button Hight is correct.when Actual Hight is "+act_searchnow_Hight+" Expected Hight is "+exp_searchnow_Hight);
		}
		else {
			System.out.println("Failed- Search now button Hight is incorrect.when Actual Hight is "+act_searchnow_Hight+" Expected Hight is "+exp_searchnow_Hight);
		}
		if(act_searchnow_Width==exp_searchnow_Width) {
			System.out.println("Passed- Search now button width is correct.when Actual Width is "+act_searchnow_Width+" Expected Width is "+exp_searchnow_Width);
		}
		else {
			System.out.println("Failed- Search now button width is incorrect.when Actual Width is "+act_searchnow_Width+" Expected Width is "+exp_searchnow_Width);
		}
		Point po_searchbutton=serchnowButton.getLocation();
		int act_po_searchbuttonHorizontal=po_searchbutton.getX();
		int act_po_searchbuttonVertical=po_searchbutton.getY();
		System.out.println(act_po_searchbuttonHorizontal);
		System.out.println(act_po_searchbuttonVertical);
		int exp_po_searchbuttonHorizontal=678;
		int exp_po_searchbuttonVertical=149;
		if(act_po_searchbuttonHorizontal==exp_po_searchbuttonHorizontal) {
			System.out.println("Passed- Search now button is Horizontally correct.when Actual Horizontally result is "+act_po_searchbuttonHorizontal+" Expected Horizontally result is "+exp_po_searchbuttonHorizontal);
		}
		else {
			System.out.println("failed- Search now button is Horizontally incorrect.when Actual Horizontally result is "+act_po_searchbuttonHorizontal+" Expected Horizontally result is "+exp_po_searchbuttonHorizontal);
		}
		if(act_po_searchbuttonVertical==exp_po_searchbuttonVertical) {
			System.out.println("Passed- Search now button is Vertically correct.when Actual Vertically result is "+act_po_searchbuttonVertical+" Expected Vertically result is "+exp_po_searchbuttonVertical);
		}
		else {
			System.out.println("failed- Search now button is Vertically incorrect.when Actual Vertically result is "+act_po_searchbuttonVertical+" Expected Vertically result is "+exp_po_searchbuttonVertical);
		}
		//verify on Marketing<leads page "plus" icon should be visible and enable.
		WebElement plusicon= driver.findElement(By.xpath("//img[@title='Create Lead...']"));
		boolean exp_plusiconDispaly=true;
		boolean act_plusiconDispaly=plusicon.isDisplayed();
		if(act_plusiconDispaly==exp_plusiconDispaly) {
			System.out.println("Passed- Plus icon is visible");
		}
		else {
			System.out.println("Failed- Plus icon is invisible");
		}
		boolean exp_plusiconEnable=true;
		boolean act_plusiconEnable=plusicon.isEnabled();
		if(act_plusiconEnable==exp_plusiconEnable) {
			System.out.println("Passed- Plus icon is enabled");
		}
		else {
			System.out.println("Failed- Plus icon is disabled");
		}
		//verify plus icon should be correct size and location.
		Dimension dim_plusicon=plusicon.getSize();
		int act_plusicon_Height=dim_plusicon.getHeight();
		int act_plusicon_Width=dim_plusicon.getWidth();
		System.out.println(act_plusicon_Height);
		System.out.println(act_plusicon_Width);
		int exp_plusicon_Height=24;
		int exp_plusicon_Width=24;
		if(act_plusicon_Height==exp_plusicon_Height) {
			System.out.println("Passed- Plus icon Height is correct.when Actual height is "+act_plusicon_Height+" Expeacted height is "+exp_plusicon_Height);
		}
		else {
			System.out.println("Failed- Plus icon Height is incorrect.when Actual height is "+act_plusicon_Height+" Expeacted height is "+exp_plusicon_Height);
		}
		if(act_plusicon_Width==exp_plusicon_Width) {
			System.out.println("Passed- Plus icon width is correct.when Actual width is "+act_plusicon_Width+" Expeacted width is "+exp_plusicon_Width);
		}
		else {
		System.out.println("Failed- Plus icon width is incorrect.when Actual width is "+act_plusicon_Width+" Expeacted width is "+exp_plusicon_Width);
		}
		Point po_plusicon=plusicon.getLocation();
		int act_po_plusiconHorizontal=po_plusicon.getX();
		int act_po_plusiconVertical=po_plusicon.getY();
		System.out.println(act_po_plusiconHorizontal);
		System.out.println(act_po_plusiconVertical);
		int exp_po_plusiconHorizontal=228;
		int exp_po_plusiconVertical=92;
		if(act_po_plusiconHorizontal==exp_po_plusiconHorizontal) {
			System.out.println("Passed- Plus icon Location Horizontally is correct.when Actual Horizontally is "+act_po_plusiconHorizontal+" Expeacted Horizontally is "+exp_po_plusiconHorizontal);
		}
		else {
			System.out.println("Failed- Plus icon Location Horizontally is incorrect.when Actual Horizontally is "+act_po_plusiconHorizontal+" Expeacted Horizontally is "+exp_po_plusiconHorizontal);
		}
		if(act_po_plusiconVertical==exp_po_plusiconVertical) {
			System.out.println("Passed- Plus icon Location Vertically is correct.when Actual Vertically is "+act_po_plusiconVertical+" Expeacted Vertically is "+exp_po_plusiconVertical);
		}
		else {
			System.out.println("Failed- Plus icon Location Vertically is incorrect.when Actual Vertically is "+act_po_plusiconVertical+" Expeacted Vertically is "+exp_po_plusiconVertical);

		}
		plusicon.click();
		//verify on Marketing<leads page Creating New Lead heading text is "Creating New Lead".
		WebElement  CreatingNewLead=driver.findElement(By.xpath("//span[text()='Creating New Lead']"));
		String act_CreatingNewLeadHeader=CreatingNewLead.getText();
		String exp_CreatingNewLeadHeader="Creating New Lead";
		if(act_CreatingNewLeadHeader.equals(exp_CreatingNewLeadHeader)) {
			System.out.println("Passed- Creating New Lead heading text is correct");
		}
		else {
			System.out.println("Failed- Passed- Creating New Lead heading text is correct");
		}
		//verify on Marketing<leads page Basic information heading text should be "Basic Information".
		String act_basicinfoHeading=driver.findElement(By.xpath("//b[text()='Basic Information']")).getText();
		String exp_basicinfoHeading="Basic Information";
		if(act_basicinfoHeading.equals(exp_basicinfoHeading)) {
			System.out.println("Passed- Basic information text is correct ");
		}
		else {
			System.out.println("Failed- Basic information text is incorrect ");
		}
		//verify 1st Save button should be visible and enabled.
		WebElement save1stbutton=driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		boolean exp_1stsavebuttonEnable=true;
		boolean act_1stsavebuttonEnable=save1stbutton.isEnabled();
		if(act_1stsavebuttonEnable==exp_1stsavebuttonEnable) {
			System.out.println("Passed- 1st Save Button is enabled");
		}
		else {
			System.out.println("Failed- 1st Save Button is disabled");
		}
		//verify 1st Save button text name should be "Save".
		String exp_1stsavebuttonName="  Save  ";
		String act_1stsavebuttonName=save1stbutton.getAttribute("value");
		if(act_1stsavebuttonName.equals(exp_1stsavebuttonName)) {
			System.out.println("Passed- 1st Save Button text is correct");
		}
		else {
			System.out.println("Failed- 1st Save Button text is not incorrect");
		}
		//verify 1st Save button should be correct size and location.
		Dimension dim_1stsave=save1stbutton.getSize();
		int act_1stsavebuttonHeight=dim_1stsave.getHeight();
		int act_1stsavebuttonWidth=dim_1stsave.getWidth();
		System.out.println(act_1stsavebuttonHeight);
		System.out.println(act_1stsavebuttonWidth);
		int exp_1stsavebuttonHeight=19;
		int exp_1stsavebuttonWidth=70;
		if(act_1stsavebuttonHeight==exp_1stsavebuttonHeight) {
			System.out.println("Passed- 1st Save button height is correct.when Actual height is "+act_1stsavebuttonHeight+" Expect height is "+exp_1stsavebuttonHeight);
		}
		else {
			System.out.println("Failed- 1st Save button height is incorrect.when Actual height is "+act_1stsavebuttonHeight+" Expect height is "+exp_1stsavebuttonHeight);
		}
		if(act_1stsavebuttonWidth==exp_1stsavebuttonWidth) {
			System.out.println("Passed- 1st Save button Width is correct.when Actual Width is "+act_1stsavebuttonWidth+" Expect Width is "+exp_1stsavebuttonWidth);
		}
		else {
			System.out.println("Failed- 1st Save button Width is incorrect.when Actual Width is "+act_1stsavebuttonWidth+" Expect Width is "+exp_1stsavebuttonWidth);
		}
		Point po_1stsave=save1stbutton.getLocation();
		int act_1stsavebuttonHorizontal=po_1stsave.getX();
		int act_1stsavebuttonVertical=po_1stsave.getY();
		System.out.println(act_1stsavebuttonHorizontal);
		System.out.println(act_1stsavebuttonVertical);
		int exp_1stsavebuttonHorizontal=532;
		int exp_1stsavebuttonVertical=224;
		if(act_1stsavebuttonHorizontal==exp_1stsavebuttonHorizontal) {
			System.out.println("Passed- 1st Save button Horizontally Location is correct.when Actual Horizontally Location is "+act_1stsavebuttonHorizontal+"Expect Horizontally Location is "+exp_1stsavebuttonHorizontal);
		}
		else {
			System.out.println("Failed- 1st Save button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_1stsavebuttonHorizontal+"Expect Horizontally Location is "+exp_1stsavebuttonHorizontal);
		}
		if(act_1stsavebuttonVertical==exp_1stsavebuttonVertical) {
			System.out.println("Passed- 1st Save button Vertically Location is correct.when Actual Vertically Location is "+act_1stsavebuttonVertical+"Expect Vertically Location is "+exp_1stsavebuttonVertical);
		}
		else {
			System.out.println("Failed- 1st Save button Vertically Location is incorrect.when Actual Vertically Location is "+act_1stsavebuttonVertical+"Expect Vertically Location is "+exp_1stsavebuttonVertical);
		}
		//verify 1st Cancel button should be visible and enable.
		WebElement cancel_1stbutton=driver.findElement(By.xpath("//input[@title='Cancel [Alt+X]']"));
		boolean exp_1stcancelbuttonEnable=true;
		boolean act_1stcancelbuttonEnable=cancel_1stbutton.isEnabled();
		if(act_1stcancelbuttonEnable==exp_1stcancelbuttonEnable) {
			System.out.println("Passed- 1st Cancel button is enabled");
		}
		else {
			System.out.println("Failed- 1st Cancel button is disabled");
		}
		//verify 1st cancel button text name should be "Cancel".
		String exp_1stcancelbuttonName="  Cancel  ";
		String act_1stcancelbuttonName=cancel_1stbutton.getAttribute("value");
		if(act_1stcancelbuttonName.equals(exp_1stcancelbuttonName)) {
			System.out.println("Passed- 1st Cancel button text name is correct");
		}
		else {
			System.out.println("Failed- 1st Cancel button text name is incorrect");
		}
		//verify 1st Cancel button should be correct size and location.
		Dimension dim_1stcancelbutton=cancel_1stbutton.getSize();
		int act_1stcancelbuttonHeight=dim_1stcancelbutton.getHeight();
		int act_1stcancelbuttonWidth=dim_1stcancelbutton.getWidth();
		System.out.println(act_1stcancelbuttonHeight);
		System.out.println(act_1stcancelbuttonWidth);
		int exp_1stcancelbuttonHeight=19;
		int exp_1stcancelbuttonWidth=70;
		if(act_1stcancelbuttonHeight==exp_1stcancelbuttonHeight) {
			System.out.println("Passed- 1st cancel button Height is correct.when Actual Height is "+act_1stcancelbuttonHeight+" Expect Height is "+exp_1stcancelbuttonHeight);
		}
		else {
			System.out.println("Failed- 1st cancel button Height is incorrect.when Actual Height is "+act_1stcancelbuttonHeight+" Expect Height is "+exp_1stcancelbuttonHeight);
		}
		if(exp_1stcancelbuttonWidth==exp_1stcancelbuttonWidth) {
			System.out.println("Passed- 1st cancel button Width is correct.when Actual Width is "+act_1stcancelbuttonWidth+" Expect Width is "+exp_1stcancelbuttonHeight);
		}
		else {
			System.out.println("Failed- 1st cancel button Width is incorrect.when Actual Width is "+act_1stcancelbuttonWidth+" Expect Width is "+exp_1stcancelbuttonHeight);
		}
		Point po_1stcancelButton=save1stbutton.getLocation();
		int act_1stcancelbuttonHorizontal=po_1stcancelButton.getX();
		int act_1stcancelbuttonVertical=po_1stcancelButton.getY();
		System.out.println(act_1stcancelbuttonHorizontal);
		System.out.println(act_1stsavebuttonVertical);
		int exp_1stcancelbuttonHorizontal=532;
		int exp_1stcancelbuttonVertical=224;
		if(act_1stcancelbuttonHorizontal==exp_1stcancelbuttonHorizontal) {
			System.out.println("Passed- 1st cancel button Horizontally Location is correct.when Actual Horizontally Location is "+act_1stcancelbuttonHorizontal+" Expect Horizontally Location is "+exp_1stcancelbuttonHorizontal);
		}
		else {
			System.out.println("Failed- 1st cancel button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_1stcancelbuttonHorizontal+" Expect Horizontally Location is "+exp_1stcancelbuttonHorizontal);
		}
		if(act_1stcancelbuttonVertical==exp_1stcancelbuttonVertical) {
			System.out.println("Passed- 1st cancel button Vertically Location is correct.when Actual Vertically Location is "+act_1stcancelbuttonVertical+" Expect Vertically Location is "+exp_1stcancelbuttonVertical);
		}
		else {
			System.out.println("Failed- 1st cancel button Vertically Location is incorrect.when Actual Vertically Location is "+act_1stcancelbuttonVertical+" Expect Vertically Location is "+exp_1stcancelbuttonVertical);
		}
		//verify in Basic information > Leads information heading text should be "Lead Information".
		String act_leadinfo=driver.findElement(By.xpath("//b[text()='Lead Information']")).getText();
		String exp_leadinfo="Lead Information";
		if(act_leadinfo.equals(exp_leadinfo)) {
			System.out.println("Passed- Lead information text is correct");
		}
		else {
			System.out.println("Failed- Lead information text is incorrect");
		}
		//verify salutiontype dropdown box should be visible and enable in lead information.
		WebElement salutiontype=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		
		boolean exp_salutiontypeDisplay=true;
		boolean act_salutiontypeDisplay=salutiontype.isDisplayed();
		if(act_salutiontypeDisplay==exp_salutiontypeDisplay) {
			System.out.println("Passed- salutiontype is visible and enabled in Basic information");
		}
		else {
			System.out.println("Failed- salutiontype is invisible and disabled in Basic information");
		}
		//verify Default salutiontype dropdown box value should be populated "--None--".
		Select select_salutiontype=new Select(salutiontype);
	    WebElement selectdefaultValue=select_salutiontype.getFirstSelectedOption();
	    String act_defaultsalutiontype=selectdefaultValue.getText();
	    System.out.println(act_defaultsalutiontype);
        String exp_defaultsalutiontype="--None--";
        if(act_defaultsalutiontype.equalsIgnoreCase(exp_defaultsalutiontype)) {
        	System.out.println("Passed- Default salutiontype dropdown box value is populated correct");
        }
        else {
        	System.out.println("Failed- Default salutiontype dropdown box value is populated incorrect");
        }
       // verify salutiontype dropdown box value should be populated "Mr.".
        select_salutiontype.selectByVisibleText("Mr.");
        WebElement selectsendValue=select_salutiontype.getFirstSelectedOption();
        String act_sendsalutiontype=selectsendValue.getText();
        String exp_sendsalutiontype="Mr.";
        if(act_sendsalutiontype.equalsIgnoreCase(exp_sendsalutiontype)) {
        	System.out.println("Passed- Selected salutiontype dropdown box value is populated correct.when Actual salution type is "+act_sendsalutiontype+" Expected salution type is "+exp_sendsalutiontype);
        }
        else {
        	System.out.println("Failed- Selected salutiontype dropdown box value is populated incorrect.when Actual salution type is "+act_sendsalutiontype+" Expected salution type is "+exp_sendsalutiontype);
        }
		//verify Firstname should be visible and enable.
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean exp_firstnameEnable=true;
		boolean act_firstnameEnable=firstname.isEnabled();
		if(act_firstnameEnable==exp_firstnameEnable) {
			System.out.println("Passed- firstname is enabled in Basic information");
		}
		else {
			System.out.println("Failed- firstname is disabled in Basic information");
		}
		//verify default firstname value should be blank.
		String act_defaultfirstnameValue=firstname.getAttribute("value");
		String exp_defaultfirstnameValue="";
		if(act_defaultfirstnameValue.equals(exp_defaultfirstnameValue)) {
			System.out.println("Passed- default firstname value is blank.");
		}
		else {
			System.out.println("Failed- default firstname value is not blank.");
		}
		//verify firstname value should be populated in firstname textbox "Ajeet".
		firstname.clear();
		firstname.sendKeys("Ajeet");
		String act_firstnameValue=firstname.getAttribute("value");
		String exp_firstnameValue="Ajeet";
		if(act_firstnameValue.equals(exp_firstnameValue)) {
			System.out.println("Passed- Firstname value is populated correct");
		}
		else {
			System.out.println("Failed- Firstname value is populated incorrect");
		}
		//verify lastname textbox should be enabled in lead information
	    WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			boolean exp_lastnameEnable=true;
	        boolean act_lastnameEnable=lastname.isEnabled();
			if(act_lastnameEnable==exp_lastnameEnable) {
				System.out.println("Passed- last name is enabled");
			}
			else {
				System.out.println("Failed- ast name is disabled");
			}
			//verify lastname value should be populated in lastname textbox "Kumar".
			lastname.clear();
			lastname.sendKeys("Kumar");
			String act_lastnameValue=lastname.getAttribute("value");
			String exp_lastnameValue="Kumar";
			if(act_lastnameValue.equals(exp_lastnameValue)) {
				System.out.println("Passed- lastname is populated correct");
			}
			else {
				System.out.println("Failed- lastname is not populated incorrect");
			}
	       //verify company textbox should be enaled in Lead information
			WebElement companydetail=driver.findElement(By.xpath("//input[@name='company']"));
	        boolean exp_companydetailEnable=true;
			boolean act_company_detailEnable=companydetail.isEnabled();
	        if(act_company_detailEnable==exp_companydetailEnable) {
	        	System.out.println("Passed- Company is enabled");
	        }
	        else {
	        	System.out.println("Failed- Company is disabled");
	        }
	        companydetail.clear();
	        companydetail.sendKeys("Tcs");
	        //verify company value should be populated in textbox "Tcs".
	        String act_companyValue=companydetail.getAttribute("value");
	        String exp_companyValue="Tcs";
	        if(act_companyValue.equals(exp_companyValue)) {
	        	System.out.println("Passed- comapny value is populated correct");
	        }
	        else {
	        	System.out.println("Failed- comapny value is not populated incorrect");
	        }
	        //verify title textbox should be enabled in lead information.
	        WebElement titledetail=driver.findElement(By.xpath("//input[@id='designation']"));
	        boolean exp_titleEnable=true;
	        boolean act_titleEnable=titledetail.isEnabled();
	        if(act_titleEnable==exp_titleEnable) {
	        	System.out.println("Passed- Title is enabled");
	        }
	        else {
	        	System.out.println("Failed- Title is disabled");
	        }
	        titledetail.clear();
	        titledetail.sendKeys("Administrative");
	        //verify Title value should be populated in textbox "Administrative".
	        String exp_titleValue =titledetail.getAttribute("value");
	        String act_titleValue ="Administrative";
	        if(act_titleValue.equals(exp_titleValue)) {
	            System.out.println("Passed- title value is populated correct");
	        }
	        else {
	        	System.out.println("Failed- title value is not populated incorrect");
	        }
	        //verify leadsource dropdown box should be visible and enabled in lead information
	        WebElement leadsource=driver.findElement(By.xpath("//select[@name='leadsource']"));
	        boolean exp_leadsourceDisplay=true;
	        boolean act_leadsourceDisplay=leadsource.isDisplayed();
	        if (act_leadsourceDisplay==exp_leadsourceDisplay) {
	        	System.out.println("Passed- leadsource is visible");
	        }
	        else {
	        	System.out.println("Failed- leadsource is invisible");
	        }
	        // verify Default leadsource dropdown box value should be selected "--None--".
	        Select select_leadsource = new Select(leadsource);
	        WebElement select_defaultvalueLeadsource=select_leadsource.getFirstSelectedOption();
	        String act_select_defaultvalueLeadsource=select_defaultvalueLeadsource.getText();
	        String exp_select_defaultvalueLeadsource="--None--";
	        if(act_select_defaultvalueLeadsource.equalsIgnoreCase(exp_select_defaultvalueLeadsource)) {
	        	System.out.println("Passed- Default Leadsource value is populated correct.when Actual Default lead source is "+act_select_defaultvalueLeadsource+" Expected Default lead source is "+exp_select_defaultvalueLeadsource);
	        }
	        else {
        	System.out.println("Failed- Default Leadsource value is populated incorrect.when Actual Default lead source is "+act_select_defaultvalueLeadsource+" Expected Default lead source is "+exp_select_defaultvalueLeadsource);
	        }
        	//verify leadsource dropdown box value should be selected "Other".
	        select_leadsource.selectByVisibleText("Other");
	        WebElement select_valueLeadsource=select_leadsource.getFirstSelectedOption();
	        String act_selectsource=select_valueLeadsource.getText();
	        String exp_selectsource="Other";
	        if(act_selectsource.equalsIgnoreCase(exp_selectsource)) {
	        	System.out.println("Passed- Lead source value is populated correct. when Actual lead source is "+act_selectsource+" Expected lead source is"+exp_selectsource);
	        }
	        else {
	        	System.out.println("Failed- Lead source value is populated incorrect. when Actual lead source is "+act_selectsource+" Expected lead source is"+exp_selectsource);
	        }
	        //verify leadstatus dropdown box should be visible and enable in lead information.
	        WebElement leadstatus=driver.findElement(By.xpath("//select[@name='leadstatus']"));
	        boolean exp_leadstatusDispaly=true;
	        boolean act_leadstatusDispaly=leadstatus.isDisplayed();
	        if(act_leadstatusDispaly==exp_leadstatusDispaly) {
	        	System.out.println("Passed- leadstatus is visible");
	        }
	        else {
	        	System.out.println("Failed- leadstatus is invisible");
	        }
	        boolean act_leadstatusEnable= leadstatus.isEnabled();
	        boolean exp_leadstatusEnable=true;
	        if(act_leadstatusEnable==exp_leadstatusEnable) {
	        	System.out.println("Passed- leadstatus is enabled");
	        }else {
	        System.out.println("Failed- leadstatus is disabled");
	        }
	        //verify  Default leadstatus dropdown box value should be selected "--None--".
	        Select leadstatus_obj=new Select(leadstatus);
	        WebElement select_defaultleadstatus =leadstatus_obj.getFirstSelectedOption();
	        String act_select_defaultleadstatus=select_defaultleadstatus.getText();
	        String exp_select_defaultleadstatus="--None--";
	        if(act_select_defaultleadstatus.equalsIgnoreCase(exp_select_defaultleadstatus)) {
	        	System.out.println("Passed- Default leadstatus dropdown box value is populated correct.when Actual default lead status is "+act_select_defaultleadstatus+" Expected default lead status is "+exp_select_defaultleadstatus);
	        }
	        else {
	        	System.out.println("Failed- Default leadstatus dropdown box value is populated incorrect.when Actual default lead status is "+act_select_defaultleadstatus+" Expected default lead status is "+exp_select_defaultleadstatus);
	        }
	        //verify  leadstatus dropdown value should be selected "Lost Lead".
	        leadstatus_obj.selectByVisibleText("Lost Lead");
	        WebElement select_leadstatus=leadstatus_obj.getFirstSelectedOption();
	        String act_selectstatus=select_leadstatus.getText();
	        String exp_selectstatus="Lost Lead";
	        if(act_selectstatus.equalsIgnoreCase(exp_selectstatus)) {
	        	System.out.println("Passed- leadstatus dropdown value should be populated correct.when Actual select lead status is "+act_selectstatus+" Expected lead status is "+exp_selectstatus);
	        }
	        else {
	        	System.out.println("Failed- leadstatus dropdown value should be populated incorrect.when Actual select lead status is "+act_selectstatus+" Expected lead status is "+exp_selectstatus);
	        }
	        //verify Lead No textbox should be visible and disabled in lead information.
	        WebElement leadnum=driver.findElement(By.xpath("//input[@id='lead_no']"));
	        boolean act_leadnumEnable=leadnum.isEnabled();
	        System.out.println(act_leadnumEnable);
	        boolean exp_leadnumEnable=true;
	        if(act_leadnumEnable==exp_leadnumEnable) {
	        	System.out.println("Passed- Lead num textbox is disabled");
	        }
	        else {
	        	System.out.println("Failed- Lead num textbox is enabled");
	        }
	        //verify Default Lead num value should be populated "AUTO GEN ON SAVE".
	        String exp_leadnumValue=leadnum.getAttribute("value");
	        String act_leadnumValue="AUTO GEN ON SAVE";
	        if(act_leadnumValue.equals(exp_leadnumValue)) {
	        	System.out.println("Passed- Lead num value is populated correct");
	        }
	        else {
	        	System.out.println("Failed- Lead num value is not populated incorrect");
	        }
	        //verify Phone num textbox should be enabled in lead information.
	        WebElement phone= driver.findElement(By.xpath("//input[@id='phone']"));
	        boolean exp_phonedetailEnable=true;
	        boolean act_phonedetailEnable= phone.isEnabled();
	        if(act_phonedetailEnable==exp_phonedetailEnable) {
	        	System.out.println("Passed- Phone textbox is enabled");
	        }
	        else {
	        	System.out.println("Failed- Phone textbox is disabled");
	        }
	        phone.clear();
	        phone.sendKeys("none");
	        //verify phone num value should be populated "none". 
	        String exp_phonenumValue=phone.getAttribute("value");
	        String act_phonenumValue="none";
	        if(act_phonenumValue.equals(exp_phonenumValue)) {
	        	System.out.println("Passed- Phone num is populated correct");
	        }
	        else {
	        	System.out.println("Failed- Phone num is populated incorrect");
	        }
	       //verify Mobile num textbox should be enabled in lead information.
	        WebElement mobile= driver.findElement(By.xpath("//input[@id='mobile']"));
	        boolean exp_mobiledetailEnable=true;
	        boolean act_mobiledetailEnable=mobile.isEnabled();
	       if(act_mobiledetailEnable==exp_mobiledetailEnable) {
	    	   System.out.println("Passed- Mobile textbox num is enabled");
	       }
	       else {
	    	   System.out.println("Failed- Mobile textbox num is disabled");
	       }
	       mobile.clear();
	       mobile.sendKeys("9865432191");
	       //verify Mobile num value should be populated "9865432191".
	       String exp_mobiledetailValue=mobile.getAttribute("value");
	       String act_mobiledetailValue="9865432191";
	       if(act_mobiledetailValue.equals(exp_mobiledetailValue)) {
	    	   System.out.println("Passed- Mobile num value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- Mobile num value is populated incorrect");
	       }
	       //verify Fax num textbox should be enabled.
	       WebElement fax=driver.findElement(By.xpath("//input[@id='fax']"));
	       boolean exp_faxdetailEnable=true;
	       boolean act_faxdetailEnable=fax.isEnabled();
	       if(act_faxdetailEnable==exp_faxdetailEnable) {
	    	   System.out.println("Passed- Fax num textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- Fax num textbox is disabled");
	       }
	       fax.clear();
	       fax.sendKeys("none");
	       //verify Fax num value should be populated "none".
	       String exp_faxdetailValue=fax.getAttribute("value");
	       String act_faxdetailValue="none";
	       if(act_faxdetailValue.equals(exp_faxdetailValue)) {
	    	   System.out.println("Passed- Fax num value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- Fax num value is not populated incorrect");
	       }
	       //verify Email id textbox should be enabled.
	       WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	       boolean exp_emaildetailEnable=true;
	       boolean act_emaildetailEnable=email.isEnabled();
	       if(act_emaildetailEnable==exp_emaildetailEnable) {
	    	   System.out.println("Passed- Email id textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- Email id textbox is disabled");
	       }
	       email.clear();
	       email.sendKeys("ajeetkuamr12@gamil.com");
	       //verify Email id value should be paopulated "ajeetkuamr12@gmail.com".
	       String exp_emaildetailValue= email.getAttribute("value");
	       String act_emaildetailValue="ajeetkuamr12@gamil.com";
	       if (act_emaildetailValue.equals(exp_emaildetailValue)) {
	    	   System.out.println("Passed- email id value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- email id value is populated incorrect");
	       }
	       //verify user radio button should be visible and enabled in lead information
	       WebElement user=driver.findElement(By.xpath("//input[@value='U']"));
	       boolean exp_userdetailDisplay=true;
	       boolean act_userdetailDisplay= user.isDisplayed();
	       if(act_userdetailDisplay==exp_userdetailDisplay) {
	    	   System.out.println("Passed- User radio button is visible");
	       }
	       else {
	    	   System.out.println("Failed- User radio button is invisible");
	       }
	       boolean exp_userdetailEnable=true;
	       boolean act_userdetailEnable=user.isEnabled();
	       if(act_userdetailEnable==exp_userdetailEnable) {
	    	   System.out.println("Passed- User radio button is enabled");
	       }
	       else {
	    	   System.out.println("Failed- User radio button is disabled");
	       }
	       //verify user radio button should be selectd by Default "User".
	       boolean exp_userdetailSelect=true;
	       boolean act_userdetailSelect=user.isSelected();
	       System.out.println(act_userdetailSelect);
	      
	       if(act_userdetailSelect==exp_userdetailSelect) {
	    	   System.out.println("passed- User radio button is selected by Default ");
	       }
	       else
	    	   System.out.println("Failed- User radio button is deselected by Default ");
	      //verify if user radio button selected then assigned_user_id dropdown box should be visible and enabled.
	       WebElement userid=driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
	       boolean exp_useridDisplay=true;
	       boolean act_useridDisplay=userid.isDisplayed();
	       if(act_useridDisplay==exp_useridDisplay) {
	    	   System.out.println("Passed- assigned_user_id 'admin' is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- assigned_user_id 'admin' is not populated incorrect");
	       }
	        //verify group radio button should be visible and enabled in lead information.
	       WebElement group=driver.findElement(By.xpath("//input[@value='T']"));
	       boolean exp_groupdetailDisplay=true;
	       boolean act_groupdetailDisplay= group.isDisplayed();
	       if(act_groupdetailDisplay==exp_groupdetailDisplay) {
	    	   System.out.println("Passed- Group radio button is visible");
	       }
	       else {
	    	   System.out.println("Failed- Group radio button is invisible");
	       }
	       boolean exp_groupdetailEnable=true;
	       boolean act_groupdetailEnable=group.isEnabled();
	       if(act_groupdetailEnable==exp_groupdetailEnable) {
	    	   System.out.println("Passed- Group radio button is enabled");
	       }
	       else {
	    	   System.out.println("failed- Group radio button is disabled");
	       }
	       //verify Group radio button should be selected "group".
	       group.click();
	       boolean exp_groupdetailSelect=true;
	       boolean act_groupdetailSelect=group.isSelected();
	       if(act_groupdetailSelect==exp_groupdetailSelect) {
	    	   System.out.println("passed- Group radio button is selected ");
	       }
	       else
	       {
	    	   System.out.println("Failed- Group radio button is deselected");
	       }
	       //verify if group radio button selected then assigned_group_id dropdown box should be visible and enable
	       WebElement groupid=driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
	       boolean exp_groupidDisplay=true;
	       boolean act_groupidDisplay=group.isDisplayed();
	       if(act_groupidDisplay==exp_groupidDisplay) {
	    	   System.out.println("Passed- assigned_group_id is visible");
	       }
	       else {
	    	   System.out.println("Failed- assigned_group_id is invisible");
	       }
	       //verify Default selected group dropdown box value should be selected "Marketing Group".
	       Select group_obj=new Select(groupid);
		   WebElement select_defaultgroup=group_obj.getFirstSelectedOption();
		   String act_degfaultselect_group=select_defaultgroup.getText();
		   String exp_defaultselect_group="Marketing Group";
		   if (act_degfaultselect_group.equals(exp_defaultselect_group)) {
		    	 System.out.println("Passed- Default Select group value is populated.when Actual value is "+act_degfaultselect_group+" Expected value is "+exp_defaultselect_group);
		   }
		   else {
		    	 System.out.println("Failed- Default Select group value is not populated.when Actual value is "+act_degfaultselect_group+" Expected value is "+exp_defaultselect_group);
		   }
	      //verify selected group dropdown box value should be selected "Support Group".
	      group_obj.selectByVisibleText("Support Group");
	      WebElement select_group=group_obj.getFirstSelectedOption();
	      String act_select_group=select_group.getText();
	      String exp_select_group="Support Group";
	       if (act_select_group.equals(exp_select_group)) {
	    	   System.out.println("Passed- Selected group value is populated.when Actual value is "+act_select_group+" Expected value is "+exp_select_group);
	       }
	       else {
	    	   System.out.println("Failed- Selected group value is not populated.when Actual value is "+act_select_group+" Expected value is "+exp_select_group);
	       }
	       // if user radio button should be deselected.
	       exp_userdetailSelect =false;
	       act_userdetailSelect=user.isSelected();
	       System.out.println(act_userdetailSelect);
	       if(act_userdetailSelect==exp_userdetailSelect) {
	    	   System.out.println("Passed- User radio button is deselected ");
	       }
	       else {
	    	   System.out.println("Failed- User radio button is selected ");
	       }
	       //verify Address information text heading should be visible in Basic information.
	       String act_addressHeading=driver.findElement(By.xpath("//b[text()='Address Information']")).getText();
	       String exp_addressHeading="Address Information";
	       if(act_addressHeading.equals(exp_addressHeading)) {
	    	   System.out.println("Passed- Address information text is correct");
	       }
	       else {
	    	   System.out.println("Failed- Address information text is incorrect");
	       }
	       //verify street textarea should be enabled.
	       WebElement street=driver.findElement(By.xpath("//textarea[@name=\"lane\"]"));
	       boolean exp_streetdetailEnable=true;
	       boolean act_streetdetailEnable= street.isEnabled();
	       if(act_streetdetailEnable==exp_streetdetailEnable) {
	    	   System.out.println("Passed- Street text area is enabled");
	       }
	       else {
	    	   System.out.println("Failed- Street text area is disabled");
	       }
	       street.clear();
	       street.sendKeys("Ajeet Kumar, House No-449,Street-Naibasti Road Muglsarai");
	       //verify street value should be populated "Ajeet Kumar, House No-449,Street-Naibasti Road Muglsarai"
	       String exp_streetValue=street.getAttribute("value");
	       String act_streetValue="Ajeet Kumar, House No-449,Street-Naibasti Road Muglsarai";
	       if(act_streetValue.equals(exp_streetValue)) {
	    	   System.out.println("Passed- Street text area is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- Street text area is populated incorrect");
	       }
	       //verify postal code textbox should be enable.
	       WebElement postalcode=driver.findElement(By.xpath("//input[@id='code']"));
	       boolean exp_postalcodeEnable=true;
	       boolean act_postalcodeEnable=postalcode.isEnabled();
	       if(act_postalcodeEnable==exp_postalcodeEnable) {
	    	   System.out.println("Passed- Postal code textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- Postal code textbox is disabled");
	       }
	       postalcode.clear();
	       postalcode.sendKeys("none");
	       //verify postal code textbox value should be populated.
	       String exp_postalcodeValue=postalcode.getAttribute("value");
	       String act_postalcodeValue="none";
	       if(act_postalcodeValue.equals(exp_postalcodeValue)) {
	    	   System.out.println("Passed- Postal code textbox value is populated corrret");
	       }
	       else {
	    	   System.out.println("Failed- Postal code textbox value is populated incorrect");
	       }
	       //verify countary textbox should be enabled.
	       WebElement countary=driver.findElement(By.xpath("//input[@id='country']"));
	       boolean exp_countarydetailEnable=true;
	       boolean act_countarydetailEnable=countary.isEnabled();
	       if(act_countarydetailEnable==exp_countarydetailEnable) {
	    	   System.out.println("Passed- Countary is textbox enabled");
	       }
	       else {
	    	   System.out.println("Failed- Countary textbox is disabled");
	       }
	       countary.clear();
	       countary.sendKeys("India");
	       //verify countary textbox value should be populated "India".
	       String exp_countaryValue=countary.getAttribute("value");
	       String act_countaryValue="India";
	       if(act_countaryValue.equals(exp_countaryValue)) {
	    	   System.out.println("Passed- countary textbox value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- countary textbox value is populated correct");
	       }
	       //verify PO box textbox should be enabled.
	       WebElement pobox=driver.findElement(By.xpath("//input[@id='pobox']"));
	       boolean exp_poboxEnable=true;
	       boolean act_poboxEnable=pobox.isEnabled();
	       if(act_poboxEnable==exp_poboxEnable) {
	    	   System.out.println("Passed- PO Box textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- PO Box textbox is disabled");
	       }
	       pobox.clear();
	       pobox.sendKeys("Mugalsarai");
	       //verify PO box textbox value should be populated "Mugalsarai".
	       String exp_poboxValue= pobox.getAttribute("value");
	       String act_poboxValue="Mugalsarai";
	       if(act_poboxValue.equals(exp_poboxValue)) {
	    	   System.out.println("Passed- PO box textbox value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- PO box textbox value is populated incorrect");
	       }
	       //verify city textbox should be enabled.
	       WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
	       boolean exp_citydetailEnable=true;
	       boolean act_citydetailEnable=city.isEnabled();
	       if(act_citydetailEnable==exp_citydetailEnable) {
	    	   System.out.println("Passed- city textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- city textbox is disabled");
	       }
	       city.clear();
	       city.sendKeys("Mugalsarai");
	       //verify city textbox value should be populated "Mugalsarai".
	       String exp_cityValue=city.getAttribute("value");
	       String act_cityValue="Mugalsarai";
	       if(act_cityValue.equals(exp_cityValue)) {
	    	   System.out.println("Passed- city textbox value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- city textbox value is populated incorrect");
	       }
	       //verify state textbox should be enabled.
	       WebElement state= driver.findElement(By.xpath("//input[@id='state']"));
	       boolean exp_statedetailEnable=true;
	       boolean act_statedetailEnable= state.isEnabled();
	       if(act_statedetailEnable==exp_statedetailEnable) {
	    	   System.out.println("Passed- State textbox is enabled");
	       }
	       else {
	    	   System.out.println("Failed- State textbox is disabled");
	       }
	       state.clear();
	       state.sendKeys("Utarpradesh");
	       //verify state textbox value should be populated 
	       String exp_stateValue=state.getAttribute("value");
	       String act_stateValue="Utarpradesh";
	       if(act_stateValue.equals(exp_stateValue)) {
	    	   System.out.println("Passed- state textbox value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- state textbox value is populated incorrect");
	       }
	       //verify in Basic information Description Information heading should be visible "Description Information".
	       String act_discriptioninfo=driver.findElement(By.xpath("//b[text()='Description Information']")).getText();
	       String exp_discriptioninfo="Description Information";
	       if(act_discriptioninfo.equals(exp_discriptioninfo)) {
	    	   System.out.println("Passed- Description Information text is correct");
	       }
	       else {
	    	   System.out.println("Failed- Description Information text is incorrect");
	       }
	       //verify Description Information value should be populated.
	       WebElement discription=driver.findElement(By.xpath("//textarea[@name='description']"));
	       discription.sendKeys("I hereby declaire all the information given is true and correct to the best of my knowledge");
	       String exp_discriptionvalue="I hereby declaire all the information given is true and correct to the best of my knowledge";
	       String act_discriptionvalue=discription.getAttribute("value");
	       if(act_discriptionvalue.equals(exp_discriptionvalue)) {
	    	   System.out.println("Passed- Description Information value is populated correct");
	       }
	       else {
	    	   System.out.println("Failed- Description Information value populated incorrect");
	       }
	   	   //verify 2nd Save button should be enabled.
			WebElement save_2ndbutton=driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
			boolean exp_2ndsavebuttonEnable=true;
			boolean act_2ndsavebuttonEnable=save_2ndbutton.isEnabled();
			if(act_2ndsavebuttonEnable==exp_2ndsavebuttonEnable) {
				System.out.println("Passed- Save Button is enabled");
			}
			else {
				System.out.println("Failed- Save Button is disabled");
			}
			//verify 2nd Save button text name should be "Save".
			String exp_2ndsavebuttonName="  Save  ";
			String act_2ndsavebuttonName=save_2ndbutton.getAttribute("value");
			if(act_2ndsavebuttonName.equals(exp_2ndsavebuttonName)) {
				System.out.println("Passed- 2nd Save Button text is correct");
			}
			else {
				System.out.println("Failed- 2nd Save Button text is incorrect");
			}
			//verify 2nd Save button should be correct size and location.
		    Dimension dim_2ndsavebutton=save_2ndbutton.getSize();
		      int act_2ndsavebutton_hight=dim_2ndsavebutton.getHeight();
		      int act_2ndsavebutton_width=dim_2ndsavebutton.getWidth();
		      System.out.println(act_2ndsavebutton_hight);
		      System.out.println(act_2ndsavebutton_width);
		      int exp_2ndsavebutton_hight=19;
		      int exp_2ndsavebutton_width=70;
		      if(act_2ndsavebutton_hight==exp_2ndsavebutton_hight) {
		    	  System.out.println("Passed- 2nd Save button Hight is correct.when Actual height is "+act_2ndsavebutton_hight+" Expected height is"+exp_2ndsavebutton_hight);
		      }
		      else {
		    	  System.out.println("Failed- 2nd Save button Hight is incorrect.when Actual height is "+act_2ndsavebutton_hight+" Expected height is"+exp_2ndsavebutton_hight);
		      }
		      if(act_2ndsavebutton_width==exp_2ndsavebutton_width) {
		    	  System.out.println("Passed- 2nd Save button Width is correct.when Actual Width is "+act_2ndsavebutton_width+" Expected Width is"+exp_2ndsavebutton_width);
		      }
		      else {
		    	  System.out.println("Failed- 2nd Save button Width is incorrect.when Actual Width is "+act_2ndsavebutton_width+" Expected Width is"+exp_2ndsavebutton_width);
		      }
		      Point po_2ndbutton=save_2ndbutton.getLocation();
		      int act_2ndbutton_Horizontal=po_2ndbutton.getX();
		      int act_2ndbutton_Vertical=po_2ndbutton.getY();
		      System.out.println(act_2ndbutton_Horizontal);
		      System.out.println(act_2ndbutton_Vertical);
		      int exp_2ndbutton_Horizontal=532;
		      int exp_2ndbutton_Vertical=762;
		      if(act_2ndbutton_Horizontal==exp_2ndbutton_Horizontal) {
					System.out.println("Passed- 2nd Save button Horizontally Location is correct.when Actual Horizontally Location is "+act_2ndbutton_Horizontal+" Expect Horizontally Location is "+exp_2ndbutton_Horizontal);
		      }
		      else {
					System.out.println("Failed- 2nd Save button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_2ndbutton_Horizontal+" Expect Horizontally Location is "+exp_2ndbutton_Horizontal);
		      }
		      if(act_2ndbutton_Vertical==exp_2ndbutton_Vertical) {
					System.out.println("Passed- 2nd Save button Vertically Location is correct.when Actual Vertically Location is "+act_2ndbutton_Vertical+" Expect Vertically Location is "+exp_2ndbutton_Vertical);
		      }
		      else {
					System.out.println("Failed- 2nd Save button Vertically Location is incorrect.when Actual Vertically Location is "+act_2ndbutton_Vertical+" Expect Vertically Location is "+exp_2ndbutton_Vertical);
		      }
	       //verify 2nd Cancel button should be visible & enable.
			WebElement cancel_2ndButton=driver.findElement(By.xpath("(//input[@title='Cancel [Alt+X]'])[2]"));
			boolean exp_2ndcancelButtonEnable=true;
			boolean act_2ndcancelButtonEnable=cancel_2ndButton.isEnabled();
			if(act_2ndcancelButtonEnable==exp_2ndcancelButtonEnable) {
				System.out.println("Passed- 2nd Cancel button is enabled");
			}
			else {
				System.out.println("Failed- 2nd Cancel button is disabled");
			}
			//verify 2nd cancel button text name should be "Cancel".
			String exp_2ndcancelbuttonName="  Cancel  ";
			String act_2ndcancelbuttonName=cancel_2ndButton.getAttribute("value");
			if(act_2ndcancelbuttonName.equals(exp_2ndcancelbuttonName)) {
				System.out.println("Passed- 2nd Cancel button text name is correct");
			}
			else {
				System.out.println("Failed- 2nd Cancel button text name is incorrect");
			}
			//verify 2nd Cancel button should be correct size and location.
			   Dimension dim_2ndcancelbutton=cancel_2ndButton.getSize();
			      int act_2ndcancelbutton_hight=dim_2ndcancelbutton.getHeight();
			      int act_2ndcancelbutton_width=dim_2ndcancelbutton.getWidth();
			      System.out.println(act_2ndcancelbutton_hight);
			      System.out.println(act_2ndcancelbutton_width);
			      int exp_2ndcancelbutton_hight=19;
			      int exp_2ndcancelbutton_width=70;
			      if(act_2ndcancelbutton_hight==exp_2ndcancelbutton_hight) {
			    	  System.out.println("Passed- 2nd cancel button Hight is correct. when Actual hight is "+exp_2ndcancelbutton_hight+" Expected hight is "+exp_2ndcancelbutton_hight);
			      }
			      else {
			    	  System.out.println("Failed- 2nd cancel button Hight is incorrect. when Actual hight is "+exp_2ndcancelbutton_hight+" Expected hight is "+exp_2ndcancelbutton_hight);
			      }
			      if(act_2ndsavebutton_width==exp_2ndsavebutton_width) {
			    	  System.out.println("Passed- 2nd cancel button Width is correct. when Actual Width is "+act_2ndsavebutton_width+" Expected Width is "+exp_2ndsavebutton_width);
			      }
			      else {
			    	  System.out.println("Failed- 2nd cancel button Width is correct. when Actual Width is "+act_2ndsavebutton_width+" Expected Width is "+exp_2ndsavebutton_width);
			      }
			      Point po_2ndcancelbutton=cancel_2ndButton.getLocation();
			      int act_2ndcancelbutton_Horizontal=po_2ndcancelbutton.getX();
			      int act_2ndcancelbutton_Vertical=po_2ndbutton.getY();
			      System.out.println(act_2ndcancelbutton_Horizontal);
			      System.out.println(act_2ndcancelbutton_Vertical);
			      int exp_2ndcancelbutton_Horizontal=605;
			      int exp_2ndcancelbutton_Vertical=762;
			      if(act_2ndcancelbutton_Horizontal==exp_2ndcancelbutton_Horizontal) {
						System.out.println("Passed- 2nd cancel button Horizontally Location is correct.when Actual Horizontally Location is "+act_2ndcancelbutton_Horizontal+" Expect Horizontally Location is "+exp_2ndcancelbutton_Horizontal);
			      }
			      else {
						System.out.println("Failed- 2nd cancel button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_2ndcancelbutton_Horizontal+" Expect Horizontally Location is "+exp_2ndcancelbutton_Horizontal);
			      }
			      if(act_2ndcancelbutton_Vertical==exp_2ndcancelbutton_Vertical) {
						System.out.println("Passed- 2nd cancel button Vertically Location is correct.when Actual Vertically Location is "+act_2ndcancelbutton_Vertical+" Expect Vertically Location is "+exp_2ndcancelbutton_Vertical);
			      }
			      else {
						System.out.println("Failed- 2nd cancel button Vertically Location is incorrect.when Actual Vertically Location is "+act_2ndcancelbutton_Vertical+" Expect Vertically Location is "+exp_2ndcancelbutton_Vertical);
			      }
	        //verify on Marketing> Lead page More inforamtion heading text should be visible and enable.
			WebElement more_info=driver.findElement(By.xpath("//b[text()='More Information ']"));
	        boolean exp_moreinfoDisplay=true;
	        boolean act_moreinfoDisplay=more_info.isDisplayed();
	        if(act_moreinfoDisplay==exp_moreinfoDisplay) {
	        	System.out.println("Passed- More information text is visible");
	        }
	        else {
	        	System.out.println("Failed- More information text is invisible");
	        }
	        boolean exp_moreEnable=true;
	        boolean act_moreEnabl=more_info.isEnabled();
	        if(act_moreEnabl==exp_moreEnable) {
	        	System.out.println("Passed- More information text is enable");
	        }
	        else {
	           System.out.println("Failed- More information text is disabled");
	        }
	        //verify on Marketing> Lead page More inforamtion heading text should be "More Information".
	        String exp_moreinfoHeading="More Information";
	        String act_moreinfoHeading=more_info.getText();
	        if(act_moreinfoHeading.equals(exp_moreinfoHeading)) {
	        	System.out.println("Passed- More information text is correct");
	        }
	        else {
	        	System.out.println("Failed- More information text is incorrect");
	        }
	        more_info.click();
	       //verify 3rd Save button should be enabled.
			WebElement save_3rdbutton=driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[3]"));
			boolean exp_3rdsavebuttonEnable=true;
			boolean act_3rdsavebuttonEnable=save_3rdbutton.isEnabled();
			if(act_3rdsavebuttonEnable==exp_3rdsavebuttonEnable) {
				System.out.println("Passed- 3rd Save Button is enabled");
			}
			else {
				System.out.println("Failed- 3rd Save Button is disabled");
			}
			//verify 3rd Save button text name should be "Save".
			String exp_3rdsavebuttonName="  Save  ";
			String act_3rdsavebuttonName=save_3rdbutton.getAttribute("value");
			if(act_3rdsavebuttonName.equals(exp_3rdsavebuttonName)) {
				System.out.println("Passed- 3rd Save Button text is correct");
			}
			else {
				System.out.println("Failed- 3rd Save Button text is not incorrect");
			}
			//verify 3rd save button should be correct size and location.
			Dimension dim_save_buttonSize=save_3rdbutton.getSize();
			int act_save_buttonHeight= dim_save_buttonSize.getHeight();
			int act_save_buttonWidth=dim_save_buttonSize.getWidth();
			System.out.println(act_save_buttonHeight);
			System.out.println(act_save_buttonWidth);
			int exp_save_buttonHeight=19;
			int exp_save_buttonWidth=70;
			if(act_save_buttonHeight==exp_save_buttonHeight) {
				System.out.println("Passed- 3rd save button height is correct.When Actual height is "+act_save_buttonHeight+" Expected height is "+exp_save_buttonHeight);
			}
			else {
				System.out.println("Failed- 3rd save button height is incorrect.When Actual height is "+act_save_buttonHeight+" Expected height is "+exp_save_buttonHeight);
			}
			if(act_save_buttonWidth==exp_save_buttonWidth) {
				System.out.println("Passed- 3rd save button Width is correct.When Actual Width is "+act_save_buttonWidth+" Expected Width is "+exp_save_buttonWidth);
			}
			else {
				System.out.println("Failed- 3rd save button Width is incorrect.When Actual Width is "+act_save_buttonWidth+" Expected Width is "+exp_save_buttonWidth);
			}
			Point po_save_buttonSize=save_3rdbutton.getLocation();
			int act_savebuttonHorizontal=po_save_buttonSize.getX();
			int act_savebuttonVertical=po_save_buttonSize.getY();
			System.out.println(act_savebuttonHorizontal);
			System.out.println(act_savebuttonVertical);
			int exp_savebuttonHorizontal=541;
			int exp_savebuttonVertical=224;
			if(act_savebuttonHorizontal==exp_savebuttonHorizontal) {
				System.out.println("Passed- 3rd save button location Horizontally is correct.When Actual location is "+act_savebuttonHorizontal+" Expected location is "+exp_savebuttonHorizontal);
			}
			else {
				System.out.println("Failed- 3rd save button location Horizontally is incorrect.When Actual location is "+act_savebuttonHorizontal+" Expected location is "+exp_savebuttonHorizontal);
			}
			if(act_savebuttonVertical==exp_savebuttonVertical) {
				System.out.println("Passed- 3rd save button location Vertically is correct.When Actual location is "+act_savebuttonVertical+" Expected location is "+exp_savebuttonVertical);
			}
			else {
				System.out.println("Failed- 3rd save button location Vertically is incorrect.When Actual location is "+act_savebuttonVertical+" Expected location is "+exp_savebuttonVertical);
			}
	       //verify 3rd Cancel button should be enable.
			WebElement cancel_3rdButton=driver.findElement(By.xpath("(//input[@title='Cancel [Alt+X]'])[3]"));
			boolean exp_3rdcancelButtonEnable=true;
			boolean act_3rdcancelButtonEnable=cancel_3rdButton.isEnabled();
			if(act_3rdcancelButtonEnable==exp_3rdcancelButtonEnable) {
				System.out.println("Passed- 3rd Cancel button is enabled");
			}
			else {
				System.out.println("Failed- 3rd Cancel button is disabled");
			}
			//verify 3rd cancel button text name should be "Cancel".
			String exp_3rdcancelbuttonName="  Cancel  ";
			String act_3rdcancelbuttonName=cancel_3rdButton.getAttribute("value");
			if(act_3rdcancelbuttonName.equals(exp_3rdcancelbuttonName)) {
				System.out.println("Passed- 3rd Cancel button text name is correct");
			}
			else {
				System.out.println("Failed- 3rd Cancel button text name is incorrect");
			}
			//verify 3rd cancel button should be correct size and location.
			Dimension dim_cancel_buttonSize=cancel_3rdButton.getSize();
			int act_cancel_buttonHeight= dim_cancel_buttonSize.getHeight();
			int act_cancel_buttonWidth=dim_cancel_buttonSize.getWidth();
			System.out.println(act_cancel_buttonHeight);
			System.out.println(act_cancel_buttonWidth);
			int exp_cancel_buttonHeight=19;
			int exp_cancel_buttonWidth=70;
			if(act_cancel_buttonHeight==exp_cancel_buttonHeight) {
				System.out.println("Passed- 3rd cancel button height is correct.When Actual height is "+act_cancel_buttonHeight+" Expected height is "+exp_cancel_buttonHeight);
			}
			else {
				System.out.println("Failed- 3rd cancel button height is incorrect.When Actual height is "+act_cancel_buttonHeight+" Expected height is "+exp_cancel_buttonHeight);
			}
			if(act_cancel_buttonWidth==exp_cancel_buttonWidth) {
				System.out.println("Passed- 3rd cancel button Width is correct.When Actual Width is "+act_cancel_buttonWidth+" Expected Width is "+exp_cancel_buttonWidth);
			}
			else {
				System.out.println("Failed- 3rd cancel button Width is incorrect.When Actual Width is "+act_cancel_buttonWidth+" Expected Width is "+exp_cancel_buttonWidth);
			}
			Point po_cancel_buttonSize=cancel_3rdButton.getLocation();
			int act_cancelbuttonHorizontal=po_cancel_buttonSize.getX();
			int act_cancelbuttonVertical=po_cancel_buttonSize.getY();
			System.out.println(act_cancelbuttonHorizontal);
			System.out.println(act_cancelbuttonVertical);
			int exp_cancelbuttonHorizontal=614;
			int exp_cancelbuttonVertical=224;
			if(act_cancelbuttonHorizontal==exp_cancelbuttonHorizontal) {
				System.out.println("Passed- 3rd cancel button location Horizontally is correct.When Actual location is "+act_cancelbuttonHorizontal+" Expected location is "+exp_cancelbuttonHorizontal);
			}
			else {
				System.out.println("Failed- 3rd cancel button location Horizontally is incorrect.When Actual location is "+act_cancelbuttonHorizontal+" Expected location is "+exp_cancelbuttonHorizontal);
			}
			if(act_cancelbuttonVertical==exp_cancelbuttonVertical) {
				System.out.println("Passed- 3rd cancel button location Vertically is correct.When Actual location is "+act_cancelbuttonVertical+" Expected location is "+exp_cancelbuttonVertical);
			}
			else {
				System.out.println("Failed- 3rd cancel button location Vertically is incorrect.When Actual location is "+act_cancelbuttonVertical+" Expected location is "+exp_cancelbuttonVertical);
			}
			//verify in More information > Leads information heading text should be "Lead Information".
			String act_moreinfo_leadinfo=driver.findElement(By.xpath("(//b[text()='Lead Information'])[2]")).getText();
			String exp_moreinfo_leadinfo="Lead Information";
			if(act_moreinfo_leadinfo.equals(exp_moreinfo_leadinfo)) {
				System.out.println("Passed- Lead information text is correct");
			}
			else {
				System.out.println("Failed- Lead information text is incorrect");
			}
	        //verify industry dropdown box should be visible and enabled in lead information.
			WebElement industry=driver.findElement(By.xpath("//select[@name='industry']"));
			boolean act_industryDispaly=industry.isDisplayed(); 
			boolean exp_industryDislay=true;
			if(act_industryDispaly==exp_industryDislay) {
				System.out.println("Passed- Industry is visible");
			}
			else {
				System.out.println("Failed- Industry is invisible");
			}
			boolean act_industryEnable=industry.isEnabled();
			boolean exp_industryEnable=true;
			if(act_industryEnable==exp_industryEnable) {
				System.out.println("Passed- Industry is enabled");
			}
			else {
				System.out.println("Failed- Industry is disabled");
			}
			//verify Default industry dropdown box value should be selected  "--None--".
			Select industry_obj=new Select(industry);
			industry_obj.selectByVisibleText("--None--");
			WebElement select_defaultIndustry=industry_obj.getFirstSelectedOption();
			String act_defaultselect_Industry=select_defaultIndustry.getText();
			String exp_defaultselect_Industry="--None--";
			if(act_defaultselect_Industry.equals(exp_defaultselect_Industry)) {
				System.out.println("Passed- Default Industry value is populated correct. when Actual default Industry value is "+act_defaultselect_Industry+" Expected default Industry value is "+exp_defaultselect_Industry);
			}
			else {
				System.out.println("Failed- Default Industry value is populated incorrect. when Actual default Industry value is "+act_defaultselect_Industry+" Expected default Industry value is "+exp_defaultselect_Industry);
			}
			//verify industry dropdown box value should be selected  "Education".
			industry_obj.selectByVisibleText("Education");
			WebElement select_Industry=industry_obj.getFirstSelectedOption();
			String act_select_Industry=select_Industry.getText();
			String exp_select_Industry="Education";
			if(act_select_Industry.equals(exp_select_Industry)) {
				System.out.println("Passed- Selected Industry value is populated correct. when Actual Industry value is "+act_select_Industry+" Expected Industry value is "+exp_select_Industry);
			}
			else {
				System.out.println("Failed- Selected Industry value is populated incorrect. when Actual Industry value is "+act_select_Industry+" Expected Industry value is "+exp_select_Industry);
			}
			//verify Annualrevenu should be enable.
			WebElement revenu=driver.findElement(By.xpath("//input[@name='annualrevenue']"));
			boolean act_revenuEnable=revenu.isEnabled();
			boolean exp_revenuEnable=true;
			if(act_revenuEnable==exp_revenuEnable) {
				System.out.println("Passed- Revenu is enabled");
			}
			else {
				System.out.println("Failed- Revenu is disabled");
			}
			//verify Default annualrevenu value should be populated "0".
			String act_revenuvalue=revenu.getAttribute("value");
			String exp_revenuvalue="0";
			if(act_revenuvalue.equals(exp_revenuvalue)) {
				System.out.println("Passed- Before send revenu value is populated");
			}
			else {
				System.out.println("Failed- Before send revenu value is not populated");
			}
			//verify rating dropdown box should be visible and enable .
			WebElement rating=driver.findElement(By.xpath("//select[@name='rating']"));
	        boolean act_ratingDisplay=rating.isDisplayed();
	        boolean exp_ratingDisplay=true;
	        if(act_ratingDisplay==exp_ratingDisplay) {
	        	System.out.println("Passed- rating is visible");
	        }
	        else {
	        	System.out.println("Failed- rating is invisible");
	        }
	        //verify Default rating dropdown box value is selected "--None--".
	        Select rating_obj=new Select(rating);
	        rating_obj.selectByVisibleText("--None--");
	       WebElement select_rating= rating_obj.getFirstSelectedOption();
	       String act_select_rating=select_rating.getText();
	       String exp_select_rating="--None--";
	        if(act_select_rating.equals(exp_select_rating)) {
	        	System.out.println("Passed- before select rating value is populated ");
	        }
	        else {
	        	System.out.println("Failed- before select rating value is not populated");
	        }
	        //verify website textbox should be visible & enabled.
	  	  WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
	  	  boolean act_websiteEnable=website.isEnabled();
	  	  boolean exp_websiteEnable=true;
	  	  if(act_websiteEnable==exp_websiteEnable) {
	  		  System.out.println("Passed- Website textbox should be enabled");
	  	  }
	  	  else {
	  		  System.out.println("Failed- Website textbox should be disabled");
	  	  }
	  	  //verify website textbox default value should be populated blank.
	  	  String act_websiteDefaultvalue=website.getAttribute("value");
	  	  String exp_websiteDefaultvaue="";
	  	  if(act_websiteDefaultvalue.equals(exp_websiteDefaultvaue)) {
	  		  System.out.println("Passed- Default value is populated blank");
	  	  }
	  	  else {
	  		  System.out.println("Failed- Default value is populated blank");
	  	  }
	  	  website.clear();
	  	  website.sendKeys("www.ajeetkumar.com");
	  	  //verify website textbox send value shoulld be populated "www.ajeetkumar.com".
	  	  String exp_websiteSendvalue="www.ajeetkumar.com";
	  	  String act_websiteSendvalue=website.getAttribute("value");
	  	  if(act_websiteSendvalue.equals(exp_websiteSendvalue)) {
	  		  System.out.println("Passed- Send value is populated correctly");
	  	  }
	  	  else {
	  		  System.out.println("Failed- Send value is populated incorrectly");
	  	  }
	  	  //verify No of employee textbox should be visible & enable.
	      WebElement noofEmploye=driver.findElement(By.xpath("//input[@id='noofemployees']"));
	      boolean exp_noofEmploye=true;
	      boolean act_noofEmploye=noofEmploye.isEnabled();
	      if(act_noofEmploye==exp_noofEmploye) {
	    	  System.out.println("Passed- Employee textbox is enabled");
	      }
	      else {
	    	  System.out.println("Failed- Employee textbox is disabled");
	      }
	      //verify No of emloyee default textbox should be blank.
	      String exp_noofDefaultEmployee="";
	      String act_noofDefaultEmployee=noofEmploye.getAttribute("value");
	      if(act_noofDefaultEmployee.equals(exp_noofDefaultEmployee)){
	    	  System.out.println("Passed- Emloyee default textbox is populated blank");
	      }
	      else {
	    	  System.out.println("Failed- Emloyee default textbox is populated not blank");
	      }
	      noofEmploye.clear();
	      noofEmploye.sendKeys("50");
	      String exp_noofEmployeeValue="50";
	      String act_noofEmployeeValue=noofEmploye.getAttribute("value");
	      if(act_noofEmployeeValue.equals(exp_noofEmployeeValue)) {
	    	  System.out.println("Passed- Emloyee textbox is populated correctly");
	      }
	      else {
	    	  System.out.println("Failed- Emloyee textbox is populated incorrectly");
	      }
	      //verify yahoo id textbox should be visible & enable.
	      WebElement yahoo=driver.findElement(By.xpath("//input[@id='yahooid']"));
	      boolean exp_yahooidEnable=true;
	      boolean act_yahooidEnable=yahoo.isEnabled();
	      if(act_yahooidEnable==exp_yahooidEnable) {
	    	  System.out.println("Passed- Yahoo id textbox is enabled");
	      }
	      else {
	    	  System.out.println("Failed- Yahoo id textbox is enabled");
	      }
	      //verify deafault yahoo id textbox should be blank.
	      String act_yahooDefaultValue=yahoo.getAttribute("value");
	      String exp_yahooDefaultValue="";
	      if(act_yahooDefaultValue.equals(exp_yahooDefaultValue)) {
	    	  System.out.println("Passed- Default Yahoo id textbox is populated blank");
	      }
	      else {
	    	  System.out.println("Failed- Default Yahoo id textbox is populated not blank");
	      }
	      yahoo.clear();
	      yahoo.sendKeys("None");
	      //verify send yahoo id texbox value should be populated "None".
	      String exp_yahootValue="None";
	      String act_yahootValue=yahoo.getAttribute("value");
	      if(act_yahootValue.equals(exp_yahootValue)) {
	    	  System.out.println("Passed- Yahoo id textbox is populated correctly");
	      }
	      else {
	    	  System.out.println("Failed- Yahoo id textbox is populated incorrectly");
	      }
	      //verify Last save button should be visible & enable.
	      WebElement lastsavebutton= driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[last()]"));
	      boolean exp_lastsavebuttonEnable=true;
	      boolean act_lastsavebuttonEnable=lastsavebutton.isEnabled();
	      if(act_lastsavebuttonEnable==exp_lastsavebuttonEnable) {
	    	  System.out.println("Passed- Last save button is enabled");
	      }
	      else {
	    	  System.out.println("Failed- Last save button is disabled");
	      }
	      //verify Last save button text name should be populated "Save".
	      String act_lastsavebuttonValue=lastsavebutton.getAttribute("value");
	      String exp_lastsavebuttonValue="  Save  ";
	      if(act_lastsavebuttonValue.equals(exp_lastsavebuttonValue)) {
	    	  System.out.println("Passed- Last save button text is populated correct");
	      }
	      else {
	    	  System.out.println("Failed- Last save button text is populated incorrect");
	      }
	      //verify Last save button should be visible correct size and location.
	      Dimension dim_lastsavebutton=lastsavebutton.getSize();
	      int act_lastsavebutton_hight=dim_lastsavebutton.getHeight();
	      int act_lastsavebutton_width=dim_lastsavebutton.getWidth();
	      System.out.println(act_lastsavebutton_hight);
	      System.out.println(act_lastsavebutton_width);
	      int exp_lastsavebutton_hight=19;
	      int exp_lastsavebutton_width=70;
	      if(act_lastsavebutton_hight==exp_lastsavebutton_hight) {
	    	  System.out.println("Passed- last Save button Hight is correct");
	      }
	      else {
	    	  System.out.println("Failed- last Save button Hight is incorrect");
	      }
	      if(act_lastsavebutton_width==exp_lastsavebutton_width) {
	    	  System.out.println("Passed- last Save button Width is correct");
	      }
	      else {
	    	  System.out.println("Failed- last Save button Width is incorrect");
	      }
	      Point po_lastsavebutton=lastsavebutton.getLocation();
	      int act_lastbutton_Horizontal=po_lastsavebutton.getX();
	      int act_lastbutton_Vertical=po_lastsavebutton.getY();
	      System.out.println(act_lastbutton_Horizontal);
	      System.out.println(act_lastbutton_Vertical);
	      int exp_lastbutton_Horizontal=541;
	      int exp_lastbutton_Vertical=377;
	      if(act_lastbutton_Horizontal==exp_lastbutton_Horizontal) {
				System.out.println("Passed- last Save button Horizontally Location is correct.when Actual Horizontally Location is "+act_lastbutton_Horizontal+"Expect Horizontally Location is "+exp_lastbutton_Horizontal);
	      }
	      else {
				System.out.println("Failed- last Save button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_lastbutton_Horizontal+"Expect Horizontally Location is "+exp_lastbutton_Horizontal);
	      }
	      if(act_lastbutton_Vertical==exp_lastbutton_Vertical) {
				System.out.println("Passed- last Save button Vertically Location is correct.when Actual Vertically Location is "+act_lastbutton_Vertical+"Expect Vertically Location is "+exp_lastbutton_Vertical);
	      }
	      else {
				System.out.println("Passed- last Save button Vertically Location is incorrect.when Actual Vertically Location is "+act_lastbutton_Vertical+"Expect Vertically Location is "+exp_lastbutton_Vertical);
	      }
	      //verify Last cancel button should be visible & enable.
	      WebElement lastcancelbutton= driver.findElement(By.xpath("(//input[@title='Cancel [Alt+X]'])[last()]"));
	      boolean exp_lastcancelbuttonEnable=true;
	      boolean act_lastcancelbuttonEnable=lastcancelbutton.isEnabled();
	      if(act_lastcancelbuttonEnable==exp_lastcancelbuttonEnable) {
	    	  System.out.println("Passed- Last cancel button is enabled");
	      }
	      else {
	    	  System.out.println("Failed- Last cancel button is disabled");
	      }
	      //verify Last cancel button text name should be populated "cancel".
	      String act_lastcancelbuttonValue=lastcancelbutton.getAttribute("value");
	      String exp_lastcancelbuttonValue="  Cancel  ";
	      if(act_lastcancelbuttonValue.equals(exp_lastcancelbuttonValue)) {
	    	  System.out.println("Passed- Last cancel button text is populated correct");
	      }
	      else {
	    	  System.out.println("Failed- Last cancel button text is populated incorrect");
	      }
	      //verify Last cancel button should be visible correct size and location.
	      Dimension dim_lastcancelbutton=lastcancelbutton.getSize();
	      int act_lastcancelbutton_hight=dim_lastsavebutton.getHeight();
	      int act_lastcancelbutton_width=dim_lastsavebutton.getWidth();
	      System.out.println(act_lastcancelbutton_hight);
	      System.out.println(act_lastcancelbutton_width);
	      int exp_lastcancelbutton_hight=19;
	      int exp_lastcancelbutton_width=70;
	      if(act_lastcancelbutton_hight==exp_lastcancelbutton_hight) {
	    	  System.out.println("Passed- Cancel button Hight is correct");
	      }
	      else {
	    	  System.out.println("Failed- Cancel button Hight is incorrect");
	      }
	      if(act_lastcancelbutton_width==exp_lastcancelbutton_width) {
	    	  System.out.println("Passed- Cancel button Width is correct");
	      }
	      else {
	    	  System.out.println("Failed- Cancel button Width is incorrect");
	      }
	      Point po_lastcancelbutton=lastcancelbutton.getLocation();
	      int act_lastcancelbutton_Horizontal=po_lastcancelbutton.getX();
	      int act_lastcancelbutton_Vertical=po_lastcancelbutton.getY();
	      System.out.println(act_lastcancelbutton_Horizontal);
	      System.out.println(act_lastcancelbutton_Vertical);
	      int exp_lastcancelbutton_Horizontal=614;
	      int exp_lastcancelbutton_Vertical=377;
	      if(act_lastcancelbutton_Horizontal==exp_lastcancelbutton_Horizontal) {
				System.out.println("Passed- last cancel button Horizontally Location is correct.when Actual Horizontally Location is "+act_lastcancelbutton_Horizontal+"Expect Horizontally Location is "+exp_lastcancelbutton_Horizontal);
	      }
	      else {
				System.out.println("Failed- last cancel button Horizontally Location is incorrect.when Actual Horizontally Location is "+act_lastcancelbutton_Horizontal+"Expect Horizontally Location is "+exp_lastcancelbutton_Horizontal);
	      }
	      if(act_lastcancelbutton_Vertical==exp_lastcancelbutton_Vertical) {
				System.out.println("Passed- last cancel button Vertically Location is correct.when Actual Vertically Location is "+act_lastcancelbutton_Vertical+"Expect Vertically Location is "+exp_lastcancelbutton_Vertical);
	      }
	      else {
				System.out.println("Passed- last cancel button Vertically Location is incorrect.when Actual Vertically Location is "+act_lastcancelbutton_Vertical+"Expect Vertically Location is "+exp_lastcancelbutton_Vertical);
	      }
	      
	      
	
	}

}

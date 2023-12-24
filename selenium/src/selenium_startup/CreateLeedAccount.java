package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeedAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		
		String expected_result ="vtiger CRM 5 - Commercial Open Source CRM";
		String actual_result =driver.getTitle();
		if(expected_result.equals(actual_result)) {
			System.out.println("Passed- Login title is visible in login page"+driver.getTitle());
		}
		else {
			System.out.println("Failed- Login title is invisible in login page"+driver.getTitle());
		}
		 boolean titlelogo=  driver.findElement(By.xpath("//img[@title='vtiger CRM']")).isDisplayed();
		   
	       if(titlelogo==true) {
				System.out.println("Passed- Title Logo visible in header of Login Page");
			  }
	       else {
	    	   System.out.println("Failed- Title Logo invisible in header of Login Page ");
	      }
	       boolean signheader=driver.findElement(By.xpath("//img[@title='Sign in']")).isDisplayed();
			if(signheader==true){
				System.out.println("Passed- Sign in logo Visible in Login page");
			}
			else {
				System.out.println("Failed- Sign in logo invisible in login page");
			}
	     WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
	     username.clear();
	     username.sendKeys("admin");
	    boolean user_name= username.isDisplayed();
	    user_name=username.isEnabled();
	    if(user_name==true) {
	    	System.out.println("Passed- Username visible and enable in login page");
	    }
	    else {
	    	System.out.println("Failed- Username invisible and disable in login page");
	    }
	    WebElement userpass=driver.findElement(By.xpath("//input[@name='user_password']"));
	    userpass.clear();
	    userpass.sendKeys("admin");
	    boolean user_pass=userpass.isEnabled();
	    if (user_pass==true) {
	    	System.out.println("Passed- Userpassword is visible and enable in login page");
	    }
	   else {
		   System.out.println("Failed- Userpassword is invisible and disable in login page");
	   }
		boolean col_theme=driver.findElement(By.xpath("//select[@name='login_theme']")).isDisplayed();
		if(col_theme==true) {
			System.out.println("Passed- Color theme option is visible");
		}
		else {
			System.out.println("Failed- Color theme option is invisible");
		}
		boolean language=driver.findElement(By.xpath("//select[@name=\"login_language\"]")).isDisplayed();
		if(language==true) {
			System.out.println("Passed- Language option is visible ");
		}
		else {
			System.out.println("Failed- Language option is invisible ");
		}
	    WebElement login=driver.findElement(By.xpath("//input[@name='Login']"));
	     boolean log_button=login.isEnabled();
	     login.click();
	    if(log_button==true) {
	    	System.out.println("Passed- Login button is enable in login page");
	    }
	    else {
	    	System.out.println("Failed- Login button is disable in login page");
	    }
	    String exp_result="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
	    String act_result=driver.getTitle();
	    if(exp_result.equals(act_result)) {
	    	System.out.println("Passed- Home page title is visible in home page");
	    }
	    	else {
	    		System.out.println("Failed- Home page title is invisible in home page");
	    	}
	    
	    WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	    boolean sign_out=signout.isDisplayed();
	    signout.isEnabled();
	   // signout.click();
	    if(sign_out) {
	    	System.out.println("Passed- Signout link is visible and enable in home page");
	    }
	    else {
	    	System.out.println("Failed- Signout link is invisible and disable in home page");
	    }
	   WebElement marketing=driver.findElement(By.xpath("//a[text()='Marketing']"));
	   boolean marketing_link=marketing.isEnabled();
	   //marketing.sendKeys("Leads");
	   marketing.click();
	   if(marketing_link==true) {
		   System.out.println("Passed- Marketing link visible and enable in home page ");
	   }
	   else {
		   System.out.println("Failed- Marketing link invisible and disable in home page");
	   }
//	   WebElement campaign= driver.findElement(By.xpath("(//a[text()='Campaigns'])[4]"));
//	   boolean campaign_link=campaign.isEnabled();
//	   campaign.click();
	   String act_cam=driver.findElement(By.xpath("(//a[text()='Campaigns'])[4]")).getText();
	   String exp_cam="Campaigns";
	   if(exp_cam.equals(act_cam)) {
		   System.out.println("Passed- After click Marketing link and Marketing >Campaigns text visible in Marketing>Campaigns page");
	   }
	   else {
		   System.out.println("Failed- After click Marketing link and Marketing >Campaigns text invisible in Marketing>Campaigns page");
	   }
	  WebElement leadslink= driver.findElement(By.xpath("(//a[text()='Leads'])[1]"));
	  boolean lead_link=leadslink.isEnabled();
	  leadslink.click();
	  if(lead_link==true) {
		  System.out.println("Passed- After click on leads link and Marketing >leads text visible&enable in Marketing>leads page");
	  }
	  else {
		  System.out.println("Failed- After click on leads link and Marketing >leads text invisible&disable in Marketing>leads page");
	  }
	////verify on leads page in search box heading should be "Search"
	  String act_leadsearch=driver.findElement(By.xpath("//span[text()='Search']")).getText();
	  String exp_leadsearch="Search";
	  if(exp_leadsearch.equals(act_leadsearch)) {
		  System.out.println("Passed- 'Search' is visible same as actual result on leads page");
	  }
	  else {
		  System.out.println("Failed- 'Search' is invisible Same as actual result");
	  }
	  WebElement leadacount=driver.findElement(By.xpath("//img[@title='Create Lead...']"));
	 boolean lead_act= leadacount.isEnabled();
	 leadacount.click();
	 if(lead_act==true) {
		 System.out.println("Passed- plus icon is visible and enable in Marketing >leads page ");
	 }
	 else {
		 System.out.println("Failed- plus icon is invisible and disable in Marketing >leads page ");
	 }
	 String act_createlead=driver.findElement(By.xpath("//span[text()='Creating New Lead']")).getText();
	 String exp_createlead="Creating New Lead";
	 if(exp_createlead.equals(act_createlead)) {
		 System.out.println("Passed- 'creating new leads' heading text is visible same as actual result on Marketing>Lead page");
	 }
	 else {
		 System.out.println("Failed- 'creating new leads' heading text is visible same as actual result on Marketing>Lead page");
	 }
	 String exp_1stbuttonlead="  Save  ";
	 String act_1stbuttonleads= driver.findElement(By.xpath("//input[@value='  Save  ']")).getAttribute("value");
	 if(exp_1stbuttonlead.equals(act_1stbuttonleads)) {
		 System.out.println("Passed- 'Save' text is visible on button same as actual result in create new lead ");
	 }
	 else {
		 System.out.println("Failed- 'Save' text is invisible on button same as actual result in create new lead");
	 }
	 driver.findElement(By.xpath("//select[@name='salutationtype']")).sendKeys("Dr.");
     WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	 boolean first_leadname=firstname.isEnabled();
	 firstname.clear();
	 firstname.sendKeys("Niraj");
	 if(first_leadname==true) {
		 System.out.println("Passed- First Name is Enable in Lead information");
	 }
	 else {
		 System.out.println("Failed- First Name is Disable in Lead information");
		 }
	 WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	 boolean last_leadname=lastname.isEnabled();
	 lastname.clear();
	 lastname.sendKeys("Kumar");
	 if(last_leadname==true) {
		 System.out.println("Passed- Last Name is Enable in Lead information");
	 }
	 else {
		 System.out.println("Failed- Last Name is Disable in Lead information");
	 }
	 WebElement company=driver.findElement(By.xpath("//input[@name='company']"));
	 boolean lead_company=company.isEnabled();
	 company.clear();
	 company.sendKeys("aiims");
	 if(lead_company==true) {
		 System.out.println("Passed- Company is Enable in Lead information");	 
	 }
	 else {
		 System.out.println("Failed- Company is disable in Lead information");
	 }
	 WebElement title=driver.findElement(By.xpath("//input[@id=\"designation\"]"));
	 boolean lead_title=title.isEnabled();
	 title.clear();
	 title.sendKeys("Administrative");
	 if(lead_title) {
		 System.out.println("Passed- title is Enable in Lead information");
	 }
	 else {
		 System.out.println("Failed- title is Disable in Lead information");
	 }
     WebElement leadsource=driver.findElement(By.xpath("//select[@name='leadsource']"));	 
     boolean lead_source=leadsource.isDisplayed();
     leadsource.sendKeys("Others");
     if(lead_source==true) {
    	 System.out.println("Passed- Lead source is visible in Lead information");
     }
     else {
    	 System.out.println("Failed- Lead source is invisible in Lead information");
     }
	 WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
	 boolean phone_lead=phone.isEnabled();
	 phone.clear();
	 phone.sendKeys("none");
	 if(phone_lead==true) {
		 System.out.println("Passed- phone number visible and enable in lead information");
	 }
	 else {
		 System.out.println("Failed- phone number invisible and disable in lead information");
	 }
    WebElement mobile= driver.findElement(By.xpath("//input[@id='mobile']"));
    boolean mobile_lead=mobile.isEnabled();
    mobile.clear();
    mobile.sendKeys("7856432112");
    if(mobile_lead==true) {
    	System.out.println("Passed- Mobile number visible and enable in lead information");
    }
    else {
    	System.out.println("Failed- Mobile number visible and enable in lead information");
    }
    WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
    boolean email_lead=email.isEnabled();
    email.clear();
    email.sendKeys("nirajkumar123@gmail.com");
    if(email_lead==true) {
    	System.out.println("Passed- Email Id visible and enable in lead information");
    }
    else {
    	System.out.println("Failed- Email Id visible and enable in lead information");
    }
   WebElement group= driver.findElement(By.xpath("//input[@value='T']"));
    group.click();
    boolean lead_group=group.isEnabled();
    group.isSelected();
    if(lead_group==true) {
    	System.out.println("Passed- Assingntype visible and enable in leads information ");
    }
    else {
    	System.out.println("Failed- Assingntype invisible and disable in leads information");
    }
     driver.findElement(By.xpath("//select[@name='assigned_group_id']")).sendKeys("Support Group");
   
	 WebElement lane=driver.findElement(By.xpath("//textarea[@name='lane']"));
	 boolean lane_lead=lane.isEnabled();
	 lane.sendKeys("Niraj kumar, House No-449,Street-Naibasti Road Muglsarai ");
	 if(lane_lead==true) {
		 System.out.println("Passed- Declaration is visible and enable in Leads information");
	 }
	 else {
		 System.out.println("Failed- Declaration is invisible and disable in Leads information");
	 }
	 WebElement country=driver.findElement(By.xpath("//input[@name='country']"));
	 boolean country_lead=country.isEnabled();
	 country.sendKeys("India");
	 if(country_lead==true) {
		 System.out.println("Passed- Country is visible and enable in leads information");
	 }
	 else {
		 System.out.println("Failed- Country is invisible and disable in leads information");
	 }
	 
	  WebElement secondsave=driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
	 // boolean second_save=secondsave.isEnabled();
	  String exp_2ndbuttonlead="  Save  ";
	  String act=  secondsave.getAttribute("value");
	  if(act.equalsIgnoreCase(exp_2ndbuttonlead)){
	    System.out.println("Passed- Second 'Save' text is visible on button same as actual result and enable in create new lead ");
	 }
	  else {
	    System.out.println("Failed- Second 'Save' text is invisible on button same as actual result and disable in create new lead");
	     }
	  secondsave.click();
	
	
	
	
	}   
}

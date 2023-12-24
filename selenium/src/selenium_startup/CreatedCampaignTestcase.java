package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreatedCampaignTestcase {

	public static void main(String[] args) {
		
		
		//launched Browser & navigate URL
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		
	   //User Is able to see all components on Login Page
		String expected_title="vtiger CRM 5 - Commercial Open Source CRM";
		String actual_title = driver.getTitle();
		
		 if( expected_title.equals(actual_title)) {
			 System.out.println("passed- Login title visible and Expect this title "+driver.getTitle());
		 }else {
			 System.out.println("Failed- Login title invisible and not Expect this title "+driver.getTitle());
		}
		
	
		 boolean titlelogo=  driver.findElement(By.xpath("//img[@title='vtiger CRM']")).isDisplayed();
   
       if(titlelogo==true) {
			System.out.println("passed -  Title Logo visible in header of Login Page");
		  }
       else {
    	   System.out.println("failed - Title Logo invisible in header of Login Page ");
      }
       boolean signheader=driver.findElement(By.xpath("//img[@title='Sign in']")).isDisplayed();
		if(signheader==true){
			System.out.println("passed - sign in logo Visible in Login page");
		}
		else {
			System.out.println("Failed - sign in logo invisible in login page");
		}
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean user_name=username.isDisplayed();
		username.isEnabled();
		username.clear();
		username.sendKeys("admin");
		if (user_name==true) {
			System.out.println("passed - username Visible and Enable in Login Page ");
		}
		else {
			System.out.println("Failed - username not invisible and Disable in Login Page");
		}
		WebElement userpass=driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean user_pass=userpass.isDisplayed();
		userpass.isEnabled();
		userpass.clear();
		userpass.sendKeys("admin");
		if (user_pass==true) {
			System.out.println("passed - userpassword Visible and Enable in Login Page ");
		}
		else {
			System.out.println("Failed - userpassword not invisible and Disable in Login Page");
		}	
		boolean col_theme=driver.findElement(By.xpath("//select[@name='login_theme']")).isDisplayed();
		if(col_theme==true) {
			System.out.println("Passed- color theme option is visible");
		}
		else {
			System.out.println("Failed- color theme option is invisible");
		}
		boolean language=driver.findElement(By.xpath("//select[@name=\"login_language\"]")).isDisplayed();
		if(language==true) {
			System.out.println("passed- language option is visible ");
		}
		else {
			System.out.println("failed- language option is invisible ");
		}
		
		WebElement logbutton=driver.findElement(By.xpath("//input[@name='Login']"));
		boolean log_button=logbutton.isDisplayed();
		logbutton.isEnabled();
		logbutton.click();
		if (log_button==true) {
			System.out.println("passed - Login button Visible and Enable in Login Page ");
		}
		else {
			System.out.println("Failed - Login button invisible and Disable in Login Page");
		}	
	   
		
		String exp_titlehome="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String act_titlehome = driver.getTitle();
		
		 if( exp_titlehome.equals(act_titlehome)) {
			 System.out.println("passed- Home title visible and Expect this title ->"+driver.getTitle());
		 }else {
			 System.out.println("failed- Home title invisible and not Expect this title ->"+driver.getTitle());
			 }
		WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		boolean sign_out=signout.isDisplayed();
		signout.isEnabled();
		//signout.click();
		if (sign_out==true) {
			System.out.println("passed- signout link visible and Enable in Home Page");
		}
		else {
			System.out.println("failed- signout link is invisible and disable in Home Page");
		}
		
		
	  WebElement home= driver.findElement(By.xpath("//a[text()='My Home Page']"));
		boolean home_page=home.isEnabled();
		//home.click();
		if (home_page==true) {
			System.out.println("passed- Home page link is Visible and Enable in home page ");
		}
		else {
			System.out.println("failed- Home page link is invisible and Disable in home page");
		}
		 WebElement marketing= driver.findElement(By.xpath("//a[text()='Marketing']"));
		 boolean marketing_page=marketing.isEnabled();
		 marketing.click();
			if (home_page==true) {
				System.out.println("passed- Marketing link is Visible and Enable in home page and  Marketing<Campaign Page is Open");
			}
			else {
				System.out.println("failed- Marketing link is invisible and disable in home page and open Marketing<Campaign Page is not Open");
			}
			boolean camp_link=driver.findElement(By.xpath("(//a[text()='Campaigns'])[4]")).isDisplayed();
		if(camp_link==true) {
			System.out.println("Passed- campaigns link is Visible and Enable in Campaign page");
		}
		else {
			System.out.println("failed- campaigns link is invisible and disable in Campaign page");
		}
		WebElement createcam=driver.findElement(By.xpath("//img[@title='Create Campaign...']"));
		boolean create_cam=createcam.isDisplayed();
		createcam.isEnabled();
		createcam.click();
		if(create_cam==true) {
			System.out.println("passed- create account icon is visible and enable in campaign page and open create new Campaign page");
		}
		else {
			System.out.println("failed- create account icon is invisible and disable in campaign page and not open create new Campaign page");
		}
		WebElement campname=driver.findElement(By.xpath("//input[@name='campaignname']"));
		 boolean camp_name=campname.isEnabled();
		 campname.clear();
		campname.sendKeys("Sailesh Kumar");
		if (camp_name==true) {
			System.out.println("Passed- Campaignname textbox visible and enable in create new Campaign page");
		}
		else {
			System.out.println("failed-Campaignname textbox invisible and disable in create new Campaign page");
		}
		WebElement radbutton=driver.findElement(By.xpath("//input[@name='assigntype'][2]"));
		boolean rad_button=radbutton.isDisplayed();
		radbutton.click();
		if(rad_button==true) {
			System.out.println("Passed- radio button visible in create new Campaign page");
		}
		else {
			System.out.println("failed- radio button invisible in create new Campaign page");
		}
      WebElement dropcamp= driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		boolean drop_camp=dropcamp.isDisplayed();
		dropcamp.sendKeys("Team Selling");
		if(drop_camp==true) {
			System.out.println("passed- Dropdown option visible in Create new Campaign page ");
		}
		else {
			System.out.println("failed-  Dropdown option invisible in Create new Campaign page");
		}
	  WebElement targcamp=driver.findElement(By.xpath("//input[@name='targetaudience']"));
	  boolean targ_camp=targcamp.isEnabled();
	  targcamp.clear();
	  targcamp.sendKeys("Public");
	  if(targ_camp==true) {
		  System.out.println("passed- Targetaudience is Enable in Create new campaign page ");
	  }
	  else {
		  System.out.println("failed- Targetaudience is disable in Create new campaign page");
	  }
	
	
	
	}
	
	

}

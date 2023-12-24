package snapshot_Concept;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import prcatice_Selenium.SnapShot_Concept;

public class TakeSnapShot {
	public  WebDriver driver= new  ChromeDriver();
	public static void main(String[] args) throws IOException   {
		
		TakeSnapShot sp = new TakeSnapShot();
		sp.LoginPage();
		sp.marketingPage();
	}
 
	
	// takesnapshot......
	public void takeSnapShot(String imageName ) throws IOException {
		
		DateFormat dFormat= new SimpleDateFormat("MM-dd-yyyy hh-mm-ss a");
		String timeStamp=dFormat.format(new java.util.Date());
		TakesScreenshot tssobj = (TakesScreenshot) driver;
		File sourceFile = tssobj.getScreenshotAs(OutputType.FILE);
		File folderobj = new File("Snapshots");
		if(folderobj.exists()==false) {
			folderobj.mkdir();
		}
	File destinationFile = new File("Snapshots\\"+imageName+""+timeStamp+".png");
	Files.copy(sourceFile, destinationFile);
		}
	public void LoginPage() throws IOException {
	//Full image Screenshot....
	//	 driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	//username should be dispalyed and enabled...
	WebElement userName=driver.findElement(By.xpath("//input[@name='user_name']"));
	    
	    boolean actuserName=userName.isDisplayed();
		boolean expuserName=false;
		if(actuserName==expuserName) {
			System.out.println("Passed - USERNAME TEXTBOX DISPLAYED");
		}else {
		// TakeScreenShot...
			takeSnapShot("usernameVISIBILITYValidation");
			System.out.println("Failed - USERNAME TEXTBOX NOT DISPLAYED");
		}
		userName.sendKeys("admin");
		boolean enableUserName = userName.isEnabled();
		if(enableUserName==false) {
			System.out.println("Passed - USERNAME TEXTBOX ENABLED");
		}else {
		// TakeScreenShot...
			takeSnapShot("usernameENABLEDValidation");
			System.out.println("Failed - USERNAME TEXTBOX NOT DISABLED");
		}
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		
		boolean actuserPassword=userPassword.isDisplayed();
		boolean expuserPassword=true;
		if(actuserPassword==expuserPassword) {
			System.out.println("Passed - USERPASSWORD TEXTBOX DISPLAYED");
		}else {
			takeSnapShot("userPaawordVISIBILITYValidation");
			System.out.println("Failed - USERPASSWORD TEXTBOX NOT DISPLAYED");
		}
		boolean enableUserPassword = userName.isEnabled();
		if(enableUserPassword==false) {
			System.out.println("Passed - USERPASSWORD TEXTBOX ENABLED");
		}else {
		// TakeScreenShot...
			takeSnapShot("userPasswordENABLEDValidation");
			System.out.println("Failed - USERPASSWORD TEXTBOX NOT DISABLED");
		}
		userPassword.sendKeys("admin");
		WebElement Login=driver.findElement(By.xpath("//input[@name='Login']"));
		boolean actLogin=Login.isEnabled();
		boolean expLogin= true;
		if(actLogin==expLogin) {
			System.out.println("Passed - LOGIN BUTTON IS ENABLED");
		}else {
			System.out.println("Failed - LOGIN BUTTON IS DISABLED");
		}
		Login.click();
		
    }
    public void marketingPage( ) throws IOException {
    	// Section screenshot image...
    	driver.findElement(By.linkText("Marketing")).click();
    	WebElement section=driver.findElement(By.xpath("(//table[@class='searchUIBasic small'])[1]"));
    	File srcImage=section.getScreenshotAs(OutputType.FILE);
    	File sectionfile = new File("SectionImage");
    	sectionfile.mkdir();
    	File desImage = new File("SectionImage\\image.png");
    	Files.copy(srcImage, desImage);
    }
    
}

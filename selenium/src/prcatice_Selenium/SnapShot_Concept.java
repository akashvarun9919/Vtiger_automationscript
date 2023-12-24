package prcatice_Selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SnapShot_Concept {
	
	public static void main(String[] args) throws IOException   {
		SnapShot_Concept sp = new SnapShot_Concept();
		sp.LoginPage();
	}
 
	// takesnapshot......
	public void takeSnapShot(WebDriver driver,String imageName ) throws IOException {
		driver.findElement(By.xpath(""));
		DateFormat dFormat= new SimpleDateFormat("MM-dd-yyyy hh-mm-ss a");
		String timeStamp=dFormat.format(new Date());
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
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	//username should be dispalyed and enabled...
	WebElement userName=driver.findElement(By.xpath("//input[@name='user_name']"));
	    
	    boolean actuserName=userName.isDisplayed();
		boolean expuserName=false;
		if(actuserName==expuserName) {
			System.out.println("Passed - USERNAME TEXTBOX DISPLAYED");
		}else {
		// TakeScreenShot...
			takeSnapShot(driver,"usernameVISIBILITYValidation");
			System.out.println("Failed - USERNAME TEXTBOX NOT DISPLAYED");
		}
		userName.sendKeys("admin");
		boolean enableUserName = userName.isEnabled();
		if(enableUserName==false) {
			System.out.println("Passed - USERNAME TEXTBOX ENABLED");
		}else {
		// TakeScreenShot...
			takeSnapShot(driver,"usernameENABLEDValidation");
			System.out.println("Failed - USERNAME TEXTBOX NOT DISABLED");
		}
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		
		boolean actuserPassword=userPassword.isDisplayed();
		boolean expuserPassword=true;
		if(actuserPassword==expuserPassword) {
			System.out.println("Passed - USERPASSWORD TEXTBOX DISPLAYED");
		}else {
			takeSnapShot(driver,"userPaawordVISIBILITYValidation");
			System.out.println("Failed - USERPASSWORD TEXTBOX NOT DISPLAYED");
		}
		boolean enableUserPassword = userName.isEnabled();
		if(enableUserPassword==false) {
			System.out.println("Passed - USERPASSWORD TEXTBOX ENABLED");
		}else {
		// TakeScreenShot...
			takeSnapShot(driver,"userPasswordENABLEDValidation");
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
    public void marketingPage(WebDriver driver ) throws IOException {
    	
    }
    
    
    
}

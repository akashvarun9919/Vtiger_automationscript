package prcatice_Selenium;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Automate_October9_23 {
	public static WebDriver c_driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		//create Scanner class..
		Scanner sc= new Scanner(System.in);
        
	  //create object of ChromeDriver..and broswser should be launched.
		System.out.println("Please Select Driver");
		String name=sc.next();
		if(name.equalsIgnoreCase("ChromeDriver")) {
			c_driver = new ChromeDriver();
		}else if(name.equalsIgnoreCase("EdgeDriver")) {
			c_driver = new EdgeDriver();
		}else if(name.equalsIgnoreCase("FirefoxDriver")) {
			c_driver = new FirefoxDriver();
		}else  if(name.equals("InternetExplorerDriver")) {
				c_driver = new InternetExplorerDriver();
		}
		
	   // hit the URL of browser..
		c_driver.get("http://localhost:8888/");
	   // check username textbox should be enabled..
	    WebElement user_Name=c_driver.findElement(By.xpath("//input[@name='user_name']"));
		user_Name.sendKeys("admin");
		boolean actual_userName=user_Name.isEnabled();
		boolean expected_userName=true;
		if (actual_userName==expected_userName) {
			System.out.println("Passed - username Textbox is enabled");
		}else {
			System.out.println("Failed - username Textbox is disabled");
		}
		//  check userpassword textbox should be enabled..
		WebElement user_Password=c_driver.findElement(By.xpath("//input[@name='user_password']"));
		user_Password.sendKeys("admin");
		boolean actual_userPassword=user_Name.isEnabled();
		boolean expected_userPassword=true;
		if (actual_userPassword==expected_userPassword) {
			System.out.println("Passed - userpassword Textbox is enabled");
		}else {
			System.out.println("Failed - userpassword Textbox is disabled");
		}
		//   check color theme dropdown should be selected..
		WebElement colortheme=c_driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select selObj= new Select(colortheme);
		selObj.selectByVisibleText("woodspice");
		WebElement woodspice_Selected=selObj.getFirstSelectedOption();
		String act_dropDownSelected=woodspice_Selected.getText();
		String exp_dropDownSelected = "woodspice";
		if(act_dropDownSelected.equalsIgnoreCase(exp_dropDownSelected)) {
			System.out.println("Passed - dropdown woodspice is selected");
		}else {
			System.out.println("Failed - dropdown woodspice is selected");
	    }
			
		//  check login button should be enabled..
		WebElement loginButton=c_driver.findElement(By.xpath("//input[@name='Login']"));
		
		boolean actual_LoginButton=loginButton.isEnabled();
		boolean expected_LoginButton=true;
		if (actual_LoginButton==expected_LoginButton) {
			System.out.println("Passed - login button is enabled");
		}else {
			System.out.println("Failed - login button is disabled");
		}
		loginButton.click();
	   // create action class object..
	    Actions actObj = new Actions(c_driver);
	   //click on marketing link..
	    WebElement marketing_Link= c_driver.findElement(By.xpath("//a[text()='Marketing']"));
	    actObj.moveToElement(marketing_Link).build().perform();
	   // click on account link ..
	    WebElement account_Link= c_driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Accounts']"));
	    actObj.click(account_Link).build().perform();
	    // click on plus icon to create new account..
//	    c_driver.findElement(By.xpath("//img[@title='Create Account...']")).click();
//	    c_driver.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
//	    Thread.sleep(1000); 
//	   WebElement calender= c_driver.findElement(By.xpath("//b[text()='October 2023']"));
//	   actObj.moveToElement(calender).click().build().perform();
 //    c_driver.switchTo().frame(calender);	    
//	    c_driver.findElement(By.xpath("//td[@class='calHdr']//img[@align='absmiddle']")).click();
//	    Thread.sleep(1000);
//	    c_driver.findElement(By.xpath("//a[text()='16']")).click();
	    
	    WebElement createacc=c_driver.findElement(By.xpath("//img[@title='Create Account...']"));
	    for (int j=0;j<=2;j++) {
	    RandomString random=new RandomString();
	    String data=random.nextString();
	
	    	createacc=c_driver.findElement(By.xpath("//img[@title='Create Account...']"));
	    	createacc.click();
	    Thread.sleep(200);
	        WebElement accname= c_driver.findElement(By.xpath("//input[@name='accountname']"));
	    	WebElement save=c_driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
	    	accname.sendKeys(data);
	    	System.out.println(data);
	    	save=c_driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
	  
	    	save.click();
	   Thread.sleep(2000);
	   
	    }
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

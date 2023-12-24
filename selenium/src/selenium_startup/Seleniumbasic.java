package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumbasic {

	public static void main(String[] args) {
		//CHROME BROWSER LAUNCHING
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		ChromeDriver dri=  new ChromeDriver();
		  dri.get("http://localhost:8888/");
		 
		    System.out.println("Title of web page is:"+dri.getTitle());
		    System.out.println("Current URL  of the web page is:"+dri.getCurrentUrl());
		     
		    System.out.println(" Page source of:"+dri.getPageSource());
		    WebElement searchStore= dri.findElement(By.xpath("//select[@name='login_theme']"));  
		    System.out.println("Visible status:"+searchStore.isDisplayed());
		    System.out.println("Enable status:"+searchStore.isDisplayed());
		    WebElement username= dri.findElement(By.xpath("//input[@name='user_name']"));
		    username.sendKeys("admin");
		    WebElement userpass=dri.findElement(By.xpath("//input[@name='user_password']"));
		    userpass.sendKeys("admin");
		   // dri.switchTo().frame("//select[@name='login_theme']");
		   //Select select=new Select(dri.findElement(By.xpath("//select[@name='login_theme']")));
		   //select.selectByValue("2");
		    WebElement login=dri.findElement(By.xpath("//input[@name='Login']"));
		    login.click();
	       System.out.println("Current URL  of the web page is:"+dri.getCurrentUrl());
	      
	      
	       /* dri.findElement(By.name("user_name")).sendKeys("admin");
	        dri.findElement(By.name("user_password")).sendKeys("admin");
	        dri.findElement(By.name("Login")).click();*/
	     dri.findElement(By.xpath("//a[text()='Marketing']")).click();
	    // System.out.println("Current URL  of the web page is:"+dri.getCurrentUrl());
	      dri.findElement(By.xpath("//a[text()='Sales']")).click();
	      dri.findElement(By.xpath("//a[text()='Support']")).click();
	      dri.findElement(By.xpath("//a[text()='Analytics']")).click();
	      dri.findElement(By.xpath("//a[text()='Inventory']")).click();
	      dri.findElement(By.xpath("//a[text()='Tools']")).click();
	      dri.findElement(By.xpath("//a[text()='Settings']")).click();
	      dri.findElement(By.xpath("//select[@id='qccombo']")).click();
	      //dri.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	      //dri.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("akash");
	      
	  
	   
	      
	       //dri.close();
		    //EDGE BROWSER LAUNCHING
	    /* System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Desktop\\MyFirstProject\\selenium\\driver1\\msedgedriver.exe");
	     EdgeDriver edge= new EdgeDriver();
	     edge.get("http://localhost:8888/");
	     edge.get("http://localhost:8888/");
	     edge.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	     edge.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	     edge.findElement(By.xpath("//input[@name='Login']")).click();
	     edge.findElement(By.xpath("<a href=\"index.php?module=Home&amp;action=index&amp;parenttab=My Home Page\">My Home Page</a>"));
	     edge.close();*/
		  
	
	}
}

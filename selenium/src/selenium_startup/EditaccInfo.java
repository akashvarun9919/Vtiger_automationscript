package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import oops_InheritanceConcepts.A;

public class EditaccInfo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Desktop\\MyFirstProject\\selenium\\driver1\\msedgedriver.exe");
	    EdgeDriver driver=new EdgeDriver();
	    driver.get("http://localhost:8888/");
	    By byobjname=By.name("user_name");
	    WebElement webusername=driver.findElement(byobjname);
	    webusername.sendKeys("admin");
	    By objpass=By.name("user_password");
	    WebElement webuserpass=driver.findElement(objpass);	
	    webuserpass.sendKeys("admin");
	    WebElement theme=  driver.findElement(By.name("login_theme"));
	    theme.sendKeys("bluelagoon");
	    theme.click();
	    By loginobj=By.name("Login");
	    WebElement websignin=driver.findElement(loginobj);
	    websignin.click();
	  
	    By marketingobj= By.linkText("Marketing");
	    WebElement webmarket= driver.findElement(marketingobj);
	    webmarket.click();
		WebElement account=driver.findElement(By.xpath("(//a[text()='Accounts'])[1]"));
	    account.click();
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("Akash varun");
		WebElement search=driver.findElement(By.xpath("//select[@name='search_field']"));
		search.sendKeys("Account Name");
		search.click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();//button
		WebElement selectaccobj=driver.findElement(By.xpath("(//a[text()='Akash varun'])[2]"));
		selectaccobj.click();
		//driver.findElement(By.xpath("(//input[@name=\"Edit\"])[1]")).click();
		// driver.findElement(By.xpath("(//input[@accesskey=\"D\"])[1]")).click();
		
		//selectaccobj.sendKeys("edit");
	
		//Thread.sleep(4000);
		 
        //WebElement editinfo=driver.findElement(By.xpath("(//input[@accesskey=\"D\"])[1]"));
	//	editinfo.sendKeys("Akash varun");
	//	editinfo.click();
	
	}

}

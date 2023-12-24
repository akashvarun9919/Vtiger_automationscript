package selenium_startup;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicConcept {

	public static void main(String[] args) {
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
	    WebElement createaccount= driver.findElement(By.xpath("//img[@title='Create Account...']"));
	    createaccount.click();
	    WebElement acname= driver.findElement(By.xpath("//input[@name='accountname']"));
	    acname.sendKeys("Ankit kumar");
	    driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.mycrmaccount.com");
	    driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("sensex_info");
	   
	    driver.findElement(By.xpath("//img[@alt='Select']")).click();
	   //driver.findElement(By.xpath("//a[text()='vtiger']")).click();
	   driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
	   WebElement groupobj= driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
	   groupobj.sendKeys("Support Group");
	   groupobj.click();
	   WebElement phoneobj=driver.findElement(By.xpath("//input[@id='phone']"));
	   phoneobj.sendKeys("9451962231");
	   driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("911-2543");
	   driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ankit415@gmail.com");
	  
	   driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("123,Main road modh bhadoi,ca,23451");
	   driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys("Near badhoi vidacolony pincode-231237");
	   driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys("Badhoi modh");
	   driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys("Utarpradesh");
	   driver.findElement(By.xpath("//input[@id='bill_code']")).sendKeys("123,main road modh pincode-231237");
	   driver.findElement(By.xpath("//input[@id='bill_country']")).sendKeys("India");
	   driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
	   driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Here written every thing is correct if you find any incorrect information cancel my account creation");
	   driver.findElement(By.xpath("(//b['More Information'])[4]")).click();
	   driver.findElement(By.xpath("//input[@id=\"otherphone\"]")).sendKeys("7985017292");
	   driver.findElement(By.xpath("//input[@id=\"email2\"]")).sendKeys("akash123@yahoo.co.in");
	   driver.findElement(By.xpath("//input[@id=\"employees\"]")).sendKeys("12367541");
	  WebElement rating= driver.findElement(By.xpath("//select[@name=\"rating\"]"));
	  rating.sendKeys("Active");
	  rating.click();
	  driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("30000");
	  WebElement industry=driver.findElement(By.xpath("//select[@name='industry']"));
	   industry.sendKeys("Engineering");
	   industry.click();
	   WebElement typeobj=driver.findElement(By.xpath("//select[@name=\"accounttype\"]"));
	   typeobj.sendKeys("Customer");
	   typeobj.click();
	   driver.findElement(By.xpath("//input[@name=\"notify_owner\"]")).click();
	   //driver.findElement(byobjname.xpath("(//input[@name='button'])[7]")).click();
	   //driver.findElement(By.xpath("(//input[@accesskey=\"D\"])[1]")).click();
	   System.out.println("hiii");
	   
	   
	   
	   
	   
	   
	   // By salesobj=By.linkText("Sales");
	   // WebElement websales=driver.findElement(salesobj);
	    //websales.click();
	}

}

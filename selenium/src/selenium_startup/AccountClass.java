package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		WebElement logtheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		logtheme.sendKeys("woodspice");
		logtheme.click();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Marketing'][1]")).click();
		driver.findElement(By.xpath("(//a[text()='Accounts'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Account...']")).click();		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Virat Kholi");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.Myaccount.com");
		driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("nifty_50");
		Thread.sleep(3000);
	   // driver.findElement(By.xpath("//img[@alt='Select']")).click();
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		//driver.findElement(By.xpath("//input[@value='T']")).sendKeys("Group");
		//driver.findElement(By.xpath("//input[@value='T']")).click();
		Thread.sleep(3000);
		WebElement group=driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		group.sendKeys("Support Group");
		//group.click();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

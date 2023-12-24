package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CampaignsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","driver1\\msedgedriver.exe" );
		EdgeDriver driver= new EdgeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		WebElement logtheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		logtheme.sendKeys("woodspice");
		logtheme.click();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Marketing'][1]")).click();		
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("Rahul Kumar");
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement group=driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		group.sendKeys("Support Group");
		group.click();
		WebElement none=driver.findElement(By.xpath("//select[@name='campaigntype']"));
		none.sendKeys("Others");
		none.click();
		
		
		
		
		
		
		
		
	}

	}



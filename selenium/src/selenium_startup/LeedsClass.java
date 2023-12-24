package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeedsClass {

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
	    theme.sendKeys("alphagrey");
	    theme.click();
	    By loginobj=By.name("Login");
	    WebElement websignin=driver.findElement(loginobj);
	    websignin.click();
	   
	    driver.findElement(By.xpath("//a[text()='Marketing']")).click();
	   
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
	    
	    driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();
		//driver.findElement(By.xpath("//img[@title=\"Open Calendar...\"]")).click();
		//driver.findElement(By.xpath("(//img[@src=\"themes/images/close.gif\"])[1]")).click();
        driver.findElement(By.xpath("//img[@title=\"Show World Clock...\"]")).click();
        driver.findElement(By.xpath("//img[@onclick=\"fninvsh('wclock')\"]")).click();
		WebElement mrobj=driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		mrobj.sendKeys("Mr.");
		//mrobj.click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Amit");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("TechMahendra");
		driver.findElement(By.xpath("//input[@id=\"designation\"]")).sendKeys("Administrative");
		WebElement source=driver.findElement(By.xpath("//select[@name=\"leadsource\"]"));
		source.sendKeys("Employee");
		source.click();
		WebElement status=driver.findElement(By.xpath("//select[@name=\"leadstatus\"]"));
		status.sendKeys("Contacted");
		status.click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9838786651");
		driver.findElement(By.xpath("//input[@id=\"fax\"]")).sendKeys("911-2543");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akash415@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"assigntype\"][2]")).click();
		WebElement group=driver.findElement(By.xpath("//select[@name=\"assigned_group_id\"]"));
		group.sendKeys("Team Selling");
		group.click();
		driver.findElement(By.xpath("//textarea[@name=\"lane\"]")).sendKeys("AmitKumar, House No-449,Street-Naibasti Road Muglsarai");
		driver.findElement(By.xpath("//input[@name=\"code\"]")).sendKeys("Postal Code-232101");
		driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id=\"pobox\"]")).sendKeys("PO-Chandasi Mugalsarai");
		driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Mugalsarai");
		driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Uttar Pradesh");
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("I hereby declaire all the information given is true and correct to the best of my knowledge ");
		driver.findElement(By.xpath("//td[@id='mi']")).click();
		WebElement industry=driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		industry.sendKeys("Engineering");
		industry.click();
		driver.findElement(By.xpath("//img[@title=\"Open Calculator...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"annualrevenue\"]")).sendKeys("20000");
	    WebElement rate=driver.findElement(By.xpath("//select[@name=\"rating\"]"));
		rate.sendKeys("Ative");
		rate.click();
		driver.findElement(By.xpath("//input[@name=\"website\"]")).sendKeys("www.Myinfo.com");
		driver.findElement(By.xpath("//input[@name=\"noofemployees\"]")).sendKeys("103");
		driver.findElement(By.xpath("//input[@name=\"yahooid\"]")).sendKeys("amit1_ind@yahoo.co.in");
		driver.findElement(By.xpath("//img[@onclick=\"fninvsh('calc')\"]")).click();
		//driver.findElement(By.xpath("(//input[@name=\"button\"])[3]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

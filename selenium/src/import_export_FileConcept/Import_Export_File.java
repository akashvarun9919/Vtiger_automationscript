package import_export_FileConcept;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Import_Export_File {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("remote-allow-origins=*");
//		Map<String,Object> pref= new HashMap<String,Object>();
//		pref.put("downlod.prompt_for_download", false);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();
//		driver.findElement(By.xpath("//img[@title='Export Accounts']")).click();
//		driver.findElement(By.name("Export")).click();
		driver.findElement(By.xpath("//img[@title='Import Accounts']")).click();
		driver.findElement(By.name("userfile")).sendKeys("C:\\Users\\Dell\\Documents\\rohitomega.csv");
		driver.findElement(By.xpath("//input[@title='Next']")).click();
		driver.findElement(By.xpath("//input[@id='saved_map_checkbox']")).click();
		
		driver.findElement(By.xpath("//select[@id='colnum0']")).sendKeys("Account Name");
		driver.findElement(By.xpath("//select[@id='colnum2']")).sendKeys("Website");
		driver.findElement(By.xpath("//select[@id='colnum3']")).sendKeys("Phone");
		driver.findElement(By.xpath("//select[@id='colnum8']")).sendKeys("Employees");
		driver.findElement(By.xpath("//select[@id='colnum9']")).sendKeys("Email");
		driver.findElement(By.xpath("//select[@id='colnum12']")).sendKeys("Industry");
		driver.findElement(By.xpath("//select[@id='colnum16']")).sendKeys("Email Opt Out");
		driver.findElement(By.xpath("//select[@id='colnum17']")).sendKeys("Annual Revenue");
		driver.findElement(By.xpath("//select[@id='colnum18']")).sendKeys("Assigned To");
		driver.findElement(By.xpath("//select[@id='colnum26']")).sendKeys("Billing City");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Finished']")).click();
		
	}

}

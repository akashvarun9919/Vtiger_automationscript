package selenium_startup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check {
public static void main(String[] args) {
	
	
	
	 System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 
	 driver.get("http://localhost:8888/");
	 
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	
	WebElement colortheme= driver.findElement(By.xpath("//select[@name='login_theme']"));
	 Select selectobj=new Select(colortheme);
	 WebElement allcolortheme= driver.findElement(By.xpath("//select[@name='login_theme']//option"));
	 List<WebElement>alllistOptions=selectobj.getOptions();
	 int a=alllistOptions.size();
	 System.out.println(a);
	 for(int i=0;i<=alllistOptions.size()-1;i++) {
		 WebElement getalllistOptions=alllistOptions.get(i);
		 String ViewallOptions= getalllistOptions.getText();
		 System.out.println(ViewallOptions); 
	 }
	 
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	
	
	// WebElement wet= driver.findElement(By.xpath("//*[@id=\"headerrow_15\"]/td[3]/img[2]"));
	   WebElement wet= driver.findElement(By.xpath("(//img[(@title='Edit [Alt+E]')])[2]"));
	   boolean status= wet.isEnabled();
	   System.out.println(status);
	   if(status==true) {
		   System.out.println("passed");
	   }else {
		   System.out.println("failed");

	   }
	
	
}
}

package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UltimateClass {

	public static void main(String[] args) {
     System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Desktop\\MyFirstProject\\selenium\\driver1\\msedgedriver.exe");
      EdgeDriver driver= new EdgeDriver();
      driver.get("https://courses.ultimateqa.com/");
     WebElement sininobj=driver.findElement(By.linkText("Sign In"));
     sininobj.click();
    WebElement nameobj= driver.findElement(By.id("user[email]"));
    nameobj.sendKeys("theycallmeRoshan@yopmail.com");
    WebElement passobj=driver.findElement(By.id("user[password]"));
    passobj.sendKeys("Viratians-VK-18");
   WebElement checkboxobj= driver.findElement(By.id("user[remember_me]"));
    checkboxobj.click();
   WebElement buttonobj= driver.findElement(By.xpath("//button[@type='submit']"));
      buttonobj.click();
      
      
      
      
      
      
      
	}

}

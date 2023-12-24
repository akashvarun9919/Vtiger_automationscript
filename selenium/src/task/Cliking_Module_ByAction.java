package task;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cliking_Module_ByAction {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("http://localhost:8888/");
     driver.findElement(By.name("user_name")).sendKeys("admin");
     driver.findElement(By.name("user_password")).sendKeys("admin");
     driver.findElement(By.name("Login")).click();
     Actions act= new Actions(driver);
     List<WebElement> mainModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
     for(int i=0;i<mainModule.size();i++) {
    	 mainModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
    	 WebElement wemainModule=mainModule.get(i);
    	 String mainModuletext=wemainModule.getText();
         System.err.println(mainModuletext);
    	Thread.sleep(1000);
         act.moveToElement(wemainModule).build().perform();
    if(i==0) {
         List<WebElement> homePagemodule=driver.findElements(By.xpath("//div[@id='My Home Page_sub']//a"));
         for (int j = 0; j < homePagemodule.size(); j++) {
        	 mainModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
        	 wemainModule=mainModule.get(i);
        	 act.moveToElement(wemainModule).build().perform();
        	 homePagemodule=driver.findElements(By.xpath("//div[@id='My Home Page_sub']//a"));
        	 WebElement wehomemodule=homePagemodule.get(j);
             String strwehomemodule= wehomemodule.getText();
        	 System.out.println(strwehomemodule);
        	 Thread.sleep(200);
        	 act.moveToElement(wehomemodule).click().build().perform();
         }
	}
    else {
    	List  <WebElement> subModule=driver.findElements(By.xpath("//div[@id='"+mainModuletext+"_sub']//a"));
    	Thread.sleep(200);
    	for (int j = 0; j < subModule.size(); j++) {
    		 mainModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
        	 wemainModule=mainModule.get(i);
        	 act.moveToElement(wemainModule).build().perform();
        	 subModule=driver.findElements(By.xpath("//div[@id='"+mainModuletext+"_sub']//a"));
             WebElement wesubModule=subModule.get(j);
        	 String subModuleText= wesubModule.getText();
        	 System.out.println(subModuleText);
        	 act.moveToElement(wesubModule).click().build().perform();
        	 Thread.sleep(1000);
             
    		
    		
    		
    		
    		
			
		}
    	
    	
    	
    	
    }
     }
     
     
     
     
	}
     
     
     
     
	}



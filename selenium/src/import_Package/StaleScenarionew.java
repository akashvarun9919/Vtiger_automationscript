package import_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleScenarionew {
 
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/ ");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		
		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		
		WebElement weLoginButton=driver.findElement(By.xpath("//input[@name='Login']"));
		weLoginButton.click();
		
		//approch3 use findElements
		List<WebElement> weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
		int elementCount=weListOfModule.size();
		
		for(int i=0;i<=elementCount-1; i++ ) {
			weListOfModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			WebElement weTabLink=weListOfModule.get(i);
			String moduleText=weTabLink.getText();
			weTabLink.click();
			List<WebElement> listSubModules = driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
			int subModuleCount=listSubModules.size();
			for(int j=0; j<=subModuleCount-1;j++) {
				listSubModules = driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
				WebElement weSubModule=listSubModules.get(j);
				String subModuleText=weSubModule.getText();
				weSubModule.click();
				String expectedPageHeader=moduleText+" > "+subModuleText;
				///  ampersand 
				////  vertical line -  pipe line
			
				 List<WebElement> listPageHeader =  driver.findElements(By.xpath("//td[@class='moduleName']"));
				 if(listPageHeader.size()==0) {
					 continue;
				 }
				 WebElement wePageHeader=listPageHeader.get(0);
				String actualPageHeader = wePageHeader.getText();
			       if(actualPageHeader.equalsIgnoreCase(expectedPageHeader)) {
			    	   System.out.println("Passed. For Module-" +moduleText+" and SubModule-"+subModuleText);
			       }else {
			    	   System.out.println("Failed. For Module-" +moduleText+" and SubModule-"+subModuleText);    	   
			       }
			
			}
			
		}
		
		
		
		
		///// When we are using findElement method and getting WebElement Object 
		///  and after that if we are doing some action that is refreshing or changing the page
		//  then already created webelement object will be useless and it will throw stale element refrence exception
		
		////  when this exception will come, before using this webelement object we will use
		///  driver.findElement again so it will search again and it will have fresh refernece
		/// and now it will work
		
		
		
		
		
		
		
	}

}

package import_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleScenario {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/ ");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		
		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		
		WebElement weLoginButton=driver.findElement(By.xpath("//input[@name='Login']"));
		weLoginButton.click();
		
		
		List<WebElement> weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
		int elementCount=weListOfModule.size();
		
		for(int i=0;i<=elementCount-1; i++ ) {
		
			weListOfModule=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			WebElement weTabLink=weListOfModule.get(i);
			String mainmoduletext=weTabLink.getText();
			Dimension dim=weTabLink.getSize();
			System.out.println("Text and Size of Mainmodule -->"+mainmoduletext+"--"+dim.getHeight()+","+dim.getWidth());
			weTabLink.click();
		
			List<WebElement> weListSubModule =driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
			int subElementCount=weListSubModule.size();
			int total_tabs=weListSubModule.size();
			System.out.println("No. of Submodule in "+mainmoduletext +" --> "+total_tabs);
			for(int j=0;j<=subElementCount-1;j++) {
			weListSubModule =driver.findElements(By.xpath("//table[@class='level2Bg']//a"));
			WebElement weSubTabLink=weListSubModule.get(j);
			String submoduleText=weSubTabLink.getText();
			Dimension tab_Size=weSubTabLink.getSize();
			System.out.println("Text and Size of submodule -->"+submoduleText+"--"+tab_Size);
			weSubTabLink.click();
		    String exp_headerTitleText=mainmoduletext+" > "+submoduleText;
//          approch1-findelement
//			if("Module Manager".equalsIgnoreCase(subText)||"settings".equalsIgnoreCase(subText)||"webmail".equalsIgnoreCase(subText)) {
//				System.out.println("Header Text is not Available in Submodule page");
//			}else {
//				weSubTabLink.click();
//			headerTitleText=driver.findElement(By.xpath("//td[@class='moduleName']"));
//			String actual_headerText=headerTitleText.getText();
//			System.out.println("Text of submodule Header -->"+actual_headerText);
//			
//			if(actual_headerText.equalsIgnoreCase(exp_headerTitleText)) {
//				System.out.println("Passed :Header Text is visibled correct. Where expected text is "+exp_headerTitleText+" and Actual text "+actual_headerText);
//			}else {
//				System.out.println("Failed :Header Text is visibled incorrect. Where expected text is "+exp_headerTitleText+" and Actual text "+actual_headerText);
//			}
//          approch2-findelements
			List<WebElement> headerTitleText=driver.findElements(By.xpath("//td[@class='moduleName']"));

		    if(submoduleText.equalsIgnoreCase("webmail")==false && submoduleText.equalsIgnoreCase("settings")==false && submoduleText.equalsIgnoreCase("module manager")==false) {
				System.out.println("Passed. For Module-"+mainmoduletext+" and submaodule-"+submoduleText);
			}else {
				System.out.println("Failed. For Module-"+mainmoduletext+" and submaodule-"+submoduleText);
			}		

		 
			}	
		}
		
		
		
		
		
		
	}

}

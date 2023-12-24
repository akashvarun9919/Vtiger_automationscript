package prcatice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Modules_ByAction {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/ ");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		Actions act_Obj = new Actions(driver);
		WebElement weLoginButton = driver.findElement(By.xpath("//input[@name='Login']"));
		weLoginButton.click();

		List<WebElement> weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));

		for (int i = 0; i < weListOfModule.size(); i++) {
			weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			WebElement weModule = weListOfModule.get(i);
			String moduletext = weModule.getText();
			System.out.println(moduletext);
			Thread.sleep(500);
			act_Obj.moveToElement(weModule).build().perform();
		if(i==0) {
			
			List<WebElement> ListSubModule = driver.findElements(By.xpath("//div[@id='My Home Page_sub']//a"));
			for(int k=0;k<ListSubModule.size();k++) {
				weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			    weModule = weListOfModule.get(i);
				act_Obj.moveToElement(weModule).build().perform();
				ListSubModule = driver.findElements(By.xpath("//div[@id='My Home Page_sub']//a"));
				WebElement weSubModule=ListSubModule.get(k);
				String strText=weSubModule.getText();
				System.out.println(strText);
				act_Obj.moveToElement(weSubModule).click().build().perform();
			}
			}	
		
			else {
				
			
			List<WebElement> weListSubModule = driver.findElements(By.xpath("//div[@id='" + moduletext + "_sub']//a"));
			Thread.sleep(200);
			
			for (int j = 0; j <= weListSubModule.size() - 1; j++) {
			weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			weModule=weListOfModule.get(i); 
			act_Obj.moveToElement(weModule).build().perform();
				weListSubModule = driver.findElements(By.xpath("//div[@id='" + moduletext + "_sub']//a"));
				WebElement weSubTabLink = weListSubModule.get(j);
				String submoduleText = weSubTabLink.getText();
				
				System.out.println(submoduleText);
				act_Obj.moveToElement(weSubTabLink).click().build().perform();

				Thread.sleep(200);
			}
			
			
		}
	}
	}
}
//table[@class='level2Bg']//a
//div[@id='" + moduletext + "_sub']//a
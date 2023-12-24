package prcatice_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New_Vtiger_ClassWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		WebElement color_Theme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select sc_ColorObj=new Select(color_Theme);
		sc_ColorObj.selectByVisibleText("alphagrey");
		WebElement language_Theme=driver.findElement(By.xpath("//select[@name='login_language']"));
		Select sc_LanguageObj=new Select(language_Theme);
		sc_LanguageObj.selectByVisibleText("US English");
		driver.findElement(By.name("Login")).click();
		
		//8 elements....
		List<WebElement> myHomepAGE=driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
		
		for(int i=0;i<=myHomepAGE.size()-1;i++) {
		WebElement actualtagname=myHomepAGE.get(i);
		String list=actualtagname.getText();
		System.out.println("List of Elements ->"+list);
		}
		Actions acObj=new Actions(driver);
		WebElement marketing=driver.findElement(By.linkText("Marketing"));
		acObj.moveToElement(marketing).build().perform();
		WebElement leads=driver.findElement(By.linkText("Leads"));
		acObj.moveToElement(leads).click().build().perform();
		List<WebElement> listof_AtoZ=driver.findElements(By.xpath("//td[contains(@onclick,'alphabetic')]"));
		for(int i=0;i<=listof_AtoZ.size()-1;i++) {
		WebElement list_ofAZ=listof_AtoZ.get(i);
		String listAtoZ=list_ofAZ.getText();
		System.out.println("List of text A to Z->"+listAtoZ);
		
		}
	}

}

package prcatice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class Frame_Concept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();

		driver.navigate().to("https://www.tatacliq.com/?cid=ps:Tata_Brand_Top_Regions_12102022:google:TopRegions_Exact:brand&gclid=EAIaIQobChMI1IiFoKzvgAMVvplmAh0PggHMEAAYASAAEgKJU_D_BwE&gclsrc=aw.ds");
	    
		Thread.sleep(4000);
		WebElement qr_Code=driver.findElement(By.xpath("//iframe[@id='wiz-iframe']"));
		driver.switchTo().frame(qr_Code);
		WebElement qr_Text=driver.findElement(By.xpath("//div[@class='wzrkPPtitle']"));
		String strtext=qr_Text.getText();
		System.out.println(strtext);
	   
       
		
		
		
		
//		driver.get("http://localhost:8888/");
		
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.name("Login")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Gmail Bookmarklet']")).click();
//	 
//		List<WebElement> iframe1= driver.findElements(By.xpath("//iframe[@id='__vtigerBookmarkletFrame__']"));
//		WebElement weframe=iframe1.get(0);
//		driver.switchTo().frame(weframe);
//		WebElement subject=driver.findElement(By.xpath("//input[@id='subject']"));
//		subject.clear();
//		subject.sendKeys("i am akash");
		
		
		
		
		
	}

}

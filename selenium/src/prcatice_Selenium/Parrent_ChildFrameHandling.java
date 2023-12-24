package prcatice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parrent_ChildFrameHandling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://letcode.in/frame");
	    
		Thread.sleep(1000);
	//swich to frame...
	 WebElement frameParrent=driver.findElement(By.xpath("//iframe[@id='firstFr']"));
	 driver.switchTo().frame(frameParrent);
	 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("admin");
	//swich to child frame...
	 WebElement frameChild=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	 driver.switchTo().frame(frameChild);
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maheshbabu@123");
	//swich to parrent frame...
	 driver.switchTo().parentFrame();
	 WebElement firstFrameTex=driver.findElement(By.xpath("//h1[@class='title']"));
	 String frametext=firstFrameTex.getText();
	 System.out.println(frametext);
	//swicth to main frame..
	 driver.switchTo().defaultContent();
	 WebElement insighttext=driver.findElement(By.xpath("//p[@class='card-header-title']"));
	 String strtext= insighttext.getText();
	 System.out.println(strtext);
	}

}

package prcatice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(200);
		WebElement Left =driver.findElement(By.xpath("//frame[@name='frame-top']"));
		Thread.sleep(200);
		driver.switchTo().frame(Left);
		Thread.sleep(200);

		WebElement frameLeft =driver.findElement(By.xpath("//frame[@name='frame-left']"));
		Thread.sleep(200);
		driver.switchTo().frame(frameLeft);
		String strLefttext=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(strLefttext);
		
		driver.switchTo().parentFrame();
       
		WebElement framemiddile =driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		Thread.sleep(200);
		driver.switchTo().frame(framemiddile);
		String strmiddletext=driver.findElement(By.xpath("//body//div[text()='MIDDLE']")).getText();
		System.out.println(strmiddletext);
       	
		driver.switchTo().parentFrame();
		
		WebElement frameRight =driver.findElement(By.xpath("//frame[@name='frame-right']"));
		Thread.sleep(200);
		driver.switchTo().frame(frameRight);
		String strRighttext=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(strRighttext);
	
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement bottom =driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		Thread.sleep(200);
		driver.switchTo().frame(bottom);
		Thread.sleep(200);


		String strBottomtext=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(strBottomtext);
	
	
	
	
	
	}
	
	
	
	

}

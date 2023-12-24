package prcatice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "driver1\\msedgedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	    driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("5g Mobile phone  ");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	    Thread.sleep(2000);
	    
	   List <WebElement> mobiles_5G = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	    for(int i=1;i<mobiles_5G.size();i++) {
	    	WebElement weMobiles=mobiles_5G.get(i);
	    	String strlistMobbiles=weMobiles.getText();
	    	String splitPrice=strlistMobbiles.replaceAll("[0-9]","");
	    	System.out.println(splitPrice);
	   
	    }
	   
	
	}

}

package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Array_Object_inSelenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
		ChromeDriver c2=new ChromeDriver();
		ChromeDriver c3=new ChromeDriver();
		ChromeDriver c4=new ChromeDriver();
		ChromeDriver[] cDArr= new ChromeDriver[4];
//		ChromeDriver[] cDAr= {c4,c2,c3,c1};
		
		cDArr[0]=c2;
		cDArr[1]=c1;
		cDArr[2]=c4;
		cDArr[3]=c3;
		for(int i=0;i<=cDArr.length-1;i++) {
		ChromeDriver cObj=cDArr[i];
		
		cObj.get("http://localhost:8888/");
		Actions act_obj=new Actions(c4);
		act_obj.sendKeys("admin").build().perform();
		act_obj.sendKeys(Keys.TAB,"admin").build().perform();
		act_obj.sendKeys(Keys.TAB.ENTER).build().perform();
		
	}
	}
}

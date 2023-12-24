package prcatice_Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoundDuplicateValueFromList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver dri=new ChromeDriver();
			dri.get("http://localhost:8888/");
	        
			//automate Login page
			dri.findElement(By.name("user_name")).sendKeys("admin");
			dri.findElement(By.name("user_password")).sendKeys("admin");
			dri.findElement(By.name("Login")).click();
		
		
        List<WebElement> weListOfModule = dri.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
	    ArrayList<String> beforeSortedDuplicateSubTabList= new ArrayList<String> ();
	   
	    HashSet<String> afterSortedDuplicateSubTabList= new HashSet<String>();
	    
            int elementCount=weListOfModule.size();
	     	for(int i=0;i<=elementCount-1; i++ ) {
			weListOfModule=dri.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			WebElement weTabLink=weListOfModule.get(i);
			String text=weTabLink.getText();
			weTabLink.click();
		
			List<WebElement> weListSubModule =dri.findElements(By.xpath("//table[@class='level2Bg']//a"));
            	
			int subElementCount=weListSubModule.size();
     		for(int j=0;j<=subElementCount-1;j++) {
			weListSubModule =dri.findElements(By.xpath("//table[@class='level2Bg']//a"));
			WebElement weSubTabLink=weListSubModule.get(j);
			String subText=weSubTabLink.getText();
			weSubTabLink.click();
			beforeSortedDuplicateSubTabList.add(subText);
		
			afterSortedDuplicateSubTabList.add(subText);   
     		
     		}
     	}	     	
	  	   System.out.println("Before sorting sublist");
	       System.out.println(beforeSortedDuplicateSubTabList);
//		   System.out.println("After sorting ascending order sublist");
//	       Collections.sort(aftershortedsubtabList);
//		   System.out.println(aftershortedsubtabList);
		   Thread.sleep(500);
	     	boolean flag= false;
			for(String dup:afterSortedDuplicateSubTabList) {

				if(afterSortedDuplicateSubTabList.add(dup)==false) {
					System.out.println("Found Duplicate Element:"+dup);
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Not Found Duplicate Element");
		}
	
	
	
	}

}

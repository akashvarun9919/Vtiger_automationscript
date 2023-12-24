package prcatice_Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ArrayListShorting_Option {

	public static void main(String[] args) {
		// System.setProperty("webdriver.edge.driver", "driver1\\msedgedriver.exe");//sessionnotcreatedexcption
		//EdgeDriver dri=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver dri=new ChromeDriver();
			dri.get("http://localhost:8888/");
	        
			//automate Login page
			dri.findElement(By.name("user_name")).sendKeys("admin");
			dri.findElement(By.name("user_password")).sendKeys("admin");
			List <WebElement> colortheme_list=dri.findElements(By.xpath("//select[@name='login_theme']//option"));
		
			ArrayList<String> orignalcolortheme=new ArrayList<>();
			ArrayList<String> shortingcolortheme=new ArrayList<>();
			
			for(int i=0;i<colortheme_list.size();i++) {
				WebElement colortheme_get=colortheme_list.get(i);
				String list_ofthemecolor=colortheme_get.getText();
				orignalcolortheme.add(list_ofthemecolor);
				shortingcolortheme.add(list_ofthemecolor);
			}	
			System.out.println("Before shorting..........colorlist");
			System.out.println(orignalcolortheme);
			System.out.println("After shorting ascending order...........colorlist");
			Collections.sort(shortingcolortheme);
			System.out.println(shortingcolortheme);
			if(orignalcolortheme.equals(shortingcolortheme)) {
				System.out.println("The Color list is shorted ascending order");
			}else {
				System.out.println("The Color list is unshorted ascending order");
			}
			List <WebElement> languagetheme_list=dri.findElements(By.xpath("//select[@name='login_language']//option"));
			ArrayList<String> orignallanguagetheme=new ArrayList<>();
			ArrayList<String> shortinglanguagetheme=new ArrayList<>();
			
			for(int i=0;i<languagetheme_list.size();i++) {
				WebElement languagetheme_get=languagetheme_list.get(i);
				String list_ofthemelanguage=languagetheme_get.getText();
				orignallanguagetheme.add(list_ofthemelanguage);
				shortinglanguagetheme.add(list_ofthemelanguage);
			}	
				System.out.println("Before shorting..........Languagelist");
			System.out.println(orignallanguagetheme);
			    System.out.println("After shorting ascending order...........Languagelist");
			Collections.sort(shortinglanguagetheme);
			System.out.println(shortinglanguagetheme);
			if(orignallanguagetheme!=shortinglanguagetheme) {
				System.out.println("The Language list is shorted ascending order");
			}else {
				System.out.println("The Language list is unshorted ascending order");
			}
			
			dri.findElement(By.name("Login")).click();

		
			// pass list<WebElement> Tab links text to ArrayList..
			List <WebElement> tabList=dri.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			ArrayList<String> newTabList= new ArrayList<String>();
			ArrayList<String> shortingTabList= new ArrayList<String>();
			for(int i=0;i<tabList.size();i++) {
				WebElement new_TabList=tabList.get(i);
				String tab_store=new_TabList.getText();
				newTabList.add(tab_store);
				shortingTabList.add(tab_store);

				
				}
	        System.out.println("Before shorting TabLinks...........");
	        System.out.println(newTabList);
	        System.out.println("After shorting ascending order TabLinks............");
	        Collections.sort(shortingTabList);
	        System.out.println(shortingTabList);
	     
	       
	        List<WebElement> weListOfModule = dri.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
		    ArrayList<String> beforesortedsubtablist= new ArrayList<String> ();
		    ArrayList<String> aftershortedsubtabList= new ArrayList<String>();

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
				beforesortedsubtablist.add(subText);
				aftershortedsubtabList.add(subText);
//				   boolean flag=false;
//					for(String dup:beforesortedsubtablist) {
//						  
//						if(beforesortedsubtablist.add(dup)==false) {
//							System.out.println("Found Duplicate Element:"+dup);
//							flag=true;
//						}
//					}
//					if(flag==false) {
//						System.out.println("Not Found Duplicate Element");
//					}
				aftershortedsubtabList.add(subText);
				weSubTabLink.click();
	}
		     
			}
		     	
		     	
		  	   System.out.println("Before sorting sublist");
		       System.out.println(beforesortedsubtablist);
			   System.out.println("After sorting ascending order sublist");
		       Collections.sort(aftershortedsubtabList);
			   System.out.println(aftershortedsubtabList);
			
	
	}
}
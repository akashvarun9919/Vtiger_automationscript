package automate_AllMainComponent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Marketing_Campagain {

	public static void main(String[] args) {
    System.setProperty("webdriver.edge.driver", "driver1\\msedgedriver.exe");
        EdgeDriver dri=new EdgeDriver();
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
		    System.out.println("After shorting...........colorlist");
		Collections.sort(shortingcolortheme);
		System.out.println(shortingcolortheme);
		if(orignalcolortheme.equals(shortingcolortheme)) {
			System.out.println("The Color list is shorted");
		}else {
			System.out.println("The Color list is unshorted");
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
		    System.out.println("After shorting...........Languagelist");
		Collections.sort(shortinglanguagetheme);
		System.out.println(shortinglanguagetheme);
		if(orignallanguagetheme!=shortinglanguagetheme) {
			System.out.println("The Language list is shorted");
		}else {
			System.out.println("The Language list is unshorted");
		}
		
		dri.findElement(By.name("Login")).click();

	
		// pass list<WebElement> Tab links text to ArrayList..
		List <WebElement> tabList=dri.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
		ArrayList<String> newTabList= new ArrayList<String>();
		for(int i=0;i<tabList.size();i++) {
			WebElement new_TabList=tabList.get(i);
			String tab_store=new_TabList.getText();
			newTabList.add(tab_store);
			System.out.println(tab_store);
//		for(WebElement newlist:tabList) {
//			String listtab=newlist.getText();
//		    System.out.println(listtab);
		}
	
		
		/*		//Homepage of Marketing links.
		Actions act_Obj=new Actions(dri);
		WebElement marketing_Link=dri.findElement(By.linkText("Marketing"));
		act_Obj.moveToElement(marketing_Link).build().perform();
		//Click on Campaigans.
		WebElement Campaigns_Link=dri.findElement(By.linkText("Campaigns"));
		act_Obj.click(Campaigns_Link).build().perform();*/
	}
    
}

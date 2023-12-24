package prcatice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkbox_Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver dri=new ChromeDriver();
		dri.navigate().to("http://localhost:8888/");
		dri.findElement(By.name("user_name")).sendKeys("admin");
		dri.findElement(By.name("user_password")).sendKeys("admin");
		dri.findElement(By.name("Login")).click();
		Actions act_obj=new Actions (dri);
		WebElement sales=dri.findElement(By.linkText("Sales"));
		act_obj.moveToElement(sales).build().perform();
		dri.findElement(By.linkText("Accounts")).click();
		
	//   check all the checkbox and verify header checkbox should be checked. 
//		WebElement checkbox=dri.findElement(By.xpath("//input[@name='selected_id']"));
		for(int i=1;i<=12;i++) {
			dri.findElement(By.xpath("(//input[@name='selected_id'])["+ i +"]")).click();  
		}
		WebElement hedercheckbox=dri.findElement(By.xpath("//input[@name='selectall']"));
		boolean Checked_hedercheckbox=hedercheckbox.isSelected();
		if(Checked_hedercheckbox==true) {
			System.out.println("Passed - Header checkbox is checked");
		}else {
			System.out.println("Failed - Header checkbox is unchecked");
		}
		 //   uncheck header checkbox and verify all the checkbox should be unchecked. 
		hedercheckbox.click();
		boolean unchecked_checkbox=hedercheckbox.isSelected();
		if(unchecked_checkbox==false) {
			System.out.println("Passed - All checkbox is unchecked");
		}else {
			System.out.println("Failed - All checkbox is checked");
		}
		 //   check header checkbox and verify all the checkbox should be checked. 
		hedercheckbox.click();
		boolean allcheckbox_Checked=hedercheckbox.isSelected();
		if(allcheckbox_Checked==true) {
			System.out.println("Passed - All checkbox is checked");
		}else {
			System.out.println("Failed - All checkbox is unchecked");
		}
		
		
		
		
	}

}

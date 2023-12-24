package import_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fresh {

	//// print text of all the tab links
	
	
	public static void main(String[] args) {

		/// do Login
		/// navigate to Marketing accounts page
		/// check all the table data checkboxes - verify header checkbox is checked
		System.setProperty("webdriver.chrome.driver",
				"Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/ ");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.clear();
		weUserName.sendKeys("admin");
		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();
		//check all table checkbox and verify header checkbox should be checked.
		List<WebElement> listCheckboxes=driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		int checkboxCount=listCheckboxes.size();
		for(int i=0; i<=checkboxCount-1;i++) {
			WebElement weCheckbox=listCheckboxes.get(i);
			weCheckbox.click();
		}
		boolean expectedStatus=true;
		WebElement header_actualStatus=driver.findElement(By.xpath("//input[@name='selectall']"));
		boolean actualStatus=header_actualStatus.isSelected();
		if(actualStatus==expectedStatus) {
			System.out.println("Passed. Header checkbox is automatically checked");
		}else {
			System.out.println("Failed. Header checkbox is not checked");

		}
		
		///// uncheck header checkbox and verify that all the table data checkboxs should be unchecked.
		header_actualStatus.click();
		

		for(int i=0;i<checkboxCount;i++) {
		boolean actual_WeUncheckboxes=listCheckboxes.get(i).isSelected();
		System.out.println(actual_WeUncheckboxes);
		boolean expected_WeUncheckboxes=false;
		if(actual_WeUncheckboxes==expected_WeUncheckboxes) {
			System.out.println("Passed. Table data checkbox is automatically unchecked");
		}else {
			System.out.println("Failed. Table data checkbox is checked");
		}
		}
		
		/////  check header checkbox and verify that all the table data checkboxes should be checked
		header_actualStatus.click();
		for(int i=0;i<checkboxCount;i++) {
		boolean act_allChecked_Chekbox= listCheckboxes.get(i).isSelected();
		boolean exp_allChecked_Chekbox=true;
		if(act_allChecked_Chekbox==exp_allChecked_Chekbox) {
			System.out.println("Passed. Table data checkbox is automatically checked");
		}else {
			System.out.println("Failed. Table data checkbox is unchecked");
		}
		}
//		for(int i=1; i<=checkboxCount;i++) {
//			WebElement weCheckbox=driver.findElement(By.xpath("(//input[@name='selected_id'])["+i+"]"));
//		    weCheckbox.click();
//		}
		
		
		///  We have to write xpath or locator and 
		/// that xpath should match with those elements on which we want to work
		/// but that xpath should not match with those elements on which we dont want to work
		
	
	}
	
	
	
	
	public static void homePageLinkScenario() {
		// do login
		// print text of all the non blank links on home page
		/// get count of all blank links and all non blank links separately 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\eclipse-java-2022-12-R-win32-x86_64\\eclipse\\Software Testing\\seleniuminstallation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/ ");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.clear();
		weUserName.sendKeys("admin");
		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		List<WebElement> weLinks=driver.findElements(By.xpath("//a"));  //  255 WebElement Object 2040 byte
	
		//WebElement we=driver.findElement(By.xpath("//abc"));  // 8 byte
		///  * any tag
		int blankCounter=0;
		int nonBlankCounter=0;
		int elementCount=weLinks.size();
		System.out.println(elementCount);
		for(int i=0; i<=elementCount-1; i=i+1) {
			
			WebElement element=weLinks.get(i);
			
			String text=element.getText();
			boolean status=text.equals("");
			if(status==true) {
				blankCounter=blankCounter+1;
			}else {
				nonBlankCounter=nonBlankCounter+1;
				System.out.println(text);
			}
		}
		
		System.out.println(blankCounter);
		System.out.println(nonBlankCounter);
		
		
		System.out.println("");
		
 //1) findElement searches element on page and returning 1 element object
  //   if it will find multiple elements even then it will return first element only
  
		// 1) findElements searches and will return all the element from the html page as per xpath
		 //     it can have multiple elements that's why it returns List<WebElement>
		
	// 2 - if xpath is wrong - findElement will throw NoSuchElementException and execution will be stop	
	/// 2- if xpath is wrong - findELements will not throw exception it will give List but that list will be empty
	
	}
	
	
	

}

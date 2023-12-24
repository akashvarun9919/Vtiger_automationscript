package prcatice_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTab_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver\\\\\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		String hndlVal1=driver.getWindowHandle();
        System.out.println(hndlVal1);

		driver.get("http://localhost:8888");
		

		/// when selenium launches browser then it gives a handle value
		///  to the browser

		///  Handle Value

		WebElement weuserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement weUserPass = driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPass.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
        //window handle feedback
		driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		
	    Set<String> handleWindow=driver.getWindowHandles();
	    for(String strFeedBack:handleWindow) {
	    driver.switchTo().window(strFeedBack);
	    String titleTextfeedback=driver.getTitle();
	    if(titleTextfeedback.equalsIgnoreCase(""))
	    break;
	    }
	    // sendkey value on feedback window element 
	    WebElement weFeedBackSummary=driver.findElement(By.xpath("//input[@name='subject']"));
	    weFeedBackSummary.clear();
	    weFeedBackSummary.sendKeys("My FeedBack for CRM");
	    WebElement weFeedBackDescription=driver.findElement(By.xpath("//textarea[@name='description']"));
	    weFeedBackDescription.clear();
	    weFeedBackDescription.sendKeys("It is very good for Automation Practice");
	    //window handle homepage page element..
	    handleWindow=driver.getWindowHandles();
	    for(String strFeedBack:handleWindow) {
	    driver.switchTo().window(strFeedBack);
	    String homePageTitle=driver.getTitle();
	    if(homePageTitle.equals("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"));
	    break;
	    }
	    // click on marketing link..
	    driver.findElement(By.linkText("Marketing")).click();
	    // handle help tab...window
	    driver.findElement(By.xpath("//a[text()='Help']")).click();
	    handleWindow=driver.getWindowHandles();
	    for(String strFeedBack:handleWindow) {
	    driver.switchTo().window(strFeedBack);
	    String helpTitle=driver.getTitle();
	    if(helpTitle.equalsIgnoreCase("Vtiger CRM - vtiger"))
	    break;
	    }
	    // get first heading text of ...help tab
	    WebElement helpHeaderText=driver.findElement(By.xpath("//h1[@id='firstHeading']"));
	    String titleText=helpHeaderText.getText();
		System.out.println("Title of Help -"+titleText);
		//again swich the window handle homepage page element..
	    handleWindow=driver.getWindowHandles();
	    for(String strFeedBack:handleWindow) {
	    driver.switchTo().window(strFeedBack);
	    String homePageTitle=driver.getTitle();
	    if(homePageTitle.equals("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"));
	    break;
	    }
	    // handle about us window..
		driver.findElement(By.xpath("//a[@onclick='openwin();']")).click();
	    handleWindow=driver.getWindowHandles();
	    for(String strFeedBack:handleWindow) {
	    driver.switchTo().window(strFeedBack);
	    String aboutUsTitle=driver.getTitle();
	    if(aboutUsTitle.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM"))
	    break;
	    }
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//input[@name='close']")).click();
//		driver.findElement(By.xpath("//a[text()='Help']")).click();
//		driver.findElement(By.xpath("//a[text()='About Us']")).click();
//
//		Thread.sleep(10000);
//		/// we will have to switch focus of driver object to new window
//
//		Set<String> setWindowHandles=driver.getWindowHandles();
//
//		for(String handleValue  : setWindowHandles) {
//			System.out.println(handleValue);
//		}
//
//		Iterator<String> itWindowHandles=setWindowHandles.iterator();
//		while(itWindowHandles.hasNext()==true) {
//			String handleValue=itWindowHandles.next();
//			System.out.println(handleValue);
//		}
//
//		
//		while(itWindowHandles.hasNext()==true) {
//			String handleValue=itWindowHandles.next();
//			System.out.println(handleValue);
//		}
//		for(String handleValue  : setWindowHandles) {
//			System.out.println(handleValue);
//		}

	}

}

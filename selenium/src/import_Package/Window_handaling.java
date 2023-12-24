package import_Package;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handaling {

	public static int a; //// by default value -
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver\\\\\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		String hndlVal1=driver.getWindowHandle();


		driver.get("http://localhost:8888");
		String hndlVal2=driver.getWindowHandle();

		/// when selenium launches browser then it gives a handle value
		///  to the browser

		///  Handle Value

		WebElement weuserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement weUserPass = driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPass.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();

		driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		driver.findElement(By.xpath("//a[text()='About Us']")).click();

		Thread.sleep(10000);
		/// we will have to switch focus of driver object to new window

		Set<String> setWindowHandles=driver.getWindowHandles();

		for(String handleValue  : setWindowHandles) {
			System.out.println(handleValue);
		}

		Iterator<String> itWindowHandles=setWindowHandles.iterator();
		while(itWindowHandles.hasNext()==true) {
			String handleValue=itWindowHandles.next();
			System.out.println(handleValue);
		}

		
		while(itWindowHandles.hasNext()==true) {
			String handleValue=itWindowHandles.next();
			System.out.println(handleValue);
		}
		for(String handleValue  : setWindowHandles) {
			System.out.println(handleValue);
		}


	}
}

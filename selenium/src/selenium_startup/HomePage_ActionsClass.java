package selenium_startup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.Select;

public class HomePage_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
//		WebElement name=driver.findElement(By.xpath("//input[@type='text']"));
		Actions act_Obj=new Actions(driver);
		act_Obj.sendKeys(Keys.CLEAR,"admin").build().perform();
//		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		act_Obj.sendKeys(Keys.CLEAR.TAB, "admin").build().perform();
		WebElement colortheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		Select select=new Select(colortheme);
		select.selectByValue("bluelagoon");
		WebElement langauge=driver.findElement(By.xpath("//select[@name='login_language']"));
		Select select_Lang=new Select(langauge);
		select_Lang.selectByValue("en_us");
		WebElement engLanguge=select_Lang.getFirstSelectedOption();
		String actLangugeSelect=engLanguge.getText();
		String expLangugeSelect="US English";
		if(actLangugeSelect.equalsIgnoreCase(expLangugeSelect)) {
			System.out.println("Passed- US English is selected");
		}else {
				System.out.println("Failed- US English is not selected");
			}
		WebElement login_Button=driver.findElement(By.xpath("//input[@title='Login [Alt+L]']"));
		act_Obj.click(login_Button).build().perform();
		Thread.sleep(5000);
//		act_Obj.clickAndHold(drag_Clouds).moveToElement(drop_Accounts).release().build().perform();
		WebElement drag_Quates=driver.findElement(By.xpath("//b[contains(text(),'Top Quotes')]"));
		WebElement drop_Clouds=driver.findElement(By.xpath("//b[contains(text(),'Tag Cloud')]"));
		act_Obj.dragAndDrop(drag_Quates, drop_Clouds).release().build().perform();
//		WebElement calendar=driver.findElement(By.xpath("//a[text()='Calendar']"));
//		act_Obj.contextClick(calendar).click().build().perform();
		WebElement mark=driver.findElement(By.xpath("//a[text()='Marketing']"));
		act_Obj.moveToElement(mark).build().perform();
        WebElement lead=driver.findElement(By.linkText("Leads"));
		act_Obj.contextClick(lead).build().perform();
		WebElement acc=driver.findElement(By.linkText("Accounts"));
		act_Obj.contextClick(acc).build().perform();
		WebElement homesec=driver.findElement(By.xpath("//a[text()='Home']"));
		ScrollOrigin sc=ScrollOrigin.fromElement(homesec);
		act_Obj.scrollFromOrigin(sc, 2000, 100).build().perform();
//		act_Obj.scrollByAmount(2000, 1000).build().perform();
        WebElement tagCloud=driver.findElement(By.xpath("//div[@id='stuff_15']/table[@class='small scrollLink']/tbody/tr/td/a"));
        act_Obj.click(tagCloud).build().perform();
		
		
		
		
		
		
		
		
		
	}

}

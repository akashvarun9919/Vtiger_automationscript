package prcatice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_AccountsPage_AllDetailes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8888/");
		WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.clear();
		wePassword.sendKeys("admin");

		WebElement weLoginButton = driver.findElement(By.xpath("//input[@name='Login']"));
		weLoginButton.click();
        
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();

        
		List<WebElement> account_list = driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
		
		for (int i = 0; i < account_list.size(); i++) {
			WebElement weAcoountList = account_list.get(i);
//			String strAccountList = weAcoountList.getText();
//		System.out.println(strAccountList);

			List<WebElement> ListOfDetails = driver
					.findElements(By.xpath("//table[@class='lvt small']//tr[" + (i+1) + "]//td"));
			
			for (int j = 0; j < ListOfDetails.size(); j++) {
				WebElement weListOfDetails = ListOfDetails.get(j);
				String strListOfDetails = weListOfDetails.getText();
				System.out.print(strListOfDetails + "  ");	
			}
			System.out.println("");
		}
			List<WebElement> name_List=driver.findElements(By.xpath("//table[@class='lvt small']//tr//td[4]"));
			for(int k=0;k<name_List.size();k++) {
			WebElement wename_List=name_List.get(k);
			String name_Listtext=wename_List.getText();
			System.out.println(name_Listtext);
			}
		
		



		


	}

}

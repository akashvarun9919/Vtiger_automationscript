package import_Package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Accounts_Data {

	public static void main(String[] args) throws InterruptedException {

//	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//img[@alt='Mobiles']
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		///  Task 1 - 
	//	List<WebElement> weColumnList= driver.findElements(By.xpath("//td[@class='lvtCol']"));
//		List<WebElement> weColumnList= driver.findElements(By.xpath("//table[@class='lvt small']//tr[1]//td"));
		//String[] columnNameArray=new String[8];
		ArrayList<String> al= new ArrayList<String>();
//		for(int i=0; i<=weColumnList.size()-1; i++) {
//			WebElement we=weColumnList.get(i);
//			String columnName=we.getText();
//			//System.out.println(columnName);
//			//columnNameArray[i]=columnName;
//			al.add(columnName);
//		}
		
		List<WebElement> weTrList= driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
		
		for(int i=0; i<=weTrList.size()-1; i++) {
			WebElement weTr=weTrList.get(i);
			
			List<WebElement> weTdList= driver.findElements(By.xpath("//table[@class='lvt small']//tr["+(i+1)+"]//td"));
			for(int j=0; j<=weTdList.size()-1;j++) {
				WebElement weTd=weTdList.get(j);
				String tdText=weTd.getText();
				System.out.print(tdText+" , ");
			}
			System.out.println("");
			
		}
		
		
		
		
		List<WebElement> weColumnNameAndData= driver.findElements(By.xpath("//table[@class='lvt small']//tr//td[3]"));
		for(int i=0; i<=weColumnNameAndData.size()-1; i++) {
			WebElement we=weColumnNameAndData.get(i);
			String columnData=we.getText();
			System.out.println(columnData);
		}
		
		//////   https://prsuniv.ac.in/PRSU_StudentsDetail.aspx
		//textarea[@name='description']/ancestor::tr[1]/following-sibling::tr//input[@title='Save [Alt+S]']
		
		
	}

}

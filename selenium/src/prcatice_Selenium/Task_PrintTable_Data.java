package prcatice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_PrintTable_Data {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://prsuniv.ac.in/PRSU_StudentsDetail.aspx");
      WebElement courseDropdown= driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlcourse']"));
		Select obj_Course=new Select(courseDropdown);
		obj_Course.selectByVisibleText("B.Sc. PART-II");
		WebElement collegeDropdown=driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlinst']"));
		Select obj_College=new Select(collegeDropdown);
		obj_College.selectByVisibleText("(01008) DR. BHIMRAO AMBEDKAR MAHAVIDYALAYA, JUGNIDEEH, PHOOLPUR, PRAYAGRAJ");
		
		List <WebElement> rowList=driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_GridView1']//tr"));
		 
		for(int i=0;i<rowList.size();i++) {
			WebElement weColoumn=rowList.get(i);
			String headerText=weColoumn.getText();
	
			List<WebElement> coloumnData;
	        if(i==0) {
	        	coloumnData=driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_GridView1']//tr[1]//th"));

	        }else {
				coloumnData=driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_GridView1']//tr["+(i+1)+"]//td"));

	        }
            
			for(int j=0;j<coloumnData.size();j++) {
				WebElement weColoumnData=coloumnData.get(j);
				String strDataText=weColoumnData.getText();
				System.out.print(strDataText+" ");
			}
			System.out.println("");
			
			
			
		}
		
		
		
//		List<WebElement> coloumnData=driver.findElements(By.xpath("//table[@id='ContentPlaceHolder1_GridView1']//tr["+i+"]//th/ancestor::tr["+i+"]//following-sibling::tr["+i+"]//td"));

		
	}

}

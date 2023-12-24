package import_Package;




	import java.lang.reflect.Array;
	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import graphql.org.antlr.v4.runtime.misc.Array2DHashSet;

	public class TabLinkScenarios {

		public static void main(String[] args) {
			/// do login
			/// fetch Text of all the tab links
			int[] numArr= {123, 324, 234,24, 6,68,6586,768, 54};
			for(int num:numArr) {
				System.out.println(num);
			}
			
			for(int i=0; i<=numArr.length-1;i++) {
				int num=numArr[i];
				System.out.println(num);
			}
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Lenovo\\\\Downloads\\\\eclipse-java-2022-12-R-win32-x86_64\\\\eclipse\\\\Software Testing\\\\seleniuminstallation\\\\Driver\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888/ ");
			WebElement weUserName = driver.findElement(By.xpath("//input[@name='user_name']"));
			weUserName.clear();
			weUserName.sendKeys("admin");
			WebElement wePassword = driver.findElement(By.xpath("//input[@name='user_password']"));
			wePassword.clear();
			wePassword.sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='Login']")).click();
			List<WebElement> weListOfModule = driver.findElements(By.xpath("//td[contains(@onmouseover,'fnDropDown')]"));
			int elementCount=weListOfModule.size();
			for(int i=0;i<=elementCount-1; i=i+3 ) {
				WebElement weTabLink=weListOfModule.get(i);
				String text=weTabLink.getText();
				Dimension dim=weTabLink.getSize();
				System.out.println(text+"-"+dim.getHeight()+","+dim.getWidth());
			}
			///    //td[contains(@class,'Selected')]
			
			///  //td[contains(@class,'Selected')]//a
			
			////  //table[@class='hdrTabBg']//td[2]//a
			
			///  xpath with "and" operator
			
			//table[@class='hdrTabBg']//td[@nowrap='' and @class='small']//a
			
			///////  2nd scenario
			    /// //a[contains(text(),'Scroll')]
			
			///  3rd scenario
			//    //div[@id='Marketing_sub']//a
			
			//4th scenaro - get the rowcount of account table
			//table[@class='lvt small']//tr
			
			
			/// 5th scenario
			
			///  //td[contains(text(),'ACC')]
			
			////   //table[@class='lvt small']//tr[2]//td[2]
			
			
			
			
			
			
			
			
//			///  for each -  Array , List , 
//			for(WebElement weTabLink:weListOfModule) {
//				String text=weTabLink.getText();
//				Dimension dim=weTabLink.getSize();
//				System.out.println(text+"-"+dim.getHeight()+","+dim.getWidth());
//				
//			}
//			
			
			
			
			
			
			
		}

	}



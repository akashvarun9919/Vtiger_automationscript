package prcatice_Selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class File_ClassConcept {
   public WebDriver driver;
	public static void main(String[] args) throws IOException {
//	WebDriver driver = new ChromeDriver();
//	driver.get("http://localhost:8888/");
//	driver.manage().window().maximize();
//	driver.findElement(By.name("user_name")).sendKeys("admin");
//	driver.findElement(By.name("user_password")).sendKeys("admin");
//	driver.findElement(By.name("Login")).click();
//	driver.findElement(By.linkText("Marketing")).click();
//	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File f= div.getScreenshotAs(OutputType.FILE);
//		File fobj = new File("C:\\Users\\Dell\\Desktop\\B");
//		fobj.mkdir();
//	Files.copy(f,new File("C:\\Users\\Dell\\Desktop\\B\\name.jpg"));

		
		
		
		//	File fobj = new File("C:\\Users\\Dell\\Desktop\\B.txt");	
//		FileWriter ff = new FileWriter("C:\\Users\\Dell\\Desktop\\B.txt");
//
//		ff.write("Akashvarun1 \n");
//		ff.write("Akashvarun123 \n");
//		ff.write("Akashvarun123");
//		ff.close();
//		ff = new FileWriter("C:\\Users\\Dell\\Desktop\\A.txt");
//        System.out.println("succesfully data wrote");
//        
//	
		
		
//		 if(fobj.exists()) {
//			 System.out.println("file name :"+fobj.getName());
//			 System.out.println("file location :"+fobj.getAbsolutePath());
//			 System.out.println("file writable :"+fobj.canWrite());
//			 System.out.println("file redable :"+fobj.canRead());
//			 System.out.println("file size :"+fobj.length());
//			 System.out.println("file removed :"+fobj.delete());
//		 }else {
//			 System.out.println("file doesn't exist..");
//		 }
        File_ClassConcept flc = new File_ClassConcept();
        flc.vTigerloginPage();
	    flc.loginFeild();
	    flc.marketing();
	}
    // vtiger login page...
	public void vTigerloginPage() throws IOException {
    	driver=new ChromeDriver();
    	driver.get("http://localhost:8888/");
    	driver.manage().window().fullscreen();
    	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fobj = new File("C:\\Users\\Dell\\Desktop\\Login");
		fobj.mkdir();
	Files.copy(f,new File("C:\\Users\\Dell\\Desktop\\Login\\loginPage.png"));
     }
	// enter username and password textbox feild...
	public void loginFeild() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
	}
	public void marketing() throws IOException {
	  	driver.manage().window().fullscreen();
    	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fobj = new File("C:\\Users\\Dell\\Desktop\\Login");
		fobj.mkdir();
	Files.copy(f,new File("C:\\Users\\Dell\\Desktop\\Login\\MarketingPage.jpg"));
		
	}
	
}

package import_export_FileConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Email_FileImport {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions options = new ChromeOptions();

        Map<String,Object> pre= new HashMap<String,Object>();
//      options.addArguments("test-type");
//      options.addArguments("--disable-web-security");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("incognito");
        options.setExperimentalOption("prefs", pre);
//        pre.put("download.prompt_for_download", false);
       options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(250));
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=ASKXGp2cxVzXfk0gMglVrHfz_jjz29D8MxU6OIzOQr7LVwytKIGUs4Wo-kpC69kOWvCzE5ETBND4&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("omegabatch123@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	

		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Omega@1234");
		//downoad file from email..
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='J-Ke n0'])[1]")).click();
        driver.findElement(By.xpath("(//td[@class='yX xY '])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='akn'])[1]")).click();
      // upload file from email..
//		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
//     	driver.findElement(By.xpath("//input[@name='Filedata'] ")).sendKeys("C:\\Users\\Dell\\Desktop\\B.txt");
//	    driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("anshuomega90@gmail.com");
//		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Abcd");
//     	driver.findElement(By.xpath("//div[@class='dC']")).click();
	}
	
}

//div[@class='VfPpkd-RLmnJb']/following::span[text()='Next']
//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']
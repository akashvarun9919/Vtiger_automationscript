package waitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) {
		ImplicitlyWait imp = new ImplicitlyWait();
		imp.launchedBrowser();

	}

	public void launchedBrowser() {
		WebDriver driver = new ChromeDriver();
//       use of implicitly Wait ...
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		homePage(driver);
	}

	public void homePage(WebDriver driver) {
		// use of explicitly wait....
		WebDriverWait expliwait = explicitlyMethod(driver);
		Boolean val = expliwait
				.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.linkText("Marketing"))));
//    	WebElement marketing =driver.findElement(By.linkText("Marketing"));
//       WebElement cc=val.get(0);
//       cc.click();

	}

	// use of explicitly wait ...
	public WebDriverWait explicitlyMethod(WebDriver driver) {
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wdw;
	}

}

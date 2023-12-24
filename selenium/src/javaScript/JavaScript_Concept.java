package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript_Concept {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new EdgeDriver();
	     driver.get("http://localhost:8888/");
	    JavascriptExecutor jse= (JavascriptExecutor) driver;
	    
	    WebElement userName= driver.findElement(By.name("user_name"));
	    jse.executeScript("arguments[0].value='admin';",userName);
	    WebElement userPaas=driver.findElement(By.name("user_password"));
	    jse.executeScript("arguments[0].value='admin';",userPaas);
	    WebElement login=driver.findElement(By.name("Login"));
	    jse.executeScript("arguments[0].click();", login);
	    WebElement mark=driver.findElement(By.linkText("Marketing"));
	    jse.executeScript("if(document.createEvent){var evObj= "
	    +"document.createEvent('MouseEvents');evObj.initEvent"
	    +"('mouseover',true,false);arguments[0].dispatchEvent(evObj);}"
	    +"else if(document.createEventObject)"
	    +"{arguments[0].fireEvent('onmouseover');}", mark);
	  Thread.sleep(1000);
	    WebElement sales=driver.findElement(By.linkText("Sales"));
	    jse.executeScript("if(document.createEvent){var evObj= "
	    +"document.createEvent('MouseEvents');evObj.initEvent"
	    +"('mouseover',true,false);arguments[0].dispatchEvent(evObj);}"
	    +"else if(document.createEventObject)"
	    +"{arguments[0].fireEvent('onmouseover');}", sales);
	   Thread.sleep(1000);
	    WebElement tools=driver.findElement(By.linkText("Tools"));
	    jse.executeScript("if(document.createEvent){var evObj= "
	    +"document.createEvent('MouseEvents');evObj.initEvent"
	    +"('mouseover',true,false);arguments[0].dispatchEvent(evObj);}"
	    +"else if(document.createEventObject)"
	    +"{arguments[0].fireEvent('onmouseover');}", tools);
	}

}

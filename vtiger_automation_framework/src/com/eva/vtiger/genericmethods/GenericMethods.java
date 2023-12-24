package com.eva.vtiger.genericmethods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class GenericMethods {

	public static WebDriver driver;
	public static ExtentReports extentReport;
	public static ExtentTest extentText;

	// Create ProjectReport Methods....
	/*
	 * it is a logger(kind of an object to log certain messages for an app)style
	 * repoting library for automated test.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void genrateExtentReport() {
		extentReport = new ExtentReports();
		ExtentSparkReporter SparkReport = new ExtentSparkReporter("Vtiger.html");
		SparkReport.config().setTheme(Theme.DARK);
		SparkReport.config().setDocumentTitle("vtiger_automation_framework");
		try {
			extentReport.attachReporter(SparkReport);
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Report not Generate");
		}
	}

	/*
	 * This method will adds info about test cases,screenshots,tags,series of steps.
	 * 
	 * @param - String testcasename
	 * 
	 * @return - no return
	 */
	public void genrateExtentTest(String testCaseName) {
		try {
			extentText = extentReport.createTest(testCaseName);
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Extent Test not Generate");
		}
	}


	/*
	 * This method will instruct extentreort to write the test info in a certain
	 * destination.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void flushReport() {
		try {
			extentReport.flush();
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Flush not work ");
		}
	}

	// WebDriver Methods...
	/*
	 * This method will launch the browser.
	 * 
	 * @param - String browser
	 * 
	 * @return - no return
	 */
	public void launchedBrowser(String browser) {
		try {
			driver = new ChromeDriver();
			extentText.log(Status.INFO, browser + " launched successfully");
		} catch (SessionNotCreatedException e) {
			extentText.log(Status.FAIL, browser + " doesnot launched successfully");
			throw e;
		} catch (InvalidArgumentException e) {
			extentText.log(Status.FAIL, browser + " doesnot launched successfully");
			throw e;
		} catch (WebDriverException e) {
			extentText.log(Status.FAIL, browser + " doesnot launched successfully");
			throw e;
		} catch (Exception e) {
			extentText.log(Status.FAIL, browser + " doesnot launched successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will open a Url.
	 * 
	 * @param - String urlvalue
	 * 
	 * @return - no return
	 */
	public void openUrl(String urlValue) {
		try {
			driver.get(urlValue);
			extentText.log(Status.INFO, urlValue + " opened successfully");

		} catch (InvalidArgumentException e) {
			extentText.log(Status.FAIL, urlValue + " does not opened");
			throw e;
		} catch (NoSuchWindowException e) {
			extentText.log(Status.FAIL, urlValue + " does not opened");
			throw e;
		} catch (Exception e) {
			extentText.log(Status.FAIL, urlValue + " does not opened");
			throw e;
		}
	}

	/*
	 * This method will Fetching current url.
	 * 
	 * @param - no parameter
	 * 
	 * @return - String
	 */
	public String getCurrentURL() {
		String currentURL = null;
		try {
			currentURL = driver.getCurrentUrl();
			// extentText.log(Status.INFO, "Current "+currentURL+" opened successfully");
		} catch (InvalidArgumentException e) {
			// extentText.log(Status.FAIL, "Current "+currentURL+" does not opened");
			throw e;
		} catch (NoSuchWindowException e) {
			// extentText.log(Status.FAIL, "Current "+currentURL+" does not opened");
			throw e;
		} catch (Exception e) {
			// extentText.log(Status.FAIL, "Current "+currentURL+" does not opened");
			throw e;
		}
		return currentURL;
	}

	/*
	 * This method will Fetching a Page Title.
	 * 
	 * @param - no parameter
	 * 
	 * @return - String
	 */
	public String getTittle() {
		String titleText = null;
		try {
			titleText = driver.getTitle();
//			extentText.log(Status.PASS, titleText+" title  fetching correct");
		} catch (InvalidArgumentException e) {
//			extentText.log(Status.FAIL, titleText+" title does not fetching correct");
			throw e;
		} catch (NoSuchWindowException e) {
//			extentText.log(Status.FAIL, titleText+" title does not fetching correct");
			throw e;
		} catch (Exception e) {
//			extentText.log(Status.FAIL, titleText+" title does not fetching correct");
			throw e;
		}
		return titleText;
	}

	/*
	 * This method will maxmize the webbrowser.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void maximize() {
		try {
			driver.manage().window().maximize();
			extentText.log(Status.PASS, "Maxmize browser successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Maxmize webbrowser not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will move to privious page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void back() {
		try {
			driver.navigate().back();
			extentText.log(Status.PASS, "Move to privious page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Move to privious page not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will Move to next page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void forward() {
		try {
			driver.navigate().forward();
			extentText.log(Status.PASS, "Move to Next page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Move to Next page not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will reload the page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void refresh() {
		try {
			driver.navigate().refresh();
			extentText.log(Status.PASS, "Refresh page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Refresh page not successfully");
			throw e;
		}
	}

	/*
	 * This method will minmize the page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void minmize() {
		try {
			driver.manage().window().minimize();
			extentText.log(Status.PASS, "Minmize page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Minmize page not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will open page to fullscreen.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void fullScreen() {
		try {
			driver.manage().window().fullscreen();
			extentText.log(Status.PASS, "Fullscreen page open successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Fullscreen page open not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will close the page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void close() {
		try {
			driver.close();
			extentText.log(Status.PASS, "Close page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Close page not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will quit the page.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void quite() {
		try {
			driver.quit();
			extentText.log(Status.PASS, "Quit page successfully");
		} catch (Exception e) {
			extentText.log(Status.FAIL, "Quit page not successfully");
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will search the single element on UI.
	 * 
	 * @param - By locatorname , String elementname
	 * 
	 * @return - Webelement
	 */
	public WebElement searchElement(String elementName, By locatorName) {
		WebElement getElement = null;
		try {
			getElement = driver.findElement(locatorName);
			extentText.log(Status.PASS, elementName + "element is found by locator-" + locatorName);
		} catch (NoSuchElementException e) {
			getElement = driver.findElement(locatorName);
			extentText.log(Status.PASS, elementName + "element is found second attempt by locator-" + locatorName);
		} catch (InvalidSelectorException e) {
			extentText.log(Status.PASS, elementName + " syntax- " + locatorName + " is wrong. please check");
			throw e;
		} catch (NullPointerException e) {
			extentText.log(Status.PASS, elementName + "- element has Null value");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return getElement;
	}

	/*
	 * This method will search the multiple element on UI.
	 * 
	 * @param - By locatorname , String elementname
	 * 
	 * @return - List<Webelement>
	 */
	public List<WebElement> searchElements(String locatorName, String elementName) {
		List<WebElement> getElement = null;
		try {
			getElement = driver.findElements(By.xpath(locatorName));
			extentText.log(Status.PASS, elementName + "element is found by locator-" + locatorName);
		} catch (NoSuchElementException e) {
			getElement = driver.findElements(By.xpath(locatorName));
			extentText.log(Status.PASS, elementName + "- element is found second attempt by locator-" + locatorName);
		} catch (InvalidSelectorException e) {
			extentText.log(Status.PASS, elementName + "- syntax- " + locatorName + " is wrong. please check.");
			throw e;
		} catch (NullPointerException e) {
			extentText.log(Status.PASS, elementName + "- element has Null value");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return getElement;
	}

	/*
	 * This method will take screenshot.
	 * 
	 * @param - String testcaseimagename
	 * 
	 * @return - String
	 */
	public String takeScreenShot(String testCaseImageName) {
		DateFormat dFormat = new SimpleDateFormat("MM-dd-yyyy hh-mm-ss a");
		String timeStamp = dFormat.format(new java.util.Date());
		TakesScreenshot tssobj = (TakesScreenshot) driver;
		File sourceFile = tssobj.getScreenshotAs(OutputType.FILE);
		File folderobj = new File("SnapshotsFolder");
		if (folderobj.exists() == false) {
			folderobj.mkdir();
		}
		File destinationFile = new File("SnapshotsFolder\\" + testCaseImageName + "" + timeStamp + ".png");
		try {
			Files.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destinationFile.getAbsolutePath();
	}
	// Element Matched By if else -Method....

	/*
	 * This method will Match the String element.
	 * 
	 * @param - String actualElement,String expectElement, String elementName
	 * 
	 * @return - no return
	 */
	public void verify_Act_Exp_ResultForString(String actualElement, String expectElement, String elementName) {
		if (actualElement.equalsIgnoreCase(expectElement)) {
			// System.out.println("Passed: Actual- " + actualElement + " matched to Expected
			// -" + expectElement);
			extentText.log(Status.PASS, "Expected " + elementName + "-" + actualElement + " Matched to Actual "
					+ elementName + "-" + expectElement + " Successfully");
		} else {
			// System.out.println("Failed: Actual- " + actualElement + " unmatched matched
			// to Expected -" + expectElement);
			extentText.log(Status.FAIL, "Expected " + elementName + "-" + actualElement + " Unmatched to Actual "
					+ elementName + "-" + expectElement);
			extentText.addScreenCaptureFromPath(takeScreenShot(elementName));
		}
	}

	/*
	 * This method will Match the integer element.
	 * 
	 * @param - int actualElement, int expectElement, String elementName
	 * 
	 * @return - no return
	 */
	public void Verify_Act_Exp_ResultForInt(int actualElement, int expectElement, String elementName) {
		if (actualElement == (expectElement)) {
			extentText.log(Status.PASS, "Expected " + elementName + "-" + actualElement + " Matched to Actual "
					+ elementName + "-" + expectElement + " Successfully");
		} else {
			extentText.log(Status.FAIL, "Expected " + elementName + "-" + actualElement + " Unmatched to Actual "
					+ elementName + "-" + expectElement);
			extentText.addScreenCaptureFromPath(takeScreenShot(elementName));
		}
	}

	/*
	 * This method will Match the boolean display element.
	 * 
	 * @param - boolean actualElement, boolean expectElement, String elementName
	 * 
	 * @return - no return
	 */
	public void verify_Act_Exp_ResultForDisplayed(boolean actualElement, boolean expectElement, String elementName) {

		if (actualElement == (expectElement)) {
			// System.out.println("Passed:" + elementName + " on UI Page");
			extentText.log(Status.PASS, elementName + " is Displayed");
		} else {
			// System.out.println("Failed:" + elementName + " not on UI Page");
			extentText.log(Status.FAIL, elementName + " is not Displayed");
			extentText.addScreenCaptureFromPath(takeScreenShot(elementName));
		}
	}

	/*
	 * This method will Match the boolean enable element.
	 * 
	 * @param - boolean actualElement, boolean expectElement, String elementName
	 * 
	 * @return - no return
	 */
	public void verify_Act_Exp_ResultForEnabled(boolean actualElement, boolean expectElement, String elementName) {

		if (actualElement == (expectElement)) {
			// System.out.println("Passed:" + elementName + " on UI Page");
			extentText.log(Status.PASS, elementName + " is Enabled");
		} else {
			// System.out.println("Failed:" + elementName + " not on UI Page");
			extentText.log(Status.FAIL, elementName + " is Disabled");
			extentText.addScreenCaptureFromPath(takeScreenShot(elementName));
		}
	}

	/*
	 * This method will Match the boolean select element.
	 * 
	 * @param - boolean actualElement, boolean expectElement, String elementName
	 * 
	 * @return - no return
	 */
	public void verify_Act_Exp_ResultForSelected(boolean actualElement, boolean expectElement, String elementName) {

		if (actualElement == (expectElement)) {
			// System.out.println("Passed:" + elementName + " on UI Page");
			extentText.log(Status.PASS, elementName + " is Selected");
		} else {
			// System.out.println("Failed:" + elementName + " not on UI Page");
			extentText.log(Status.FAIL, elementName + " is not Selected");
			extentText.addScreenCaptureFromPath(takeScreenShot(elementName));
		}
	}

	// WebElement Methods...

	/*
	 * This method will send a value in textbox, search box etc.
	 * 
	 * @param - By locator, String value, String elementName
	 * 
	 * @return - no return
	 */
	public void sendKeys(By locator, String value, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		try {
			getElement.sendKeys(value);
			extentText.log(Status.PASS, value + "- entered in " + elementName);
		} catch (ElementNotInteractableException e) {
			sendKeysByjavaScript(locator, value, elementName);
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			getElement.sendKeys("value");
			extentText.log(Status.FAIL, value + "- entered in " + elementName + " after handling stale exception");
		} catch (NullPointerException e) {
			extentText.log(Status.FAIL, elementName + "- element has Null in SendKeys");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will click a button and checkboxes and radio button etc.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void click(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		try {
			getElement.click();
			extentText.log(Status.PASS, "cliked on- " + elementName);
		} catch (ElementNotInteractableException e) {
			mouseOverByjavaScript(locator, elementName);
			clickByjavaScript(locator, elementName);
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			getElement.click();
			extentText.log(Status.FAIL, "clicked on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will clear the textbox and serchbox.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void clear(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		try {
			getElement.clear();
			extentText.log(Status.PASS, "clear- " + elementName + " textbox successfully");
		} catch (ElementNotInteractableException e) {
//			js.sendKeysBy_javaScript();		
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			getElement.clear();
			extentText.log(Status.FAIL,
					"clear- " + elementName + " textbox successfully after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will check the element displayed in UI or not.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - boolean
	 */
	public boolean isDisplayed(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		boolean displayElement;
		try {
			displayElement = getElement.isDisplayed();
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			displayElement = getElement.isDisplayed();
			extentText.log(Status.FAIL, elementName + "- Displayed after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return displayElement;
	}

	/*
	 * This method will check the element enabled in UI or not.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - boolean
	 */
	public boolean isEnabled(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		boolean enableElement;
		try {
			enableElement = getElement.isEnabled();
//			System.out.println(elementName + "- Enabled on UI");
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			enableElement = getElement.isEnabled();
			extentText.log(Status.FAIL, elementName + "- Enabled after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return enableElement;
	}

	/*
	 * This method will check the element selected in UI or not.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - boolean
	 */
	public boolean isSelected(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		boolean selectElement;
		try {
			selectElement = getElement.isSelected();
//			System.out.println(elementName + "- Selected on UI");
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			selectElement = getElement.isSelected();
			extentText.log(Status.FAIL, elementName + "- Selected after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return selectElement;
	}

	/*
	 * This method will Fetching the Attribute value.
	 * 
	 * @param -By locator, String attributeName, String elementName
	 * 
	 * @return - String
	 */
	public String getAttribute(By locator, String attributeName, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		String attributeText = null;
		try {
			attributeText = getElement.getAttribute(attributeName);
//			System.out.println(elementName + "- " + attributeText + " Fetched by Value Attribute");
		} catch (StaleElementReferenceException e) {
			attributeText = getElement.getAttribute(attributeName);
			extentText.log(Status.FAIL, elementName + "- " + attributeText + " Fetched by value Attribute");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return attributeText;
	}

	/*
	 * This method will Fetching the Innertext value.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - String
	 */
	public String getText(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		String innerText = null;
		try {
			innerText = getElement.getText();
//			System.out.println(elementName + "- Text Fetch by InnerText- " + innerText);
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			innerText = getElement.getText();
			extentText.log(Status.FAIL,
					elementName + "- Text Fetch by InnerText- " + innerText + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return innerText;
	}

	/*
	 * This method will Fetching the Size of element.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - Dimension
	 */
	public Dimension getSize(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Dimension elementSize;
		try {
			elementSize = getElement.getSize();
//			System.out.println(elementName + "- Size Fetched correct");
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			elementSize = getElement.getSize();
			extentText.log(Status.FAIL, elementName + "- Size Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return elementSize;
	}

	/*
	 * This method will Fetching the Hight of element .
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - int
	 */
	public int getHightOfElement(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		int getHight = 0;
		Dimension elementSize = getSize(locator, elementName);
		try {
			getHight = elementSize.getHeight();
			// System.out.println(elementName + "- Location Fetched correct");
		} catch (StaleElementReferenceException e) {
			elementSize.getHeight();
			extentText.log(Status.FAIL, elementName + "- Hight Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return getHight;
	}

	/*
	 * This method will Fetching the Width of element .
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - int
	 */
	public int getWidthOfElement(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		int getWidth = 0;
		Dimension elementSize = getSize(locator, elementName);
		try {
			getWidth = elementSize.getWidth();
//			System.out.println(elementName + "- Location Fetched correct");
		} catch (StaleElementReferenceException e) {
			elementSize.getHeight();
			extentText.log(Status.FAIL, elementName + "- Width Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return getWidth;
	}

	/*
	 * This method will Fetching the Location of element.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - Point
	 */
	public Point getLocation(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Point locationElement;
		try {
			locationElement = getElement.getLocation();
//			System.out.println(elementName + "- Location Fetched correct");
		} catch (StaleElementReferenceException e) {
			getElement = searchElement(elementName, locator);
			locationElement = getElement.getLocation();
			extentText.log(Status.FAIL, elementName + "- Location Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return locationElement;
	}

	/*
	 * This method will Fetching the Location of element horizontally.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - int
	 */
	public int getLocationHorizontaly(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Point getlocation = getLocation(locator, elementName);
		int locationHorizontaly = 0;
		try {
			locationHorizontaly = getlocation.getX();
//			System.out.println(elementName + "- Horizontally Fetched correct");
		} catch (StaleElementReferenceException e) {
			locationHorizontaly = getlocation.getX();
			extentText.log(Status.FAIL,
					elementName + "Horizontally Location Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return locationHorizontaly;
	}

	/*
	 * This method will Fetching the Location of element Vertically.
	 * 
	 * @param -By locator, String elementName
	 * 
	 * @return - int
	 */
	public int getLocationVertically(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Point getlocation = getLocation(locator, elementName);
		int locationVertically = 0;
		try {
			locationVertically = getlocation.getY();
			// System.out.println(elementName + "- Vertically Fetched correct");
		} catch (StaleElementReferenceException e) {
			locationVertically = getlocation.getX();
			extentText.log(Status.FAIL,
					elementName + "Vertically Location Fetch correct after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return locationVertically;
	}

//	 Select Class Methods......

	/*
	 * This method will select dropdown option by InnerText.
	 * 
	 * @param - By locator, String innerText, String elementName
	 * 
	 * @return - no return
	 */
	public void selectByVisibleText(By locator, String innerText, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		try {
			selObj.selectByVisibleText(innerText);
			extentText.log(Status.PASS, "DropDown " + elementName + " Selected " + innerText + " by innertext Successfully");
		} catch (ElementNotInteractableException e) {
//				javaScriptClick(xpath,elementName);
		} catch (StaleElementReferenceException e) {
			selObj.selectByVisibleText(innerText);
			extentText.log(Status.FAIL,"DropDown " + elementName + " Selected " + innerText
					+ " Successfully after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will select dropdown option by index.
	 * 
	 * @param - By locator, int index, String elementName
	 * 
	 * @return - no return
	 */
	public void selectByIndex(By locator, int index, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		try {
			selObj.selectByIndex(index);
			extentText.log(Status.PASS,"DropDown " + elementName + " Selected by " + index + " Index Number Successfully");
		} catch (ElementNotInteractableException e) {
//				javaScriptClick(xpath,elementName);
		} catch (StaleElementReferenceException e) {
			selObj.selectByIndex(index);
			extentText.log(Status.FAIL,"DropDown " + elementName + " Selected by " + index
					+ " Index Number Successfully after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will select dropdown option by Attribute value.
	 * 
	 * @param - By locator, String valueAttribute, String elementName
	 * 
	 * @return - no return
	 */
	public void selectByValue(By locator, String valueAttribute, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		try {
			selObj.selectByValue(valueAttribute);
			extentText.log(Status.PASS, "DropDown " + elementName + " Selected by " + valueAttribute + " Attribute Successfully");
		} catch (ElementNotInteractableException e) {
//				javaScriptClick(xpath,elementName);
		} catch (StaleElementReferenceException e) {
			selObj.selectByValue(valueAttribute);
			extentText.log(Status.FAIL, "DropDown " + elementName + " Selected by " + valueAttribute
					+ " Attribute Successfully after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will select dropdown option by contains.
	 * 
	 * @param - By locator, String elementName, String selectText
	 * 
	 * @return - no return
	 */
	public void selectOptionsByContains(By locator, String elementName, String selectText) {
		int indexNumber = -1;

		List<String> listAllText = getAllDropdownOptionsText(locator, elementName);
		for (int i = 0; i < listAllText.size(); i++) {
			String weOptions = listAllText.get(i);
			boolean status = weOptions.contains(selectText);
			if (status == true) {
				indexNumber = i;
				break;
			}
		}
		selectByIndex(locator, indexNumber, elementName);
	}

	/*
	 * This method will Get selected dropdown option.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - String
	 */
	public String getSelectedFirstOption(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		WebElement getFirstOption = null;
		String selectedtextvalue = null;
		try {
			getFirstOption = selObj.getFirstSelectedOption();
			selectedtextvalue = getFirstOption.getText();
			extentText.log(Status.PASS, "DropDown " + elementName + " Fetching " + selectedtextvalue + " option Successfully");
		} catch (ElementNotInteractableException e) {
//				javaScriptClick(locator,elementName);
		} catch (StaleElementReferenceException e) {
			getFirstOption = selObj.getFirstSelectedOption();
			extentText.log(Status.FAIL, "DropDown " + elementName + " Selected by value Attribute after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return selectedtextvalue;
	}

	/*
	 * This method will Get all dropdown option size.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - int
	 */
	public int getAllOptionsSize(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		List<WebElement> getAllOption = null;
		int itemCount = 0;
		try {
			getAllOption = selObj.getOptions();
			itemCount = getAllOption.size();
			extentText.log(Status.PASS," DropDown List size- " + itemCount + " Get Correct");
		} catch (ElementNotInteractableException e) {
//				javaScriptClick(xpath,elementName);
		} catch (StaleElementReferenceException e) {
			getAllOption = selObj.getOptions();
			extentText.log(Status.FAIL," Selected by value Attribute after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return itemCount;
	}

	/*
	 * This method will Get all dropdown option Text.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - List
	 */
	public List getAllDropdownOptionsText(By locator, String elementName) {
		List<String> listOptionText = new ArrayList<String>();
		WebElement getElement = searchElement(elementName, locator);
		Select selObj = new Select(getElement);
		List<WebElement> getAllOption = selObj.getOptions();
		for (int j = 0; j < getAllOption.size(); j++) {
			WebElement weOptions = getAllOption.get(j);
			String AllOptionsText = weOptions.getText();
			listOptionText.add(AllOptionsText);

		}
//		String elementText=listOptionText.toString();
		extentText.log(Status.PASS,elementName + " DropDown Text- " + listOptionText);

		return listOptionText;
	}
	// Actions Class Methods.....

	/*
	 * This method will Send value in textbox ,searchbox etc by mouse.
	 * 
	 * @param - By locator, String value, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionSendKeys(By locator, String value, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.sendKeys(getElement, value).build().perform();
			extentText.log(Status.PASS,"SendKeys By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
			sendKeysByjavaScript(locator, value, elementName);
		} catch (StaleElementReferenceException e) {
			actObj.sendKeys(getElement, value).build().perform();
			extentText.log(Status.FAIL,"SendKeys By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will click on button,checkbox,radiobutton,link etc by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionClick(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.click(getElement).build().perform();
			extentText.log(Status.PASS,"cliked By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
			clickByjavaScript(locator, elementName);
		} catch (StaleElementReferenceException e) {
			actObj.click(getElement).build().perform();
			extentText.log(Status.FAIL,"clicked By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will dobuleclick on button,checkbox,radiobutton,link etc by
	 * mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionDoubleClick(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.doubleClick(getElement).build().perform();
			extentText.log(Status.PASS,"Double cliked By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
			clickByjavaScript(locator, elementName);
		} catch (StaleElementReferenceException e) {
			actObj.doubleClick(getElement).build().perform();
			extentText.log(Status.FAIL,"Double clicked By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Right click by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionContextClick(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.contextClick(getElement).build().perform();
			extentText.log(Status.PASS,"Context cliked By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
			clickByjavaScript(locator, elementName);
		} catch (StaleElementReferenceException e) {
			actObj.contextClick(getElement).build().perform();
			extentText.log(Status.FAIL,"Context clicked By mouse on- " + elementName + " after handling stale exception");
			System.out.println(("Context clicked By mouse on- " + elementName + " after handling stale exception"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Mouse over by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionMouseOver(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.moveToElement(getElement).build().perform();
			extentText.log(Status.PASS,"MouseOver By Mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
			mouseOverByjavaScript(locator, elementName);
		} catch (StaleElementReferenceException e) {
			actObj.moveToElement(getElement).build().perform();
			extentText.log(Status.FAIL,"MouseOver By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Scroll page by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionScrollByElement(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.scrollToElement(getElement).build().perform();
			extentText.log(Status.PASS,"Scroll Page By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
//			javaScriptMouseOver(elementName, locator);
		} catch (StaleElementReferenceException e) {
			actObj.scrollToElement(getElement).build().perform();
			extentText.log(Status.FAIL,"Scroll Page By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Click and Hold the element by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionClickandHold(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.clickAndHold(getElement).build().perform();
			extentText.log(Status.PASS,"Click and Hold By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
//			javaScriptMouseOver(elementName, locator);
		} catch (StaleElementReferenceException e) {
			actObj.clickAndHold(getElement).build().perform();
			extentText.log(Status.FAIL,"Click and Hold By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Drag and drop by mouse.
	 * 
	 * @param - By sourceLocator, By destinationLocator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionDragandDrop(By sourceLocator, By destinationLocator, String elementName) {
		WebElement getElementSource = searchElement(elementName, sourceLocator);
		WebElement getElementDestination = searchElement(elementName, destinationLocator);
		Actions actObj = new Actions(driver);
		try {
			actObj.dragAndDrop(getElementSource, getElementDestination).build().perform();
			extentText.log(Status.PASS,"Drag and Drop By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
//			javaScriptMouseOver(elementName, locator);
		} catch (StaleElementReferenceException e) {
			actObj.dragAndDrop(getElementSource, getElementDestination).build().perform();
			extentText.log(Status.FAIL,"Drag and Drop By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}

	/*
	 * This method will Release the element by mouse.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - Actions
	 */
	public Actions actionRelease(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		Actions actObj = new Actions(driver);
		try {
			actObj.release(getElement).build().perform();
			extentText.log(Status.PASS,"Release By mouse on- " + elementName);
		} catch (ElementNotInteractableException e) {
//			javaScriptMouseOver(elementName, locator);
		} catch (StaleElementReferenceException e) {
			actObj.release(getElement).build().perform();
			extentText.log(Status.FAIL,"Release By mouse on- " + elementName + " after handling stale exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return actObj;
	}
	// Window Handling Methods....

	/*
	 * This method will get Handle value window .
	 * 
	 * @param - String elementName
	 * 
	 * @return - no return
	 */
	public void windowHandleBy(String elementName) {
		try {
			String handleValue = driver.getWindowHandle();
			driver.switchTo().window(handleValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will switch the window by Title.
	 * 
	 * @param - String expectedURL, String elementName
	 * 
	 * @return - no return
	 */
	public void windowHandlesByTitle(String expectedTitle, String elementName) {
		try {
			Set<String> handleWindow = driver.getWindowHandles();
			for (String handleValue : handleWindow) {
				driver.switchTo().window(handleValue);
				String titleTextfeedback = driver.getTitle();
				if (titleTextfeedback.contains(expectedTitle)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will switch the window by URL.
	 * 
	 * @param - String expectedURL, String elementName
	 * 
	 * @return - no return
	 */
	public void windowHandlesByURL(String expectedURL, String elementName) {
		try {
			Set<String> handleWindow = driver.getWindowHandles();
			for (String handleValue : handleWindow) {
				driver.switchTo().window(handleValue);
				String titleTextfeedback = driver.getCurrentUrl();
				if (titleTextfeedback.contains(expectedURL)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	// Frame Method....

	/*
	 * This method will switch window to Frame window.
	 * 
	 * @param - By locator, String frameName
	 * 
	 * @return - no return
	 */
	public void switchWindowToFrame(By locator, String frameName) {
		WebElement getElement = searchElement(frameName, locator);
		driver.switchTo().frame(getElement);
		System.out.println("Switch Window to Frame");
	}

	/*
	 * This method will switch Frame to window.
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void switchFrameToWindow() {
		driver.switchTo().defaultContent();
		System.out.println("Switch Frame to Window");
	}
	// Pop-up Alert method....

	/*
	 * This method will accept the pop-up(Yes for this).
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void pop_UpHandleAccept() {
		driver.switchTo().alert().accept();
		System.out.println("Pop-Up window Handle Successfully");
	}

	/*
	 * This method will dismiss the pop-up(No for this).
	 * 
	 * @param - no parameter
	 * 
	 * @return - no return
	 */
	public void pop_UpHandleDismiss() {
		driver.switchTo().alert().dismiss();
		System.out.println("Pop-Up window Handle Successfully");
	}
	// JavaScript methods....

	/*
	 * This method will clicked the element by javascript.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void clickByjavaScript(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", getElement);
		System.out.println("clicked on- " + elementName + " By javascript");
	}

	/*
	 * This method will send the value textbox searchbox etc by javascript.
	 * 
	 * @param - By locator, String value, String elementName
	 * 
	 * @return - no return
	 */
	public void sendKeysByjavaScript(By locator, String value, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='" + value + "';", getElement);
		System.out.println(" Sendkeys- " + value + " on " + elementName + " By javascript");
	}

	/*
	 * This method will clear the value textbox searchbox etc by javascript.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void clearByjavaScript(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value=' ';", getElement);
		System.out.println("Clear- " + elementName + " Textbox By javascript");
	}

	/*
	 * This method will doubleclicked by javascript.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void doubleClickedByjavaScript(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", getElement);
		System.out.println("Doubleckicked on " + elementName + " By javascript");
	}

	/*
	 * This method will MouseOver by javascript.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void mouseOverByjavaScript(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(
				"if(document.createEvent){var evObj = " + "document.createEvent('MouseEvents');evObj.initEvent"
						+ "('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
						+ "else if(document.createEventObject) " + "{ arguments[0].fireEvent('onmouseover');}",
				getElement);
		System.out.println("Mouseover on- " + elementName + " By javascript");
	}

	/*
	 * This method will Scroll page by javascript.
	 * 
	 * @param - By locator, String elementName
	 * 
	 * @return - no return
	 */
	public void scrollByjavaScript(By locator, String elementName) {
		WebElement getElement = searchElement(elementName, locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		System.out.println("Scroll page- " + elementName + " By javascript");
	}
	// Wait Methods.......

	/*
	 * This method, webdriver will wait for the for certain measure time.
	 * 
	 * @param - long time
	 * 
	 * @return - no return
	 */
	public void implicitlyWait(long time) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			System.out.println("Implicitly wait- is work successfully");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method, webdriver will wait for the element for certain measure time.
	 * 
	 * @param - long time
	 * 
	 * @return - no return
	 */
	public WebDriverWait ExplicitlyWait(By locator,long time) {
		WebDriverWait wDW =null;
		try {
			wDW = new WebDriverWait(driver, Duration.ofMillis(100));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return wDW;
	}
	
	/*
	 * This method, webdriver will wait for the visibility of all element for certain measure time.
	 * 
	 * @param - long time
	 * 
	 * @return - no return
	 */
	public void ExplicitlyWaitForVisibilityOfAllElement(By locator,long time) {
		try {
			WebDriverWait eW=ExplicitlyWait(locator,time);
			eW.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			System.out.println("Explicitly- wait is work successfully");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// table Methods.....

	/*
	 * This method will check all the table checkboxes.
	 * 
	 * @param - String locator, String elementName
	 * 
	 * @return - no return
	 */
	public void checkAllCheckBoxes(String locator, String elementName) {
		List<WebElement> listCheckBox;
		listCheckBox = driver.findElements(By.xpath(locator));
		for (int i = 0; i < listCheckBox.size(); i++) {
			WebElement weCheckBox = listCheckBox.get(i);
			if (weCheckBox.isSelected() == false) {
				try {
					weCheckBox.click();
					System.out.println(elementName + "- all Check Boxes Checked successfully");
				} catch (StaleElementReferenceException e) {
					weCheckBox = listCheckBox.get(i);
					weCheckBox.click();
					System.out.println(
							elementName + " all Check Boxes checked successfully after handling Stale Exception");
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
		}
	}

	/*
	 * This method will uncheck all the table checkboxes.
	 * 
	 * @param - String locator, String elementName
	 * 
	 * @return - no return
	 */
	public void uncheckAllCheckBoxes(String locator, String elementName) {
		List<WebElement> listCheckBox;
		listCheckBox = driver.findElements(By.xpath(locator));
		for (int i = 0; i < listCheckBox.size(); i++) {
			WebElement weCheckBox = listCheckBox.get(i);
			if (weCheckBox.isSelected() == false) {
				try {
					weCheckBox.click();
					System.out.println(elementName + "- all Check Boxes unChecked successfully");
				} catch (StaleElementReferenceException e) {
					weCheckBox = listCheckBox.get(i);
					weCheckBox.click();

					System.out.println(
							elementName + " all Check Boxes unchecked successfully after handling Stale Exception");
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
		}
	}

	/*
	 * This method will get the tablecolumn size of table.
	 * 
	 * @param - String locator, String elementName
	 * 
	 * @return - no return
	 */
	public void getTableColumnSizeCout(String locator, String elementName) {
		List<WebElement> listCheckBox;
		int wecheckBoxSize = -1;
		try {
			listCheckBox = driver.findElements(By.xpath(locator));
			for (int i = 0; i < listCheckBox.size(); i++) {
				wecheckBoxSize = listCheckBox.size();
			}
			System.out.println(elementName + " Check Boxes size- " + wecheckBoxSize);
		} catch (StaleElementReferenceException e) {
			listCheckBox = driver.findElements(By.xpath(locator));
			System.out.println(elementName + " Check Boxes size- after handling Stale Exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will get Table ColumnNumber By ColumnName.
	 * 
	 * @param - String tableXpath, String tableName, String columnName
	 * 
	 * @return - int
	 */
	public int getTableColumnNumberByColumnName(String tableXpath, String tableName, String columnName) {
		int columnNumber = -1;
		List<WebElement> columnListName = driver.findElements(By.xpath(tableXpath + "//tr[1]//td"));
		String ColumnDataByName = null;
		for (int i = 0; i <= columnListName.size() - 1; i++) {
			try {
				ColumnDataByName = columnListName.get(i).getText();
				if (ColumnDataByName.equalsIgnoreCase(columnName) == true) {
					columnNumber = ++i;
					System.out.println("ColumnNumber of " + ColumnDataByName + " is " + columnNumber);
					break;
				}
			} catch (StaleElementReferenceException e) {
				columnListName = driver.findElements(By.xpath(tableXpath + "//tr[1]//td"));
				ColumnDataByName = columnListName.get(i).getText();
				System.out.println("ColumnNumber of " + ColumnDataByName + " is " + columnNumber);
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return columnNumber;
	}

	/*
	 * This method will get Table ColumnData List By ColumnNumber.
	 * 
	 * @param - String tableXpath, int columnNumber, String tableName
	 * 
	 * @return - List<String>
	 */
	public List<String> getTableColumnDataListByColumnNumber(String tableXpath, int columnNumber, String tableName) {
		List<WebElement> columnListByNumber = driver
				.findElements(By.xpath(tableXpath + "//tr//td[" + columnNumber + "]"));
		List<String> getColumnNameList = new ArrayList<>();
		String columnName = null;
		for (int i = 1; i < columnListByNumber.size(); i++) {
			columnName = columnListByNumber.get(i).getText();
			try {
				columnName = columnListByNumber.get(i).getText();
				getColumnNameList.add(columnName);
				System.out.println(columnName + " columnData List of  Find By ColumnNumber ");
			} catch (StaleElementReferenceException e) {
				columnListByNumber = driver.findElements(By.xpath(tableXpath + "//tr//td[" + columnNumber + "]"));
				columnName = columnListByNumber.get(i).getText();
				System.out.println(columnName + " columnData List By ColumnNumber  after handling Stale Exception");
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return getColumnNameList;
	}

	/*
	 * This method will get Table ColumnData List By ColumnName.
	 * 
	 * @param - String tableXpath, String tableName, String columnName
	 * 
	 * @return - List<String>
	 */
	public List<String> getTableColumnDataListByColumnName(String tableXpath, String tableName, String columnName) {

		int listOfColumnData = getTableColumnNumberByColumnName(tableXpath, tableName, columnName);
		List<String> listOfDataName = getTableColumnDataListByColumnNumber(tableXpath, listOfColumnData, tableName);
		return listOfDataName;
	}

	/*
	 * This method will get Table Row Size .
	 * 
	 * @param - String locator, String elementName
	 * 
	 * @return - no return
	 */
	public void getTableRowSizeCout(String locator, String elementName) {
		List<WebElement> listCheckBox;
		int wecheckBoxSize = -1;
		try {
			listCheckBox = driver.findElements(By.xpath(locator));
			for (int i = 0; i < listCheckBox.size(); i++) {
				wecheckBoxSize = listCheckBox.size();
			}
			System.out.println(elementName + " Check Boxes size- " + wecheckBoxSize);
		} catch (StaleElementReferenceException e) {
			listCheckBox = driver.findElements(By.xpath(locator));
			System.out.println(elementName + " Check Boxes size- after handling Stale Exception");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * This method will get Table RowDataNumber By RowName.
	 * 
	 * @param - String tableXpath, String tableName, String columnName
	 * 
	 * @return - int
	 */
	public int getTableRowDataNumberByRowName(String tableXpath, String tableName, String columnName) {
		int rowNumber = -1;
		List<WebElement> rowData = driver.findElements(By.xpath(tableXpath + "//tr//td[3]"));
		String rowLDataName = null;
		for (int i = 0; i < rowData.size(); i++) {
			try {
				rowLDataName = rowData.get(i).getText();
				if (rowLDataName.equalsIgnoreCase(columnName)) {
					rowNumber = ++i;
					System.out.println("RowNumber of " + rowLDataName + " is " + rowNumber);
					break;
				}
			} catch (StaleElementReferenceException e) {
				rowLDataName = rowData.get(i).getText();
				System.out.println(" Row RowNumber of- " + rowLDataName + " is " + " after handling Stale Exception ");
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return rowNumber;
	}

	/*
	 * This method will get Table RowData List By RowNumber.
	 * 
	 * @param - String tableXpath, int rowNumber, String rowName
	 * 
	 * @return - List<String>
	 */
	public List<String> getTableRowDataListByRowNumber(String tableXpath, int rowNumber, String rowName) {
		List<String> rowDataList = new ArrayList<>();
		List<WebElement> rowData = driver.findElements(By.xpath(tableXpath + "//tr[" + rowNumber + "]"));
		String rowDataListName = null;
		for (int i = 0; i < rowData.size(); i++) {
			try {
				rowDataListName = rowData.get(i).getText();
				rowDataList.add(rowDataListName);
				System.out.println(rowDataList + " rowData List of '" + rowName + "' Find By rowNumber ");

			} catch (StaleElementReferenceException e) {
				rowData = driver.findElements(By.xpath("//table[@class='lvt small']//tr//td[" + rowNumber + "]"));
				rowDataListName = rowData.get(i).getText();
				System.out.println(rowDataList + " rowData List of " + rowName + " - after handling Stale Exception");
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return rowDataList;
	}

	/*
	 * This method will get Table RowData List By RowName.
	 * 
	 * @param - String tableXpath, String tableName, String columnName
	 * 
	 * @return - List<String>
	 */
	public List<String> getTableRowDataListByRowName(String tableXpath, String tableName, String columnName) {

		int listOfRowData = getTableRowDataNumberByRowName(tableXpath, tableName, columnName);
		List<String> listOfDataName = getTableRowDataListByRowNumber(tableXpath, listOfRowData, tableName);
		return listOfDataName;
	}

	/*
	 * This method will get Table data.
	 * 
	 * @param - String tableXpath, String tableName
	 * 
	 * @return - no return
	 */
	public void printTableData(String tableXpath, String tableName) {
		List<WebElement> weTrList = driver.findElements(By.xpath(tableXpath + "//tr"));

		for (int i = 0; i <= weTrList.size() - 1; i++) {
			WebElement weTr = weTrList.get(i);

			List<WebElement> weTdList = driver.findElements(By.xpath(tableXpath + "//tr[" + (i + 1) + "]//td"));
			for (int j = 0; j <= weTdList.size() - 1; j++) {
				WebElement weTd = weTdList.get(j);
				String tdText = weTd.getText();
				System.out.print(tdText + " - ");
			}
			System.out.println(" ");

		}
	}

}

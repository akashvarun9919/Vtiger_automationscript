package import_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Action_Vtiger {

	public static int a; //// by default value -
	/// 0, 0.0, boolean - false , null

	public static void main(String[] args) {

		int[] numArr = { 234, 345, 345, 345634, 346, 5467 };
		String[] nameArr = { "Rahul1", "Rahul1", "Rahul3", "Rahul4" };
		nameArr[2] = "Ramesh";
		nameArr[0] = "Sandeep";
		int nameArrSize = nameArr.length;
		for (int i = 0; i < nameArrSize; i++) {
			String name = nameArr[i];
			System.out.println(name);
		}

		System.out.println(a);
		/// default value
		int num = 279;
		int[] myNumberArr = new int[num];
		/// we can't resize the array -
		/// task -

		/// Object - Array - int type - size length- 15
		String[] strArr = new String[2]; /// Object =- Array - String - size length - 20
		double[] myDblArr = new double[5];

		for (int i = 0; i <= myNumberArr.length - 1; i++) {
			myNumberArr[i] = 1000 + i;
		}
		for (int i = 0; i <= strArr.length - 1; i++) {
			strArr[i] = "Rahul" + i;
		}
		//// 10000000
		//// 56789

		/// Adjacent memory allocation 2499*20 - 49980
		int[] intArr = new int[1];

		int data = intArr[9];
		// Array - Data search

		/// 500001

		/// LinkedList

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajit\\eclipse-workspace\\Ajeet\\project\\Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("http://localhost:8888");
		WebElement weuserName = driver.findElement(By.xpath("//input[@name='user_name']"));
		// act.sendKeys(weuserName, "admin");
		weuserName.sendKeys("admin");
		WebElement weUserPass = driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPass.sendKeys("admin");
		// act.sendKeys(weUserPass, "admin");

		driver.findElement(By.xpath("//input[@name='Login']")).click();

		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// TC001 click header check box an verify all check boxes should be checked

		WebElement weCheck = driver.findElement(By.xpath("//input[@name='selectall']"));
		weCheck.click();

		if (weCheck.isSelected() == true) {
			System.out.println("Passed :All check bax is clicked ");
		} else {
			System.out.println("Failed :All check bax is not  clicked ");
		}
		for (int i = 1; i <= 20; i++) {
			boolean weSelectde = driver.findElement(By.xpath("(//input[@name='selected_id'])[" + i + "]")).isSelected();
			if (weSelectde == true) {
				System.out.println("Passed : check box is checked " + i);
			} else {
				System.out.println("Failed : check box is  unchecked " + i);

			}

		}

		weCheck.click();
		// TC002 check all check boxes and verify header check box should be click
		for (int i = 1; i <= 20; i++) {
			driver.findElement(By.xpath("(//input[@name='selected_id'])[" + i + "]")).click();
		}
		if (weCheck.isSelected() == true) {
			System.out.println("Passed :All check box is clicked ");
		} else {
			System.out.println("Failed :All check box is not clicked ");

		}

		// TC003 Uncheck header check box and verify all check boxes should be uncked

		weCheck.click();

		for (int i = 1; i <= 20; i++) {
			boolean weSelectde = driver.findElement(By.xpath("(//input[@name='selected_id'])[" + i + "]")).isSelected();
			if (weSelectde == false) {
				System.out.println("Passed : check box is unchecked " + i);
			} else {
				System.out.println("Failed : check box is  checked " + i);

			}

		}

	}
}

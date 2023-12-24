package oops_AbstractionConcept;

public class CreateNewAccount {

	public void signup(WebBrowser brw) {
		brw.searchElement().clear();
		brw.searchElement().sendKeys("akash");
		brw.searchElement().clear();
		brw.searchElement().sendKeys("varun");
		brw.searchElement().clear();
		brw.searchElement().sendKeys("akash@123");
		brw.searchElement().clear();
		brw.searchElement().sendKeys("123456");
		brw.searchElement().click();
	}
	
	
}

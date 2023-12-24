package oops_InheritanceConcepts;

import oops_AbstractionConcept.EdgeBrowser;

public class Test_Login {
 public void doLogin(WebBrowser browser) {
	 browser.searchElement().sendKeys("admin");
	 browser.searchElement().sendKeys("admin");
	 browser.searchElement().click();
 }
}

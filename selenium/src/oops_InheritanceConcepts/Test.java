package oops_InheritanceConcepts;

public class Test {

	public static void main(String[] args) {
		
		WebBrowser browser=new ChromeBrowser();
		ChromeBrowser wbc=(ChromeBrowser) browser;
	//	ChromeBrowser br=(ChromeBrowser)new WebBrowser();// ClassCastException
		ChromeBrowser cb= new ChromeBrowser();
		cb.clear();
		cb.close();
		WebBrowser eB=new EdgeBrowser();
		EdgeBrowser wbe = (EdgeBrowser)eB;
	    wbe.getCurrentUrl();
	    wbe.getTitle();
		browser.launchBrowser();
		browser.openUrl("http://flipcart.com/");
		browser.searchElement().getText("user_name");
		browser.searchElement().getText("user_password");
		browser.searchElement().clear();
		Test_Login tL=new Test_Login();
		tL.doLogin(browser);
		browser.close();
		EdgeBrowser ed= new EdgeBrowser();
		ed.close();
	    ed.clear();
	}

}

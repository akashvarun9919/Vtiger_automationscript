package oops_AbstractionConcept;



public class Test {

	public static void main(String[] args) {
		
		WebBrowser browser=new ChromeBrowser();
		browser.clear();
		browser.close();
		Test_Login tll=new Test_Login();
		tll.doLoginid(browser);
		CreateNewAccount cna=new CreateNewAccount();
		cna.signup(browser);
//		WebBrowser a=new EdgeBrowser(); 
		
	}

}

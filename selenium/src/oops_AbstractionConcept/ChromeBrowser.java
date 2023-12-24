package oops_AbstractionConcept;

public class ChromeBrowser extends WebBrowser{
	ChromeBrowser(){
		System.out.println("abcde");
	}
	
	public void getCurrentUrl() {
		System.out.println("Fetching Current Url from Browser");
	}
	public void getTitle() {
		System.out.println("Fetching Title from Browser");
	}
	@Override
	public void clear() {
		System.out.println("clear the chrome Browser");
	}
	@Override
	public void close() {
		System.out.println("Close the chrome Browser");
	}
	
}

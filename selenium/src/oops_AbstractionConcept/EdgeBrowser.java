package oops_AbstractionConcept;

public class EdgeBrowser extends WebBrowser {
	
	private EdgeBrowser(){//// can't create object out side the class
		
	}
	
	public void getCurrentUrl() {
		System.out.println("Fetching Current Url from Browser");
	}
	public void getTitle() {
		System.out.println("Fetching Title from Browser");
	}
	@Override
	public void clear() {
		System.out.println("clear the edge Browser");
	}
	@Override
	public void close() {
		System.out.println("Close edge Browser");
	}
}

package oops_InheritanceConcepts;

public class WebBrowser {
	public void launchBrowser() {
	System.out.println("Launching Browser");
	}
	public void openUrl(String url) {
		
		System.out.println("Open Url "+ url +" in Browser");
	}
	public void clear() {
		System.out.println("clear the Browser");
	}
	public void close() {
		System.out.println("Close Browser");
	}
	public PageElements searchElement() {
		System.out.println("Search Elements in Browser");
		PageElements element=new PageElements();
		return element;
	}
}

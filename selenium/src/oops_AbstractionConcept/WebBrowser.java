package oops_AbstractionConcept;

public  abstract class WebBrowser {
	  WebBrowser() {
	}
	
	public void launchBrowser() {
	System.out.println("Launching Browser");
	}
	public void openUrl(String url) {
		
		System.out.println("Open Url "+ url +" in Browser");
	}	
	public PageElements searchElement() {
		System.out.println("Search Elements in Browser");
		PageElements element=new PageElements();
		return element;
	}
	public abstract void clear();
	
	public abstract void close();
}

package oops_AbstractionConcept;

public class PageElements {
  public void sendKeys(String value) {
	  System.out.println("Enter value "+ value+" in Element");
  }
  public void clear() {
	  System.out.println("Clear the Elemenet");
  }
  public void click() {
	  System.out.println("Click the Elemenet");
}  
  public void getText(String text) {
	  System.out.println("GetText "+text+" from Elemenet");
  }

}

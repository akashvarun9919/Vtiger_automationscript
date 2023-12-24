package method_hiding;

public class Method_HidingConcept {

   public static void m() {
		System.out.println("hello");
	}
	
	

}
class Sample extends Method_HidingConcept {
	
   public static void m() {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		m();
	//	Method_HidingConcept.m();
	}
	
}
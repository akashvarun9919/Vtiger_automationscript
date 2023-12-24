package oops_InheritanceConcepts;

public class A extends B{
  public int sum;
	public A (){
	super(12);
	System.out.println("A Constructor");
	
	}
	
	public void B1 (int sum) {
		this.B(20);
		System.out.println("B1 method -"+this.sum);
	}
	public void B (int sum) {
		super.B(200);
		System.out.println(super.sum);
		System.out.println(" i am A orignal A ");
	}
}
//Example of Mulilevel inheritance class A class B and class C...
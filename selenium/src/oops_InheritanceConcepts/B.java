package oops_InheritanceConcepts;

public class B extends C{
	public int sum=1000;

	public B(int sum) {
		
		System.out.println("B Constructor -"+sum);
	}

	public void B(int sum) {
		sum=sum;
		System.out.println(sum);
		System.out.println(" i am B orignal B ");

	}

}

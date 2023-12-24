package oops_AbstractionConcept;

public  class A {

	int a=100;
	A(int a){
		a=a;
		
		
	}
	public void  show() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		A ab=new A(10);
		ab.show();
	}

}

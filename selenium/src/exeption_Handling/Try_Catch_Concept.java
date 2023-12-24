package exeption_Handling;

public class Try_Catch_Concept {

	public static void main(String[] args) {
		int num = 100, num1 =0;
		System.out.println("My int value is 100");
		System.out.println("Then i am dividing int value by 0");
		
		try{
			int result = num/0;
			
			
		}
		catch (ArithmeticException aE) {
			System.out.println("Exception should be handaled");
			try {
			int div = num/0;
					
		}catch(ArithmeticException a){
			System.out.println("Exception should be handaled again");
		}		
		}
		System.out.println(num);
		System.out.println("After Exeption handale i move to next step ");
	
	
	}

}

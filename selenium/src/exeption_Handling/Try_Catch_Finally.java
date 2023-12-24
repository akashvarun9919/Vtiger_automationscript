package exeption_Handling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		int i =10, y=0, z,x,m;
		ChromeDriver di = null ;
	
		for(int j=0;j<3;j++) {
	
		try {
			System.out.println("first try block");
//			System.out.println(z=15/0);
//			System.out.println(  di.location());
//			System.out.println(y=5/0);
			
			try {
				System.out.println("aaaaa");
				System.out.println(y=5/0);
			}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException exception 1st handle 1st catch");
//			System.out.println(z=i/y);
		}
		finally {
			System.out.println("bbbbbb");
			System.out.println(y=5/0);
			
		}
		}
			catch(NullPointerException e){
				System.out.println("ArithmeticException exception 1st handle 1st catch");
				System.out.println(z=15/3);
		}finally {
			System.out.println("2nd finally");
			
		}
		System.out.println("normal statement 1");
		}
	
	}
	
		
	
	
	
	}



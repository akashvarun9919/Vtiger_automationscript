package exeption_Handling;

public class CustomizedDemoException {

	public static void main(String[] args) {
		int age = 24;//Integer.parseInt(args[0]);
		if(age>18 && age<59) {
			throw new TooYoungAge("please wait you get best match...");
		}
		else if(age<18) {
			throw new TooOldAge("you are two young for marrige");
		}
		else {
			System.out.println("notify through Email");
		}
	}

}
class TooYoungAge extends RuntimeException {
	TooYoungAge(String s){
		super(s);
	}
}
class TooOldAge extends RuntimeException{
	TooOldAge(String s){
		super(s);
	}
}
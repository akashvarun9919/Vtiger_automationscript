package exeption_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.io.Files;

public class Exception_Overriding_Concept {

	public static void main(String[] args) {
		
	}
    public void m1() throws Exception{
		
	}
	
	
}
class B extends Exception_Overriding_Concept{
	 
	public void m1() throws IOException,FileNotFoundException{
		//FileInputStream fis = new FileInputStream("");
	}
	
	
	
	
}
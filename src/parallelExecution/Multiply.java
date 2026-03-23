package parallelExecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
	
	@Test
	@Parameters({"a","b"})
	public void multiply(int c,int d) {
		
		int multiply = c*d;
		System.out.println("Multiplication of two numbers is:"+multiply);
	}

}

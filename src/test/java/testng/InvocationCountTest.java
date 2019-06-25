package testng;

import org.testng.annotations.*;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void sum(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is==="+ c);
	}
	
//	@Test(expectedExceptions=NumberFormatException.class)
//	public void Exception(){
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println("sum is==="+ c);
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x ="100x";
		Integer.parseInt(x);
	}
	
	
	
}
package testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	
//	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
//	public void infintLoopTest(){
//		int i = 1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1(){
		String x = "100A";
		Integer.parseInt(x);
	}
//	
//	@Test(timeOut =2000)  //Will stop the loop after 2 secs
//	public void infiniteLoop() {
//		int i = 1;
//		while (i==1) {
//			System.out.println("infinite loop");
//		}
//	}
	

}
package testngAnnotationAttributes;

import org.testng.annotations.Test;

public class AnnotationAttributeTimeout {
	
	@Test(timeOut=200)
	public void TestOne() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("This is first test case");
	}
	@Test
	public void TestTwo() {
		System.out.println("This is second test case");
	}
	@Test
	public void TestThree() {
		System.out.println("This is third test case");
	}

}

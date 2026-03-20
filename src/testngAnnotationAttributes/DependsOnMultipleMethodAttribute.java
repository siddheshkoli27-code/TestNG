package testngAnnotationAttributes;

import org.testng.annotations.Test;

public class DependsOnMultipleMethodAttribute {

	@Test(dependsOnMethods = { "testcase2()", "testcase3()" })
	public void testcase1() {
		System.out.println("This is test case 1");
	}

	@Test
	public void testcase2() {
		System.out.println("This is test case 2");
	}

	@Test
	public void testcase3() {
		System.out.println("This is test case 3");
	}
}

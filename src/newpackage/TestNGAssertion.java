package newpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	
	@Test
	public void TestOne() {
		Assert.assertTrue(true, "Asset failed as actual condition is True");
	}
	@Test
	public void TestTwo() {
		Assert.assertFalse(false, "Assert failed as actual condition is false");
	}
	@Test
	public void TestThree() {
		String s ="Siddhesh";
		Assert.assertNotNull(s,"Assert Fails as String is Null");
	}
	@Test
	public void TestFour() {
		String s =null;
		Assert.assertNull(s,"Assert Fails as String is not null");
	}
	@Test
	public void TestFive(){
		String s1="Sidd";
		String s2="Sidd";
		Assert.assertEquals(s1, s2,"Assert fails as string are not equal");
	}
	@Test
	public void TestSix() {
		String s1="Sidd";
		String s2="Sidd1";
		Assert.assertNotEquals(s1, s2,"Assert fails as string are equal");
	}

}

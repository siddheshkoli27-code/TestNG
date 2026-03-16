package newpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestAnnotations {

		@Test
		public void testCase1() {
			System.out.println("This is Normal Test Case1");
		}
		@Test
		public void testCase2() {
			System.out.println("This is Normal Test Case 2");
		}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("This will execute before every method");
		}
		@AfterMethod
		public void afterMethod() {
		System.out.println("This will execute after every method");	
		}
		@BeforeClass
		public void BeforeClass() {
			System.out.println("This will execute Before the Class");
		}
		@AfterClass
		public void AfterClass() {
			System.out.println("This will execute After the Class");
		}
		@BeforeTest
		public void BeforeTest() {
			System.out.println("This will execute before Test");
		}
		@AfterTest
		public void AfterTest() {
			System.out.println("This will execute after Test");
		}
		@BeforeSuite
		public void BeforeSuite() {
			System.out.println("This will execute before suite");
		}
		@AfterSuite
		public void AfterSuite() {
			System.out.println("This will execute after suite");
		}
		
	}



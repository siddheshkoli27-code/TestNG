package testngAnnotationAttributes;

import org.testng.annotations.Test;

public class AnnotationAttributeDescription {
	
	@Test(description="This is test case for HR")
	public void HR() {
		System.out.println("HR");
	}
	
	@Test(description="This is test case for Quality Analyst")
	public void QA() {
		System.out.println("QA");
	}

}

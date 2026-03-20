package testngAnnotationAttributes;

import org.testng.annotations.Test;

public class EnabledAttribute {

	@Test
	public void c_language() {
		System.out.println("This is C language");
	}

	@Test
	public void Java_language() {
		System.out.println("This is Java Language");
	}

	@Test(enabled = false)
	public void python_language() {
		System.out.println("Python");
	}

}

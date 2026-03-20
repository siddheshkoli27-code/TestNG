package testngAnnotationAttributes;

import org.testng.annotations.Test;

public class GroupAttribute {

	@Test(groups = { "software company" })
	public void infosys() {
		System.out.println("Infosys");
	}

	@Test
	public void technip() {
		System.out.println("Technip");
	}

	@Test(groups = { "software company" })
	public void wipro() {
		System.out.println("Wipro");
	}

}

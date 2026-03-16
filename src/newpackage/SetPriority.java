package newpackage;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority=6)
	public void c_method() {
		System.out.println("I am in method C");
	}
	@Test(priority=9)
	public void b_method() {
		System.out.println("I am in method B");
	}
	@Test(priority=1)
	public void a_method() {
		System.out.println("I am in method A");
	}
	@Test(priority=0)
	public void e_method() {
		System.out.println("I am in method E");
	}
	@Test(priority=3)
	public void d_method() {
		System.out.println("I am in method D");
	}

}

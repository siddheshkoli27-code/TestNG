package newpackage;

import org.testng.annotations.Test;

public class PrioritizedAndNonPrioritized {
	
	@Test
	public void c_method() {
		System.out.println("I am in method C");
	}
	@Test
	public void d_method() {
		System.out.println("I am in method D");
	}
	@Test(priority=0)
	public void a_method() {
		System.out.println("I am in method A");
	}
	@Test(priority=0)
	public void b_method() {
		System.out.println("I am in method B");
	}
	@Test(priority=9)
	public void method_e() {
		System.out.println("I am in method E");
	}
	@Test(priority=6)
	public void method_f() {
		System.out.println("I am in method F");
	}

}

package Priority;

import org.testng.annotations.Test;

public class TestNgPriorityDemo {

	@Test(priority = 1)
	public void one() {

		System.out.println("I am inside Test1");
	}

	@Test(priority = 1)
	public void two() {
		System.out.println("I am inside Test2");
	}

	@Test(priority = 1)
	public void three() {
		System.out.println("I am inside Test3");
	}
}

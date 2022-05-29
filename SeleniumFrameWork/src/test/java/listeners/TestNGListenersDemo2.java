package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo2 {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
		
	}
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
		
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");
		
	}
	
}

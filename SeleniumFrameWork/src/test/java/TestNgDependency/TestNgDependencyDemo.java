package TestNgDependency;

import org.testng.annotations.Test;

public class TestNgDependencyDemo {

	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("I am Inside Test 1");
	}
	

	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("I am Inside Test 2");
	}
	
	@Test(groups = {"sanity2"})
	public void test3() {
		System.out.println("I am Inside Test 3");
	}
}

package demo;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {
	
	// dependencies takes precedence over priorities
	
	@Test(dependsOnMethods= {"test3"}, priority = 1)
	public void test1() {
		System.out.println("I m in test1");
	}

	@Test(groups= {"gk"}, priority = 2)
	public void test2() {
		System.out.println("I m in test2");
	}
	
	@Test(dependsOnGroups= {"gk"}, priority = 3)
	public void test3() {
		System.out.println("I m in test3");
	}

}

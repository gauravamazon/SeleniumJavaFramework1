package demo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	
	@Test(groups= {"sanity"})
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test(groups= {"smoke"})
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		
		System.out.println("Test3");
		
	}
	
	@Test
	public void test4() {
		
		System.out.println("Test4");
		
	}

}

package demo;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listerners.RetryAnalyzer;
import junit.framework.Assert;


public class TestNGRunFailedTests {
	
	@Test
	
	public void test1() {
		
		System.out.println("this is Test1");
	}
	
	//@Test(retryAnalyzer = Listerners.RetryAnalyzer.class)
	public void test2() {
		
		System.out.println("this is Test2");
		int i=1/0;
		
	}

	@Test(retryAnalyzer = Listerners.RetryAnalyzer.class)
	public void test3() {
		
		System.out.println("this is Test3");
		Assert.assertTrue(false);
	}

}

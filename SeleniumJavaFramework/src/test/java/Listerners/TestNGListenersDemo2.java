package Listerners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNG_Listeners.class)
public class TestNGListenersDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside Test2");
		
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside Test3");
		throw new SkipException("this tets is skipped");
	}

}

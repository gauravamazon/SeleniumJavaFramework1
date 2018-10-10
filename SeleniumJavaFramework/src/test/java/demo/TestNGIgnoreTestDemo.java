package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreTestDemo {
	
	@Test
	
	public void test1() {
		
		System.out.println("this is Test1");
	}
	
	@Test
	@Ignore
	public void test2() {
		
		System.out.println("this is Test2");
	}

}

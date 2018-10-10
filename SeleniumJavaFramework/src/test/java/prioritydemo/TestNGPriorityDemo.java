package prioritydemo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	


	@Test(priority = 1)
	public void one() {
		System.out.println("Test #1");

	}

	@Test(priority = 0)
	public void two() {
		System.out.println("Test #2");

	}

	@Test(priority = -2)
	public void three() {
		System.out.println("Test #3");

	}
}

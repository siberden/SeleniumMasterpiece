package testNG;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	@Test(groups="car")
	public void mahindra()
	{
	System.out.println("Mahindra car");
	}

	@Test(groups="car")
	public void tata()
	{
	System.out.println("tata car");
	}
	@Test(groups="bike")
	public void yamaha()
	{
	System.out.println("yamaha bike");
	}
}

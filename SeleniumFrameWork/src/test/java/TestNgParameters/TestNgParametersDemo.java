package TestNgParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParametersDemo {

	@Test
	@Parameters("MyName")
	public void test(@Optional("Shubham") String name) {
		
		System.out.println("Name is  : "+name);
	}
}

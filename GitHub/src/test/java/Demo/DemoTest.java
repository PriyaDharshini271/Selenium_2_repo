package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void addMessage() {
		Reporter.log("Hii");
	}

}

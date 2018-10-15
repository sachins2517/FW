package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class DemoA extends BaseTest {

	@Test
	public void testA() {
		String un = Utility.getXLData(DATA_PATH, "DemoA", 0, 0);
		String pw = Utility.getXLData(DATA_PATH, "DemoA", 0, 1);
		
		LoginPage l = new LoginPage(driver);
		l.setUsername(un);
		l.clickNext();
		l.setPassword(pw);
		l.clickLogin();
	}
}

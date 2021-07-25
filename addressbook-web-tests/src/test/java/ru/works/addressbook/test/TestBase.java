package ru.works.addressbook.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.works.addressbook.appmanager.ApplicationManager;

public class TestBase {

	protected final ApplicationManager app = new ApplicationManager();

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		app.init();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		app.stop();
	}

}
package ru.works.addressbook.test;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

	@Test
	public void testGroupCreation() throws Exception {
		app.goToGroupPage();
		app.initGroupCreation();
		app.fillGroupForm(new GroupData("firstGroup", "group1", "test group 1"));
		app.submitGroupCreation();
		app.returnToGroupPage();
	}

}

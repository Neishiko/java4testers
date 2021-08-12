package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

	@Test
	public void testGroupCreation() throws Exception {
		app.getNavigationHelper().goToGroupPage();
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(new GroupData("firstGroup", "group1", "test group 1"));
		app.getGroupHelper().submitGroupCreation();
		app.getGroupHelper().returnToGroupPage();
	}

}

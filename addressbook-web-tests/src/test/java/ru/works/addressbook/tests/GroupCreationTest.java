package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

	@Test
	public void testGroupCreation() throws Exception {
		app.getNavigationHelper().goToGroupPage();
		app.getGroupHelper().createGroup(new GroupData("firstGroup", null, null));
	}

}

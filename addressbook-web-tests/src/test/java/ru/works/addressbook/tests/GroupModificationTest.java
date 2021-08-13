package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase{

	@Test
	public void testGroupModification(){
		app.getNavigationHelper().goToGroupPage();
		app.getGroupHelper().selectGroup();
		app.getGroupHelper().editGroup();
		app.getGroupHelper().fillGroupForm(new GroupData("TestGroup1", "TestGroup1", "Test Group 1"));
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupPage();
	}
}

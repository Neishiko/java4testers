package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase{

	@Test
	public void testGroupModification(){
		app.getNavigationHelper().goToGroupPage();
		if (app.getGroupHelper().isThereAGroup()){
			app.getGroupHelper().createGroup(new GroupData("firstGroup", null, null));
		}
		app.getGroupHelper().selectGroup();
		app.getGroupHelper().editGroup();
		app.getGroupHelper().fillGroupForm(new GroupData("TestGroup1", null, null));
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupPage();
	}
}

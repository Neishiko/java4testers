package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase{

	@Test
	public void testGroupDeletion() {
		app.getNavigationHelper().goToGroupPage();
		if (app.getGroupHelper().isThereAGroup()){
			app.getGroupHelper().createGroup(new GroupData("firstGroup", null, null));
		}
		app.getGroupHelper().selectGroup();
		app.getGroupHelper().deleteSelectedGroup();
		app.getGroupHelper().returnToGroupPage();
	}
}

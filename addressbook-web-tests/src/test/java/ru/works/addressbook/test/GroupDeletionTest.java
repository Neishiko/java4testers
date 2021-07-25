package ru.works.addressbook.test;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

	@Test
	public void testGroupDeletion() throws Exception {
		app.goToGroupPage();
		app.selectGroup();
		app.deleteSelectedGroup();
		app.returnToGroupPage();
	}

}

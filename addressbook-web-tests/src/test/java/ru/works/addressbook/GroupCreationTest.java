package ru.works.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

	@Test
	public void testGroupCreation() throws Exception {
		goToGroupPage();
		initGroupCreation();
		fillGroupForm(new GroupData("firstGroup", "group1", "test group 1"));
		submitGroupCreation();
		returnToGroupPage();
	}

}

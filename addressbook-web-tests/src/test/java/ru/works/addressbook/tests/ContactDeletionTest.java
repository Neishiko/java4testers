package ru.works.addressbook.tests;

import org.testng.annotations.Test;


public class ContactDeletionTest extends TestBase{

	@Test
	public void testContactDeletion() {
		app.getContactHelper().selectContact();
		app.getContactHelper().deleteContact();
		app.getContactHelper().confirmContactDeleting();
		app.getNavigationHelper().returnToHomePage();
	}
}

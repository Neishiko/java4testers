package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;


public class ContactDeletionTest extends TestBase{

	@Test
	public void testContactDeletion() {
		if (app.getContactHelper().isThereAContact()){
			app.getContactHelper().createContact(new ContactData("firstGroup", null, null));
			app.getNavigationHelper().returnToHomePage();
		}
		app.getContactHelper().selectContact();
		app.getContactHelper().deleteContact();
		app.getContactHelper().confirmContactDeleting();
		app.getNavigationHelper().returnToHomePage();
	}
}

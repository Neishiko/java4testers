package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

	@Test
	public void testContactModification() {
		if (app.getContactHelper().isThereAContact()){
			app.getContactHelper().createContact(new ContactData("firstGroup", null, null));
			app.getNavigationHelper().returnToHomePage();
		}
		app.getContactHelper().editContact();
		app.getContactHelper().fillContactForm(new ContactData("Tester", "Testing", "test@mail.com"));
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().returnToHomePage();
	}
}

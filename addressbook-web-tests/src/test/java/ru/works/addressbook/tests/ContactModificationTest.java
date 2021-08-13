package ru.works.addressbook.tests;

import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

	@Test
	public void testContactModification() {
		app.getContactHelper().editContact();
		app.getContactHelper().fillContactForm(new ContactData("Tester", "Testing", "test@mail.com"));
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().returnToHomePage();
	}
}

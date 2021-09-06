package ru.works.addressbook.tests;


import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

	@Test
	public void testContactCreation() throws Exception {
		app.getContactHelper().createContact(new ContactData("Firstname", "Lastname", "email@mail.com"));
		app.getNavigationHelper().returnToHomePage();
	}
}

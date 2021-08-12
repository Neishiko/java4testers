package ru.works.addressbook.tests;


import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

	@Test
	public void testContactCreation() throws Exception {
		app.getContactHelper().initContactCreation();
		app.getContactHelper().fillContactForm(new ContactData("Firstname", "Lastname", "email@mail.com"));
		app.getGroupHelper().submitGroupCreation();
		app.getNavigationHelper().returnToHomePage();
	}
}

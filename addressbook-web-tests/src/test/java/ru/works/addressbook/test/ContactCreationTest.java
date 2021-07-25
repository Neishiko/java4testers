package ru.works.addressbook.test;


import org.testng.annotations.Test;
import ru.works.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

	@Test
	public void testContactCreation() throws Exception {
		app.initContactCreation();
		app.fillContactForm(new ContactData("Firstname", "Lastname", "email@mail.com"));
		app.submitGroupCreation();
		app.returnToHomePage();
	}
}

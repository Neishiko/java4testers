package ru.works.addressbook;


import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

	@Test
	public void testContactCreation() throws Exception {
		initContactCreation();
		fillContactForm(new ContactData("Firstname", "Lastname", "email@mail.com"));
		submitGroupCreation();
		returnToHomePage();
	}
}

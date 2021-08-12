package ru.works.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.works.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(WebDriver wd) {
		super(wd);
	}

	public void initContactCreation() {
		wd.findElement(By.linkText("add new")).click();
	}

	public void fillContactForm(ContactData contactData) {
		type(By.name("firstname"),contactData.getFirstname());
		type(By.name("lastname"),contactData.getLastname());
		type(By.name("email"),contactData.getEmail());
	}
}

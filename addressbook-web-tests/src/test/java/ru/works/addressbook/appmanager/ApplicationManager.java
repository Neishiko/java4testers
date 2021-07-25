package ru.works.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.works.addressbook.model.ContactData;
import ru.works.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	private WebDriver wd;

	public void init() {
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.get("http://localhost/addressbook/");
		login("admin", "secret");
	}

	private void login(String username, String password) {
		wd.findElement(By.name("user")).click();
		wd.findElement(By.name("user")).clear();
		wd.findElement(By.name("user")).sendKeys(username);
		wd.findElement(By.name("pass")).click();
		wd.findElement(By.name("pass")).clear();
		wd.findElement(By.name("pass")).sendKeys(password);
		wd.findElement(By.xpath("//input[@value='Login']")).click();
	}

	public void goToGroupPage() {
		wd.findElement(By.linkText("groups")).click();
	}

	public void initGroupCreation() {
		wd.findElement(By.name("new")).click();
	}

	public void fillGroupForm(GroupData groupData) {
		wd.findElement(By.name("group_name")).click();
		wd.findElement(By.name("group_name")).clear();
		wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
		wd.findElement(By.name("group_header")).clear();
		wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
		wd.findElement(By.name("group_footer")).click();
		wd.findElement(By.name("group_footer")).clear();
		wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
	}

	public void submitGroupCreation() {
		wd.findElement(By.name("submit")).click();
	}

	public void initContactCreation() {
		wd.findElement(By.linkText("add new")).click();
	}

	public void fillContactForm(ContactData contactData) {
		wd.findElement(By.name("firstname")).click();
		wd.findElement(By.name("firstname")).clear();
		wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
		wd.findElement(By.name("lastname")).click();
		wd.findElement(By.name("lastname")).clear();
		wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
		wd.findElement(By.name("email")).click();
		wd.findElement(By.name("email")).clear();
		wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
	}

	public void returnToHomePage() {
		wd.findElement(By.linkText("home page")).click();
	}

	public void deleteSelectedGroup() {
		wd.findElement(By.name("delete")).click();
	}

	public void selectGroup() {
		wd.findElement(By.name("selected[]")).click();
	}

	public void returnToGroupPage() {
		wd.findElement(By.linkText("group page")).click();
	}

	public void stop() {
		wd.quit();
	}
}
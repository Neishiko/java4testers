package ru.works.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.works.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

	public GroupHelper(WebDriver wd) {
		super(wd);
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}

	public void fillGroupForm(GroupData groupData) {
		type(By.name("group_name"), groupData.getName());
		type(By.name("group_header"), groupData.getHeader());
		type(By.name("group_footer"), groupData.getFooter());
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void deleteSelectedGroup() {
		click(By.name("delete"));
	}

	public void selectGroup() {
		click(By.name("selected[]"));
	}

	public void returnToGroupPage() {
		click(By.linkText("groups"));
	}

	public void editGroup() {
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
	}

	public void createGroup(GroupData group) {
		initGroupCreation();
		fillGroupForm(group);
		submitGroupCreation();
		returnToGroupPage();
	}

	public boolean isThereAGroup() {
		return !isElementPresent(By.name("selected[]"));
	}
}

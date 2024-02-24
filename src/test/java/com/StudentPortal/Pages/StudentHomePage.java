package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentHomePage extends BaseLocators{

	public StudentHomePage MenuButton() throws Exception {
		  
		wait(10);
		Menu.clickUsingJavaScriptExecutor();
		wait(5);
		return this;
	}
	
	public StudentHomePage StudentButton() throws Exception{
		Students.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		return this;
	}

	public StudentHomePage SettingsButton() throws Exception{
		Settings.clickUsingJavaScriptExecutor();
		wait(2);
		return this;
	}

	public StudentHomePage ConfigurationButton() throws Exception{
		Configuration.clickUsingJavaScriptExecutor();
		wait(15);
		return this;
	}

	public StudentHomePage ProcessesButton() throws Exception{
		Processes.clickUsingJavaScriptExecutor();
		wait(15);
		return this;
	}
	
	public StudentHomePage TaskButton() throws Exception{
		Tasks.clickUsingJavaScriptExecutor();
		wait(20);
		return this;
	}
	
	public StudentHomePage ClassSchedulingButton() throws Exception{
		ClassScheduling.clickUsingJavaScriptExecutor();
		wait(25);
		return this;
	}
	
	public StudentHomePage GroupsButton() throws Exception{
		Groups.clickUsingJavaScriptExecutor();
		wait(20);
		return this;
	}
	
	public StudentHomePage SearchStudent1(StringHash data)throws Exception {

		Link ClickStudent = new Link("Select Student",byXPath("//span[.='"+data.get("StudentName")+"']"));
		Button FilterDropDwon = new Button("Filter Drop Down", byXPath("//div[@id='listSettingsButton_wrapper']/button[2]"));
		Button ClearFiltersButton = new Button("Filter Button", byXPath("//span[text()='Clear Filters']"));
		Dropbox StuNumDropDown = new Dropbox("Student Number Dropdown", byXPath("//a[@title='Student Number edit column settings']/span[1]"));
		Button StuNumFilter = new Button("Stud Num Filter", byXPath("(//span[text()='Filter'])[1]"));
		TextField value = new TextField("Student Number Value", byXPath("//input[@title='Value']"));
		Button FilterButton = new Button("Filter Button", byXPath("(//span[text()='Filter'])[2]"));
		Dropbox CampusDropdown = new Dropbox("Campus Dropdown", byXPath("//span[@aria-controls='studentCampusIdDropDown_listbox']"));
		Link Campus = new Link("Campus", byXPath("//span[.='"+data.get("Campus")+"']"));
		Button ApplyFilter= new Button("Apply Filter", byXPath("//button[.='Apply Filter']"));
		TextField Search = new TextField("Student Name Search", byXPath("//input[@id='basicSearchSearchField']"));
		
		wait(5);
		CampusDropdown.waitTillElementClickable();
		CampusDropdown.click();
		wait(2);
		Campus.waitTillElementClickable();
		Campus.click();
		wait(2);
		ApplyFilter.waitTillElementClickable();
		ApplyFilter.click();
		wait(10);
		//Search.clearAndType(data.get("StudentName"));
		FilterDropDwon.waitTillElementClickable();
		FilterDropDwon.click();
		wait(2);
		ClearFiltersButton.waitTillElementClickable();
		ClearFiltersButton.click();
		wait(8);
		StuNumDropDown.waitTillElementClickable();
		StuNumDropDown.click();
		wait(2);
		StuNumFilter.waitTillElementClickable();
		StuNumFilter.click();
		wait(2);
		value.waitTillElementClickable();
		value.clearAndType(data.get("StudentNumber"));
		wait(2);
		FilterButton.waitTillElementClickable();
		FilterButton.click();
		wait(5);
		ClickStudent.waitTillElementClickable();
		ClickStudent.click();
		String StdName = ClickStudent.getText();
		TestReportsLog.log(LogStatus.INFO, "Selected Student is "+StdName);
		waitForPageToLoad();
		return this;
	}


	public StudentHomePage CreateLetter(StringHash data) throws Exception {

		Link TaskMsg = new Link("TaskMsg", byXPath("//span[text()='The Task records were successfully saved.']"));
		Link RoleSelect = new Link("Role", byXPath("//li[text()='"+data.get("Role")+"']"));
		Link SelectingEmployer = new Link("Selecting searched employer", byXPath("//a[text()='"+data.get("EmpName")+"']"));
		Link SelectingTaskTemp = new Link("Selecting task template", byXPath("//a[text()='//span[text()='"+data.get("TaskTemplate")+"']']"));
		Checkbox SelectingStudent = new Checkbox("Selecting Student", byXPath("//div[@id='searchModel_searchgrid}']/div[2]/table/tbody/tr[1]/td[1]/input"));
		
		SearchConfiguration.waitTillElementClickable();
		SearchConfiguration.click();
		SearchConfiguration.clearAndType(data.get("Component").toString());
		wait(5);
		Employers.waitTillElementClickable();
		Employers.click();
		wait(12);
//		GlobalSearch.sendKeys(data.get("EmpName"));
		Dropdown.click();
		wait(2);
		Filter.click();
		wait(2);
		EmployerValue.clearAndType(data.get("EmpName"));
		wait(2);
		FilButton.click();
		wait(2);
		SelectingEmployer.click();
		wait(15);
		Task.click();
		wait(5);
		Newtask.click();
		wait(8);
		TaskTemplateName.clearAndType(data.get("TaskTemplate"));
		wait(1);
		SelectingTaskTemp.click();
		wait(8);
		Student.clickUsingJavaScriptExecutor();
		wait(4);
		//SearchName.clearAndType(data.get("FullName"));
		//wait(3);
		SelectingStudent.click();
		String SelectedStudent = SelectingStudent.getAttribute("aria-label");
		System.out.println(SelectedStudent);
		TestReportsLog.log(LogStatus.INFO, "Selected Student is "+SelectedStudent);
		wait(2);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(3);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(TaskMsg.getText(), data.get("TaskMsg").toString());
		return this;
		//End of Menu Button	

	}

}


package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;
public class StudentContactManagerPage extends BaseLocators{
	
	
	public StudentContactManagerPage CloseTask(StringHash data) throws Exception{
		
		Button HighlightTask = new Button("Highlight Task", byXPath("(//tr[1]/td[2])[1]"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Task records were successfully closed.']"));
		 Link ContactManager = new Link("Contact Manager", byXPath("//a[@aria-label='Contact Manager']"));
		 Link TasksSpan = new Link("TasksSpan", byXPath("//span[text()='Tasks']"));
		 Link Dontsave = new Link ("Dontsave",byXPath("//button[@id='cnsDirtyCheckUnsavedChangesDialogNotOkButton']"));
		 Link TaskSettings = new Link("Settings",byXPath("//button[contains(@id,'cnsToolbar_kendoToolBar_settingsButton')]"));
		 Link TaskClearFilter = new Link("Clear Filter",byXPath("//*[contains(@id,'cnsToolbar_kendoToolBar_clearPreferencesButton')]"));
		 TextField Subjectdropdown = new TextField("Subject Dropdown",byXPath("//th[@data-field='Subject']//a[1]/span"));
		 Button FilterOptions = new Button("Filter", byXPath("(//span[.='Filter'])[1]"));
		 TextField value = new TextField("Value", byXPath("//input[@title='Value']"));
		 Button Filterbutton = new Button("Filter icon", byXPath("(//span[text()='Filter'])[2]"));
		 TextField Statusdropdown = new TextField("Status Dropdown",byXPath("//th[@data-field='TaskStatusName']//a[1]/span"));
		 Button FilterOptions2 = new Button("Filter options", byXPath("(//span[text()='Filter'])[3]"));
		 TextField Value2 = new TextField("Enter filter value", byXPath("(//input[@title='Value'])[2]"));
		 Button Filterbutton2 = new Button("Filter icon", byXPath("(//span[text()='Filter'])[4]"));
		 Button CloseTask = new Button("Close Task", byXPath("//button/span[text()='Close Task']"));
		 TextField TaskNote = new TextField("Note", byXPath("//textarea[@id=\"note\"]"));
		 Button TaskSaveClose = new Button("Save and Close", byXPath("//button[@id=\"studentTaskCloseDialogButton\"]"));
		
		
		
		ContactManager.click();
		wait(2);
		TasksSpan.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		TaskSettings.clickUsingJavaScriptExecutor();
		wait(2);
		TaskClearFilter.clickUsingJavaScriptExecutor();
		wait(3);
		Subjectdropdown.clickUsingJavaScriptExecutor();
		//SearchSubject.clearAndType(data.get("TaskTemplate").toString());
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("TaskTemplate").toString());
		wait(2);
		Filterbutton.click();
		/*
		 * SubjectDropDown.click(); wait(2); AssignedToFilter.click(); wait(2);
		 * AssignedToValue.clearAndType(data.get("TaskSubject")); wait(2);
		 * AssignedToFilterButton.click();
		 */
		Statusdropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions2.click();
		wait(2);
		Value2.clearAndType(data.get("Status").toString());
		wait(2);
		Filterbutton2.click();
		wait(3);
		HighlightTask.click();
		wait(5);
		CloseTask.clickUsingJavaScriptExecutor();
		wait(18);
		TaskNote.sendKeys("Close");
//		Comments.sendKeys("Close");
//		wait(1);
//		SaveAndClose.clickUsingJavaScriptExecutor();
//		wait(5);
//		Comments.sendKeys("Closing the task");
//		wait(2);
		wait(2);
		TaskSaveClose.click();
		wait(6);
//		CloseAndFolloup.clickUsingJavaScriptExecutor();
//	//	waitForPageToLoad();
//		wait(10);
//		ConfirmCloseTask.click();
//		wait(7);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Task is closed successfully");
		return this;
	}
	
	public StudentContactManagerPage AddFADocumentPage(StringHash data) throws Exception{

		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Document records were successfully saved.']"));
		Dropbox DocumentDropdown = new Dropbox("Document Dropdown", byXPath("//span[contains(@aria-controls,'studentDocName')]/span"));
		Link SelectDocument = new Link("Document", byXPath("//ul[@id='studentDocName_listbox']/li[1]/div/span[1]"));
		Link SelectStatus = new Link("Status", byXPath("//ul[@id='studentDocStatus_listbox']/li[1]/div/span[1]"));
		Link SelectModule = new Link("Module", byXPath("(//span[.='Financial Aid'])[2]"));
		Link Awardyear= new Link("Award year", byXPath("//span[@aria-controls='studentDocAwardYear_listbox']"));
		Link SelectingAwardYear= new Link("Selecting AwardYear", byXPath("(//li[text()='2000-01'])[1]"));
		
		ContactManager.click();
		wait(2);
		Documents.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(10);
		/*	DocEnterModule.clearAndType(data.get("Module"));
		wait(2);
		SelectMainModule.click();
		wait();
		DocAwardYear.clearAndType(data.get("AwardYear"));
		wait(2);
		SelectMainAwardYear.click();
		wait(2);
		*/
		NewDocument.click();
		wait(10);
		DocModule.clearAndType("Financial Aid");
		wait(4);
		SelectModule.click();
		wait(2);
		//SelectDocModule.click();
		//wait(4);
		DocumentDropdown.click();
		wait(2);
		SelectDocument.click();
		String DocumentName = SelectDocument.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Document Name is selected as " +DocumentName);
		wait(2);
		DocumentStatus.click();
		wait(2);
		SelectStatus.click();
		wait(2);
//		wait(2);
//		Awardyear.click();
//		wait(2);
//		SelectingAwardYear.clickUsingJavaScriptExecutor();
//		wait(1);
//		SaveAndCloseDocument.clickUsingJavaScriptExecutor();
//		DocSaveClose.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document is added successfully");
		return this;	
	}
	
	public StudentContactManagerPage AddFADocumentListPage(StringHash data) throws Exception{

		Link SelectDocumentListName = new Link(data.get("DocumentListName"), byXPath("//span[.='"+data.get("DocumentListName")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Document records were successfully saved.']"));
		Link SelectStatus = new Link("Status", byXPath("//ul[@id='studentDocStatus_listbox']/li[1]/div/span[1]"));
		Link SelectModule = new Link("Module", byXPath("//ul[@id='studentDocModule_listbox']/li/div/span[1]"));
		Dropbox DocListSpan = new Dropbox("Document List Span", byXPath("//span[@aria-controls='studentDocName_listbox']/span[1]"));
		
		
		ContactManager.click();
		wait(2);
		Documents.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(10);
		/*    DLEnterModule.clearAndType(data.get("Module"));
	        wait(2);
	        DLAwardYear.clearAndType(data.get("AwardYear"));
	        wait(2);
		 */
		NewDocumentList.click();
		wait(15);
		scrollPage(0, 500);
		wait(5);
		DocModule.sendKeys("Financial Aid");
		wait(5);
		SelectModule.click();
		wait(2);
//		DocumentListName.clearAndType(data.get("DocumentListName"));
//		wait(4);
//		SelectDocumentListName.click();
		wait(2);
		DocumentStatus.click();
		wait(4);
		SelectStatus.click();
		wait(2);
//		DLSaveClose.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document List is added successfully");
		return this;  
	    }    
}

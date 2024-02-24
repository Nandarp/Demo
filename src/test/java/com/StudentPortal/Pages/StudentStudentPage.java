package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentStudentPage extends BaseLocators {

	static String LastNameValue = AppendValue.apendString();
	static String FirstNameValue = AppendValue.apendString();


	public StudentStudentPage AddDocumentToStudent(StringHash data) throws Exception {
		
		Link SelectingModule= new Link(data.get("ModuleName"), byXPath("(//span[text()='"+data.get("ModuleName")+"'])[1]"));
		Link AddDocStudMsg= new Link("Add Document to Student", byXPath("//span[text()='The Document records were successfully saved.']"));
		
		Link Awardyear= new Link("Award year", byXPath("(//button[@aria-label='expand combobox'])[8]"));
		Link SelectingAwardYear= new Link("Selecting AwardYear", byXPath("//ul[@id=\"studentDocAwardYear_listbox\"]//li[1]//span"));
		
		TextField DocumentName= new TextField("DocumentName", byXPath("//input[@name=\"studentDocName_input\"]"));

		ContactManager.clickUsingJavaScriptExecutor();
		wait(2);
		Documents.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
		wait(15);
		NewDocument.clickUsingJavaScriptExecutor();
		wait(15);
		//Module.clickUsingJavaScriptExecutor();
		DocModule.clearAndType(data.get("ModuleName"));
		wait(2);
		SelectingModule.clickUsingJavaScriptExecutor();
		String SelectedModule = SelectingModule.getAttribute("title");
		System.out.println(SelectedModule);
		TestReportsLog.log(LogStatus.INFO, "Selected Module is "+SelectedModule);
		wait(2);
		Document.click();
		wait(2);
		DocumentName.clearAndType(data.get("DocumentName"));
		wait(2);
		SelectingDocument.click();
		String SelectedDocument = SelectingDocument.getAttribute("title");
		System.out.println(SelectedDocument);
		TestReportsLog.log(LogStatus.INFO, "Selected Document is "+SelectedDocument);
		wait(2);
//		DocumentStatus.clearAndType(data.get("DocumentStatus"));
//		wait(2);
//		SelectingDocumentStatus1.click();
//		String SelectedDocumentStatus = SelectingDocumentStatus1.getAttribute("title");
//		System.out.println(SelectedModule);
//		TestReportsLog.log(LogStatus.INFO, "Selected Document status is "+SelectedDocumentStatus);
//		wait(2);
		Awardyear.click();
		wait(3);
		SelectingAwardYear.clickUsingJavaScriptExecutor();
		wait(3);
		SaveAndCloseDocument.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(AddDocStudMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document is added successfully");

		return null;
	}

	public StudentStudentPage AddDocumentListToStudent(StringHash data) throws Exception {

		Link SelectingDocumentStatus1= new Link("Selecting Document Status", byXPath("//span[text()='"+data.get("DocumentStatus")+"']"));
		//Link SelectingStudent2 = new Link("Selecting Student", byXPath("//span[text()='"+LastNameValue+", "+FirstNameValue+"']"));
		Link SelectingModule= new Link(data.get("ModuleName"), byXPath("(//span[text()='"+data.get("ModuleName")+"'])[2]"));
		Link AddDocStudMsg= new Link("Add Document to Student", byXPath("//span[text()='The Document records were successfully saved.']"));
		

		ContactManager.clickUsingJavaScriptExecutor();
		wait(2);
		Documents.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
		wait(15);
		NewDocumentList.click();
		wait(6);
		scrollPage(0, 500);
		wait(2);
		DocModule.clearAndType(data.get("ModuleName"));
		wait(1);
		SelectingModule.clickUsingJavaScriptExecutor();
		String SelectedModule = SelectingModule.getAttribute("title");
		System.out.println(SelectedModule);
		TestReportsLog.log(LogStatus.INFO, "Selected Module is "+SelectedModule);
		wait(3);
		DocList.clearAndType(data.get("DocumentListName"));
		wait(2);
		DocumentStatus.clearAndType(data.get("DocumentStatus"));
		wait(2);
		SelectingDocumentStatus1.click();
		wait(2);
		SaveAndCloseDocumentList.click();
		wait(6);
		CustomAsserts.containsString(AddDocStudMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document List is added successfully");
		return null;
	}

}

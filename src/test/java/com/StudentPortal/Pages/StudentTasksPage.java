package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;


public class StudentTasksPage extends BaseLocators {
	
	public StudentTasksPage ConfirmPendingTasksForStaff(StringHash data) throws Exception{

		Link StatusTableCell = new Link(data.get("Status"), byXPath("(//td[text()='"+data.get("Status")+"'])[1]"));
		Link TaskSubjectTableCell = new Link("TaskSubjectTableCell", byXPath("(//td[@title='"+data.get("TaskTemplate")+"'])[1]"));

		
		StaffTaskSettings.click();
		wait(2);
		StaffTaskClearFilter.click();
		wait(8);
		SearchSubject.clearAndType(data.get("TaskTemplate"));
		wait(5);
		CustomAsserts.containsString(StatusTableCell.getText(), data.get("Status").toString());
		CustomAsserts.containsString(TaskSubjectTableCell.getText(), data.get("TaskTemplate").toString());
		System.out.println("Task is available for staff");
		return this;

	}


	public StudentTasksPage EditTaskByStaff(StringHash data) throws Exception{


		Link TaskSubjectCell = new Link("TaskSubjectCell", byXPath("(//a[. = '"+data.get("TaskTemplate")+"'])[1]"));
		Link MessageSpan = new Link("Success Message", byXPath("//span[. = 'The Task records were successfully saved.']"));

		String NoteValue = AppendValue.apendString();


//		wait(8);
		StaffTaskSettings.click();
		wait(2);
		StaffTaskClearFilter.click();
		wait(5);
		SearchSubject.clearAndType(data.get("TaskTemplate"));
		wait(8);
		TaskSubjectCell.clickUsingJavaScriptExecutor();
		wait(8);
		scrollPage(0, 500);
		StatusSpan.click();
		wait(2);
		SelectStatus.click();
		wait(2);
		String StatusValue = SelectStatus.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Task Status Value is selected as "+StatusValue);
		Note.clearAndType(NoteValue.toString());
		scrollPage(0, -500);
		TaskSaveAndClose.click();
		wait(7);
		CustomAsserts.containsString(MessageSpan.getText(), data.get("Successmessage").toString());
		System.out.println("Task is edited successfully");

		return this;

	}
}

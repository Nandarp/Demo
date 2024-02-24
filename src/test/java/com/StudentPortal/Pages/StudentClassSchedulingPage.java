package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;


public class StudentClassSchedulingPage extends BaseLocators{
//	static String TermCodeValueForClass = StudentTermsPage.TermCodeValue;	
	static String SectionCodeName = AppendValue.apendString();
	static String SectionCode1 = AppendValue.apendString();

	public StudentClassSchedulingPage CreatingClassScheduleUsingExistingTerm(StringHash data) throws Exception{

			Link SelTermCodeSpan1 = new Link("Term", byXPath("//span[text()='"+data.get("Term Code")+"']"));
			Link CourseSpan = new Link("Course", byXPath("//span[@title='"+data.get("Course Code")+"']"));
			Link CreateClsSchedSaveMessage = new Link("Create Class Schedule Save Message", byXPath("//span[. = 'The Documents & LMS Options records were successfully saved.']"));
			Link SuccessMessage = new Link("Save Message", byXPath("//span[text()='The Class Section records were successfully saved.']"));
		
		//Method Implementation
			New.click();	
			waitForPageToLoad();
			wait(5);
			TermDropdown.clickUsingJavaScriptExecutor();
			wait(5);
			SelTermCodeSpan1.click();
			wait(5);
			String SelTermCodeSpan = SelTermCodeSpan1.getAttribute("title");
		    TestReportsLog.log(LogStatus.INFO, "Term Code Name is selected as "+SelTermCodeSpan);
		    wait(3);
			CourseDropdown.click();
			wait(2);
			CourseSpan.click();
			wait(2);
			String CoursSpan = CourseSpan.getAttribute("title");
		    TestReportsLog.log(LogStatus.INFO, "Course Name is selected as "+CoursSpan);
			wait(5);
			SectionCode.click();
			wait(2);
			SectionCode.clearAndType(SectionCode1);
			wait(2);
			Instructor.click();
			wait(2);
			InstructorSpan.click();
			wait(3);
			String InstructorSpn = InstructorSpan.getAttribute("title");
		    TestReportsLog.log(LogStatus.INFO, "Instructor Name is selected as "+InstructorSpn);
			wait(3);	
			MaxStudents.sendKeys("10");
			wait(3);
			DeliveryMethodField.clickUsingJavaScriptExecutor();
			wait(3);
			SelDeliveryMethod.clickUsingJavaScriptExecutor();
			wait(10);
			String SelDeliveryMetod = SelDeliveryMethod.getAttribute("title");
		    TestReportsLog.log(LogStatus.INFO, "Delivery Method Name is selected as "+SelDeliveryMetod);
			wait(3);
			scrollPage(0,-200);
			SaveAndClose1.clickUsingJavaScriptExecutor();	
			wait(7);
			CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
			System.out.println("Course section is added successfully");
		return this;
	}

	public StudentClassSchedulingPage EditClassScheduleUsingExistingCourse(StringHash data) throws Exception{

		Link EditCreateClsSchedSaveMessage = new Link("Edit Create Class Schedule SaveMessage", byXPath("//span[. = 'The Class Section records were successfully saved.']"));
		Checkbox SelectTerm = new Checkbox("SelectTerm",byXPath("//input[@aria-label='"+data.get("Term Name")+"']"));
		Checkbox SelectCourse = new Checkbox("SelectCourse",byXPath("//input[@aria-label='"+data.get("Course Code")+"']"));
		Link ClickCoursesec = new Link("Course section", byXPath("(//a[text()='"+data.get("Course Code")+"'])[1]"));
		TextField SelectCampus = new TextField("Select Campus", byXPath("//div//span[@title='"+data.get("Campus")+"']"));

		//Method Implementation
//		campus.waitTillElementClickable();
//		campus.clickUsingJavaScriptExecutor();
//		wait(1);
//		SelectCampus.waitTillElementClickable();
//		SelectCampus.clickUsingJavaScriptExecutor();
		wait(7);
		TermInput.clickUsingJavaScriptExecutor();
		wait(6);
		Search.clearAndType(data.get("Term Code").toString());
		wait(2);
		SelectTerm.clickUsingJavaScriptExecutor();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(4);
		CourseInput.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Course Code").toString());
		wait(2);
		SelectCourse.clickUsingJavaScriptExecutor();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(4);
		ApplyFilters.clickUsingJavaScriptExecutor();
		wait(25);
		ClassSectionFilter.clickUsingJavaScriptExecutor();
		wait(4);
		ClassSectionClearFilter.clickUsingJavaScriptExecutor();
		wait(12);
		ClickCoursesec.clickUsingJavaScriptExecutor();
		wait(20);
//		if(ErrorMessage.isDisplayed()) {
//			TestReportsLog.log(Status.FAIL, "Test case failed because of error message: "+ErrorMessage.getText());
//			System.out.println("Data base error");
//		}else {
//		UpdSecCode.clickUsingJavaScriptExecutor();
//		wait(2);
		UpdSecCode.clearAndType(SectionCode1);
		wait(3);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(8);
		CustomAsserts.containsString(EditCreateClsSchedSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Course section is edited successfully");
		return this;
	}

	public StudentClassSchedulingPage CopyClassSchedule(StringHash data) throws Exception{

		Checkbox SelectTerm = new Checkbox("SelectTerm",byXPath("//input[@aria-label='"+data.get("Term Name")+"']"));
		Checkbox SelectCourse = new Checkbox("SelectCourse",byXPath("//input[@aria-label='"+data.get("Course Code")+"']"));
		Link CopyClassScheduleSaveMessage = new Link("Copy Class Schedule SaveMessage", byXPath("//span[. = 'The class schedule records were successfully copied.']"));
	    Checkbox SeltermButton = new Checkbox("Term", byXPath("//input[contains(@aria-label,'"+data.get("Term Name")+"')]"));
		TextField SelectCampus = new TextField("Select Campus", byXPath("//div//span[@title='"+data.get("Campus")+"']"));
	    
	//Method Implementation
//		campus.waitTillElementClickable();
//		campus.clickUsingJavaScriptExecutor();
//		wait(1);
//		SelectCampus.waitTillElementClickable();
//		SelectCampus.clickUsingJavaScriptExecutor();
		wait(7);
		TermInput.clickUsingJavaScriptExecutor();
		wait(6);
		Search.clearAndType(data.get("Term Code").toString());
		wait(2);
		SelectTerm.clickUsingJavaScriptExecutor();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(4);
		CourseInput.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Course Code").toString());
		wait(2);
		SelectCourse.clickUsingJavaScriptExecutor();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(4);
		ApplyFilters.clickUsingJavaScriptExecutor();
		wait(15);
		ClassSectionFilter.clickUsingJavaScriptExecutor();
		wait(4);
		ClassSectionClearFilter.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		SeltermButton.clickUsingJavaScriptExecutor();
		wait(5);
		CopyClassSchedule.click();
		wait(20);
		SecCode.clearAndType(SectionCode1);
		wait(2);
		CopyButton.click();
		wait(5);
		//CustomAsserts.containsString(CopyClassScheduleSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Section is copied successfully");
		return this;
	}
}
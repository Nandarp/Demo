package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentCoursePage extends BaseLocators{ 
	
    public StudentCoursePage RecordMakeupHourForStudent(StringHash data) throws Exception{

    	int Hour = AppendValue.apendNumber();
    	Link RecordmakeupStdSaveMessage = new Link("Record makeup Hours SaveMessage", byXPath("//span[. = 'The Attendance records were successfully saved.']"));
    	Link ClickCourse2 = new Link(data.get("Course Code"), byXPath("//span[text()='"+data.get("Course Code")+"']"));
    	
    	AcademicRecords.waitTillElementClickable();
    	AcademicRecords.click();
    	StudentCourse.waitTillElementClickable();
    	StudentCourse.clickUsingJavaScriptExecutor();
    	wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		CourseFilter.clickUsingJavaScriptExecutor();
    	wait(2);
    	CourseClearFilters.clickUsingJavaScriptExecutor();
    	wait(5);
    	CourseDropDown.clickUsingJavaScriptExecutor();
    	wait(2);
    	FilterOptions.click();
    	wait(2);
    	value.clearAndType(data.get("Course Code"));
    	wait(2);
    	FilterButton.click();
    	wait(10);
//    	SelCourse.clickUsingJavaScriptExecutor();
//    	wait(5);
//    	SelectCheckbox
//    	SelectCheckbox.click();
//   	wait(5);
//    	ClickCourse2.waitTillElementClickable();
    	ClickCourse2.click();
    	wait(12);
    	scrollPage(0, -200);
    	wait(3);
    	Attendance.waitTillElementClickable();
    	Attendance.clickUsingJavaScriptExecutor();
    	wait(5);
    	scrollPage(0, 500);
    	SelectAttendance.click();
    	wait(2);
    	PostRecord.waitTillElementClickable();
    	PostRecord.click();
    	wait(4);
    	MakeupDate.clearAndType(data.get("Date").toString());
    	wait(2);
//    	Hours.click();
//    	Hours.sendKeys(data.get("Hours"));
//    	wait(3);
    	SaveAttendance.waitTillElementClickable();
    	SaveAttendance.click();
    	wait(7);
    	CustomAsserts.containsString(RecordmakeupStdSaveMessage.getText(), data.get("SuccessMessage").toString());
    	wait(2);
    	return this;
    }

    public StudentCoursePage AddStudentCourse(StringHash data) throws Exception{

    	Link SelCourse = new Link("Course", byXPath("(//td[1]/input)[1]"));
    	Checkbox SelTerm = new Checkbox("SelTerm", byXPath("//input[@aria-label='"+data.get("Term Name")+"']"));
    	Link StdCourSaveMessage = new Link("Student Course Save Message", byXPath("//span[.='The Student Course records were successfully saved.']"));

//    	waitForPageToLoad();
    	AcademicRecords.click();
    	wait(2);
    	StudentCourse.click();
    	wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
    	wait(17);
    	AddCourse.clickUsingJavaScriptExecutor();
    	wait(3);
    	CourseInput.clickUsingJavaScriptExecutor();
    	wait(2);
    	Search.clearAndType(data.get("Course Code").toString());
    	wait(2);
    	SelCourse.click();
    	wait(2);
    	Select.clickUsingJavaScriptExecutor();
    	wait(3);
    	TermList.click();
    	wait(2);
    	Search.clearAndType(data.get("Term Name").toString());
    	wait(2);
    	SelTerm.click();
    	wait(2);
    	Select.clickUsingJavaScriptExecutor();
    	wait(3);
    	SaveAndClose.clickUsingJavaScriptExecutor();
    	wait(3);
    	addcoursewithoutCatogery.clickUsingJavaScriptExecutor();
    	wait(2);
//    	if(AddCourse1.isDisplayed()) {
//    		AddCourse1.click();
//    		wait(2);
//    	}
    	wait(4);
    	CustomAsserts.containsString(StdCourSaveMessage.getText(), data.get("SuccessMessage").toString());
    	System.out.println("Course is added successfully");
//    	wait(10);
    	return this;
    }       



    public StudentCoursePage CourseRegistrationForStudent(StringHash data) throws Exception{

    		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully registered.']"));
//        	Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//input[@aria-label='"+data.get("Course Code")+"']"));
        	Link SelectTerm = new Link(data.get("TermCode"), byXPath("//span[.='"+data.get("TermCode")+"']"));
        	Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
        	Link Override = new Link("Override", byXPath("(//button[@aria-label=\"Override\"])[11]"));
        	
        	
        //Method Implementation	
//        	waitForPageToLoad();
        	AcademicRecords.click();
        	wait(2);
        	StudentCourse.click();
        	wait(3);
        	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
        	wait(20);
        	CourseFilter.clickUsingJavaScriptExecutor();
        	wait(2);
        	CourseClearFilters.clickUsingJavaScriptExecutor();
        	wait(5);
        	CourseDropDown.clickUsingJavaScriptExecutor();
        	wait(2);
        	FilterOptions.click();
        	wait(2);
        	value.clearAndType(data.get("Course Code"));
        	wait(2);
        	FilterButton.click();
        	wait(10);
        	SelCourse.clickUsingJavaScriptExecutor();
        	wait(5);
        	Register.clickUsingJavaScriptExecutor();
        	wait(30);
        	scrollPage(0, 250);
        	wait(5);
        	RegisterTerm.clearAndType(data.get("TermCode"));
        	wait(2);
        	SelectTerm.click();
       		wait(2);
       		String SelConfrmTerm = SelectTerm.getAttribute("title");
       		TestReportsLog.log(LogStatus.INFO, "Confirm Term Name is selected as "+SelConfrmTerm);
       		wait(2);
       		CourseNext.click();
        	wait(3);
        	InstructorTableCell.clickUsingJavaScriptExecutor();
        	wait(3);
        	scrollPage(0, 500);
        	RegisterButton.clickUsingJavaScriptExecutor();
        	//wait(3);
        	//SelRegister.clickUsingJavaScriptExecutor();
        	//wait(5);
//        	if (Override.isDisplayed()) {
//        		Override.waitTillElementClickable();
//        		Override.click();
//			}
        	wait(8);
        	CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
        	System.out.println("Course is registered successfully");
        	return this;

        }

    public StudentCoursePage CourseUnRegistrationForStudent(StringHash data) throws Exception{

        //X-path Parameterization
        	Link CourseUnRegSaveMessage = new Link("Course UnRegister Save Message", byXPath("//span[. = 'The Student Course records were successfully unregistered.']"));
//        	Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//input[@aria-label='"+data.get("Course Code")+"']"));
        	Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
        	
        	AcademicRecords.click();
        	wait(5);
        	StudentCourse.click();
        	wait(3);
        	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
    		wait(17);
    		CourseFilter.clickUsingJavaScriptExecutor();
        	wait(3);
        	CourseClearFilters.clickUsingJavaScriptExecutor();
        	wait(7);
        	CourseDropDown.clickUsingJavaScriptExecutor();
        	wait(2);
        	FilterOptions.click();
        	wait(2);
        	value.clearAndType(data.get("Course Code"));
        	wait(2);
        	FilterButton.click();
        	wait(5);
        	SelCourse.clickUsingJavaScriptExecutor();
        	wait(6);
        	UnregisterCourse.clickUsingJavaScriptExecutor();
        	wait(5);
        	Clickreasonspan.clickUsingJavaScriptExecutor();
        	wait(2);
        	SelReasonName.click();
        	wait(2);
        	String SelResonName = SelReasonName.getAttribute("title");
        	TestReportsLog.log(LogStatus.INFO, "Reason Name is selected as "+SelResonName);
        	ConfirmUnregister.click();
        	wait(10);
        	CustomAsserts.containsString(CourseUnRegSaveMessage.getText(), data.get("SuccessMessage").toString());
        	System.out.println("Course is unregistered successfully");
        	return this;
        }
}
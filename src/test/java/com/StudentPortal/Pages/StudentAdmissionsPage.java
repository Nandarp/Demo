package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.util.StringHash;

public class StudentAdmissionsPage extends BaseLocators {
	
  
    public StudentAdmissionsPage CreateStudentApplication(StringHash data) throws Exception {
    	
    	Link ClickStudent = new Link(data.get("StudentName"),byXPath("//span[.='"+data.get("StudentName")+"']"));
    	Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Application records were successfully saved.']"));
    	Dropbox SelectAdmRep = new Dropbox(data.get("AdmRep"), byXPath("//span[.='"+data.get("AdmRep")+"']"));
    	
    	Admissions.click();
    	wait(2);
    	StudentApplications.click();
    	wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.click();
    	waitForPageToLoad();
    	scrollPage(0, 500);
    	wait(2);
    	//wait(2);
//    	ApplicationTypeSpan.waitTillElementClickable();
//    	ApplicationTypeSpan.click();
//    	//wait(2);
//    	SelectApplicationType.waitTillElementClickable();
//    	SelectApplicationType.click();
//    	String ApplicationTypeValue = SelectApplicationType.getAttribute("title");
//		TestReportsLog.log(LogStatus.INFO, "Application Type Value is selected as "+ApplicationTypeValue);
//		ProgramCode.click();
//		wait(2);
//		SelectProgramCode.click();
//		wait(2);
//		ProgramVersionCode.click();
//		wait(2);
//		SelectProgramVersionCode.click();
//		wait(2);
//		VersionStartDateDropdown.click();
//		wait(2);
//		VersionStartDate.click();
//		wait(5);
//		scrollPage(0, 200);
//		wait(2);
//		CatalogsDropdown.click();
//		wait(2);
//		Catalog.click();
//		wait(2);
//		ShiftDropdown.click();
//		wait(2);
//		Shift.click();
//		wait(2);
//		BillingMethodDropdown.click();
//		wait(2);
//		BillingMethod.click();
//		wait(2);
//		GradeLevelDropdown.click();
//		wait(2);
//		GradeLevel.click();
//		wait(2);
//		EnrollmentDate.clearAndType(TDate);
//    	wait(3);
//    	scrollPage(0, 400);
//    	scrollPage(0, 700);
//    	wait(2);
    	//StatusReason.click();
    	//wait(2);
    	//SchoolStatus.sendKeys("Application Received");
    	wait(5);
    	StudentStatusSpan.clickUsingJavaScriptExecutor();
    	wait(3);
    	SelectStudentStatus.click();
    	wait(3);
    	AdminRep.clearAndType(data.get("AdmRep"));
    	wait(2);
    	SelectAdmRep.click();
    	wait(5);
    	/*    	SelectAdminRep.click();
     	Thread.sleep(1000);
    	 */      
    	//EnrolNum.click();
    	scrollPage(0, -1000);
    	wait(5);
    	SaveAndClose.clickUsingJavaScriptExecutor();
    	wait(8);
    	CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Application is created succcessfully");
		return this;	   	
    }
}

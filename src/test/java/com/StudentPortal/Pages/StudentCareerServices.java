package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.util.concurrent.TimeUnit;

import com.framework.elements.BaseLocators;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentCareerServices extends BaseLocators {
	
	static String TDate = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	
	public StudentCareerServices AddStudentIntoJob(StringHash data) throws Exception {
		

		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Placement records were successfully saved.']"));
		Link SelectJobType = new Link("Select Job Type", byXPath("//span[1][.='"+data.get("Job Type")+"']"));
		Checkbox SelectEmployer = new Checkbox("Employer", byXPath("//tr[1]/td/input"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		wait(2);
		CareerServices.click();
		wait(2);
		PlacementsIntern.click();
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
			wait(15);
		NewPlacement.click();
		wait(15);
		scrollPage(0, 500);
		wait(5);
		Employer.click();
    	wait(2);
    	SelectEmployer.click();
    	String SelectEmployerValue = SelectEmployer.getAttribute("aria-label");
		TestReportsLog.log(LogStatus.INFO, "Employer Value is selected as " +SelectEmployerValue);
    	wait(2);
		Select.click();
		wait(2);
		JobType.clearAndType(data.get("Job Type"));
    	wait(2);
    	SelectJobType.click();
    	wait(10);
    	PlacementStatus.click();
    	wait(2);
    	SelectPlacementStatus.click();
    	wait(2);
		//	PlacementStatus.waitTillElementFound();
		//	PlacementStatus.sendKeys(data.get("Placement Status"));
//		JobCategory.click();
//		wait(2);
		scrollPage(0, 200);
		wait(2);
//		jobtitledropdown.click();
//		wait(2);
//		SelectJobTitle.click();
//		String JobTitleValue = SelectJobTitle.getAttribute("title");
//		TestReportsLog.log(Status.INFO, "Job Title Value is selected as " +JobTitleValue);
//		wait(2);
		scrollPage(0, 300);
		wait(2);
		JobStatusSpan.click();
		wait(2);
		SelectJobStatus.click();
		String JobStatusValue = SelectJobStatus.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Job Status Value is selected as " +JobStatusValue);
		wait(2);
//		InFieldofStudy.click();
//		wait(2);
//		SelInFieldofStudy.click();
//		String FieldOfStudyValue = SelInFieldofStudy.getAttribute("title");
//		TestReportsLog.log(LogStatus.INFO, "Field of Study Value is selected as " +FieldOfStudyValue);
//		wait(2);
//		HowPlaced.click();
//		wait(2);
//		SelHowPlaced.click();
//		String HowPlacedValue = SelHowPlaced.getAttribute("title");
//		TestReportsLog.log(LogStatus.INFO, "How Placed Value is selected as " +HowPlacedValue);
//		wait(2);
		SalAmount.clearAndType("10");
		wait(2);
		SalaryStatus.click();
		wait(2);
		SelSalaryStatus.click();
		String SalaryStatusValue = SelSalaryStatus.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Salary Status Value is selected as " +SalaryStatusValue);
		wait(2);
		SalaryType.click();
		wait(2);
		SelSalaryType.click();
		String SalaryTypeValue = SalaryType.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Salary Type Value is selected as " +SalaryTypeValue);
		wait(2);
		DatePlaced.clearAndType(TDate);
		wait(2);
		PlacementStartDate.clearAndType(TDate);
		wait(2);
//		wait(2);
//		scrollPage(0, 300);  
//		wait(2);
//		VerificationAgent.clearAndType("ABC");
//		wait(2);
//		VerificationAgentTitle.clearAndType("Agent");
//		wait(2);
//		VerificationDate.clearAndType(TDate);
//		wait(2);
//		VerificationPHNnumber.clearAndType("5434333898");
//		wait(2);
//		VerificationRepDropdown.click();
//		wait(2);
//		SelectRep.click();
		scrollPage(0, -1000);  
		wait(2);
		SaveAndClose.click();
		wait(7);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Place wizard student is successfully");
		return this;
	}

}



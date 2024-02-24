package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byId;
import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentAcademicRecordsPage extends BaseLocators{
	static String currentDate = DatesUtil.getCurrentDatebyFormat("M/DD/YYYY");
	
	public StudentAcademicRecordsPage AddCourseToStudentSchedule(StringHash data) throws Exception{

		Link ClickStudent = new Link(data.get("StudentName"),byXPath("//span[.='"+data.get("StudentName")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully saved.']"));
		Checkbox CheckCourseCode= new Checkbox(data.get("CourseCode"), byXPath("//input[@aria-label='"+data.get("CourseCode")+"']"));
		
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		AddCourse.waitTillElementClickable();
		AddCourse.click();
		wait(15);
		CourseInput.waitTillElementClickable();
		CourseInput.click();
		wait(2);
		Search.waitTillElementFound();
		Search.clearAndType(data.get("CourseCode"));
		wait(1);
		CheckCourseCode.waitTillElementClickable();
		CheckCourseCode.check();
		wait(1);
		SelectButton.waitTillElementClickable();
		SelectButton.click();
		wait(2);
		AddSaveClose.waitTillElementClickable();
		AddSaveClose.clickUsingJavaScriptExecutor();
		wait(2);
		addcoursewithoutCatogery.clickUsingJavaScriptExecutor();
		wait(8);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Course is added successfully");
		return this;
	}
	
	public StudentAcademicRecordsPage RegisterCourse(StringHash data) throws Exception{

		Link ClickCourseCode = new Link(data.get("CourseCode"), byXPath("//input[@aria-label = '"+data.get("CourseCode")+"']"));
		Link SelectTerm = new Link(data.get("TermCode"), byXPath("//span[.='"+data.get("TermCode")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully registered.']"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(10);
		CourseDropDown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("CourseCode"));
		wait(2);
		FilterButton.click();
		wait(6);
		ClickCourseCode.clickUsingJavaScriptExecutor();
		wait(5);
		Register.click();
		wait(20);
		scrollPage(0, 300);
		wait(5);
		RegisterTerm.clearAndType(data.get("TermCode"));
		wait(2);
		SelectTerm.click();
		wait(5);
		//Notes.clearAndType("Registering a Student");
		//wait(2);
		//	Next.waitTillElementClickable();
		CourseNext.click();
		wait(4);
		InstructorTableCell.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, 600);
		wait(2);
		RegisterButton.clickUsingJavaScriptExecutor();
		wait(10);
		wait(5);
//		WebElement isregdisplayed = driver.findElement(By.xpath("//button[@id=\"schedueCourseDialogOkButton\"]"));
//		String text = isregdisplayed.getText();
//		if(text.equals("Register"))
//		{
//			isregdisplayed.click();
//		}
			
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Register is successfull");
		return this;
	}

	public StudentAcademicRecordsPage DropCourse(StringHash data) throws Exception{

//		Link ClickCourseCode = new Link(data.get("CourseCode"), byXPath("//input[@aria-label = '"+data.get("CourseCode")+"']"));
		Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully dropped.']"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
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
		CourseDropDown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("CourseCode"));
		wait(2);
		Filterbutton.click();
		wait(2);
		SelCourse.clickUsingJavaScriptExecutor();
		wait(4);
		Drop.clickUsingJavaScriptExecutor();
		wait(15);
		DropGradeSpan.clickUsingJavaScriptExecutor();
		wait(4);
		SelectDropGrade.clickUsingJavaScriptExecutor();
		String DropGradeValue = SelectDropGrade.getText();
		TestReportsLog.log(LogStatus.INFO, "Drop Grade Value is selected as " +DropGradeValue);
		wait(4);
		DropReasonsSpan.clickUsingJavaScriptExecutor();
		wait(4);
		SelectDropReason.clickUsingJavaScriptExecutor();
		String DropReasonValue = SelectDropReason.getText();
		TestReportsLog.log(LogStatus.INFO, "Drop Grade Value is selected as " +DropReasonValue);
		wait(4);
		DropButton.clickUsingJavaScriptExecutor();
		wait(10);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Drop course is successfull");
//		wait(2);
		return this;
	}
	
	public StudentAcademicRecordsPage ReinstateCoursePage(StringHash data) throws Exception{

		Link ClickCourseCode = new Link(data.get("CourseCode"), byXPath("//input[@aria-label = '"+data.get("CourseCode")+"']"));
		Link ClickStudent = new Link(data.get("StudentName"),byXPath("//span[.='"+data.get("StudentName")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[text()='The Student Course records were successfully reinstated.']"));
		Button ReinstateButton = new Button("Reinstate", byXPath("//button/span[text()='Reinstate']"));
		Button ReinstateConfirm = new Button("Reinstate Confirm", byXPath("(//button[@aria-label='Reinstate'])[1]"));
		
		
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		CourseDropDown.waitTillElementClickable();
		CourseDropDown.click();
		wait(2);
		FilterOptions.waitTillElementClickable();
		FilterOptions.click();
		wait(2);
		value.waitTillElementFound();
		value.clearAndType(data.get("CourseCode"));
		wait(2);
		FilterButton.waitTillElementClickable();
		FilterButton.click();
		wait(2);
		ClickCourseCode.waitTillElementClickable();
		ClickCourseCode.click();
		wait(4);
		ReinstateButton.waitTillElementClickable();
		ReinstateButton.clickUsingJavaScriptExecutor();
		wait(5);
		ReinstateConfirm.waitTillElementClickable();
		ReinstateConfirm.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Reinstate is successfull");
//		wait(5);
		return this;
	}
	

	public StudentAcademicRecordsPage IndividualAttendence(StringHash data) throws Exception{

		Link ClickCourse = new Link(data.get("CourseCode"), byXPath("//span[.= '"+data.get("CourseCode")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Attendance records were successfully saved.']"));
		Link ClickDate = new Link(data.get("AttendenceDate"), byXPath("//span[.='"+data.get("AttendenceDate")+"']"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		CourseFilter.clickUsingJavaScriptExecutor();
    	wait(4);
    	CourseClearFilters.clickUsingJavaScriptExecutor();
		wait(5);
		CourseDropDown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("CourseCode").toString());
		wait(2);
		Filterbutton.click();
		wait(10);
		ClickCourse.clickUsingJavaScriptExecutor();
		wait(15);
		scrollPage(0, -200);
		wait(2);
		Attendance.click();
		wait(10);
		scrollPage(0, 500);
		wait(2);
//		Date.click();
		ClickDate.click();
		wait(8);
		Minutes.sendKeys("25");
		wait(5);
		SaveAttendance.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Attendence is added successfully");
		return this;
	}
	
	public StudentAcademicRecordsPage individualFinalGradesPage(StringHash data) throws Exception{

		Link ClickCourse = new Link("Course", byXPath("//span[.= '"+data.get("CourseCode")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully saved.']"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
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
		CourseDropDown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("CourseCode").toString());
		wait(2);
		Filterbutton.click();
		wait(10);
		ClickCourse.clickUsingJavaScriptExecutor();
		wait(15);
		scrollPage(0, -200);
		wait(4);
		FinalGrades.click();
		wait(12);
		LetterGradeDropdown.click();
		wait(2);
		SelectGrade.click();
		wait(2);
		//		NumericGrade.sendKeys("50");
		//	LetterGrade.waitTillElementFound();
		//	NumericGrade.sendKeys(data.get("LetterFinalGrade"));
		wait(2);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Final grade is successfull");
//		wait(3);
		return this;
	}

	public StudentAcademicRecordsPage StatusChangePage(StringHash data) throws Exception{

		Link SelectNewStatus = new Link(data.get("NewStatus"), byXPath("//li[.='"+data.get("NewStatus")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Status was successfully changed.']"));
		
		
		AcademicRecords.click();
		wait(2);
		StudentStatusHistory.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		ChangeStatus.click();
		wait(15);
		NewStatus.click();
		wait(2);
		EnterNewStatus.sendKeys(data.get("NewStatus"));
		wait(2);
		SelectNewStatus.click();
		wait(4);
		//		ReasonsDropdown.click();
		//		wait(2);
		//		SelectReasons.click();
		//		String Reasons = SelectReasons.getAttribute("title");
		//		TestReportsLog.log(Status.INFO, "Reason is selected as " +Reasons);
		//		wait(2);
		ChangeButton.click();
		wait(6);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Status updated successfully");
		return this;
	}

	public StudentAcademicRecordsPage TransferCreditsPage(StringHash data) throws Exception{

		
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Transfer Credits records were successfully saved.']"));
		Checkbox checkinstitution = new Checkbox("Check institution", byXPath("//input[@aria-label='"+data.get("Institution")+"']"));
		
		AcademicRecords.click();
		wait(2);
		TransderCredits.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
		wait(15);
		New.click();
		wait(20);
		scrollPage(0, 500);
		wait(2);
		TransferTypesDropdown.click();
		wait(2);
		SelectTransferTypes.click();
		String TransferTypesValue = SelectTransferTypes.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Transfer Type value is selected as " +TransferTypesValue);
		wait(2);
		TransferStatusDropdown.click();
		wait(2);
		SelectTransferStatus.click();
		String TransferStatusValue = SelectTransferStatus.getText();
		TestReportsLog.log(LogStatus.INFO, "Transfer Status value is selected " +TransferStatusValue);
		wait(2);
//		TransferTerm.clickUsingJavaScriptExecutor();
//		wait(4);
//		CheckTerm.check();
//		String TermValue = CheckTerm.getAttribute("aria-label");
//		TestReportsLog.log(LogStatus.INFO, "Term Value is selected as " +TermValue);
//		wait(2);
//		Select.clickUsingJavaScriptExecutor();
//		wait(5);
//		GradeDropDown.click();
//		wait(2);
//		SelectGrade.click();
//		String GradeValue = SelectGrade.getText();
//		TestReportsLog.log(LogStatus.INFO, "Grade value is selected as " +GradeValue);
//		wait(2);
//		TCGrade.sendKeys(data.get("Grade"));
//				wait(4);
//				SelectTCGrade.click();
//				wait(4);
		 
		New2.click();
		wait(10);
//		ExInsDropdown.waitTillElementClickable();
		ExInsDropdown.clickUsingJavaScriptExecutor();	
		//				ExInsDropdown.click();
		wait(2);
		SelectExInst.clickUsingJavaScriptExecutor();
		String ExInstValue = SelectExInst.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "External Institution is selected as " +ExInstValue);
		wait(2);
		ExInstCourseDrodown.click();
		wait(2);
		SelectExInstCourse.click();
		String ExInstCourseValue = SelectExInstCourse.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "External Institution Course is selected as " +ExInstCourseValue);
		wait(2);
		DateCompleted.clearAndType("12/08/2023");
		wait(2);
		GradeReceived.click();
		wait(2);
		GradeReceived.clearAndType("B");
		wait(2);
		ExOk.click();
		wait(4);
		scrollPage(0, 500);
		wait(4);
		New3.click();
		wait(10);
		CampusCourseDropdown.click();
		wait(2);
		SelectCampusCourse.click();
		String CampusCourseValue = SelectCampusCourse.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Campus Course is selected as " +CampusCourseValue);
		wait(2);
		ClickOk.click();
		wait(2);
		scrollPage(0, -1000);
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Transfer credit is successfull");
		return this;
	}

	public StudentAcademicRecordsPage ProgramChangePage(StringHash data) throws Exception{

		TextField HighlightProgramVersion = new TextField("Status", byXPath("//tr[1]/td[3]"));
		Link SelectProgram = new Link(data.get("NewProgramName"), byXPath("(//span[.='"+data.get("NewProgramName")+"'])[1]"));
		Link SelectPV = new Link(data.get("NewProgramVersionName"), byXPath("//span[.='"+data.get("NewProgramVersionName")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[.='The Enrollment records were successfully saved.']"));
		Button BudgetConfirmYES = new Button(" BudgetConfirmYES", byXPath("(//button[@id=\"focusedButton\"])[17]"));
		
		AcademicRecords.click();
		wait(2);
		Enrollments.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(20);
		CourseFilter.clickUsingJavaScriptExecutor();
		wait(2);
		ClearFilters.clickUsingJavaScriptExecutor();
		wait(5);
		Enroldropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("ProgramVersionName"));
		wait(2);
		FilterButton3.click();
		wait(10);
		HighlightProgramVersion.clickUsingJavaScriptExecutor();
		wait(5);
		EnrollMore.click();
		wait(2);
		ProgramChange.click();
		wait(5);
		waitForPageToLoad();
		scrollPage(0, -100);
		EnrollProgramSpan.clickUsingJavaScriptExecutor();
		wait(2);
		EnterProgramName.clearAndType(data.get("NewProgramName"));
		wait(2);
		SelectProgram.click();
		wait(5);
		ProgramVersionCodeSpan.clickUsingJavaScriptExecutor();
		wait(2);
		EnterPVName.clearAndType(data.get("NewProgramVersionName"));
		wait(2);
		SelectPV.clickUsingJavaScriptExecutor();
		wait(10);
		VersionStartDate.clickUsingJavaScriptExecutor();
		wait(1);
//		SelectPV.waitTillElementClickable();
//		SelectPV.click();
//		wait(1);
//		StartDateDropdown.waitTillElementClickable();
//		StartDateDropdown.click();
//		SelectStartDate.waitTillElementClickable();
		SelVersionStartDate.click();
		String StartDateValue = SelVersionStartDate.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Start Date is selected as " +StartDateValue);
		wait(1);
//		ShiftDropdown.click();
//		wait(2);
//		SelectShift.click();
//		String ShiftValue = SelectShift.getAttribute("title");
//		TestReportsLog.log(LogStatus.INFO, "Shift is selected as " +ShiftValue);
//		wait(2);
//		GradeLevelDropdown.click();
//		wait(2);
//		SelectGradeLevel.click();
//		String GradeLevel = SelectGradeLevel.getAttribute("title");
//		TestReportsLog.log(LogStatus.INFO, "Grade Level is selected as " +GradeLevel);
//		wait(2);
		CatalogDropdown.click();
		wait(2);
		SelectCatalog.click();
		String Catalog = SelectCatalog.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Catalog is selected as " +Catalog);
		wait(4);
//		BillingMethodDropdown.click();
//		wait(3);
//		SelectBillingMethod.click();
//		wait(3);
		scrollPage(0, 500);
		wait(2);
		//GraduateDate.clearAndType(data.get("GraduateDate"));
		//wait(5);
		//GraduateDate.clearAndType(data.get("GraduateDate"));
		//wait(2);
		//EnterBillingMethod.clearAndType(data.get("BillingMethod"));
		//wait(2);
		PVNext.waitTillElementClickable();
		PVNext.click();
		wait(1);
		if (BudgetConfirmYES.isDisplayed()) {
			BudgetConfirmYES.clickUsingJavaScriptExecutor();
			wait(6);
		}
		//Yes.clickUsingJavaScriptExecutor();
		//wait(5);
		CourseProceedNext.waitTillElementClickable();
		CourseProceedNext.click();
		wait(1);
		FeeNext.waitTillElementClickable();
		FeeNext.click();
		wait(1);
		Change.waitTillElementClickable();
		Change.click();
		wait(8);
		//CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Program change is successfull");
		return this;
	}
	
	public StudentAcademicRecordsPage verifyMinimumLimitPage(StringHash data) throws Exception{

		Link InstructorTableCell = new Link("Section Selection", byXPath("(//div[@id='classSectionGrid_cmcGrid']//td[3])[1]"));
		TextField ValidationMessage = new TextField("Get the validation point", byXPath("//span[.='Minimum Limit']"));
		TextField EnterTerm = new TextField("Term ", byXPath("//input[@name='termId_input']"));
		Link SelectTerm = new Link("Term", byXPath("//span[.='"+data.get("TermCode")+"']"));
		Link Overflow = new Link("Overflow", byXPath("//div[@id='cnsGrid_cnsToolbar_kendoToolBar']/div[1]"));
		Link OverflowRegister = new Link("Over flowRegister", byXPath("//li[@id='courseUnRegisterButton_overflow']"));
//		Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//input[@aria-label='"+data.get("Course Code")+"']"));
		Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
	    Button Unregister = new Button("Unregister", byXPath("//button[@id=\"courseUnRegisterButton\"]"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
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
    	value.clearAndType(data.get("CourseCode"));
    	wait(2);
    	FilterButton.click();
    	wait(10);
    	SelCourse.clickUsingJavaScriptExecutor();
    	wait(5);
    	Register.clickUsingJavaScriptExecutor();
    	wait(25);
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
    	scrollPage(0, 1000);
    	RegisterButton.clickUsingJavaScriptExecutor();
    	wait(20);
//    	SelRegister.clickUsingJavaScriptExecutor();
		//	if (Register1.isDisplayed()) {
		//		Register1.click();
		//	}
//		wait(2);
		scrollPage(0, -1000);
		wait(5);
    	CourseDropDown.clickUsingJavaScriptExecutor();
    	wait(2);
    	FilterOptions.click();
    	wait(2);
    	value.clearAndType(data.get("CourseCode"));
    	wait(2);
    	FilterButton.click();
    	wait(5);
    	SelCourse.click();
		wait(6);
		Unregister.clickUsingJavaScriptExecutor();
		wait(10);
//		RegistrationLock.waitTillElementClickable();
		RegistrationLock.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("ValidationPoint").toString());
		System.out.println("Minimum lock is successfull");
		return this;
	}
	
	public StudentAcademicRecordsPage verifyMaximumLimitPage(StringHash data) throws Exception{
		

//		Link SelCourse = new Link(data.get("CourseCode"), byXPath("//input[@aria-label = '"+data.get("CourseCode")+"']"));
		Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
		Link SelectTerm = new Link("Term", byXPath("//span[.='"+data.get("TermCode")+"']"));
		TextField ValidationMessage = new TextField("Get the validation point", byXPath("//span[.='Maximum Limit']"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
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
    	value.clearAndType(data.get("CourseCode"));
    	wait(2);
    	FilterButton.click();
    	wait(10);
    	SelCourse.clickUsingJavaScriptExecutor();
    	wait(5);
    	Register.clickUsingJavaScriptExecutor();
    	wait(25);
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
    	scrollPage(0, 1000);
    	RegisterButton.clickUsingJavaScriptExecutor();
    	wait(10);
//    	SelRegister.clickUsingJavaScriptExecutor();
		//	if (Register1.isDisplayed()) {
		//		Register1.click();
		//	}
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("ValidationPoint").toString());
		System.out.println("Maximum limit is verified");
		return this;
	}
	
public StudentAcademicRecordsPage VerifyScheduleLockPage(StringHash data) throws Exception{
		
//		Link SelCourse = new Link(data.get("CourseCode"), byXPath("//input[@aria-label = '"+data.get("CourseCode")+"']"));
		Link SelectTerm = new Link("Term", byXPath("//span[.='"+data.get("TermCode")+"']"));
		TextField ValidationMessage = new TextField("Get the validation point", byXPath("//span[.='Schedule Change']"));
		Checkbox SelCourse = new Checkbox("Select all Checkbox", byXPath("//tr[1]/td[2]//input"));
		
		AcademicRecords.click();
		wait(2);
		StudentCourse.click();
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
    	value.clearAndType(data.get("CourseCode"));
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
    	scrollPage(0, 1000);
    	RegisterButton.clickUsingJavaScriptExecutor();
    	wait(10);
 //   	SelRegister.clickUsingJavaScriptExecutor();
		//	if (Register1.isDisplayed()) {
		//		Register1.click();
		//	}
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("ValidationPoint").toString());
		System.out.println("Schedule lock is successful");
		return this;
	}
	
	public StudentAcademicRecordsPage DeleteCoursePage(StringHash data) throws Exception{
		 
		//X-path Parameterization
			Checkbox SelectCheckbox = new Checkbox("Checkbox", byXPath("(//tr//td//input)[1]"));
			Link SuccessMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully deleted.']"));
			Button DeleteButton = new Button("Delete Button", byId("deletedCourseButton"));
			Button ConfirmDeleteButton = new Button("Confirm Delete Button", byId("confirmDeleteDialogOkButton"));
			Link reasonsdropdown = new Link("Reason drop down", byXPath("//span[contains(@aria-owns,'DeletewithReasoncode')]/span/span[2]"));
			Link SelectReason = new Link("Reason", byXPath("(//ul[@id='DeletewithReasoncode_listbox']/li)[1]"));
			Button OkDelete = new Button("Delete Button", byXPath("(//button[.='Delete'])[2]"));
			Button FinalDelete = new Button("Final Delete Button", byId("deleteValidationDialogOkButton"));
			Link AcademicRecords = new Link("Academic Records", byXPath("//a[@aria-label='Academic Records']"));
			Link StudentCourses = new Link("Student Courses span", byXPath("//span[. = 'Student Courses']"));
			Link CourseCodeDropdown = new Link("Course Code dropdown", byXPath("(//a[@aria-label='Column Settings'])[1]"));
			Button CClFilterDropDown = new Button("Filter", byXPath("//span[text()='Filter']"));
			TextField Value = new TextField("Filter", byXPath("//input[@title='Value']"));
		    Button Filter = new Button("Filter Button", byXPath("//button[text()='Filter']"));
		    
		//Method Implementation
//			waitForPageToLoad();
			AcademicRecords.click();
			wait(2);
			StudentCourses.click();
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
			CourseCodeDropdown.click();
			wait(2);
			CClFilterDropDown.click();
			wait(2);
			Value.clearAndType(data.get("Course Code"));
			wait(2);
			Filter.click();
			wait(12);
			SelectCheckbox.click();
			wait(5);
			DeleteButton.click();
			wait(2);
			ConfirmDeleteButton.click();
			wait(2);
			/*reasonsdropdown.click();
			wait(2);
			SelectReason.click();
			String ReasonValue = SelectReason.getText();
			TestReportsLog.log(Status.INFO, "Reason is selected as " +ReasonValue);
			wait(2);*/
			OkDelete.click();
			wait(10);
			FinalDelete.clickUsingJavaScriptExecutor();
			wait(8);
			CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
			System.out.println("Course is deleted successfully");
			//wait(5);
			return this;
		}
	
	
	public StudentAcademicRecordsPage DeleteCourse(StringHash data) throws Exception{

		Checkbox SelectCheckbox = new Checkbox("Checkbox", byXPath("//input[@aria-label='"+data.get("CourseCode")+"']"));
		Link SuccessMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Course records were successfully deleted.']"));
		Button DeleteButton = new Button("Delete Button", byId("deletedCourseButton"));
		Button ConfirmDeleteButton = new Button("Confirm Delete Button", byId("confirmDeleteDialogOkButton"));
		Link reasonsdropdown = new Link("Reason drop down", byXPath("//span[contains(@aria-owns,'DeletewithReasoncode')]/span/span[2]"));
		Link SelectReason = new Link("Reason", byXPath("(//ul[@id='DeletewithReasoncode_listbox']/li)[1]"));
		Button OkDelete = new Button("Delete Button", byXPath("(//button[.='Delete'])[2]"));
		Button FinalDelete = new Button("Final Delete Button", byId("deleteValidationDialogOkButton"));

		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
    	wait(17);
		CourseDropDown.waitTillElementClickable();
		CourseDropDown.click();
		wait(2);
		FilterOptions.waitTillElementClickable();
		FilterOptions.click();
		wait(2);
		value.waitTillElementFound();
		value.clearAndType(data.get("CourseCode"));
		wait(2);
		FilterButton.waitTillElementClickable();
		FilterButton.click();
		wait(2);
		SelectCheckbox.waitTillElementClickable();
		SelectCheckbox.click();
		wait(2);
		DeleteButton.waitTillElementClickable();
		DeleteButton.click();
		wait(2);
		ConfirmDeleteButton.waitTillElementClickable();
		ConfirmDeleteButton.click();
		wait(2);
		/*reasonsdropdown.click();
		wait(2);
		SelectReason.click();
		String ReasonValue = SelectReason.getText();
		TestReportsLog.log(Status.INFO, "Reason is selected as " +ReasonValue);
		wait(2);*/
		OkDelete.waitTillElementClickable();
		OkDelete.click();
		wait(3);
		FinalDelete.waitTillElementClickable();
		FinalDelete.click();
		wait(5);
		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Course delete is successfull");
		return this;
	}
}

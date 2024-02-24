package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byCSSSelector;
import static com.framework.elements.Locator.byXPath;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentMainPage extends BaseLocators {

	static String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	static String SMSServiceProviderValue = StudentConfigurationPage.SMSNameValue;
	static String EmployerNameActualValue = StudentConfigurationPage.EmployerNameValue;
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	String currentDate = formatter.format(date);


	public StudentMainPage RegisterCourse(StringHash data) throws Exception{

		Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));	
		waitForPageToLoad();
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		Add.waitTillElementClickable();
		Add.click();
		if (Overide.isElementPresent()) {
			Overide.click();       
		}
		waitForPageToLoad();
		scrollPage(0, -200);
		CourseInput.waitTillElementFound();
		CourseInput.waitTillElementClickable();
		CourseInput.click();
		wait(3);
		Search.clearAndType(data.get("Course").toString());
		wait(3);
		Input.click();
		Select.click();
		wait(3);
		Term.click();
		wait(3);
		Search.clearAndType(data.get("Term").toString());
		wait(2);
		Input.click();
		Select.click();
		SaveAndRegister.waitTillElementClickable();
		SaveAndRegister.click();
		addcoursewithoutCatogery.waitTillElementClickable();
		addcoursewithoutCatogery.click();
		waitForPageToLoad();
		scrollPage(0, 500);
		Next.waitTillElementClickable();
		Next.click();
		wait(4);
		InstructorTableCell.waitTillElementClickable();
		InstructorTableCell.click();
		scrollPage(0, 200);
		Register.click();
		wait(2);
		RegisterButton.click();
		scrollPage(0, -500);
		return this;

	}

	public StudentMainPage DropCourse(StringHash data) throws Exception{

		//Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));
		Link CourseTableCell = new Link("CourseTableCell", byXPath("//td[. = '"+data.get("Course")+"']"));
		Link CourseStatusTableCell = new Link("CourseStatusTableCell", byXPath("//td[8]"));
		Dropbox LetterGrade = new Dropbox("LetterGrade", byXPath("//li[. = '"+data.get("LetterGrade")+"']"));
		Dropbox DropReason = new Dropbox("DropReason", byXPath("//li[text()='"+data.get("DropReason")+"']"));

		waitForPageToLoad();
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseTableCell.getText(), data.get("Course").toString());
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatus").toString());
		Input.click();
		wait(3);
		Drop.waitTillElementClickable();
		Drop.click();
		wait(3);
		DropGradeSpan.waitTillElementClickable();
		DropGradeSpan.click();
		wait(2);
		LetterGrade.click();
		DropReasonsSpan.waitTillElementFound();
		DropReasonsSpan.click();
		wait(2);
		DropReason.click();
		DropButton.waitTillElementClickable();
		DropButton.click();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatusAfterDropping").toString());	
		return this;

	}


	public StudentMainPage ReinstateCourse(StringHash data) throws Exception{

		//Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));
		Link CourseTableCell = new Link("CourseTableCell", byXPath("//td[. = '"+data.get("Course")+"']"));
		Link CourseStatusTableCell = new Link("CourseStatusTableCell", byXPath("//td[8]"));


		waitForPageToLoad();
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseTableCell.getText(), data.get("Course").toString());
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatus").toString());
		Input.click();
		wait(3);
		Reinstate.waitTillElementClickable();
		Reinstate.click();
		wait(3);
		if (ReinstatePopUpButton.isElementPresent()) {
			ReinstatePopUpButton.click();       
		}
		wait(2);
		if (Override1.isElementPresent()) {
			Override1.click();       
		}

		waitForPageToLoad();
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatusAfterReinstating").toString());	
		return this;

	}

	public StudentMainPage UnregisterCourse(StringHash data) throws Exception{

		//Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));
		Link CourseTableCell = new Link("CourseTableCell", byXPath("//td[. = '"+data.get("Course")+"']"));
		Link CourseStatusTableCell = new Link("CourseStatusTableCell", byXPath("//td[8]"));
		Dropbox UnregisterDropDown = new Dropbox("Unregister", byXPath("//li[. = '"+data.get("UnregisterReason")+"']"));
		Link MessageSpan = new Link("Unregister message success", byXPath("/span[. = 'The Student Course records were successfully unregistered.']"));


		waitForPageToLoad();
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseTableCell.getText(), data.get("Course").toString());
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatus").toString());
		Input.click();
		wait(3);
		Unregister.click();
		wait(8);
		Clickreasonspan.waitTillElementClickable();
		Clickreasonspan.click();
		wait(2);
		UnregisterDropDown.click();
		ConfirmUnregister.click();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatusAfterUnregistering").toString());
		//MessageSpan.waitTillElementFound();
		//MessageSpan.isDisplayed();	
		return this;

	}

	public StudentMainPage AddLetterGrade(StringHash data) throws Exception{

		//Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));
		Link CourseTableCell = new Link("CourseTableCell", byXPath("//td[. = '"+data.get("Course")+"']"));
		Link CourseSpan = new Link("CourseSpan", byXPath("//span[. = '"+data.get("Course")+"']"));
		Dropbox LetterGradeDropBox = new Dropbox("LetterGradeDropBox", byXPath("//li[. = '"+data.get("LetterGrade")+"']"));
		Link CourseStatusTableCell = new Link("CourseStatusTableCell", byXPath("//td[8]"));

		waitForPageToLoad();
		AcademicRecords.waitTillElementClickable();
		AcademicRecords.click();
		StudentCourse.waitTillElementClickable();
		StudentCourse.click();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		CustomAsserts.containsString(CourseTableCell.getText(), data.get("Course").toString());
		//CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatus").toString());
		Input.click();
		CourseSpan.click();
		waitForPageToLoad();
		scrollPage(0, -200);
		FinalGrades.waitTillElementClickable();
		FinalGrades.click();
		wait(6);
		scrollPage(0, 200);
		LetterGradeDropdown.waitTillElementClickable();
		LetterGradeDropdown.click();
		wait(2);
		LetterGradeDropBox.click();
		scrollPage(0, -200);
		Save.click();
		wait(3);
		if (PostGrade.isElementPresent()) {
			PostGrade.click();       
		} 
		waitForPageToLoad();
		scrollPage(0, -400);
		CustomAsserts.containsString(CourseStatusTableCell.getText(), data.get("CourseStatusAfterAddingLetterGrade").toString());	
		return this;

	}


	public StudentMainPage AddTasks(StringHash data) throws Exception{

		//Dropbox TaskTemplateDropDown = new Dropbox("TaskTemplateDropDown", byXPath("//span[. = '"+data.get("TaskTemplate")+"']"));
		Dropbox TaskTemplateDropDown = new Dropbox(data.get("TaskTemplate"), byXPath("//span[. ='"+data.get("TaskTemplate")+"']"));
		Dropbox Status = new Dropbox(data.get("Status"), byXPath("//div/span[. ='"+data.get("Status")+"']"));
		Link MessageSpan = new Link("Unregister message success", byXPath("//span[. = 'The Task records were successfully saved.']"));

		//		waitForPageToLoad();
		ContactManager.click();
		wait(2);
		TasksSpan.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.click();
		wait(15);
		TaskTemplateSpan.click();
		wait(2);
		TaskTemplateDropDown.click();
		wait(5);
		Subject.click();
		wait(2);
		scrollPage(0, 300);
		wait(2);
		StatusSpan.click();
		wait(2);
		Status.click();
		scrollPage(0, -400);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(MessageSpan.getText(),"The Task records were successfully saved.");
		System.out.println("Task is added successfully");
		return this;
	}


	public StudentMainPage ConfirmPendingTasks(StringHash data) throws Exception{

		//Link InstructorTableCell = new Link("Click on Instructor table cell", byXPath("//td[. = '"+data.get("SectionCode")+"']"));
		Link TaskSubjectTableCell = new Link("TaskSubjectTableCell", byXPath("//td[1][. = '"+data.get("TaskTemplate")+"']"));
		Link TaskStatusTableCell = new Link("TaskStatusTableCell", byXPath("(//td/span[text()='"+data.get("Status")+"'])[1]"));

		//		waitForPageToLoad();
		ContactManager.click();
		wait(2);
		TasksSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(12);
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
		wait(3);
		CustomAsserts.containsString(TaskSubjectTableCell.getText(), data.get("TaskTemplate").toString());
		CustomAsserts.containsString(TaskStatusTableCell.getText(), data.get("Status").toString());
		System.out.println("Task is available in Pending state for student");
		return this;

	}

	public StudentMainPage EditTasks(StringHash data) throws Exception{

		Link TaskLink = new Link(data.get("TaskTemplate"), byXPath("//a[. = '"+data.get("TaskTemplate")+"']"));
		Link MessageSpan = new Link("Unregister message success", byXPath("//span[. = 'The Task records were successfully saved.']"));

		String NoteValue = AppendValue.apendString();
		Link TaskNotesTableCell = new Link("TaskNotesTableCell", byXPath("//td[text()='"+NoteValue+"']"));

		//		waitForPageToLoad();
		ContactManager.clickUsingJavaScriptExecutor();
		wait(2);
		TasksSpan.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(12);
		TaskSettings.clickUsingJavaScriptExecutor();
		wait(2);
		TaskClearFilter.clickUsingJavaScriptExecutor();
		wait(3);
		Subjectdropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("TaskTemplate").toString());
		wait(2);
		Filterbutton.click();
		wait(2);
		Statusdropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions2.click();
		wait(2);
		Value2.clearAndType(data.get("Status").toString());
		wait(2);
		Filterbutton2.click();
		wait(3);
		TaskLink.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		scrollPage(0, 500);
		StatusSpan.clickUsingJavaScriptExecutor();
		wait(2);
		SelectStatus.click();
		wait(2);
		String StatusValue = SelectStatus.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Task Status Value is selected as "+StatusValue);
		scrollPage(0, 300);
		Note.clearAndType(NoteValue.toString());
		scrollPage(0, -500);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(MessageSpan.getText(), data.get("Successmessage").toString());
		System.out.println("Task is edited successfully");
		return this;

	}

	public StudentMainPage CloseTask(StringHash data) throws Exception{

		Dropbox StatusDrop = new Dropbox(data.get("Status"), byXPath("//div/span[. = '"+data.get("Status")+"']"));

		Link TaskSubjectTableCell = new Link("TaskSubjectTableCell", byXPath("//td[1][. = '"+data.get("TaskTemplate")+"']"));
		Link TaskLink = new Link("TaskLink", byXPath("//a[. = '"+data.get("TaskTemplate")+"']"));
		String NoteValue = AppendValue.apendString();
		Link MessageSpan = new Link("Unregister message success", byXPath("//span[text()='The Task records were successfully saved.']"));


		ContactManager.clickUsingJavaScriptExecutor();
		wait(2);
		TasksSpan.click();
		wait(2);
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
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("TaskTemplate").toString());
		wait(2);
		Filterbutton.click();
		wait(3);
		TaskLink.clickUsingJavaScriptExecutor();
		waitForPageToLoad();
		scrollPage(0, 500);
		StatusSpan.click();
		wait(2);
		StatusDrop.click();
		wait(2);
		ActivityResultSpan.click();
		wait(2);
		ActivityResultDropDown.click();
		wait(2);
		String ActivityResultValue = ActivityResultDropDown.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Activity result Value is selected as "+ActivityResultValue);
		Note.click();
		Note.clearAndType(NoteValue.toString());
		scrollPage(0, -400);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(MessageSpan.getText(), data.get("Successmessage").toString());
		System.out.println("Task is closed successfully");
		return this;

	}



	public StudentMainPage UpdatingAdminRep(StringHash data) throws Exception{

		Link Successmessage = new Link("Successmessage", byXPath("//span[. = 'The Student records were successfully saved.']"));
		//		waitForPageToLoad();

		scrollPage(0, 600);
		RecruitInformationSpan.waitTillElementClickable();
		RecruitInformationSpan.click();
		wait(4);
		scrollPage(0, 300);	
		AdminRepSpan.clickUsingJavaScriptExecutor();
		wait(13);
		Search.clickUsingJavaScriptExecutor();
		wait(5);
		if(AdminRepCheckBox1.isSelected()){
			wait(2);
			AdminRepCheckBox2.click();
			wait(2);
			Select.clickUsingJavaScriptExecutor();
			TestReportsLog.log(LogStatus.INFO, "Admin Rep is selected");
		}
		else {
			wait(3);
			AdminRepCheckBox1.click();
			wait(2);
			Select.clickUsingJavaScriptExecutor();
			TestReportsLog.log(LogStatus.INFO, "Admin Rep is selected");
		}
		wait(6);
		scrollPage(0, -600);
		Save1.clickUsingJavaScriptExecutor();
		wait(10);
		SaveAgain.click();
		SaveAgain.clickUsingJavaScriptExecutor();
		wait(8);
		CustomAsserts.containsString(Successmessage.getText(), data.get("StatusAfterClosing").toString());
		System.out.println("Admin rep is updated successfully");
		return this;

	}



	public StudentMainPage VerifySMSConfiguration(StringHash data) throws Exception{

		Link SMSServiceProviderList = new Link("SMSServiceProviderList", byXPath("//span[. = '"+SMSServiceProviderValue+"']"));
		Link SuccessMessageSpan = new Link("SuccessMessageSpan", byXPath("//span[. = 'The Student records were successfully saved.']"));
		Link AddressTypeValue = new Link("AddressTypeValue", byXPath("//span[text()='"+data.get("AddressType")+"']"));


		//		waitForPageToLoad();
		scrollPage(0, 600);
		scrollPage(0, 600);
		ContactInformationSpan.click();
		wait(3);
		scrollPage(0, 300);
		wait(3);
		if(SubscribeToSMSCheckBox.isSelected()) {
			wait(2);
			SMSServiceProvider.click();
			wait(2);
			SMSServiceProvider.clearAndType(StudentConfigurationPage.SMSNameValue);
			wait(2);
			SMSServiceProviderList.click();
			wait(3);
		}
		else
		{
			SubscribeToSMSCheckBox.clickUsingJavaScriptExecutor();
			wait(2);
			SMSServiceProvider.click();
			wait(2);
			SMSServiceProvider.clearAndType(StudentConfigurationPage.SMSNameValue);
			wait(2);
			SMSServiceProviderList.click();
			wait(3);	
		}
		//		wait(2);
		//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//		jsExecutor.executeScript("document.getElementById('mobileNumber').value='4567890123'");
		wait(3);
		SaveButton1.clickUsingJavaScriptExecutor();
		wait(10);
		if(AddressType.isDisplayed()){
			AddressType.click();
			wait(2);
			AddressType.clearAndType(data.get("AddressType").toString());
			wait(2);
			AddressTypeValue.click();
			wait(2);
			SaveAddress.clickUsingJavaScriptExecutor();
			wait(8);
			//CustomAsserts.containsString(SuccessMessageSpan.getText(), data.get("SuccessMessageSpan").toString());
		}
		CustomAsserts.containsString(SuccessMessageSpan.getText(), data.get("SuccessMessageSpan").toString());
		System.out.println("SMS is added successfully for student");
		return this;

	}


	public StudentMainPage ScheduleStudentPaymentPlan(StringHash data) throws Exception{


		//Link AwardYearDropDown = new Link(data.get("AwardYear"), byXPath("//span[. = '"+data.get("AwardYear")+"']"));
		Link FundSourceDropDown = new Link(data.get("FundSource"), byXPath("//span[contains(text(),'"+data.get("FundSource")+"')]"));
		Link StatusDropDown = new Link(data.get("Status"), byXPath("//span[. = '"+data.get("Status")+"']"));
		Link SuccessMessageSpan = new Link("SuccessMessageSpan", byXPath("//span[. = 'The Cash/Other fund source records were successfully saved.']"));



		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		PaymentScheduleSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.click();
		wait(20);
		//		AwardYearSpan.click();
		//		wait(6);
		//		AwardYearInput.click();
		//		wait(3);
		//		AwardYearInput.clearAndType(data.get("AwardYear").toString());
		//		wait(2);
		//		AwardYearDropDown.click();
		//		wait(5);
		FundSourceSpan.click();
		wait(2);
		FundSourceInput.click();
		FundSourceInput.clearAndType(data.get("FundSource").toString());
		wait(2);
		FundSourceDropDown.click();
		wait(10);
		GrossAmountSpan.click();
		wait(4);
		//GrossAmount.Type(data.get("GrossAmount").toString());
		GrossAmount.type(data.get("GrossAmount").toString());
		wait(2);
		StatusSpan.click();
		wait(2);
		StatusDropDown.click();
		scrollPage(0, 100);
		Proceed.click();
		wait(20);
		scrollPage(0, 300);
		wait(2);
		CalculateButton.click();
		wait(6);
		scrollPage(0, -400);
		SavePaymentSch.click();
		wait(8);
		CustomAsserts.containsString(SuccessMessageSpan.getText(), data.get("Successmessage").toString());
		System.out.println("Payment schedule is added successfully");
		return this;

	}

	public StudentMainPage PerformRefundCalculation(StringHash data) throws Exception{

		Link SuccessMessage = new Link("SuccessMessage", byXPath("//span[text()='The Refund Calculation records were successfully saved.']"));
		String CalculationNameValue = "NewRefundCalculation"+AppendValue.apendString();

		StudentAccounts.click();
		wait(2);
		RefundCalculationsSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		NewCalculation.clickUsingJavaScriptExecutor();
		wait(15);
		CalculationName.click();
		CalculationName.clear();
		CalculationName.type(CalculationNameValue);
		wait(2);
		LastDayAttended.click();
		wait(2);
		LastDayAttended.clearAndType(currentDate);
		wait(3);
		Update.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, 300);
		wait(2);
		//		RefundCalTerm.waitTillElementClickable();
		//		RefundCalTerm.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectingRefundTerm.clickUsingJavaScriptExecutor();
		//		wait(3);	
		Calculate.waitTillElementClickable();
		Calculate.click();
		wait(8);
		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Refund calculation is successfull");
		return this;
	}

	public StudentMainPage AddingEnrollmentToStudent(StringHash data) throws Exception{


		Link AddEnrollmentSaveMessage = new Link("AddEnrollmentSaveMessage", byXPath("//span[. = 'The Student was successfully enrolled.']"));

		//Method Implementation
		//		waitForPageToLoad();
		AcademicRecords.click();
		wait(2);
		EnrollmentSpan.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		New.click();
		wait(20);
		StudentNext.clickUsingJavaScriptExecutor();
		wait(5);
		StudentStatusSpan1.click();
		wait(2);
		SelectStudentStatus1.click();
		wait(2);
		String SelectStudentStaus1 = SelectStudentStatus1.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Student Status Name is selected as "+SelectStudentStaus1);
		wait(3);
		ProgramSpan.clickUsingJavaScriptExecutor();
		wait(2);
		Program.click();
		wait(2);
		ProgramVersionCodeSpan.click();
		wait(2);
		ProgramVersionCode.click();
		wait(3);
		//		scrollPage(0, 300);
		//		wait(2);
		VersionStartDate.click();
		wait(2);
		SelVersionStartDate.click();
		wait(10);
		CatalogDropdown.click();
		wait(4);;
		SelectCatalog.click();
		wait(5);
		Shift.click();
		wait(4);
		SelShift.click();
		String SelShiftt = SelShift.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Shift Name is selected as "+SelShiftt);
		wait(2);
		GradelevelSpan.click();
		wait(3);
		Gradelevel.click();
		String Gradelvel = Gradelevel.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Gradelevel Name is selected as "+Gradelvel);
		wait(3);
		scrollPage(0, 400);
		wait(2);
		//		Billingcodespan.click();
		//		wait(3);
		//		SelBillingcodespan.click();
		//		String SelonBillingcodespan = SelBillingcodespan.getAttribute("title");
		//		TestReportsLog.log(LogStatus.INFO, "Billing code span is selected as "+SelonBillingcodespan);
		//		wait(3);
		scrollPage(0, 650);
		wait(2);
		ProgramNext.clickUsingJavaScriptExecutor();
		wait(2);
		EnrollNext.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, 50);
		wait(2);
		Enroll.click();
		wait(10);
		CustomAsserts.containsString(AddEnrollmentSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Enrollment is added successfully");
		return this;
	}

	public StudentMainPage AddEstimatedFAPackaging(StringHash data) throws Exception{

		Link BeginningAwardYearDropDown = new Link(data.get("BeginningAwardYear"), byXPath("//span[. = '"+data.get("BeginningAwardYear")+"']"));
		Link EstimateRecordsSuccessMessage = new Link("EstimateRecordsSuccessMessage", byXPath("//span[. = '"+data.get("EstimateRecordsSuccessMessage")+"']"));

		int COAValue = AppendValue.apendShortNumber();

		FinancialAid.click();
		wait(2);	
		EstimatesSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);	
		FAProgramVersionSpan.clickUsingJavaScriptExecutor();
		wait(2);
		//ProgramVersionInputBox.click();
		//ProgramVersionInputBox.clearAndType(data.get("ProgramVersion").toString());
		wait(2);
		ProgramVersionDropDown.clickUsingJavaScriptExecutor();
		wait(4);		
		String ProgramVersionValue = ProgramVersionDropDown.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Program version is selected  as  "+ProgramVersionValue);	
		//		BeginningAwardYear.clickUsingJavaScriptExecutor();
		//		wait(6);
		//		EnterBeginningAwardYear.click();
		//		wait(6);
		//		EnterBeginningAwardYear.clearAndType(data.get("BeginningAwardYear").toString());
		//		wait(6);
		//		BeginningAwardYearDropDown.click();
		//		wait(6);
		//		TotalProgramCOAValueInput.click();
		//		wait(1);
		TotalProgramCOAValue.sendKeys(String.valueOf(COAValue));
		TestReportsLog.log(LogStatus.INFO, "COA Value is updated as  "+COAValue);
		wait(5);
		//		StartDate.clickUsingJavaScriptExecutor();
		//		wait(5);
		//		StartDate.clearAndType(currentDate);
		////		wait(6);	
		//		if(Recalculate.isDisplayed()) {
		//			Recalculate.click();
		//			wait(10);
		//		}
		SaveFA.clickUsingJavaScriptExecutor();
		wait(8);	
		CustomAsserts.containsString(EstimateRecordsSuccessMessage.getText(), data.get("EstimateRecordsSuccessMessage").toString());
		scrollPage(0, 550);
		wait(2);
		CalculateEFC.click();
		wait(10);
		CalculatePell.click();
		wait(10);
		scrollPage(0, -550);
		SaveFA.click();
		wait(8);
		CustomAsserts.containsString(EstimateRecordsSuccessMessage.getText(), data.get("EstimateRecordsSuccessMessage").toString());
		System.out.println("Estimated FA packaging is added successfully");
		return this;
	}

	public StudentMainPage VerifyAcademicYearsInformation(StringHash data) throws Exception{

		TextField AwardYearTableCell = new TextField("AwardYear", byXPath("//td[. = '"+data.get("BeginningAwardYear")+"']"));
		//TextField COATableCell = new TextField("COA", byXPath("//td[. = '"+data.get("COAValue")+"']"));


		FinancialAid.clickUsingJavaScriptExecutor();
		wait(2);
		EstimatesSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		EstimatedAwards.click();
		wait(20);
		CustomAsserts.containsString(AwardYearTableCell.getText(), data.get("BeginningAwardYear").toString());
		//CustomAsserts.containsString(COATableCell.getText(), data.get("COAValue").toString());
		System.out.println("Academic year info is verified successfully");
		return this;

	}

	public StudentMainPage AddPromissoryNote(StringHash data) throws Exception{

		Link FundSourceType = new Link("FundType", byXPath("//a[. = '"+data.get("FundSourceFullName")+"']"));
		//TextField StudentName = new TextField("StudentName", byXPath("//div/div[. = '"+data.get("StudentName")+"']"));
		TextField StudentName = new TextField("StudentName", byXPath("//div[text()='"+data.get("StudentName")+"']"));

		StudentAccounts.waitTillElementClickable();
		StudentAccounts.click();
		scrollPage(0, 200);
		PaymentScheduleSpan.waitTillElementClickable();
		PaymentScheduleSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		FundSourceType.waitTillElementClickable();
		FundSourceType.click();
		wait(10);
		PromissoryNoteButton.waitTillElementClickable();
		PromissoryNoteButton.click();
		wait(5);
		//CustomAsserts.containsString(StudentName.getText(), data.get("StudentName").toString());	
		//CustomAsserts.containsString(PromissoryNotePoint.getText(), "A. PROMISE TO PAY.".toString());
		scrollPage(0, 300);
		CancelProm.waitTillElementClickable();
		CancelProm.clickUsingJavaScriptExecutor();
		System.out.println("Promisory note is added successfully");
		return this;

	}

	public StudentMainPage EditAwardInformation(StringHash data) throws Exception{

		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Cash/Other fund source records were successfully saved.']"));
		Checkbox ClickFundSource = new Checkbox(data.get("FundSource"), byXPath("//a[contains(text(),'"+data.get("FundSource")+"')]"));

		//		StudentStudentPage.FinancialAid.waitTillElementClickable();
		FinancialAid.clickUsingJavaScriptExecutor();
		wait(2);
		//		Awarding.waitTillElementClickable();
		Awarding.clickUsingJavaScriptExecutor();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		Awards.waitTillElementClickable();
		Awards.clickUsingJavaScriptExecutor();
		wait(20);
		//		PackagingMethod.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		/* SearchPackingMethod.clickUsingJavaScriptExecutor(); */
		//		wait(2);
		//		SelectingPackingMethod.click();
		//		wait(2);
		//		StudentStudentPage.NewButton.clickUsingJavaScriptExecutor();
		//		wait(20);
		//		TypeOfAid.click();
		//		wait(2);
		//		/* SearchTypeOfAid.sendKeys(data.get("TypeofAid")); */
		//		wait(2);
		//		SelectingTypeOfAid.click();
		//		wait(2);
		//		Source.click();
		//		wait(2);
		//		/* SearchSource.sendKeys(data.get("Source")); */
		//		wait(2);
		//		SelectingSource.click();
		//		wait(2);
		//		Status.click();
		//		wait(2);
		////		SearchStatus.sendKeys(data.get("Status"));
		////		wait(2);
		//		SelectingStatus.click();
		//		wait(2);
		//		GrossAmount.sendKeys("100");
		//		wait(2);
		//		Proceed.click();
		//		wait(20);
		////		Status.click();
		////		wait(2);
		////		SearchStatus1.sendKeys(data.get("Status"));
		////		wait(2);
		////		SelectingStatus1.click();
		////		wait(2);
		//		scrollPage(0, 300);
		//		Number.sendKeys("2");
		//		wait(5);
		//		scrollPage(0, 400);
		//		Calculate.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		scrollPage(0, -500);
		//		wait(2);
		//		SaveAndClose.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		//Dontsave.clickUsingJavaScriptExecutor();
		//		wait(5);
		//		CustomAsserts.containsString(ValidationMessage.getText(), "The Cash/Other fund source records were successfully saved.");
		//		wait(5);
		FSdropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("FundSource"));
		wait(2);
		FilterButton1.click();
		wait(2);
		ClickFundSource.waitTillElementClickable();
		ClickFundSource.click();
		wait(12);
		Number.waitTillElementFound();
		Number.sendKeys("1");
		wait(2);
		scrollPage(0, 100);
		CalculateButton.waitTillElementClickable();
		CalculateButton.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, -300);
		wait(2);
		SavePaymentSch.waitTillElementClickable();
		SavePaymentSch.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(),"The Cash/Other fund source records were successfully saved.");
		System.out.println("Award information is edited successfully");
		return this;
	}


	public StudentMainPage VerifyAwardUpdate(StringHash data) throws Exception{


		Link ModifiedByCellValue = new Link("ModifiedByCellValue", byXPath("//tr[1]/td[. = '"+data.get("ModifiedBy")+"']"));


		FinancialAid.click();
		wait(2);
		Audit.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(12);
		CustomAsserts.containsString(ModifiedByCellValue.getText(), data.get("ModifiedBy").toString());
		System.out.println("Award information is verified successfully");
		return this;
	}


	public StudentMainPage BatchOfStudentRegestrationTrack(StringHash data) throws Exception{

		Link SelectingTrack= new Link("Select Track", byXPath("//td[text()='"+StudentTrackConfiguration.TrackName+"']"));
		Link PopUpValidation = new Link("Validation Message", byXPath("//span[contains(text(),'The Track Registration records were successfully queued.')]"));
		TextField SearchProcessess = new TextField("SearchProcessess", byXPath("//input[@id=\"daily-processes-treeview-filter\"]"));

		//Method Implementation
		wait(4);
		SearchProcessess.clearAndType("Registration");
		wait(2);
		Registration.click();
		wait(10);
		Track.clickUsingJavaScriptExecutor();
		wait(10);
		NameDropDown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(StudentTrackConfiguration.TrackName);
		wait(2);
		FilterButton.click();
		wait(2);

		//			List<WebElement> rows = driver.findElements(By.xpath("//table//tr")); 
		//			Link PopUpValidation = new Link("Validation Message", By.xpath("//span[contains(text(),'The Track Registration records were successfully queued.')]"));
		//			wait(7);
		//			rows.size();
		//			System.out.println(rows.size());
		//			for (int i=1; i<=rows.size(); i++) {
		//				WebElement elementTrackName = driver.findElement(By.xpath("//table//tr["+i+"]//td[1]"));
		//				System.out.println("//table//tr["+i+"]//td[1]");
		//				String actualValue = elementTrackName.getText();
		//				System.out.println(actualValue);
		//				//System.out.println(Abcd);
		//				if(actualValue.equals(TrackName.toString())) {
		//					elementTrackName.getText();
		//					elementTrackName.click();
		//					wait(2);
		//					System.out.println(elementTrackName);
		//					wait(4);
		//					break; 
		//				}
		//			}
		SelectingTrack.click();
		wait(4);
		EnterSgroup.click();
		wait(4);
		EnterSgroup.clearAndType(StudentTrackConfiguration.Groupname);
		wait(2);
		scrollPage(0,20);
		wait(2);
		ApproveNext.click();
		wait(20);
		AllstuCheck.clickUsingJavaScriptExecutor();
		wait(3);
		QueueRegistration.clickUsingJavaScriptExecutor();
		wait(5);
		/*if (Override.isDisplayed()) {
					Override.clickUsingJavaScriptExecutor();
					wait(5);
				}*/
		ApproveToPost.clickUsingJavaScriptExecutor();
		wait(5);
		//CustomAsserts.containsString(PopUpValidation.getText(), data.get("SuccessMessage").toString());
		System.out.println("Batch track registration is successfull");
		wait(10);
		return this;

	}

	public StudentMainPage BatchOfStudentUnRegistration(StringHash data) throws Exception{


		Link BatchStudentUnRegSaveMessage = new Link("Batch Student UnRegister SaveMessage", byXPath("//span[. = 'The Unregister records were successfully queued.']"));
		Checkbox SelectTerm1 = new Checkbox("Select Term1", byXPath("//tr//td//input"));
		TextField SearchProcessess = new TextField("SearchProcessess", byXPath("//input[@id=\"daily-processes-treeview-filter\"]"));

		wait(2);
		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		wait(2);
		SearchProcessess.clearAndType("Registration");
		wait(2);
		Registration.click();
		wait(15);
		Unregister.clickUsingJavaScriptExecutor();
		wait(10);
		//			campus.clickUsingJavaScriptExecutor();
		//			wait(5);
		//			SelectCampus.clickUsingJavaScriptExecutor();
		//			wait(5);
		TermList.click();
		wait(2);
		Search.clearAndType(data.get("Term Code").toString());
		wait(5);
		SelectTerm1.click();
		wait(2);	
		Select.clickUsingJavaScriptExecutor();
		wait(7);
		/*Term1.click();
				wait(3);
				SelectTerm.click();
				wait(3);
				String SelctTerm = SelectTerm.getAttribute("title");
			    TestReportsLog.log(Status.INFO, "SelectTermName is selected as "+SelctTerm);
				Select1.click();
				wait(7);*/
		//Instructor.click();
		//wait(2);
		EnterInstructor.clearAndType(data.get("Instructor").toString());
		wait(2);
		String SelInstructr = SelInstructor.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Instructor Name is selected as "+SelInstructr);
		wait(2);
		SelInstructor.click();
		wait(2);
		ApproveNext.click();
		wait(2);
		SelectAll.click();
		SelectAll.click();
		wait(4);
		scrollPage(0, 300);
		wait(2);
		UnReas.click();
		wait(3);
		SelReass.click();
		wait(1);
		QueueUnregiter.click();
		wait(2);
		QueueButton.click();
		wait(5);
		CustomAsserts.containsString(BatchStudentUnRegSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Batch track unregister is successfull");
		return this;
	}

	public StudentMainPage ProgrameTransferToStudent(StringHash data) throws Exception{

		Link TransStudentSaveMessage = new Link("Trans Student SaveMessage", byXPath("//span[. = 'The Transfer Enrollment records were successfully saved.']"));

		Link SelectPrograme = new Link("Programe", byXPath("(//tbody/tr[1]/td[2])[1]"));			
		//Method Implementation
		AcademicRecords.click();
		wait(2);
		Enrollments.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		CourseFilter.click();
		wait(6);
		ClearFilters.clickUsingJavaScriptExecutor();
		wait(8);
		Enroldropdown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("Program Version"));
		wait(2);
		FilterButton.click();
		wait(10);
		SelectPrograme.click();
		wait(10);
		EnrollMore.click();
		wait(3);
		Transfer.click();
		wait(8);
		TransferType.click();
		wait(3);
		SelTransferType.click();
		wait(3);
		//			wait(4);
		//			ProgrameVersion.waitTillElementClickable();
		ProgrameVersion.clickUsingJavaScriptExecutor();
		wait(2);
		//			SelPrgver.waitTillElementClickable();
		SelPrgver.click();
		wait(3);
		Proceed.clickUsingJavaScriptExecutor();
		//			Proceed.click();
		wait(4);
		if(TransferButton.isDisplayed()){
			TransferButton.click();
			wait(20);
		}
		//			Next3.waitTillElementClickable();
		Next3.clickUsingJavaScriptExecutor();
		wait(2);
		Next4.clickUsingJavaScriptExecutor();
		wait(2);
		Next5.clickUsingJavaScriptExecutor();
		wait(2);
		Transfer2.clickUsingJavaScriptExecutor();
		wait(2);
		//Transfer3.clickUsingJavaScriptExecutor();
		wait(7);
		//CustomAsserts.containsString(TransStudentSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Program is transferred successfully");
		return this;

	}


	public StudentMainPage AddBillableServices(StringHash data) throws Exception{

		Link SuccessMessage = new Link("SuccessMessage", byXPath("//span[. = 'The Billable Service records were successfully saved.']"));

		StudentServices.click();
		wait(2);
		BillableServicesSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.click();
		wait(15);
		TermSpan.click();
		wait(3);
		SelectBillTerm.click();
		String TermValue = SelectBillTerm.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Term is selected as "+TermValue);
		wait(3);
		ProgramVersionSpan.clickUsingJavaScriptExecutor();
		wait(3);
		SelectBillProgramVersion.click();
		String ProgramVersionValue = SelectBillProgramVersion.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Programversion is selected as "+ProgramVersionValue);
		wait(3);
		ServiceCategorySpan.click();
		wait(3);
		ServiceCategory.click();
		String ServiceCategoryValue = ServiceCategory.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Service category is selected as "+ServiceCategoryValue);
		wait(3);
		ServiceSpan.click();
		wait(3);
		Service.click();
		String ServiceValue = Service.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Service is selected as "+ServiceValue);
		wait(6);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(6);
		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage"));
		System.out.println("Billable service is added successfully");
		return this;
	}




	public StudentMainPage AddAthletics(StringHash data) throws Exception{

		Link AthleticsSpan = new Link("AthleticsSpan", byXPath("//span[. = 'Athletics']"));
		Button New = new Button("New", byXPath("//a[5][. = 'New']"));
		Button SportSpan = new Button("SportSpan", byXPath("//div[1]/cmc-drop-down-list-classic[1]/div/div/span/span/span/span"));
		Link Sport = new Link("Sport", byXPath("//div/ul[@id='sportId_listbox']/li[1]"));
		Button RecruitmentTypeSpan = new Button("RecruitmentTypeSpan", byXPath("//cmc-drop-down-list-classic[2]/div/div/span/span/span/span"));
		Link RecruitmentType = new Link("RecruitmentType", byXPath("//div/ul[@id='recruitmentTypeId_listbox']/li[1]"));
		Button AthleticStatusSpan = new Button("AthleticStatusSpan", byXPath("//div[2]/cmc-drop-down-list-classic/div/div/span/span/span/span"));
		Link AthleticStatus = new Link("AthleticStatus", byXPath("//div/ul[@id='athleticStatusId_listbox']/li[1]"));
		Button LastActiveTermSpan = new Button("LastActiveTermSpan", byXPath("//div/cmc-drop-down-list/div/div/span//span[2]"));
		Link LastActiveTerm = new Link("LastActiveTerm", byXPath("//div/ul[@id='lastActiveTermId_listbox']/li[1]"));
		TextField RemainingEligibility = new TextField("RemainingEligibility", byXPath("//input[@name='remainingEligibility']"));
		TextField AthleticID = new TextField("AthleticID", byXPath("//input[@name='athleticIdentifier']"));
		Button SaveAndClose = new Button("SaveAndClose", byXPath("//div[2]/cmc-toolbar/section/cmc-toolbar-button-save-close//button"));
		Button UpdateAthleticID = new Button("UpdateAthleticID", byXPath("//button[@id='confirmStudentAthleticIdentifierWindowOkButton']"));
		Link AthleticStatusTableCell = new Link("AthleticStatusTableCell", byXPath("(//tr/td[3])[1]"));
		Link SuccessMessage = new Link("SuccessMessage", byXPath("//span[. = 'The Athletic records were successfully saved.']"));

		int AthleticIdValue = AppendValue.apendShortNumber();

		StudentServices.waitTillElementClickable();
		StudentServices.click();
		AthleticsSpan.waitTillElementClickable();
		AthleticsSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.waitTillElementClickable();
		New.click();
		wait(15);
		SportSpan.waitTillElementClickable();
		SportSpan.click();
		Sport.waitTillElementClickable();
		Sport.click();
		String SportValue = Sport.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Sport is selected as "+SportValue);
		wait(1);
		RecruitmentTypeSpan.waitTillElementClickable();
		RecruitmentTypeSpan.click();
		RecruitmentType.waitTillElementClickable();
		RecruitmentType.click();
		String RecruitmentTypeValue = RecruitmentType.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Recruitment Type is selected as "+RecruitmentTypeValue);
		wait(1);
		AthleticStatusSpan.waitTillElementClickable();
		AthleticStatusSpan.click();
		AthleticStatus.waitTillElementClickable();
		AthleticStatus.click();
		String AthleticStatusValue = AthleticStatus.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Athletic Status is selected as "+AthleticStatusValue);
		wait(1);
		LastActiveTermSpan.waitTillElementClickable();
		LastActiveTermSpan.click();
		LastActiveTerm.waitTillElementClickable();
		LastActiveTerm.click();
		String LastActiveTermValue = LastActiveTerm.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Last active term is selected as "+LastActiveTermValue);
		wait(1);
		RemainingEligibility.waitTillElementClickable();
		RemainingEligibility.click();
		RemainingEligibility.waitTillElementClickable();
		RemainingEligibility.sendKeys(String.valueOf(1));
		TestReportsLog.log(LogStatus.INFO, "Remaining eligibility is entered as "+1);
		wait(1);
		AthleticID.click();
		//wait(2);
		//AthleticID.clear();
		wait(2);
		AthleticID.sendKeys(String.valueOf(AthleticIdValue));
		wait(2);
		TestReportsLog.log(LogStatus.INFO, "Athletic ID is entered as "+AthleticIdValue);
		SaveAndClose.click();
		wait(6);
		if(UpdateAthleticID.isDisplayed()) {
			UpdateAthleticID.click();
			wait(14);
		}
		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage"));
		//		CustomAsserts.containsString(AthleticStatusValue.toString(),AthleticStatusTableCell.getText());
		System.out.println("Athletic details is added successfully");
		return this;
	}


	public StudentMainPage AddAccomodations(StringHash data) throws Exception{

		Link AccomodationServiceSuccessMessage = new Link("AccomodationServiceSuccessMessage", byXPath("//span[.='The Accommodation Service records were successfully saved.']"));

		String NoteValue = AppendValue.apendString();

		StudentServices.click();
		wait(2);
		AccomodationsSpan.click();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		DisabledSpan.click();
		wait(2);
		Disabled.click();
		String DisabledValue = Disabled.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Disabled is selected as "+DisabledValue);
		wait(3);
		AccomStatusSpan.click();
		wait(2);
		AccomStatus.click();
		String StatusValue = AccomStatus.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Status is selected as "+StatusValue);
		wait(3);	
		SearchDisabilityTypes.click();
		wait(4);	
		if(DisabilityType.isSelected()){
			DisabilityType.click();
			wait(2);
			DisabilityTypeValue.click();
			wait(2);
			Select.click();
			//Cancel.click();
			TestReportsLog.log(LogStatus.INFO, "Disability type is selected");
		}
		else {
			wait(3);
			DisabilityType.click();
			wait(2);
			Select.click();
			TestReportsLog.log(LogStatus.INFO, "Disability type is selected");
		}
		wait(3);
		AssistanceDuringRegistrationSpan.click();
		wait(2);
		AssistanceDuringRegistration.click();
		String AssistanceDuringRegistrationValue = AssistanceDuringRegistration.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Assistance during registration is selected as "+AssistanceDuringRegistrationValue);
		wait(3);
		PriorityRegistrationSpan.click();
		wait(2);
		PriorityRegistration.click();
		wait(2);
		Note1.click();
		wait(2);
		Note1.clearAndType(NoteValue.toString());
		wait(2);
		scrollPage(0, -200);
		Save.click();
		wait(12);
		scrollPage(0, 200);
		New.click();
		wait(15);
		AccomServiceSpan.click();
		wait(2);
		AccomService.click();
		String ServiceValue = Service.getTextValue();
		TestReportsLog.log(LogStatus.INFO, "Service is selected as "+ServiceValue);
		wait(2);
		ServiceStartDate.click();
		wait(2);
		ServiceStartDate.clearAndType(data.get("StartDate").toString());
		wait(2);
		ServiceEndDate.click();
		wait(2);
		ServiceEndDate.clearAndType(data.get("EndDate").toString());
		wait(2);
		SaveService.click();
		wait(10);
		CustomAsserts.containsString(AccomodationServiceSuccessMessage.getText(),data.get("SuccessMessage").toString());
		System.out.println("Accomodation details are addedd successfully");
		return this;
	}



	public StudentMainPage VeteranConfirmnewinfoaddedtofield(StringHash data) throws Exception{


		Link ConfirmInfoSchoolFieldSaveMessage = new Link("Confirm Info School Field SaveMessage", byXPath("//span[. = 'The Veteran records were successfully saved.']"));

		//Method Implementation
		StudentServices.clickUsingJavaScriptExecutor();
		wait(2);
		Veteran.clickUsingJavaScriptExecutor();
		wait(10);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(12);
		New.click();
		wait(3);
		if (AddVeteran.isDisplayed()) {
			AddVeteran.click(); 
			wait(2);
		}
		//AddVeteran.click();
		//wait(10);
		scrollPage(0,200);
		wait(2);
		Branch.clickUsingJavaScriptExecutor();
		wait(2);
		SelectBranch.clickUsingJavaScriptExecutor();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(5);
		//		Benifit.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectBenifit.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		Select.click();
		//			wait(5);
		//			CertifiedTerm.clickUsingJavaScriptExecutor();
		//			wait(2);
		//			SelCertifiedTerm.clickUsingJavaScriptExecutor();
		//			wait(5);
		//		CertificateType.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelCertificateType.clickUsingJavaScriptExecutor();
		//		wait(5);
		SaveAndClose.click();	
		wait(6);
		CustomAsserts.containsString(ConfirmInfoSchoolFieldSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Veteran information is added successfully");
		return this;
	}

	public StudentMainPage IndicatorsConfnewinfocanbeaddtofield(StringHash data) throws Exception{


		Link ConfirmInfoSchoolFieldSaveMessage = new Link("Confirm Info School Field SaveMessage", byXPath("//span[text()='The Indicator Defined Service records were successfully saved.']"));

		//Method Implementation
		StudentServices.clickUsingJavaScriptExecutor();
		wait(3);
		scrollPage(0,15);
		wait(3);
		Indicator.clickUsingJavaScriptExecutor();
		wait(10);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(12);
		scrollPage(0, -300);
		New.click();
		wait(3);
		scrollPage(0,200);
		wait(2);
		IndicatorDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		SelIndicator1.clickUsingJavaScriptExecutor();
		wait(5);
		EffectiveDate.clearAndType(currentDate);
		wait(5);
		//			EndDate.clearAndType(data.get("EndDate"));
		//			wait(3);
		SaveAndClose.clickUsingJavaScriptExecutor();	
		wait(6);
		//CustomAsserts.containsString(ConfirmInfoSchoolFieldSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Indicator is added successfully");
		return this;
	}
	public StudentMainPage DeleteIndicatorsConfirmnewinformationcanbeaddedtofield(StringHash data) throws Exception{

		Link ConfirmIndicatorSaveMessage = new Link("Confirm Info School Field SaveMessage", byXPath("//span[. = 'The Indicator records were successfully deleted.']"));

		//Method Implementation
		StudentServices.waitTillElementClickable();
		StudentServices.clickUsingJavaScriptExecutor();
		Indicator.waitTillElementClickable();
		Indicator.clickUsingJavaScriptExecutor();
		wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		wait(10);
		SelectIndicator.waitTillElementClickable();
		SelectIndicator.click();
		DeleteButton.waitTillElementClickable();
		DeleteButton.clickUsingJavaScriptExecutor();
		wait(1);
		ConfirmDeleteButton.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(ConfirmIndicatorSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Indicator is deleted successfully");
		return this;
	}

	public StudentMainPage InternationalConfirmnewinformationcanbeaddedtofield(StringHash data) throws Exception{

		//X-path Parameterization
		Link ClickStudentName = new Link("Selecting Student", byXPath("//span[text()='"+data.get("StudentName")+"']"));

		Link StudentServices = new Link("Student Services", byXPath("//li[7]/span"));

		Link ConfirmInfoSchoolFieldSaveMessage1 = new Link("Confirm Info School Field SaveMessage1", byXPath("//span[. = 'The Dependent Information records were successfully saved.']"));

		Link ConfirmInfoSchoolFieldSaveMessage = new Link("Confirm Info School Field SaveMessage", byXPath("//span[. = 'The International records were successfully saved.']"));

		Link Veteran = new Link("Veteran", byXPath("//div/span[. = 'Veteran']"));

		Link Indicator = new Link("Indicator", byXPath("//span[. = 'Indicators']"));

		Link New = new Link("New", byXPath("//a[5][. = 'New']"));

		Link AddVeteran = new Link("Add Veteran", byXPath("//div[39]//button[1]"));

		Link Select = new Link("Select", byXPath("//button[. = 'Select']"));

		Link CertifiedTerm = new Link("Certified Term", byXPath("//div/cmc-drop-down-list-classic[1]/div/div/span/span/span/span"));

		Link SelCertifiedTerm = new Link("Certified Term", byXPath("//li[1]/div/span[1]"));

		Link Transstatus = new Link("Transaction status", byXPath("//span[@aria-controls='generalTransmittalStatus_listbox']/span"));

		Link SelTransstatus = new Link("Transaction status", byXPath("//ul[@id='generalTransmittalStatus_listbox']/li[2]"));

		Link Visatyepe = new Link("Visa type", byXPath("//span[@aria-controls='generalVisaCode_listbox']/span"));

		Link SelVisatyepe = new Link("Visa type", byXPath("//ul[@id='generalVisaCode_listbox']/li[1]/div/span[1]"));

		Link FormPurpose = new Link("Form Purpose", byXPath("//span[@aria-controls='generalFormPurpose_listbox']/span"));

		Link SelFormPurpose = new Link("Form Purpose", byXPath("//ul[@id='generalFormPurpose_listbox']/li[1]/div/span[1]"));

		Link CountryBirth = new Link("Country Birth", byXPath("//span[@aria-controls='f1CountryOfBirth_listbox']/span"));

		Link SelectData = new Link("Data", byXPath("//cns-student-international-f1-m1/div/cmc-collapse/div/div[1]/div//div"));

		Link SelectFund = new Link("Fund", byXPath("//cns-student-international-f1-m1-funds/div/cmc-collapse/div/div[1]/div//div"));

		Link SelectProgramme = new Link("Programme", byXPath("//cns-student-international-program/div/cmc-collapse/div/div[1]/div//div"));

		Link SelectDependentinfo = new Link("Dependent Info", byXPath("//div/a/div"));

		Link SelectAddress = new Link("Address", byXPath("//cns-student-international-address/div/cmc-collapse/div/div[1]/div//div"));

		Link SelCountryBirth = new Link("Country Birth", byXPath("//ul[@id='f1CountryOfBirth_listbox']/li[1]/div/span[1]"));

		TextField ProficiancyReason = new TextField("Proficiancy Reason", byXPath("//cns-student-international-f1-m1-data/div/cmc-collapse/div/div[2]/div[6]//textarea"));

		TextField ProficiancyReason1 = new TextField("Proficiancy Reason1", byXPath("//cns-student-international-f1-m1-data/div/cmc-collapse/div/div[2]/div[6]//textarea"));

		TextField Personal = new TextField("Enter Personal", byXPath("//input[@aria-label='Personal'][1]"));

		TextField Personal1 = new TextField("Enter Personal1", byXPath("//div[1]/cmc-numeric-input-text[1]/div/div/span/span"));

		Link Enrollmentstatus = new Link("Enrollment status", byXPath("//cns-student-international-program/div/cmc-collapse/div/div[2]/div/div[1]/cmc-drop-down-list/div/div/span/span/span/span"));

		Link SelEnrollmentstatus = new Link("Enrollment status", byXPath("(//div/div/div[3]/ul/li[1]//span[1])[1]"));

		Link EducationLevel = new Link("Education Level", byXPath("//span[@aria-controls='programVerEducationLevel_listbox']/span"));

		Link SelEducationLevel = new Link("Education Level", byXPath("//ul[@id='programVerEducationLevel_listbox']/li[1]/div/span[1]"));

		Link PrimeryMajor = new Link("Primery Major", byXPath("//span[@aria-controls='programVerMajor_listbox']/span"));

		Link SelPrimeryMajor = new Link("Education Level", byXPath("//ul[@id='programVerMajor_listbox']/li[1]/div/span[1]"));

		TextField InstituteCharge = new TextField("Institute Charge", byXPath("//input[@aria-label='Institutional Charges'][1]"));

		TextField InstituteCharge1 = new TextField("Institute Charge", byXPath("//div[4]/cmc-numeric-input-text[1]/div/div/span/span"));

		TextField LivingExpense = new TextField("Living Expense", byXPath("//input[@aria-label='Living Expenses'][1]"));

		TextField LivingExpense1 = new TextField("Living Expense", byXPath("//div[4]/cmc-numeric-input-text[2]/div/div/span/span"));

		Link Add = new Link("add", byXPath("//a[5][. = 'Add']"));

		Link Relationship = new Link("Relationship", byXPath("//span[@aria-controls='dependentInfoRelationship_listbox']/span"));

		Link SelRelationship = new Link("Relationship", byXPath("//ul[@id='dependentInfoRelationship_listbox']/li[1]/div/span[1]"));

		TextField Firstname = new TextField("Firstname", byXPath("//input[@id='dependentInfoFirstName']"));

		TextField Lastname = new TextField("Lastname", byXPath("//input[@id='dependentInfoLastName']"));

		TextField MiddleName = new TextField("MiddleName", byXPath("//ng-transclude/div/div/div[3]/cmc-input-text//input"));

		TextField Firstname1 = new TextField("Firstname", byXPath("//ng-transclude/div/div/div[2]/cmc-input-text[1]//input"));

		TextField Lastname1 = new TextField("Lastname", byXPath("//ng-transclude/div/div/div[2]/cmc-input-text[2]//input"));

		TextField MiddleName1 = new TextField("MiddleName", byXPath("//ng-transclude/div/div/div[3]/cmc-input-text//input"));

		TextField EffectiveDate = new TextField("Effective Date", byXPath("//cmc-date-picker[1]//input[@placeholder = 'MM/DD/YYYY']"));

		TextField EffectiveDate1 = new TextField("Effective Date", byXPath("//ng-transclude//input[@placeholder = 'MM/DD/YYYY']"));

		Link Gender = new Link("Gender", byXPath("//span[@aria-controls='dependentInfoGender_listbox']/span"));

		Link SelGender = new Link("Gender", byXPath("//ul[@id='dependentInfoGender_listbox']/li[1]/div/span[1]"));

		Link CountryofBirth = new Link("Country of Birth", byXPath("//span[@aria-controls='dependentInfoBirthCountry_listbox']/span"));

		Link SelCountryofBirth = new Link("Country of Birth", byXPath("//ul[@id='dependentInfoBirthCountry_listbox']/li[1]/div/span[1]"));

		Link Citizenship = new Link("Citizenship", byXPath("//span[@aria-controls='dependentInfoCitizenshipCountry_listbox']/span"));

		Link SelCitizenship = new Link("Citizenship", byXPath("//ul[@id='dependentInfoCitizenshipCountry_listbox']/li[1]/div/span[1]"));

		TextField Expenses = new TextField("Expenses", byXPath("//input[1][@aria-label='Expenses']"));

		TextField Expenses1 = new TextField("Expenses", byXPath("//div[6]/cmc-numeric-input-text/div/div/span/span"));

		Dropbox VisaType = new Dropbox("Visa Type", byXPath("//span[@aria-controls='dependentInfoVisaType_listbox']/span"));

		Link SelVisaType = new Link("Visa Type", byXPath("//ul[@id='dependentInfoVisaType_listbox']/li[1]/div/span[1]"));

		Link CopyfromStudentProfile = new Link("Copy from Student Profile", byXPath("//div/div/div[1]/div[3]/a"));

		TextField StretAddress = new TextField("Street Address", byXPath("//textarea[@name='foreignStreetAddress']"));

		TextField StretAddress1 = new TextField("Street Address", byXPath("//div[2]/div/div[2]/cmc-textarea[1]//textarea"));

		Link Country = new Link("Country", byXPath("//span[@aria-controls='foreignCountry_listbox']/span"));

		Link SelCountry = new Link("Country", byXPath("//ul[@id='foreignCountry_listbox']/li[1]/div/span[1]"));

		TextField PhnNumber = new TextField("Phone Number", byXPath("(//input[@aria-label='Phone Number'])[1]"));

		Link SaveAndCose = new Link("Save Massege1", byXPath("//*[@id='studentInternationalSaveButton']"));

		//	        Button Save = new Button("Save Massege", byXPath("//button[@id='saveDependentInfo']"));

		Button Yes = new Button("Yes", byXPath("//button[@id='studentInternationalInformationDialogOkButton']"));

		TextField Birthday = new TextField("Birthdate", byXPath("//input[@name='dependentInfoBirthDate']"));

		Link International = new Link("International", byXPath("//span[. = 'International'][1]"));

		//	        AngDropDown CountryOfCitizenship = new AngDropDown("Country Of Citizenship", byXPath("//span[@aria-controls='studentInfoCitizenshipCountry_listbox']/span"));

		Link SelCountryOfCitizenship = new Link("Select Country Of Citizenship", byXPath("//ul[@id='studentInfoCitizenshipCountry_listbox']/li[1]/div/span[1]"));

		Button Change = new Button("Change", byXPath("(//button[@aria-label='Change'])[4]"));

		TextField USStreetAddress = new TextField("US Street Address", byXPath("//textarea[@id='usStreetAddress']"));

		TextField UsCity = new TextField("Enter US City", byXPath("//input[@id='usCity']"));

		TextField UsState = new TextField("Enter US State", byXPath("(//input[@aria-label='State'])[1]"));

		Link SelectState = new Link("Click on the State", byXPath("(//span[@title='NY'])[1]"));

		//	        Dropbox PostalCode = new Dropbox("Click on the DropDown", byXPath("//span[@aria-controls='usPostalCode_listbox']"));
		TextField PostalCode = new TextField("Click on the DropDown", byXPath("//input[@aria-owns='usPostalCode_listbox']"));

		Link SelectPostalCode = new Link("Click on PostalCode", byXPath("//ul[@id='usPostalCode_listbox']/li[1]"));

		TextField Englishproficiency = new TextField("Enter the Proficiency", byXPath("//textarea[@id='EnglishProficiencyNotRequiredReason']"));

		///
		Button CountryCitizen = new Button("Country", byXPath("(//button[@aria-label='expand combobox'])[5]/span[1]"));
		Link SelectCountry = new Link("Country", byXPath("//ul[@id='studentInfoCitizenshipCountry_listbox']/li[1]/span[1]/div/span[1]"));
		Button Save = new Button("Save", byXPath("//span[text()='Save']"));

		//Method Implementation

		//    waitForPageToLoad();

		ContactManager.clickUsingJavaScriptExecutor();
		wait(3);
		International.clickUsingJavaScriptExecutor();
		wait(5);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);

		if (Change.isDisplayed()) {

			Change.click();

		}

		//Yes.click();

		wait(5);

		//	        Transstatus.click();
		//
		//	        wait(2);
		//
		//	        SelTransstatus.click();
		//
		//	        wait(3);
		//
		//	        Visatyepe.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        SelVisatyepe.clickUsingJavaScriptExecutor();
		//
		//	        wait(5);
		//
		//	        FormPurpose.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        SelFormPurpose.clickUsingJavaScriptExecutor();
		//
		//	        wait(5);

		CountryCitizen.click();

		wait(2);

		SelectCountry.click();

		wait(2);
		//	        scrollPage(0, 650);
		//
		//	        wait(5);
		//
		//	        SelectData.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        scrollPage(0, 90);
		//
		//	        wait(3);
		//
		//	        CountryBirth.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        SelCountryBirth.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Englishproficiency.clearAndType("Learn");
		//
		//	        wait(3);
		//
		//	        scrollPage(0, 700);
		//
		//	        wait(3);
		//
		//	        SelectFund.clickUsingJavaScriptExecutor();
		//
		//	        wait(7);
		//
		////	        Personal1.click();
		//
		//	        wait(3);
		//
		//	        Personal.sendKeys(String.valueOf(100));
		//
		//	        //wait(3);
		//
		//	        scrollPage(0, 500);
		//
		//	        wait(3);
		//
		//	        SelectProgramme.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		////	        Enrollmentstatus.clickUsingJavaScriptExecutor();
		//
		////	        wait(3);
		//
		////	        SelEnrollmentstatus.clickUsingJavaScriptExecutor();
		//
		////	        wait(5);
		//
		//	        EducationLevel.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelEducationLevel.clickUsingJavaScriptExecutor();
		//
		//	        wait(5);
		//
		//	        PrimeryMajor.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelPrimeryMajor.clickUsingJavaScriptExecutor();
		//
		//	        wait(5);
		//
		//	        InstituteCharge.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        InstituteCharge.sendKeys("200");
		//
		//	        wait(3);
		//
		//	        LivingExpense.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        LivingExpense.sendKeys("100");
		//
		//	        wait(3);
		//
		//	        scrollPage(0, 300);
		//
		//	        wait(3);
		//
		//	        SelectDependentinfo.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Add.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Relationship.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelRelationship.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Firstname1.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        Firstname.clearAndType("AA");
		//
		//	        wait(3);
		//
		//	        Lastname1.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        Lastname.clearAndType("BB");
		//
		//	        wait(3);
		//
		////	        MiddleName1.clickUsingJavaScriptExecutor();
		//
		////	        wait(2);
		//
		////	        MiddleName.clearAndType("CC");
		//
		//	        wait(3);
		//
		//	        Birthday.clearAndType("10/17/2023");
		//
		//	        wait(2);
		//
		//	        Gender.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelGender.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        CountryofBirth.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelCountryofBirth.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Citizenship.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelCitizenship.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        Expenses.sendKeys("150");
		//
		//	        wait(3);
		//
		//	        VisaType.click();
		//
		//	        wait(2);
		//
		//	        SelVisaType.click();
		//
		//	        wait(2);
		//
		//	        scrollPage(0, 50);
		//
		//	        wait(3);

		//	        Save.click();    
		//
		//	        wait(5);
		//
		//	        CustomAsserts.containsString(ConfirmInfoSchoolFieldSaveMessage1.getText(), data.get("SuccessMessage1").toString());
		////
		//	        wait(2);
		//
		//	        scrollPage(0, 550);
		//
		//	        wait(3);
		//
		//	        SelectAddress.clickUsingJavaScriptExecutor();
		//
		//	        wait(7);
		//
		//	    //    CopyfromStudentProfile.clickUsingJavaScriptExecutor();
		//
		//	        wait(6);
		//
		//	        StretAddress.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        StretAddress.clearAndType("US");
		//
		//	        wait(2);
		//
		//	        Country.clickUsingJavaScriptExecutor();
		//
		//	        wait(3);
		//
		//	        SelCountry.clickUsingJavaScriptExecutor();
		//
		//	        wait(5);
		//
		//	        PhnNumber.clearAndType("12345");
		//
		//	        wait(5);
		//
		//	        USStreetAddress.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		//	        USStreetAddress.clearAndType("132, My Street, Kingston, New York");
		//
		//	        wait(2);
		//
		//	        UsCity.clearAndType("Denver");
		//
		//	        wait(2);
		//
		//	        UsState.clearAndType("VI");
		//
		//	        wait(2);
		//
		//	        SelectState.clickUsingJavaScriptExecutor();
		//
		//	        wait(2);
		//
		////	        PostalCode.clickUsingJavaScriptExecutor();
		//	        PostalCode.clearAndType("12421");
		//	        wait(2);
		//
		//	        SelectPostalCode.clickUsingJavaScriptExecutor();
		//
		//	        wait(7);
		//
		//	        scrollPage(0, -1000);
		//
		//	        wait(2);
		//
		scrollPage(0, -300);
		wait(2);
		SaveAndCose.clickUsingJavaScriptExecutor();

		wait(8);

		CustomAsserts.containsString(ConfirmInfoSchoolFieldSaveMessage.getText(), data.get("SuccessMessage").toString());
		return this;
	}

	public StudentMainPage BatchOfStudentRegistration(StringHash data) throws Exception{

		Checkbox TermCheckBox = new Checkbox("Select Term", byXPath("//tr//td//input"));
		Link ClassSectionClick = new Link("ClassSection", byXPath("//tr//td[1]"));
		Link AllStuCheckBox = new Link("Select CheckBox", byXPath("//th//input"));
		Link PopUpValidation = new Link("Validation Message", By.xpath("//span[text()='The Track Registration records were successfully queued.')]"));


		//Method Implementation
		SearchProcessess.waitTillElementFound();
		SearchProcessess.sendkeys("Registration");
		Registration.waitTillElementClickable();
		Registration.click();
		wait(5);
		TermList.waitTillElementClickable();
		TermList.clickUsingJavaScriptExecutor();
		wait(1);
		Search.waitTillElementFound();
		Search.clearAndType(data.get("TermCode").toString());
		wait(1);
		TermCheckBox.waitTillElementClickable();
		TermCheckBox.clickUsingJavaScriptExecutor();
		wait(1);
		scrollPage(0,50);
		Select.waitTillElementClickable();
		Select.clickUsingJavaScriptExecutor();
		ClassSectionClick.waitTillElementClickable();
		ClassSectionClick.click();
		wait(1);
		scrollPage(0,40);
		Next.waitTillElementClickable();
		Next.click();
		wait(3);
		AllStuCheckBox.waitTillElementClickable();
		AllStuCheckBox.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0,70);
		QueueRegistration.waitTillElementClickable();
		QueueRegistration.clickUsingJavaScriptExecutor();
		wait(4);
		ApproveToPost.waitTillElementClickable();
		ApproveToPost.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(PopUpValidation.getText(), data.get("SuccessMessage").toString());
		System.out.println("Batch registration is successfull");
		return this;

	}


	public StudentMainPage TransferedProgrameReentry(StringHash data) throws Exception{

		Link TransStudentSaveMessage = new Link("Trans Student SaveMessage", byXPath("//span[. = 'The Transfer Enrollment records were successfully saved.']"));

		Link SelectPrograme = new Link("Programe", byXPath("(//tbody/tr[1]/td[2])[1]"));			
		//Method Implementation
		AcademicRecords.click();
		wait(2);
		Enrollments.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		CourseFilter.clickUsingJavaScriptExecutor();
		wait(2);
		ClearFilters.click();
		wait(5);
		Enroldropdown.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("Program Version"));
		wait(2);
		FilterButton.click();
		wait(5);
		SelectPrograme.click();
		wait(20);
		EnrollMore.click();
		wait(3);
		Transfer.click();
		wait(3);
		TransferType.click();
		wait(3);
		SelTransferType.click();
		wait(3);
		//		wait(4);
		//		ProgrameVersion.waitTillElementClickable();
		ProgrameVersion.clickUsingJavaScriptExecutor();
		wait(2);
		//		SelPrgver.waitTillElementClickable();
		SelPrgver.click();
		wait(3);
		Proceed.clickUsingJavaScriptExecutor();
		//		Proceed.click();
		wait(4);
		//		if(TransferButton.isDisplayed()){
		//		TransferButton.click();
		//		wait(5);
		//		}
		//		Next3.waitTillElementClickable();
		Next3.clickUsingJavaScriptExecutor();
		wait(1);
		Next4.clickUsingJavaScriptExecutor();
		//		Next4.click();
		wait(1);
		Next5.clickUsingJavaScriptExecutor();
		//		Next5.click();
		wait(3);
		Transfer2.clickUsingJavaScriptExecutor();
		//		Transfer2.click();
		wait(3);
		//		Transfer3.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(TransStudentSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Program is transferred successfully");
		return this;

	}


}




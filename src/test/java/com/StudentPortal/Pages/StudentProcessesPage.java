package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;

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

public class StudentProcessesPage extends BaseLocators{


	public StudentProcessesPage BatchAttendancePage(StringHash data) throws Exception {

		Checkbox CheckCourse = new Checkbox(data.get("CourseNameCode"), byXPath("(//input[contains(@aria-label,'"+data.get("CourseNameCode")+"')])[1]"));
		Link SelectCampus = new Link(data.get("CampusName"), byXPath("//span[.='"+data.get("CampusName")+"']"));
		Button ATTSelectTerm = new Button(data.get("TermCode"), byXPath("//span[.='"+data.get("TermCode")+"']"));
		Link Errormessage = new Link("Error Message", byXPath("//span[. = 'There are no students scheduled for this class section.']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Attendance records were successfully saved.']"));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
		Date date = new Date();
		String currentDate = formatter.format(date);
		String[] dateArray = currentDate.split("/");
		int Day = Integer.parseInt(dateArray[1]);
		int EndDateValue = Day-1;
		String EndDateActual = currentDate.replace(dateArray[1], String.valueOf(EndDateValue));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.clearAndType("Attendance");
		BatchAttendance.waitTillElementClickable();
		BatchAttendance.click();
		wait(10);
		//		Campus.waitTillElementClickable();
		//		Campus.clearAndType(data.get("CampusName"));
		//		SelectCampus.waitTillElementClickable();
		//		SelectCampus.click();
		//		wait(1);
		RegisterTerm.waitTillElementClickable();
		RegisterTerm.clearAndType(data.get("TermCode"));
		wait(1);
		ATTSelectTerm.waitTillElementClickable();
		ATTSelectTerm.click();
		wait(1);
		ClickCourseSpan.waitTillElementClickable();
		ClickCourseSpan.click();
		wait(1);
		Search.waitTillElementClickable();
		Search.clearAndType(data.get("CourseCode"));
		wait(1);
		CheckCourse.waitTillElementClickable();
		CheckCourse.check();
		wait(1);
		Select.waitTillElementClickable();
		Select.click();
		wait(1);
		//		AttendanceEndDate.clearAndType(EndDateActual);
		//		wait(2);
		//		AttendanceStartDate.clearAndType(currentDate);
		//		wait(2);
		ApplyFilters.waitTillElementClickable();
		ApplyFilters.clickUsingJavaScriptExecutor();
		wait(5);
		ClickAttendanceField.waitTillElementClickable();
		ClickAttendanceField.clickUsingJavaScriptExecutor();
		wait(2);
		EnterAttendance.waitTillElementClickable();
		EnterAttendance.sendKeys("Present");
		wait(1);
		SaveButton.waitTillElementClickable();
		SaveButton.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Batch attendance is successfull");
		return this;

	}

	public StudentProcessesPage BatchFinalGradesPage(StringHash data) throws Exception {

		Checkbox TermName = new Checkbox(data.get("TermName"), byXPath("//input[@aria-label='"+data.get("TermName")+"']"));
		Checkbox CheckCourse = new Checkbox("CourseNameCode", byXPath("(//tr//td//input)[1]"));
		Link SelectCampus = new Link("Select Campus", byXPath("//span[.='"+data.get("CampusName")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Final Grade records were successfully saved.']"));
		Link SelectLetterGrade = new Link("Select Letter Grade", byXPath("//span[text()='"+data.get("Lettergrade")+"']"));
		
		wait(4);
		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType("Gradebook");
		wait(2);
		Gradebook.waitTillElementFound();
		Gradebook.click();
		wait(15);
		Campus.click();
		wait(2);
		SelectCampus.click();
		wait(5);
		TermList.click();
		wait(4);
		Search.clearAndType(data.get("TermCode"));
		wait(4);
		TermName.check();
		wait(2);
		Select.click();
		wait(5);
		ClickCourseSpan.click();
		wait(4);
		Search.clearAndType(data.get("CourseCode"));
		wait(8);
		CheckCourse.check();
		wait(2);
		Select.click();
		wait(4);
		ApplyFilters.waitTillElementClickable();
		ApplyFilters.click();
		wait(7);
		LetterGrade.click();
		wait(2);
		LetterGradeDrop.click();
		wait(2);
		SelectLetterGrade.click();
		//NumericGrade.deleteAndType(data.get("NumericdataGrade"));
		wait(5);
		FinalSave.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Batch final grade is successfull");
		return this;

	}
	public StudentProcessesPage ProcessRefund(StringHash data) throws Exception {
		Link SelectingProcess= new Link(data.get("Process"), byXPath("//span[text()='"+data.get("Process")+"']"));
		Link SelectingReturnMethod= new Link(data.get("ReturnMethod"), byXPath("//span[text()='"+data.get("ReturnMethod")+"']"));
		Link SelectingRecordSelection= new Link(data.get("RecordSelection"), byXPath("//span[text()='"+data.get("RecordSelection")+"']"));
		Link SelectingPrintChecks= new Link(data.get("PrintChecks"), byXPath("//span[text()='"+data.get("PrintChecks")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[.='The Refund records were successfully queued.']"));
		TextField TransactionDate= new TextField("TransactionDate", byXPath("//input[@name='transactionDate']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("Component"));
		wait(2);
		RefundsStipends.click();
		wait(12);
		Campus.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Campus"));
		wait(2);
		Uncheck.click();
		//		if(cacheckcampus.isSelected()) {
		//			wait(1);
		//			Cancel.clickUsingJavaScriptExecutor();
		//		}else {
		wait(2);
		cacheckcampus.check();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		//		}
		wait(2);
		Process.click();
		wait(2);
		SelectingProcess.click();
		wait(2);
		ProcessReturnMethod.click();
		wait(2);
		SelectingReturnMethod.click();
		wait(2);
		RecordSelection.click();
		wait(2);
		SelectingRecordSelection.click();
		wait(2);
		PrintChecks.click();
		wait(2);
		SelectingPrintChecks.click();
		wait(2);
		BankAccount.click();
		wait(2);
		SelectingBankAccount.click();
		String SelectedBankAccount = SelectingBankAccount.getAttribute("aria-label");
		System.out.println(SelectedBankAccount);
		TestReportsLog.log(LogStatus.INFO, "Selected Bank Account is "+SelectedBankAccount);
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(2);
		//		TransactionDate.clearAndType("10/18/2023");
		//		wait(2);
		ApproveNext.click();
		wait(3);
		scrollPage(0, 300);
		wait(1);
		QueueProcess.click();
		wait(4);
		QueueButton.click();
		wait(8);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Processes refunds are scheduled");
		return this;

	}

	public StudentProcessesPage ProcessStipend(StringHash data) throws Exception {
		Link SelectingProcess= new Link(data.get("Process"), byXPath("//span[text()='"+data.get("Process")+"']"));
		Link SelectingReturnMethod= new Link(data.get("ReturnMethod"), byXPath("//span[text()='"+data.get("ReturnMethod")+"']"));
		Link SelectingRecordSelection= new Link(data.get("RecordSelection"), byXPath("//span[text()='"+data.get("RecordSelection")+"']"));
		Link SelectingPrintChecks= new Link(data.get("PrintChecks"), byXPath("//span[text()='"+data.get("PrintChecks")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[.='The Stipend records were successfully queued.']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("Component"));
		wait(2);
		RefundsStipends.click();
		wait(12);
		Campus.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Campus"));
		wait(2);
		Uncheck.click();
		//		if(cacheckcampus.isSelected()) {
		//			wait(1);
		//			Cancel.clickUsingJavaScriptExecutor();
		//		}else {
		wait(2);
		cacheckcampus.check();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		//		}
		wait(1);
		Process.click();
		wait(1);
		SelectingProcess.click();
		wait(2);
		StipendSelection.click();
		wait(2);
		SelectingStipendSelection.click();
		String SelectedStipendSelection = SelectingStipendSelection.getText();
		System.out.println(SelectedStipendSelection);
		TestReportsLog.log(LogStatus.INFO, "Selected Stipend options is "+SelectedStipendSelection);
		wait(1);
		ReturnMethod.click();
		wait(1);
		SelectingReturnMethod.click();
		wait(1);
		RecordSelection.click();
		wait(1);
		SelectingRecordSelection.click();
		wait(1);
		PrintChecks.click();
		wait(1);
		SelectingPrintChecks.click();
		wait(2);
		BankAccount.click();
		wait(2);
		//SearchBankAccount.clearAndType(data.get("BankAccount"));
		//wait(2);
		SelectingBankAccount.click();
		String SelectedBankAccount = SelectingBankAccount.getAttribute("aria-label");
		System.out.println(SelectedBankAccount);
		TestReportsLog.log(LogStatus.INFO, "Selected Bank Account is "+SelectedBankAccount);
		wait(2);
		Select.click();
		wait(2);
		ApproveNext.click();
		wait(8);
		QueueProcess.click();
		wait(4);
		QueueButton.click();
		wait(8);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Processes Stipends are scheduled");
		return this;

	}


	public StudentProcessesPage SAPCalculationPage(StringHash data) throws Exception {

		Checkbox CheckTerm = new Checkbox(data.get("TermCode"), byXPath("//input[@aria-label='"+data.get("TermCode")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The SAP Calculation records were successfully queued']"));
		Link ErrorMessage = new Link("Error Message", byXPath("//span[. = 'You must have at least one selected record.']"));
		Link SucceedMessage = new Link("Succeed Message", byXPath("//span[contains(text(),'Succeeded')]"));
		Checkbox SelectBatch = new Checkbox("Batch", byXPath("(//tr//td//input)[1]"));

		wait(3);
		SearchProcessess.clearAndType("SAP Calculation");
		wait(2);
		SAPCalculation.click();
		wait(5);
		TermList.click();
		wait(4);
		Search.clearAndType(data.get("TermCode"));
		wait(5);
		CheckTerm.check();
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(3);
		QueueBatches.click();
		wait(4);
		Queue.click();
		// waitForPageToLoad();
		wait(20);
		//       waitForPageToLoad();
		//       waitForPageToLoad();
		//CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		//       wait(8);
		//        if(SucceedMessage.isDisplayed()) {
		//        	wait(2);

		OpenBatches.click();
		wait(10);
		SelectBatch.click();
		wait(1);
		SelectBatch.click();
		wait(4);
		QueueBatches.clickUsingJavaScriptExecutor();
		wait(5);
		Queue.clickUsingJavaScriptExecutor();
		wait(10);
		//	        CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		//	        System.out.println("SAP is calculated successfully");
		//        SAPOpenBatches.click();
		//        wait(8);
		//        scrollPage(0, 500);
		//        wait(5);
		//        SAPQueueOpenBatch.clickUsingJavaScriptExecutor();
		//        wait(5);
		//        QueueSAPBatch.clickUsingJavaScriptExecutor();
		//        wait(5);
		//        CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		//        System.out.println("SAP is calculated successfully");
		//        }
		return this;

	}

	public StudentProcessesPage ApproveDisbursementPage(StringHash data) throws Exception {

		Link SelectAwardYear = new Link(data.get("AwardYear"),byXPath("//span[.='"+data.get("AwardYear")+"']"));
		Dropbox SelectADFundSource = new Dropbox(data.get("FundSource"), byXPath("//span[.='"+data.get("FundSource")+"']"));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
		Date date = new Date();
		String currentDate = formatter.format(date);
		String[] dateArray = currentDate.split("/");
		int year = Integer.parseInt(dateArray[2]);
		int EndDateValue = year-1;
		String From = currentDate.replace(dateArray[2], String.valueOf(EndDateValue));

		wait(5);
		SearchProcessess.sendKeys("Approve Disbursements to Pay");
		wait(2);
		ApproveDisbursementsToPay.click();
		wait(15);
		ADCampusDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingCampus.click();
		String CampusValue = SelectingCampus.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Campus is selected as " +CampusValue);
		wait(2);
		ADAwardYear.click();
		wait(2);
		SelectAwardYear.click();
		wait(2);
		DisDateFrom.clearAndType(data.get("StartDate"));
		wait(2);
		DisDateTo.clearAndType(data.get("EndDate"));
		wait(4);
		//	ADAwardYear.sendKeys(data.get("AwardYear"));
		//	wait(4);
		ADFundType.clearAndType(data.get("FundSource"));
		wait(2);
		SelectADFundSource.click();
		wait(4);
		wait(2);	
		ApproveNext.click();
		wait(10);
		
		return this;
	}


	public StudentProcessesPage ProcessLetters(StringHash data) throws Exception {
		Link SelectingType = new Link(data.get("Type"), byXPath("//li[text()='"+data.get("Type")+"']")); 
		Link SelectingCLr = new Link(data.get("ClearLetter"), byXPath("//li[text()='"+data.get("ClearLetter")+"']"));
		Checkbox SelectingLetter = new Checkbox(data.get("TaskTemplate"), byXPath("//input[@aria-label = '"+data.get("TaskTemplate")+"']"));
		Link QueLetterMsg= new Link("Queue Letter Msg", byXPath("//span[text()='The Letters were successfully queued']"));


		SearchProcessess.clearAndType(data.get("Component"));
		wait(2);
		Letters.click();
		wait(5);
		Type.click();
		wait(2);
		SelectingType.click();
		wait(2);
		ClearLetters.click();
		wait(2);
		SelectingCLr.click();
		wait(2);
		if(Next.isEnabled()) {
			Next.click();
			wait(3);
			Uncheck.click();
			wait(2);
			SelectingLetter.click();
			wait(2);
			scrollPage(0, 300);
			wait(2);
			QueueLetters.click();
			wait(2);
			Queue.click();
			wait(2);
			CustomAsserts.containsString(QueLetterMsg.getText(), data.get("QueLetterMsg").toString());
		}else {
			String Errormessage = AlertMsg.getText();
			System.out.println(Errormessage);
			TestReportsLog.logfail(LogStatus.FAIL, Errormessage);
		}

		return this;
	}

	public StudentProcessesPage UpdateSchoolFieldsPage(StringHash data) throws Exception {

		Link SelectGroupName = new Link("Group Name", byXPath("//span[.='"+StudentGroupPage.SgName+"']"));
		Link SelectSchoolField = new Link("School Field", byXPath("//span[.='"+data.get("SchoolField")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[text() = 'The Update School Fields were successfully queued']"));

		wait(4);
		SearchProcessess.clearAndType("Update School Fields");
		wait(2);
		UpdateSchoolFields.click();
		wait(10);
		GroupName.clearAndType(StudentGroupPage.SgName);
		wait(2);
		SelectGroupName.click();
		wait(2);
		SchoolField.clearAndType(data.get("SchoolField"));
		wait(2);
		SelectSchoolField.click();
		wait(2);
		Next.click();
		wait(9);
		UpdateSF.click();
		wait(4);
		SFValue.clearAndType(data.get("SchoolFieldValue"));
		wait(2);
		OkButton.click();
		wait(2);
		SFQueue.click();
		wait(2);
		Queue.click();
		wait(6);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("School field is added successfully");
		return this;
	}

}

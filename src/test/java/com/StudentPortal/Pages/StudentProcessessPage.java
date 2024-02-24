package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;


public class StudentProcessessPage extends BaseLocators{


	public StudentProcessessPage UpdateAdminRepInABatch(StringHash data) throws Exception{


		Link ReassignProspectsMessage = new Link("ReassignProspectsMessage", byXPath("//span[text()='The Reassign Prospect records were successfully queued.']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(3);
		ReassignProspectsSpan.click();
		wait(12);
//		campus.clickUsingJavaScriptExecutor();
//		wait(2);
//		search.clearAndType(data.get("Campus"));
//		wait(2);
//		if(cacheckcampus.isSelected()) {
//			wait(1);
//			Cancel.clickUsingJavaScriptExecutor();
//		}else {
//		cacheckcampus.check();
//		wait(2);
//		Select1.clickUsingJavaScriptExecutor();
//		}
		wait(1);
		ProspectStartDate.click();
		ProspectStartDate.clearAndType(data.get("StartDate").toString());
		wait(2);
		ProspectEndDate.click();
		ProspectEndDate.clearAndType(data.get("EndDate").toString());
		wait(2);
		/*
	CurrentAdminRep.click();
	wait(5);
	SearchName.click();
	wait(2);
	AdminRepCheckBoxSelectAll.click();
	wait(3);
	Select.click();
		 */
		//	if(AdminRepCheckBox1.isSelected()){
		//		//wait(2);
		//		//SearchBox.click();
		//		//SearchBox.clearAndType(data.get("AdminRep1").toString());
		//		wait(2);
		//		AdminRepCheckBox1.click();
		//		wait(2);
		//		AdminRepCheckBox2.click();
		//		wait(2);
		//		Select.click();
		//		//Cancel.click();
		//		TestReportsLog.log(Status.INFO, "Admin Rep is selected");
		//	}
		//	else {
		//		wait(3);
		//		AdminRepCheckBox1.click();
		//		wait(2);
		//		AdminRepCheckBox2.click();
		//		wait(2);
		//		Select.click();
		//		TestReportsLog.log(Status.INFO, "Admin Rep is selected");
		//	}

		//SearchName.clearAndType(data.get("AdminRep").toString());
		//wait(3);
		//Input.click();
		//wait(2);
		//	Select.click();
		/*wait(3);
	scrollPage(0, 500);
	NewAdministrativeTaskSpan.click();
	wait(2);
	NewAdministrativeTaskDropDown.click();
	String NewAdmissionsRepresentativeTaskValue = NewAdministrativeTaskDropDown.getTextValue();
	//Status.get
	TestReportsLog.log(Status.INFO, "New Admissions representative task is selected as "+NewAdmissionsRepresentativeTaskValue);
	scrollPage(0, 200);
		 */
		Next.click();
		wait(30);
		QueueApprove.clickUsingJavaScriptExecutor();
		wait(6);
		Queue.click();
		wait(6);
		CustomAsserts.containsString(ReassignProspectsMessage.getText(), data.get("ReassignProspectsMessage").toString());
		System.out.println("Batch Admin Rep is reassigned successfully");
		return this;

	}


	public StudentProcessessPage QueueRevenueRecognition(StringHash data) throws Exception{

		Link PostRevenueMessage = new Link("PostRevenueMessage", byXPath("//span[text()='Revenue Recognition records were successfully queued']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		wait(2);
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(3);
		RevenueRecognitionSpan.click();
		wait(15);
		RevenueCampusDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("Campus"));
		wait(2);
		FilterButton1.click();
		wait(5);
		StartDateTableCell.click();
		wait(3);
		RevenueStartDate.clearAndType(data.get("StartDate").toString());
		wait(2);
		scrollPage(0, 500);
		wait(5);
		QueueBatches.click();
		wait(5);
//		QueueBatches.clickUsingJavaScriptExecutor();
//		wait(9);
		if(PostRevenueMessage.isDisplayed()) {
			CustomAsserts.containsString(PostRevenueMessage.getText(), data.get("PostRevenueMessage").toString());
			System.out.println("Revenue recognization is queued successfully");
		}else {
		OpenBatches.click();
		wait(10);
		if(ErrorMessage.isDisplayed()) {
			TestReportsLog.log(LogStatus.FAIL, ErrorMessage.getText());
		}else {
//			Input.waitTillElementClickable();
			Input.clickUsingJavaScriptExecutor(); 
			wait(1);
//			QueuePost.waitTillElementClickable();
			QueuePost.click();
			wait(2);
//			Queue.waitTillElementClickable();
			QueueOpenBatch.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(PostRevenueMessage.getText(), data.get("PostRevenueMessage").toString());
		System.out.println("Revenue recognization is queued successfully");
		}
		}
		return this;

	}

	public StudentProcessessPage ApproveUnapprovedAid(StringHash data) throws Exception{

		
		Link ApprovePackageSuccessMessageSpan = new Link("ApprovePackageSuccessMessageSpan", byXPath("//span[. = 'The Approve Packaged Aid records were successfully queued.']"));
		

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(3);
		ApprovePackagedAidSpan.click();
		wait(10);
		scrollPage(0,600);
		Next.click();
		wait(7);
		scrollPage(0,400);
		wait(2);
		Uncheck.click();
		wait(3);
		StudentSelection1.click();
		wait(2);
		StudentSelection2.click();
		//wait(2);
		//StudentSelection3.click();
		//wait(2);
		//StudentSelection4.click();
		//wait(2);
		//StudentSelection5.click();
		//StudentSelection3.click();
		//wait(2);
		//StudentSelection4.click();
		//wait(2);
		//StudentSelection5.click();
		wait(2);
		ResultsArrowCollapse.click();
		wait(3);
		QueueApprove.click();
		wait(3);
		QueueButton.click();
		wait(10);
		CustomAsserts.containsString(ApprovePackageSuccessMessageSpan.getText(), data.get("ApprovePackageSuccessMessageSpan").toString());
		History.click();
		wait(6);
		Reload.click();
		wait(5);
		Reload.click();
		wait(2);
		Reload.click();
		CustomAsserts.containsString(BatchStatus.getText(), data.get("BatchStatus").toString());	
		return this;

	}


	public StudentProcessessPage PostFederalWorkDisbursements(StringHash data) throws Exception{

		Link StudentName = new Link("StudentName", byXPath("//a[. = '"+data.get("StudentNameForWorkStudyDisbursements")+"']"));
		Link GrossAmountPaidValueAfterUpdate = new Link("GrossAmountPaidValueAfterUpdate", byXPath("//td[9][. = '"+data.get("GrossAmountPaid")+"']"));
		Link DisbursementSuccessMessage = new Link("DisbursementSuccessMessage", byXPath("//span[. = 'The Post Work Study Disbursement records were successfully saved.']"));
		Link CampusValue = new Link("CampusValue", byXPath("//span[. = '"+data.get("Campus")+"']"));
		Link FundSourceValue = new Link("FundSourceValue", byXPath("//span[text()='"+data.get("FundSourceForDisbursements")+"']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(3);
		PostWorkStudyDisbursements.click();
		wait(15);
		CampusSpan.click();
		wait(2);
		CampusValue.click();
		wait(2);
		FundSourceSpan.click();
		wait(2);
		FundSourceValue.click();
		wait(2);
		ApplyFilters.click();
		wait(5);
		StudentName.click();
		wait(5);
		HoursSpan.click();
		wait(2);
		HoursWorked.type(data.get("HoursWorked").toString());
		wait(2);
		AmountPaidSpan.click();
		wait(2);
		AmountPaid.type(data.get("GrossAmountPaid").toString());
		wait(2);
		UpdateFederal.click();
		wait(2);
		scrollPage(200,0);
		CustomAsserts.containsString(GrossAmountPaidValueAfterUpdate.getText(), data.get("GrossAmountPaid").toString());
		SaveFederal.click();
		String Alertmessage = ErrorMessage.getText();
		if (ErrorMessage.isDisplayed()) 
		{
			TestReportsLog.log(LogStatus.INFO, Alertmessage);
		}
		wait(5);
		CustomAsserts.containsString(DisbursementSuccessMessage.getText(), "The Post Work Study Disbursement records were successfully saved.".toString());
		System.out.println("Federal work disbursement is successfull");
		return this;

	}

	public StudentProcessessPage ReleaseToGeneralLedger(StringHash data) throws Exception{

		TextField SubmittedBy = new TextField("SubmittedBy", byXPath("//tr[1]/td[. = '"+data.get("SubmittedBy")+"']"));
		Link ReleaseToGeneralLedgerMessage = new Link("ReleaseToGeneralLedgerMessage", byXPath("//u[contains(text(),'Release to General Ledger')]"));
		Link textmsg = new Link("Text message", byXPath("//span[.='At least one campus in campus group Cumberland Only does not have the company number. Cannot Release To G/L']"));

		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(2);
		ReleaseToGeneralLedger.click();
		wait(15);
		CampusGroupSearch.click();
		wait(5);
		CampusGroup.click();
		wait(2);
		CampusGroup.clearAndType(data.get("CampusName").toString());
		wait(2);
		if(CampusSelect.isSelected()){
			CancelButton.click();
			TestReportsLog.log(LogStatus.INFO, "Campus group is already selected");
		}
		else {
			CampusSelect.click();
			wait(2);
			Select.click();
		}
		wait(4);
		GLFromDate.click();
		wait(2);
		GLFromDate.clearAndType(data.get("FromDate").toString());
		wait(2);
		GLToDate.click();
		wait(2);
		GLToDate.clearAndType(data.get("ToDate").toString());
		wait(2);
		QueueGL.click();
		waitForPageToLoad();
		wait(10);
		OpenBatches.click();
		wait(10);
		CustomAsserts.containsString(SubmittedBy.getText(), data.get("SubmittedBy").toString());
		wait(2);
		QueueRelease.click();
		wait(3);
		Submit.click();
		wait(9);
		CustomAsserts.containsString(ReleaseToGeneralLedgerMessage.getText(), "Release to General Ledger".toString());
		System.out.println("Release to General ledger is successfull");
		return this;

	}
	public StudentProcessessPage ApproveFADisbursements(StringHash data) throws Exception{

		Link CampusList = new Link("CampusList", byXPath("//span[. = '"+data.get("Campus")+"']"));
		Link FADisbursementsSuccessMessage = new Link("FADisbursementsSuccessMessage", byXPath("//span[. = 'The Approve Disbursements records were successfully queued.']"));


		SearchProcessess.waitTillElementClickable();
		SearchProcessess.click();
		SearchProcessess.clearAndType(data.get("SearchProcesses").toString());
		wait(3);
		ApproveDisbursementsToPay.click();
		wait(15);
		CampusDropDown.click();
		wait(2);
		CampusList.click();
		wait(5);
		DisbursementFromDate.clearAndType(data.get("FromDate").toString());
		wait(5);
		DisbursementToDate.clearAndType(data.get("ToDate").toString());
		wait(4);
		AwardYear.click();
		wait(2);
		//	Apdelete.clickUsingJavaScriptExecutor();
		//	wait(2);
		//	AwardYear1Value.click();
		//	wait(1);
		//	AwardYear2Value.click();
		//	wait(1);
		//	AwardYear3Value.click();
		//	wait(1);
		//	AwardYear4Value.click();
		wait(3);
		AwardYear2Value.click();
		wait(4);
		AwardLabel.clickUsingJavaScriptExecutor();
		wait(3);
		FundTypeDropDown.clickUsingJavaScriptExecutor();
		wait(2);
		FundTypeValue.click();
		wait(7);
		//	lastNameFromTextBox.click();
		//	wait(4);
		scrollPage(0,800);
		wait(2);
		scrollPage(0,800);
		wait(2);
		scrollPage(0,800);
		wait(3);
		ApproveNext.clickUsingJavaScriptExecutor();
		wait(20);
		Uncheck.click();
		wait(2);
		CheckBoxforDisburse.click();
		wait(2);
		ApproveAll.clickUsingJavaScriptExecutor();
		wait(7);
		ApproveToPost.clickUsingJavaScriptExecutor();
		wait(5);
		ApproveToPostConfirmation.clickUsingJavaScriptExecutor();
		wait(10);
		CustomAsserts.containsString(FADisbursementsSuccessMessage.getText(), "The Approve Disbursements records were successfully queued.".toString());		
		System.out.println("Approve FA disbursement is successfull");
		return this;

	}	
}

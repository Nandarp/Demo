package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;


public class StudentFinancialAidPage extends BaseLocators{

public StudentFinancialAidPage FinancialAidReassignment(StringHash data) throws Exception{
		
		
		Checkbox CheckFundSource = new Checkbox("Select Fund Source", byXPath("//tr[1]/td[1]/input"));
		Button HighlightStartDate = new Button("Highlight Academic Year", byXPath("(//tbody/tr/td[2])[9]"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Reassign records were successfully saved.']"));
	    Dropbox Awarddropdown = new Dropbox("Dropdown", byXPath("(//div[@title='Settings'])[1]/button[2]/span[1]"));
	    Link AwardClearFilter = new Link("Reset to Default", byXPath("(//span[text()='Reset to Default'])[2]"));
	    
		FinancialAid.click();
		wait(2);
		Awarding.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		Awards.click();
		wait(24);
		Awarddropdown.waitTillElementClickable();
		Awarddropdown.clickUsingJavaScriptExecutor();
		wait(2);
		AwardClearFilter.waitTillElementClickable();
		AwardClearFilter.click();
		wait(2);
//		FSdropdown.waitTillElementClickable();
//		FSdropdown.clickUsingJavaScriptExecutor();
//	    wait(2);
//	    FilterOptions.click();
//	    wait(2);
//	    value.clearAndType(data.get("FundSource"));
//	    wait(2);
//	    FilterButton1.click();
//	    wait(4);
//		wait(2);
		CheckFundSource.clickUsingJavaScriptExecutor();
		CheckFundSource.check();
		wait(4);
		Reassign.waitTillElementClickable();
		Reassign.click();
		wait(10);
		HighlightStartDate.waitTillElementClickable();
		HighlightStartDate.click();
		wait(3);
		OkReassign.waitTillElementClickable();
		OkReassign.click();
		wait(5);
		ConfirmReassign.waitTillElementClickable();
		ConfirmReassign.click();
		wait(8);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Financial Aid is reassigned successfully");
		return this;
	}

	public StudentFinancialAidPage PrintAwardSummaryPage(StringHash data) throws Exception{
		
		Checkbox CheckFundSource = new Checkbox("Fund Source", byXPath("//tr[1]/td[1]/input"));
		//Button HighlightAcademicYear = new Button(data.get("AYStartDate"), byXPath("//span[@title='"+data.get("AYStartDate")+"']"));
		Dropbox FilterDropdown = new Dropbox("Filter Dropdown", byXPath("//div[@id='cnsGridAwards_cnsToolbar_kendoToolBar_settingsButton_wrapper']/a[2]/span"));
	    Link ClearFilter = new Link("Clear Filter", byXPath("//a[@id='cnsGridAwards_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
		
	    FinancialAid.click();
		wait(2);
		Awarding.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(20);
		Awards.click();
		wait(20);
//		FilterDropdown.clickUsingJavaScriptExecutor();
//		wait(5);
//		ClearFilter.click();
//		wait(10);
		CheckFundSource.check();
		String FundSourceValue = CheckFundSource.getAttribute("aria-label");
		TestReportsLog.log(LogStatus.INFO, "Fund Source is selected as " +FundSourceValue);
		wait(10);
		Printsummary.clickUsingJavaScriptExecutor();
		System.out.println("Award printing is successfull");
		return this;
}
	public StudentFinancialAidPage VerifyDisbursementDataPage(StringHash data) throws Exception{
		
//		Checkbox ClickFundSource = new Checkbox(data.get("SelectFundSource"), byXPath("//a[.='"+StudentStudentAccountsPage.Fundsourcevalue+"']"));
		TextField CheckTransactionDate = new TextField("Check Transaction Date", byXPath("(//table/tbody/tr[1]/td[1])[2]")); 
		 String TDate = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
		 Checkbox ClickFundSource = new Checkbox(data.get("SelectFundSource"), byXPath("//a[contains(text(),'"+data.get("SelectFundSource")+"')]"));
		 String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
		 TextField CheckNumber = new TextField("Check Number", byXPath("//tr[4]/td[3]"));
		 String checkNo = "1234";
		 Button FilterOptions = new Button("Filter", byXPath("(//span[.='Filter'])[2]"));
		 
		 
		    FinancialAid.waitTillElementClickable();
			FinancialAid.click();
			Awarding.waitTillElementClickable();
			Awarding.click();
			wait(3);
	    	if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
			wait(17);
			Awards.waitTillElementClickable();
			Awards.click();
			wait(20);
//			AYSpan.clickUsingJavaScriptExecutor();
//			wait(4);
//			HighlightAcademicYear.clickUsingJavaScriptExecutor();
//			wait(5);
//			Awarddropdown.click();
//			wait(2);
//			AwardClearFilter.click();
//			wait(4);
//			FSdropdown.waitTillElementClickable();
			FSdropdown.clickUsingJavaScriptExecutor();
			wait(2);
//			FilterOptions.waitTillElementClickable();
			FilterOptions.click();
			wait(2);
//			ClickEqualsTo.waitTillElementClickable();
//			ClickEqualsTo.clickUsingJavaScriptExecutor();
//			wait(1);
//			ClickContains.waitTillElementClickable();
//			ClickContains.clickUsingJavaScriptExecutor();
//			wait(2);
//			value.waitTillElementClickable();
			value.clearAndType(data.get("SelectFundSource"));
			wait(2);
//			FilterButton1.waitTillElementClickable();
			FilterButton1.clickUsingJavaScriptExecutor();
			wait(4);
//			ClickFundSource.waitTillElementClickable();
			ClickFundSource.click();
			wait(16);
			scrollPage(0, 1000);
			wait(2);
//			PaymentReceived.waitTillElementClickable();
			PaymentReceived.clickUsingJavaScriptExecutor();
			wait(5);
			scrollPage(0, 300);
			wait(4);
			System.out.println("Received successfully");
			String TransDate = CheckTransactionDate.getText();
			wait(3);
			if (TransDate.equals(data.get("CheckTransactionDate"))) {
				System.out.print("Disbursement Data Verification is successful");  
				TestReportsLog.log(LogStatus.INFO, "Disbursement Data Verification is successful " +data.get("SelectFundSource"));
			}  
			else {
				System.out.print("Disbursement data is not found");  
			TestReportsLog.log(LogStatus.FAIL, "Disbursement Data is not found ");
			}
		return this;	
	}
	
/**
 * @param data
 * @return
 * @throws Exception
 */
public StudentFinancialAidPage AcademicYearPage(StringHash data) throws Exception{
		
		Link SelectAwardYear = new Link("Award Year", byXPath("//ul[@id='firstAwardYear_listbox']//span[.='"+data.get("AwardYear")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Student Academic Year records were successfully saved.']"));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
	    Date date = new Date();
	    String StartDate = formatter.format(date);
	    String[] dateArray = StartDate.split("/");
	    int year = Integer.parseInt(dateArray[2]);
	    int EndDateValue = year+1;
	    String EndDate = StartDate.replace(dateArray[2], String.valueOf(EndDateValue));
	    System.out.println(EndDateValue);
	    
	    FinancialAid.waitTillElementClickable();
		FinancialAid.click();
	    Awarding.waitTillElementClickable();
		Awarding.click();
    	wait(2);
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		wait(10);
		AcademicYear.waitTillElementClickable();
		AcademicYear.click();
		wait(10);
		New.waitTillElementClickable();
		New.click();
		Manual.waitTillElementClickable();
		Manual.click();
		wait(10);
		AYStartdate.waitTillElementClickable();
		AYStartdate.clearAndType(StartDate);
		wait(1);
		AYEnddate.waitTillElementClickable();
		AYEnddate.clearAndType(EndDate);
		AwardYearSpan.waitTillElementClickable();
		AwardYearSpan.click();
		wait(1);
		EnterAwardYear.waitTillElementClickable();
		EnterAwardYear.clearAndType(data.get("AwardYear"));
		SelectAwardYear.waitTillElementClickable();
		SelectAwardYear.click();
		GradeLevelDropdown.waitTillElementClickable();
		GradeLevelDropdown.click();
		SelectGradeLevel.waitTillElementClickable();
		SelectGradeLevel.click();
		String GradeLevelValue = SelectGradeLevel.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Grade Level is selected as " +GradeLevelValue);
//		WeeksinAY.clearAndType("36");
//		wait(2);
//		MonthsinAY.clearAndType(data.get("MonthsinAY"));
//		wait(2);
		HousingDropdown.waitTillElementClickable();
		HousingDropdown.click();
		SelectHousing.waitTillElementClickable();
		SelectHousing.click();
		String HousingValue = SelectHousing.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Housing Value is selected as " +HousingValue);
//		FAAdvisorSpan.click();
//		wait(2);
//		EnterAdvisor.clearAndType(data.get("FAAdvisor"));
//		wait(2);
		scrollPage(0, 600);
		PackagingStatusDropdown.waitTillElementClickable();
		PackagingStatusDropdown.click();
		wait(1);
		EnterPackagingStatus.waitTillElementClickable();
		EnterPackagingStatus.clearAndType("04 - Ready to Package");
		SelectPackagingStatus.waitTillElementClickable();
		SelectPackagingStatus.click();
		BudgetDropdown.waitTillElementClickable();
		BudgetDropdown.click();
		SelectBudget.waitTillElementClickable();
		SelectBudget.click();
		String BudgetValue = SelectBudget.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Budget Value is selected as " +BudgetValue);
		Calculate.waitTillElementClickable();
		Calculate.click();
		wait(5);
		scrollPage(0, -1000);
		Save.waitTillElementClickable();
		Save.click();
		wait(1);
		ConfirmOK.waitTillElementClickable();
		ConfirmOK.click();
		wait(2);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Academic year is successfull");
		return this;
	}

public StudentFinancialAidPage CreatingFundSource(StringHash data) throws Exception{

	Link Awarding = new Link("Awarding", byXPath("//span[text()='Awarding']"));
	Button Awards = new Button("Awards", byXPath("//button[text()='Awards']"));
	Link PackagingMethod = new Link("Packaging Method", byXPath("//span[contains(@aria-owns,'packageMethod')]/span/span[2]"));
	TextField SearchPackingMethod = new TextField("Search Packing Method", byXPath("//input[@aria-owns='packageMethod_listbox']"));
	Link SelectingPackingMethod = new Link(data.get("PackagingMethod"), byXPath("//span[text()='"+data.get("PackagingMethod")+"']"));
	Link TypeOfAid = new Link("Type of Aid", byXPath("//span[@aria-label='Type of Aid: Dropdown']"));
	TextField SearchTypeOfAid = new TextField("Search Type of Aid", byXPath("//input[@aria-owns='typeOfAidId_listbox']"));
	Link SelectingTypeOfAid = new Link(data.get("TypeofAid"), byXPath("//li[text()='"+data.get("TypeofAid")+"']"));
	Link Source = new Link("Source", byXPath("//span[contains(@aria-owns,'sourceId')]/span/span[2]"));
	TextField SearchSource = new TextField("Search Source", byXPath("//input[@aria-owns='sourceId_listbox']"));
	Link SelectingSource = new Link("Source", byXPath("//span[text()='"+data.get("Source")+"    ']"));
	TextField GrossAmount = new TextField("Gross Amount", byXPath("(//input[@aria-label='Gross Amount'])[1]"));
	Button Proceed = new Button("Proceed", byXPath("//button[text()='Proceed']"));
	Link Status = new Link("Status", byXPath("//span[contains(@aria-owns,'statusNewAid')]/span/span[2]"));
	TextField SearchStatus = new TextField("Search Source", byXPath("//input[@aria-owns='statusNewAid_listbox']"));
	Link SelectingStatus = new Link("Status", byXPath("//ul[@id='statusNewAid_listbox']/li[text()='Approved']"));
	Button SaveAndClose = new Button("Save And CLose", byXPath("//a[@id= 'cashOthersSaveCloseButton']"));
//	Button UpdateSave = new Button("Update and Save", byXPath("//button[@id='commonValidationDialogCashOtherOkButton']"));
//	Button DontSave = new Button("Dont update and Save", byXPath("//button[@id='commonValidationDialogCashOtherNotOkButton']"));
	Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Cash/Other fund source records were successfully saved.']"));
	TextField Number = new TextField("Number", byXPath("(//input[@aria-label='Number'])[1]"));
	Button Calculate = new Button("Calculate", byXPath("//a[@id='calculateButton']"));
//	TextField SearchStatus1 = new TextField("Search Status", byXPath("//input[@aria-owns='Status_listbox']"));
//	Link SelectingStatus1 = new Link(data.get("Status"), byXPath("//span[text()='"+data.get("Status")+"']"));

	FinancialAid.waitTillElementClickable();
	FinancialAid.click();
	Awarding.waitTillElementClickable();
	Awarding.click();
	wait(2);
	if(Dontsave.isDisplayed()) {
	Dontsave.waitTillElementClickable();
	Dontsave.clickUsingJavaScriptExecutor();
	}
	wait(18);
	Awards.waitTillElementClickable();
	Awards.click();
	wait(20);
	PackagingMethod.waitTillElementClickable();
	PackagingMethod.click();
	SearchPackingMethod.waitTillElementClickable();
	SearchPackingMethod.sendKeys(data.get("PackagingMethod"));
	SelectingPackingMethod.waitTillElementClickable();
	SelectingPackingMethod.click();
	New.waitTillElementClickable();
	New.click();
	wait(15);
	TypeOfAid.waitTillElementClickable();
	TypeOfAid.click();
	SearchTypeOfAid.waitTillElementClickable();
	SearchTypeOfAid.sendKeys(data.get("TypeofAid"));
	SelectingTypeOfAid.waitTillElementClickable();
	SelectingTypeOfAid.click();
	Source.waitTillElementClickable();
	Source.click();
	SearchSource.waitTillElementClickable();
	SearchSource.sendKeys(data.get("Source"));
	SelectingSource.waitTillElementClickable();
	SelectingSource.click();
	wait(2);
	Status.waitTillElementClickable();
	Status.click();
//	wait(2);
//	SearchStatus.sendKeys(data.get("Status"));
	SelectingStatus.waitTillElementClickable();
	SelectingStatus.click();
	GrossAmount.waitTillElementClickable();
	GrossAmount.sendKeys("100");
	Proceed.waitTillElementClickable();
	Proceed.click();
	wait(10);
//	Status.click();
//	wait(2);
//	SearchStatus1.sendKeys(data.get("Status"));
//	wait(2);
//	SelectingStatus1.click();
//	wait(2);
	Number.waitTillElementClickable();
	Number.sendkeys("1");
	scrollPage(0, 300);
	wait(1);
	Calculate.waitTillElementClickable();
	Calculate.click();
	scrollPage(0, -300);
	SaveAndClose.waitTillElementClickable();
	SaveAndClose.click();
	wait(5);
	CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
	System.out.println("Fundsource is created successfully");
	return this;
}
}

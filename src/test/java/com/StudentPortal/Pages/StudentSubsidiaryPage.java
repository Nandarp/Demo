package com.StudentPortal.Pages;


import static com.framework.elements.Locator.byXPath;
import com.framework.elements.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.framework.util.AppendValue;
import com.framework.util.DatesUtil;
import com.framework.util.Encrypt;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentSubsidiaryPage extends BaseLocators{

	static String Note = AppendValue.apendString();
	static String Pay = AppendValue.apendString();

	//Random Value
	static String PayName = AppendValue.apendString();
	static String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	static String PaymentTransactionName;


	public StudentSubsidiaryPage AdjustSubTransaction(StringHash data) throws Exception {
		Link AdjustSubMsg= new Link("Adjust Subsidiary Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
		Checkbox Term = new Checkbox("Selecting Term", byXPath("(//tbody/tr[1]/td[1]/input)[1]"));

		//Login Page Web Elements

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		StudentAccounts.clickUsingJavaScriptExecutor();
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		GettingSubsidiaryName.click();
		wait(2);
		SelectingSubsidiary.click();
		wait(3);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(1);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(2);
		AddCharge.click();
		wait(6);
		//wait(2);
		TermList.clickUsingJavaScriptExecutor();
		wait(4);
		Term.clickUsingJavaScriptExecutor();
		wait(2);
		String SelectedTerm = Term.getAttribute("aria-label");
		System.out.println("Term is selected");
		TestReportsLog.log(LogStatus.INFO, "Selected Term is "+SelectedTerm);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(2);
		BillCode.click();
		wait(2);
		SelectingBillCode.click();
		String SelectedBillCode = SelectingBillCode.getAttribute("title");
		System.out.println(SelectedBillCode);
		TestReportsLog.log(LogStatus.INFO, "Selected BillCode is "+SelectedBillCode);
		wait(2);
		Amount.sendKeys("100");
		wait(5);
		scrollPage(0, -300);
		wait(1);
		SaveAndClose.click();
		//Term.click();
		wait(4);
		SelectingTransaction.clickUsingJavaScriptExecutor();
		String SelectedTransaction = SelectingTransaction.getText();
		System.out.println(SelectedTransaction);
		TestReportsLog.log(LogStatus.INFO, "Selected Transaction is "+SelectedTransaction);
		wait(5);
		TermList.clickUsingJavaScriptExecutor();
		wait(3);
		if(Term.isSelected())
		{
			System.out.println("Term is already selected");
			CancelButton.clickUsingJavaScriptExecutor();
		}else {
			Term.click();
			String SelectedTerm1 = Term.getAttribute("aria-label");
			System.out.println(SelectedTerm1);
			TestReportsLog.log(LogStatus.INFO, "Selected Term is "+SelectedTerm1);
			wait(2);
			SelectButton.clickUsingJavaScriptExecutor();
		}
		TransactionNote.clearAndType(Note);
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(2);
		CustomAsserts.containsString(AdjustSubMsg.getText(), data.get("AdjustSubMsg").toString());
		//		String TermName = TermValue.getText();
		//		if(TermName.equalsIgnoreCase(data.get("TermCode")))
		//		{
		//			System.out.println("Subsidiary Changes are reflecting");
		//		}else {
		//			System.out.println("Subsidiary Changes are not reflecting");
		//		}
		return this;
	}

	public StudentSubsidiaryPage PrintSubsidiaryLedger(StringHash data) throws Exception {

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		//Login Page Web Elements

		setImplicitWaitTimeout(implicitWaitTimeout);
		StudentAccounts.clickUsingJavaScriptExecutor();
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		GettingSubsidiaryName.click();
		wait(2);
		SelectingSubsidiary.click();
		wait(3);
		ExporttoExcelorPDF.clickUsingJavaScriptExecutor();
		wait(1);
		PDFExport.clickUsingJavaScriptExecutor();
		System.out.println("Subsidiary ledger is printed successfully");
		return this;
	}

	public StudentSubsidiaryPage AddSubsidiary(StringHash data) throws Exception {
		Link AddSubMsg= new Link("Add Subsidiary Msg", byXPath("//span[text()='The Student Subsidiary records were successfully saved.']"));


		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		AddSubsidiary.clickUsingJavaScriptExecutor();
		wait(5);
		SubsidiaryList.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingNewSubsidiary.clickUsingJavaScriptExecutor();
		String SelectedSubsidiary = SelectingNewSubsidiary.getAttribute("title");
		System.out.println(SelectedSubsidiary);
		TestReportsLog.log(LogStatus.INFO, "Selected Subsidiary is "+SelectedSubsidiary);
		wait(2);
		MaintainedBalance.sendKeys("10");
		wait(2);
		SaveSubsidiary.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(AddSubMsg.getText(), data.get("AddSubMsg").toString());
		GettingSubsidiaryName.click();
		wait(2);
		SelectingSubsidiary.click();
		wait(1);
		String NewSubName = SelectingSubsidiary.getText();
		System.out.println(NewSubName);
		if(NewSubName.contains(SelectedSubsidiary))
		{
			System.out.println("New subsidiary is added successfully");
		}else {
			System.out.println("New subsidiary is not added");
		}
		return this;
	}

	public StudentSubsidiaryPage AdjustSubTransactionReturnedCheck(StringHash data) throws Exception {
		Checkbox Term = new Checkbox("Selecting Term", byXPath("(//tbody/tr[1]/td[1]/input)[1]"));
		Link ReturnedCHeckMsg= new Link("Returned Check Msg", byXPath("//span[text()='The check was successfully marked as returned.']"));
		Link PaymentMsg= new Link("Payment Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));


		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(2);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		GettingSubsidiaryName.click();
		wait(2);
		SelectingSubsidiary.click();
		wait(3);
		Payment.click();
		wait(10);
		//		AcademicYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectingAYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		TermList.click();
		wait(5);
		Term.click();
		wait(2);
		SelectButton.click();
		wait(2);
		PaymentNameSub.sendkeys(Pay);
		wait(2);
		PaymentType.click();
		wait(2);
		//		CPCDropDown.click();
		//		wait(2);
		//		CPCDropDownSelect.click();
		//		wait(2);
		SelectingPayType.click();
		wait(2);
		CheckNumber.sendkeys("234");
		wait(2);
		Amount.sendkeys("10");
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(4);
		//		Cancel.clickUsingJavaScriptExecutor();
		//		wait(2);
		CustomAsserts.containsString(data.get("PaymentMsg"), PaymentMsg.getText());
		wait(2);
		scrollPage(0, -800);
		wait(2);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(2);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(10);
		HighlightingTransaction.click();
		wait(2);
		More.click();
		wait(2);
		ReturnedCheck.click();
		wait(3);
		ReturnNote.clearAndType(Note);
		wait(2);
		ReturnedCheckOk.click();
		wait(7);
		CustomAsserts.containsString(data.get("RetunerCheckMsg"), ReturnedCHeckMsg.getText());
		System.out.println("Subsidiary is returned successfully");
		return this;
	}

	public StudentSubsidiaryPage SubsidiaryPostCharge(StringHash data) throws Exception {
		Checkbox Term = new Checkbox("Selecting Term", byXPath("(//tr[1]/td[1]/input)[1]"));
		Link PostingChargeMsg= new Link("Posting Charge Msg", byXPath("//span[text()='The Charge records were successfully saved.']"));


		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		StudentAccounts.clickUsingJavaScriptExecutor();
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		//		GettingSubsidiaryName.click();
		//		wait(2);
		//		SelectingSubsidiary.click();
		//		wait(3);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(3);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(4);
		AddCharge.click();
		wait(12);
		TermList.clickUsingJavaScriptExecutor();
		wait(3);
		//SearchCode.clearAndType(data.get("TermCode"));
		//wait(3);
		//      if(Term.isSelected())
		//      {
		//          String SelectedTerm = Term.getAttribute("aria-label");
		//   	   System.out.println("Term is already selected");
		//          TestReportsLog.log(Status.INFO, "Selected Term is "+SelectedTerm);
		//          StudentLedgerAccountPage.CancelButton.clickUsingJavaScriptExecutor();
		//      }else {
		Term.clickUsingJavaScriptExecutor();
		wait(2);
		String SelectedTerm = Term.getAttribute("aria-label");
		TestReportsLog.log(LogStatus.INFO, "Selected Term is "+SelectedTerm);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(2);
		BillCode.click();
		wait(2);
		SelectingBillCode.click();
		String SelectedBillCode = SelectingBillCode.getAttribute("title");
		System.out.println(SelectedBillCode);
		TestReportsLog.log(LogStatus.INFO, "Selected BillCode is "+SelectedBillCode);
		wait(2);
		Amount.sendKeys("10");
		wait(5);
		scrollPage(0, -300);
		wait(1);
		SaveAndClose.click();
		wait(5);
		CustomAsserts.containsString(PostingChargeMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Subsidiary is posted successfully");
		return this;
	}


	public StudentSubsidiaryPage SubLedgerPostChargeDelete(StringHash data) throws Exception {

		//X-path Parameterization
		Link SubLedgerPostChargeDeleteSaveMessage = new Link("Subsidiary Ledger Post Charge Delete SaveMessage", byXPath("//span[. = 'The Student Subsidiary records were successfully deleted.']"));			
		Button Cancel = new Button("Cancel", byXPath("//button[@id=\"cancelPrintReceipt\"]"));
		Link FilterDropDown= new Link("FilterDropDown", byXPath("//div[@title=\"Settings\"]//button[2]//span"));
		Link ResetToDefaults= new Link("ResetToDefaults", byXPath("//span//span[.='Reset to Default']"));
		Link TransactionDropdown= new Link("TransactionDropdown", byXPath("(//th[@data-title=\"Transaction\"]//span)[4]"));
		Button Filter = new Button("Filter", byXPath("(//span[.='Filter'])[2]"));
		TextField Value = new TextField("Value", byXPath("//span//input[@title=\"Value\"]"));
		Button Filter2 = new Button("Filter2", byXPath("//button//span[.='Filter']"));
		Link BankAccountDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-controls=\"bankAccountId_listbox\"]//span)[4]"));
		Link BnakAccount= new Link("Cash Payment code select", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span[1]"));
		//Method Implementation
	    Link ClearAll= new Link("Clear Filters", byXPath("(//span//span[.='Clear All'])[2]"));
	    TextField Amount = new TextField("Amount", byXPath("(//span[@aria-label=\"Amount\"]//input[@aria-label=\"Amount\"])[1]"));
	    String Password = Encrypt.decodeString(data.get("Password").toString());
        String Username = Encrypt.decodeString(data.get("UserName").toString());
        
		Link CPCDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-label=\"Cash Payment Code\"]//span)[3]"));
		Link CPCDropDownSelect= new Link("Cash Payment code select", byXPath("//ul[@id=\"transactionNameDropDown_listbox\"]//li[1]//div//span[1]"));
		Link HighlightingTransaction= new Link("Highlighting transaction", byXPath("(//tr[4]/td[5])[1]"));
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		//		GettingSubsidiaryName.click();
		//		wait(2);
		//		SelectingSubsidiary.click();
		//		wait(3);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(3);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(4);
		Payment.click();
		wait(10);
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(currentWindowHandle);
		driver.switchTo().window(windowHandles.iterator().next());
		userNameTxt.waitTillElementClickable();
		userNameTxt.clearAndTypeUandPwd(Username.toString());
		LoginNext.waitTillElementClickable();
		LoginNext.click();
		passwordTxt.clearAndTypeUandPwd(Password.toString());
		passwordTxt.waitTillElementClickable();
		SignIn.waitTillElementClickable();
		SignIn.click();
		wait(18);
		driver.switchTo().window(currentWindowHandle);
//		EnterPassword.clearAndType(Password);
		wait(5);
		//wait(10);
		//		AcademicYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectingAYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		TermList.click();
		wait(5);
		Term.click();
		wait(2);
		SelectButton.click();
		wait(2);
		PaymentNameSub.sendkeys(Pay);
		wait(2);
		//		PaymentType.click();
		//		wait(2);
				CPCDropDown.click();
				wait(2);
				CPCDropDownSelect.click();
				wait(2);
		//		SelectingPayType.click();
		//		wait(2);
		CheckNumber.sendkeys("234");
		wait(2);
//		BankAccountDropDown.clickUsingJavaScriptExecutor();
//		wait(1);
//		BnakAccount.clickUsingJavaScriptExecutor();
		wait(4);
		Amount.sendkeys("10");
		wait(3);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(5);
		//		CustomAsserts.containsString(PaymentMsg.getText(), data.get("SuccessMessage").toString());
		//		System.out.println("Subsidiary payment is posted successfully");
		if(Cancel.isDisplayed()) {
			Cancel.click();
		}
		wait(2);
		scrollPage(0, -800);
		wait(5);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(2);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(10);
		TransactionDropdown.clickUsingJavaScriptExecutor();
		wait(1);
		Filter.click();
		wait(2);
		Value.clearAndType(Pay);
		wait(1);
		Filter2.clickUsingJavaScriptExecutor();
		wait(8);
		HighlightingTransaction.click();
		wait(3);
		More.click();
		wait(2);
		Delete.click();
		wait(6);
		DeleteNote.clearAndType("Delete");
		wait(3);
		Deletebutton.click();
		wait(5);
		CustomAsserts.containsString(SubLedgerPostChargeDeleteSaveMessage.getText(), data.get("SuccessMessage").toString());
		wait(2);
		return this;
	}

	public StudentSubsidiaryPage SubTransactionVoid(StringHash data) throws Exception {

		Link PaymentMsg= new Link("Payment Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
		Link SubTransVoidSaveMessage = new Link("SubTransVoidSaveMessage", byXPath("//span[. = 'The Student Subsidiary records were successfully voided.']"));			
		//Button Cancel = new Button("Cancel", byXPath("//button[@id='cancelPrintReceipt']"));
		Link BankAccountDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-controls=\"bankAccountId_listbox\"]//span)[4]"));
		Link BnakAccount= new Link("Cash Payment code select", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span[1]"));
		Button Cancel = new Button("Cancel", byXPath("//button[@id=\"cancelPrintReceipt\"]"));
		Link FilterDropDown= new Link("FilterDropDown", byXPath("//div[@title=\"Settings\"]//button[2]//span"));
		Link ResetToDefaults= new Link("ResetToDefaults", byXPath("//span//span[.='Reset to Default']"));
		Link TransactionDropdown= new Link("TransactionDropdown", byXPath("(//th[@data-title=\"Transaction\"]//span)[4]"));
		Button Filter = new Button("Filter", byXPath("(//span[.='Filter'])[2]"));
		TextField Value = new TextField("Value", byXPath("//span//input[@title=\"Value\"]"));
		Button Filter2 = new Button("Filter2", byXPath("//button//span[.='Filter']"));
		Link ClearAll= new Link("Clear Filters", byXPath("(//span//span[.='Clear All'])[2]"));
		TextField Amount = new TextField("Amount", byXPath("(//span[@aria-label=\"Amount\"]//input[@aria-label=\"Amount\"])[1]"));
		String Password = Encrypt.decodeString(data.get("Password").toString());
        String Username = Encrypt.decodeString(data.get("UserName").toString());
        
        Link CPCDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-label=\"Cash Payment Code\"]//span)[3]"));
		Link CPCDropDownSelect= new Link("Cash Payment code select", byXPath("//ul[@id=\"transactionNameDropDown_listbox\"]//li[1]//div//span[1]"));
		 
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		//		GettingSubsidiaryName.click();
		//		wait(2);
		//		SelectingSubsidiary.click();
		//		wait(3);
//		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
//		wait(3);
//		ClearAll.click();
		wait(4);
		Payment.click();
		wait(10);
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(currentWindowHandle);
		driver.switchTo().window(windowHandles.iterator().next());
		userNameTxt.waitTillElementClickable();
		userNameTxt.clearAndTypeUandPwd(Username.toString());
		LoginNext.waitTillElementClickable();
		LoginNext.click();
		passwordTxt.clearAndTypeUandPwd(Password.toString());
		passwordTxt.waitTillElementClickable();
		SignIn.waitTillElementClickable();
		SignIn.click();
		wait(20);
		driver.switchTo().window(currentWindowHandle);
//		EnterPassword.clearAndType(Password);
		wait(5);
		//		AcademicYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectingAYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		TermList.click();
		wait(5);
		Term.click();
		wait(2);
		SelectButton.click();
		wait(2);
		PaymentNameSub.sendkeys(Pay);
		wait(2);
		//		PaymentType.click();
		//		wait(2);
				CPCDropDown.click();
				wait(2);
				CPCDropDownSelect.click();
				wait(2);
		//		SelectingPayType.click();
		//		wait(2);
		CheckNumber.sendkeys("234");
		wait(2);
//		BankAccountDropDown.clickUsingJavaScriptExecutor();
//		wait(1);
//		BnakAccount.clickUsingJavaScriptExecutor();
//		wait(4);
		Amount.sendkeys("10");
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(5);
		//		CustomAsserts.containsString(PaymentMsg.getText(), data.get("SuccessMessage").toString());
		//		System.out.println("Subsidiary payment is posted successfully");
		if(Cancel.isDisplayed()) {
			Cancel.click();
		}
		wait(4);
		scrollPage(0, -800);
		wait(4);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(2);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(10);
		TransactionDropdown.clickUsingJavaScriptExecutor();
		wait(1);
		Filter.click();
		wait(2);
		Value.clearAndType(Pay);
		wait(1);
		Filter2.clickUsingJavaScriptExecutor();
		wait(8);
		HighlightingTransaction.click();
		wait(2);
		More.click();
		wait(2);
		Void.click();
		wait(7);
		VoidNote.clearAndType("Void");
		wait(3);
		Voidbutton.click();
		wait(6);
		CustomAsserts.containsString(SubTransVoidSaveMessage.getText(), data.get("VoidSuccessMessage").toString());
		wait(2);
		return this;
	}

	public StudentSubsidiaryPage SubLedgerPostPayment(StringHash data) throws Exception {
		Link SubsideryPostPaymentSaveMessage = new Link("SubsideryPostPaymentSaveMessage", byXPath("//span[. = 'The Transaction records were successfully saved.']"));
		Link BankAccountDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-controls=\"bankAccountId_listbox\"]//span)[4]"));
		Link BnakAccount= new Link("Cash Payment code select", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span[1]"));
		Button Cancel = new Button("Cancel", byXPath("//button[@id=\"cancelPrintReceipt\"]"));
		Link CPCDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-label=\"Cash Payment Code\"]//span)[3]"));
		Link CPCDropDownSelect= new Link("Cash Payment code select", byXPath("//ul[@id=\"transactionNameDropDown_listbox\"]//li[1]//div//span[1]"));
		
		String Password = Encrypt.decodeString(data.get("Password").toString());
        String Username = Encrypt.decodeString(data.get("UserName").toString());
        
        
		//ImplicitlyWait();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		StudentAccounts.clickUsingJavaScriptExecutor();
		wait(2);
		Subsidiary.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		//		GettingSubsidiaryName.click();
		//		wait(2);
		//		SelectingSubsidiary.click();
		//		wait(3);
		SubsidiaryFiltericon.clickUsingJavaScriptExecutor();
		wait(3);
		ClearAll.clickUsingJavaScriptExecutor();
		wait(4);
		Payment.click();
		wait(10);
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(currentWindowHandle);
		driver.switchTo().window(windowHandles.iterator().next());
		userNameTxt.waitTillElementClickable();
		userNameTxt.clearAndTypeUandPwd(Username.toString());
		LoginNext.waitTillElementClickable();
		LoginNext.click();
		passwordTxt.clearAndTypeUandPwd(Password.toString());
		passwordTxt.waitTillElementClickable();
		SignIn.waitTillElementClickable();
		SignIn.click();
		wait(15);
		driver.switchTo().window(currentWindowHandle);
//		EnterPassword.clearAndType(Password);
		wait(5);
		//		AcademicYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		SelectingAYr.clickUsingJavaScriptExecutor();
		//		wait(2);
		TermList.click();
		wait(5);
		Term.click();
		wait(2);
		SelectButton.click();
		wait(2);
		//PaymentNameSub.sendkeys(Pay);
		wait(2);
		//		PaymentType.click();
		//		wait(2);
				CPCDropDown.click();
				wait(2);
				CPCDropDownSelect.click();
				wait(2);
		//		SelectingPayType.click();
		//		wait(2);
		CheckNumber.sendkeys("234");
		wait(2);
//		BankAccountDropDown.clickUsingJavaScriptExecutor();
//		wait(1);
//		BnakAccount.clickUsingJavaScriptExecutor();
//		wait(2);
		Amount.sendkeys("10");
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(8);
		CustomAsserts.containsString(SubsideryPostPaymentSaveMessage.getText(), data.get("SuccessMessage").toString());
		wait(10);
		//Cancel.click();
		System.out.println("Subsidiary payment is posted successfully");
		return this;
	}

	public StudentSubsidiaryPage SubPostRefundForStudent(StringHash data) throws Exception {

		//X-path Parameterization
		Link SubPostRefundSaveMessage = new Link("Subsidiary Post Refund SaveMessage", byXPath("//span[. = 'The Refund records were successfully saved.']"));			
		Link RefundSource = new Link("RefundSource", byXPath("//td[. = '"+data.get("RefundSource")+"']"));

		//Method Implementation

		StudentAccounts.click();
		wait(2);
		Subsidiary.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		Refunds.clickUsingJavaScriptExecutor();
		wait(5);
		FundSource.click();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("RefundSource"));
		wait(4);
		FilterButton.click();
		wait(5);
		RefundSource.click();
		wait(7);
		RefundNext.click();
		wait(7);
		scrollPage(0, 600);
		wait(7);
		RefundTerm.clickUsingJavaScriptExecutor();
		wait(3);
		SelectingTerm.click();
		wait(3);
		DueDate.clearAndType(Date);
		wait(3);
		Amount.sendKeys("1");
		wait(5);
		PostSchedule.click();
		wait(7);
		CustomAsserts.containsString(SubPostRefundSaveMessage.getText(), data.get("SuccessMessage").toString());
		wait(2);
		return this;
	}

}






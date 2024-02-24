package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.DatesUtil;
import com.framework.util.Encrypt;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentLedgerAccountPage extends BaseLocators{
	
	static int AmountV = AppendValue.apendNumber();
	static String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	static String Note = AppendValue.apendString();

	//--------Validation message-----
	
	static Link AlreadyVoidedMsg= new Link("Already Voided Msg", byXPath("//span[text()='The transaction cannot be voided because it is already voided.']"));
	static Link UpdatingVoidMsg= new Link("Updating Void Msg", byXPath("//span[text()='The Student Transaction records were successfully voided.']"));
 
    public StudentLedgerAccountPage AdjustLedgerTransaction(StringHash data) throws Exception {
    	Link UpdatingTransactionMsg= new Link("Updating Ledger Transaction Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
    	
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(20);
		TranFilter.clickUsingJavaScriptExecutor();
		wait(1);
		TranClearFilter.clickUsingJavaScriptExecutor();
		wait(10);
		//		BillCodeDrp.click();
		//		wait(2);
		//		Filter1.click();
		//		wait(2);
		//		SettingsValue.clearAndType(data.get("BillCode"));
		//		//SettingsValue.clearAndType("Tuition");
		//		wait(2);
		//		Filterbutton.click();
		//		wait(2);
		SelectingTransaction.clickUsingJavaScriptExecutor();
		wait(4);
		TermList.clickUsingJavaScriptExecutor();
		wait(3);
		if(Term.isSelected())
		{
			System.out.println("Term is already selected");
			String SelectedTerm = Term.getAttribute("aria-label");
			System.out.println(SelectedTerm);
			TestReportsLog.log(LogStatus.INFO, "Selected Term is "+SelectedTerm);
			CancelButton.clickUsingJavaScriptExecutor();
		}else {
			Term.click();
			String SelectedTerm = Term.getAttribute("aria-label");
			System.out.println(SelectedTerm);
			TestReportsLog.log(LogStatus.INFO, "Selected Term is "+SelectedTerm);
			wait(2);
			SelectButton.clickUsingJavaScriptExecutor();
		}
		wait(2);
		scrollPage(0, 300);
		TransactionNote.clearAndType(Note);
		wait(2);
		scrollPage(0, -600);
		wait(2);
		SaveAndClose.click();
		wait(6);
		CustomAsserts.containsString(UpdatingTransactionMsg.getText(), data.get("UpdatingTransactionMsg").toString());
		System.out.println("Transaction is adjusted successfully");
		return this;
		
	}
public StudentLedgerAccountPage AdjustLedgerTransactionVoid(StringHash data) throws Exception {

	Link ReturnedCHeckMsg= new Link("Returned Check Msg", byXPath("//span[text()='The check was successfully marked as returned.']"));
	Link PaymentMsg= new Link("Payment Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
	Link CPCDropDown= new Link("CPCDropDown", byXPath("//span[@aria-label=\"Cash Payment Code: Dropdown\"]//span//span/span"));
	Link CPCDropDownSelect= new Link("Cash Payment code select", byXPath("//ul[@id=\"transactionNameDropDown_listbox\"]//li[1]"));
	TextField TransactionField= new TextField("Value",byXPath("//input[@title='Value']"));
	String Password = Encrypt.decodeString(data.get("Password").toString());
	String Username = Encrypt.decodeString(data.get("UserName").toString());

	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	StudentAccounts.waitTillElementClickable();
	StudentAccounts.clickUsingJavaScriptExecutor();
	LedgerCard.waitTillElementClickable();
	LedgerCard.clickUsingJavaScriptExecutor();
	wait(2);
	if(Dontsave.isDisplayed()) {
	Dontsave.waitTillElementClickable();
	Dontsave.clickUsingJavaScriptExecutor();
	}
	wait(20);
	Payment.click();
	wait(15);
//	wait(5);
//	String currentWindowHandle = driver.getWindowHandle();
//	Set<String> windowHandles = driver.getWindowHandles();
//	windowHandles.remove(currentWindowHandle);
//	driver.switchTo().window(windowHandles.iterator().next());
//	userNameTxt.waitTillElementClickable();
//	userNameTxt.clearAndTypeUandPwd(Username.toString());
//	LoginNext.waitTillElementClickable();
//	LoginNext.click();
//	passwordTxt.waitTillElementClickable();
//	passwordTxt.clearAndTypeUandPwd(Password.toString());
//	SignIn.waitTillElementClickable();
//	SignIn.click();
//	wait(15);
//	driver.switchTo().window(currentWindowHandle);
//	wait(3);
	PaymentType.click();
	wait(2);
	SelectingPayType.click();
	wait(7);
//	AcademicYr.clickUsingJavaScriptExecutor();
//	wait(2);
//	SelectingAYr.clickUsingJavaScriptExecutor();
//	wait(2);
	TermList.click();
	wait(5);
	Term.click();
	wait(2);
	SelectButton.click();
	wait(2);
	CashPaymentCode.clickUsingJavaScriptExecutor();
	wait(2);
	SelectingPayCode.click();
	wait(2);
	CheckNumber.sendkeys("234");
	wait(2);
	Amount.sendkeys("10");
	wait(2);
	CashDrawerDropdown.waitTillElementClickable();
	CashDrawerDropdown.clickUsingJavaScriptExecutor();
	wait(2);
	CashDrawerselect.click();
	//  	BankAccountDropDown.waitTillElementClickable();
	//  	BankAccountDropDown.click();
	//  	BnakAccount.waitTillElementClickable();
	//  	BnakAccount.click();
	wait(2);
	SaveAndClose.clickUsingJavaScriptExecutor();
	wait(5);
	System.out.println("Payment is posted successfully");
	scrollPage(0, 600);
	wait(1);
//	Cancel.waitTillElementClickable();
//	Cancel.clickUsingJavaScriptExecutor();
	wait(2);
	CustomAsserts.containsString(data.get("PaymentMsg"), PaymentMsg.getText());
	wait(2);
	scrollPage(0, -600);
	TranFilter.clickUsingJavaScriptExecutor();
	wait(2);
	TranClearFilter.clickUsingJavaScriptExecutor();
	wait(5);
	//	scrollPage(0, 200);
	//	TransactionDate.click();
	//	wait(2);
	//	FilterOptions.click();
	//	wait(2);
	//	//Operator.clickUsingJavaScriptExecutor();
	//	//wait(1);
	//	//SelectingOperator.clickUsingJavaScriptExecutor();
	//	//wait(2);
	//	Value.clearAndType(data.get("TransactionDate"));
	//	wait(2);
	//	Filterbutton.click();
	//	wait(2);
	Highligthing1.clickUsingJavaScriptExecutor();
	wait(5);
	More.clickUsingJavaScriptExecutor();
	wait(2);
	Void.clickUsingJavaScriptExecutor();
	wait(2);
	VoidNote.sendKeys(Note);
	wait(2);
	Voidbutton.clickUsingJavaScriptExecutor();
	//System.out.println("Void changes are updated");
	wait(3);
	String Alertmessage = AlertMsg.getText();
	if(Alertmessage.equalsIgnoreCase(data.get("AlreadyVoidedMsg"))) {
		CustomAsserts.containsString(Alertmessage, data.get("AlreadyVoidedMsg").toString());
		TestReportsLog.log(LogStatus.INFO, Alertmessage);
	}else {
		CustomAsserts.containsString(Alertmessage, data.get("UpdatingVoidMsg").toString());
		TestReportsLog.log(LogStatus.INFO, Alertmessage);
	}
	//CustomAsserts.containsString(AlreadyVoidedMsg.getText(), data.get("AlreadyVoidedMsg").toString());
	System.out.println("Transaction is voided successfully");
	System.out.println(Alertmessage);
	return this;
	
}

	public StudentLedgerAccountPage LedgerCardPrinting(StringHash data) throws Exception {
	

	StudentAccounts.clickUsingJavaScriptExecutor();
	wait(2);
	LedgerCard.waitTillElementClickable();
	LedgerCard.clickUsingJavaScriptExecutor();
	wait(3);
	if(Dontsave.isDisplayed()) {
	Dontsave.waitTillElementClickable();
	Dontsave.clickUsingJavaScriptExecutor();
	}
	wait(18);
//	Filtericon.clickUsingJavaScriptExecutor();
//	wait(1);
//	ClearFilters.clickUsingJavaScriptExecutor();
//	wait(2);
	More.clickUsingJavaScriptExecutor();
	wait(4);
	PrintLedger.clickUsingJavaScriptExecutor();
	wait(2);
	IncludeCourseDetail.clickUsingJavaScriptExecutor();
	wait(1);
	SelectingIncCorDet.clickUsingJavaScriptExecutor();
	wait(2);
	PrintButton.clickUsingJavaScriptExecutor();
//	waitForPageToLoad();
	wait(30);
	driver.switchTo().frame("reportViewer");
	wait(2);
	Printicon.clickUsingJavaScriptExecutor();
	wait(5);
//	PrintOK.clickUsingJavaScriptExecutor();
//	wait(2);
//	PDFdownload.clickUsingJavaScriptExecutor();
//	wait(1);
//	Done.click();
	wait(2);
//	driver.switchTo().parentFrame();
//	Cancel.clickUsingJavaScriptExecutor();
	wait(2);
	System.out.println("Ledger card detail print is successfull");
	return this;
}

	public StudentLedgerAccountPage LedgerCardPrintDetail(StringHash data) throws Exception {

		Link Alertmessage = new Link("Alertmessage", byXPath("//span[@role='alert']"));
		
	//Login Page Web Elements
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		TranFilter.clickUsingJavaScriptExecutor();
		wait(1);
		TranClearFilter.clickUsingJavaScriptExecutor();
		wait(2);
		More.clickUsingJavaScriptExecutor();
		wait(2);
		PrintRegistrationBill.clickUsingJavaScriptExecutor();
		wait(1);
		if(PrintDetail.isDisplayed()) {
		PrintDetail.clickUsingJavaScriptExecutor();
		wait(35);
//		if(Alertmessage.isDisplayed()) {
//			wait(2);
//			TestReportsLog.log(Status.FAIL, Alertmessage.getText());
//		}else {
//		waitForPageToLoad();
		driver.switchTo().frame("reportViewer");
		wait(1);
		Printicon.clickUsingJavaScriptExecutor();
		wait(2);
//		PrintOK.clickUsingJavaScriptExecutor();
//		wait(2);
//		PDFdownload.clickUsingJavaScriptExecutor();
//		wait(1);
//		Done.click();
//		wait(2);
//	driver.switchTo().parentFrame();
//	Cancel.clickUsingJavaScriptExecutor();
//		}
	System.out.println("Ledger card detail printing is successfull");
	}else {
		TestReportsLog.log(LogStatus.FAIL, "Print Detail button is not visible");
	}
	return this;
}
	
	public StudentLedgerAccountPage LedgerCardPrintSummary(StringHash data) throws Exception {
		
		Link Alertmessage = new Link("Alertmessage", byXPath("//span[text()='Registration Bill Report cannot be generated because there is no records found for selected criteria.']"));
		
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		TranFilter.clickUsingJavaScriptExecutor();
		wait(1);
		TranClearFilter.clickUsingJavaScriptExecutor();
		wait(2);
		More.clickUsingJavaScriptExecutor();
		wait(2);
		PrintRegistrationBill.clickUsingJavaScriptExecutor();
		wait(2);
		if(PrintSummary.isDisplayed()) {
			PrintSummary.clickUsingJavaScriptExecutor();
			//wait(20);
			wait(30);
			if(Alertmessage.isDisplayed()) {
				TestReportsLog.log(LogStatus.FAIL, Alertmessage.getText());
			}else {
			driver.switchTo().frame("reportViewer");
			Printicon.clickUsingJavaScriptExecutor();
			wait(4);
			PrintOK.clickUsingJavaScriptExecutor();
			wait(2);
			PDFdownload.click();
			wait(1);
			Done.click();
			wait(2);
		driver.switchTo().parentFrame();
		Cancel.clickUsingJavaScriptExecutor();
		wait(1);
		}
		System.out.println("Ledger card summary printing is successfull");
		}else {
			TestReportsLog.log(LogStatus.FAIL, "Print summary button is not visible");
		}
		return this;
	}
	
	public StudentLedgerAccountPage ApplyCreditLedger(StringHash data) throws Exception {

		Link SelectingTransactionlist= new Link(data.get("TransactionList"), byXPath("//span[text()='"+data.get("TransactionList")+"']"));
		Link GettingTransaction= new Link("Getting transaction", byXPath("//li[text()='"+data.get("TransactionList")+"']"));
		Link ApplyCreditMsg= new Link("Apply Credit Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
		
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS) ;	
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.click();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		ApplyCreditsButton.clickUsingJavaScriptExecutor();
		wait(20);
		TransatcionList1.clickUsingJavaScriptExecutor();
		wait(1);
		SelectingTransactionlist.clickUsingJavaScriptExecutor();
//		wait(5);
//		CreditFiler.clickUsingJavaScriptExecutor();
//		wait(2);
//		CreditClearFilters.click();
		wait(10);
		TranDate.clickUsingJavaScriptExecutor();
		wait(3);
		Filter1.click();
		wait(3);
		Value1.clearAndType(data.get("TranDate"));
		wait(3);
		Filterbutton.click();
		wait(8);
		HighlightingTransaction.clickUsingJavaScriptExecutor();
		String SelectedTransaction = HighlightingTransaction.getText();
		System.out.println(SelectedTransaction);
		TestReportsLog.log(LogStatus.INFO, "Selected Transaction is "+SelectedTransaction);
		wait(3);
		ApplyCredit.clickUsingJavaScriptExecutor();
//		waitForPageToLoad();
		wait(15);
//		SelectingAmount.click();
//		wait(2);
//		EnteringAmount.sendKeys("1");
//		wait(2);
		ApplyAmount.clickUsingJavaScriptExecutor();
		ApplyAmount.click();
		wait(1);
		ApplyAmount.click();
//		String SelectedRecord = GettingTransaction.getText();
//		System.out.println(SelectedRecord);
//		TestReportsLog.log(Status.INFO, "Selected Record is "+SelectedRecord);
//		wait(3);
		scrollPage(0, 200);
		wait(1);
//		ApplyButton.waitTillElementClickable();
		ApplyButton.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(ApplyCreditMsg.getText(), data.get("ApplyCreditMsg").toString());
		System.out.println("Credit applied successfully");

	return this;
}
	public StudentLedgerAccountPage LedgerCardPostCharge(StringHash data) throws Exception {
		Link PostingChargeMsg= new Link("Posting Charge Msg", byXPath("//span[text()='The Charge records were successfully saved.']"));
          
        StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
		wait(20);
		AddCharge.click();
		wait(15);
		TermList.clickUsingJavaScriptExecutor();
		wait(3);
		Term.click();
		wait(2);
		String SelectedTerm = Term.getAttribute("aria-label");
		TestReportsLog.log(LogStatus.INFO, "selected term is "+SelectedTerm);
		System.out.println(SelectedTerm);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(2);
		BillCode.click();
		wait(2);
		//SearchBillCode.waitTillElementClickable();
		//SearchBillCode.sendKeys(data.get("BillCode"));
		//wait(2);
		SelectingBillCode.click();
		wait(2);
		String SelectedBillingCode = SelectingBillCode.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "selected bill code is "+SelectedBillingCode);
		System.out.println(SelectedBillingCode);
		Amount.sendKeys("10");
		wait(5);
		scrollPage(0, -300);
		wait(1);
		SaveAndClose.click();
		wait(6);
		CustomAsserts.containsString(PostingChargeMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Charge is posted successfully");
        return this;

    }
	
	public StudentLedgerAccountPage AdjustLedgerTransactionDelete(StringHash data) throws Exception {
		Link DeletingTranMsg= new Link("DeletingvTransaction Msg", byXPath("//span[text()='The Student Transaction records were successfully deleted.']"));
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		//Login Page Web Elements
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(18);
		TranFilter.clickUsingJavaScriptExecutor();
		wait(1);
		TranClearFilter.click();
		wait(6);
		//		Code.click();
		//		wait(2);
		//		Filter1.click();
		//		wait(2);
		//		Value1.clearAndType(data.get("BillCode"));
		//		wait(2);
		//		Filterbutton.click();
		//		wait(2);
		HighlightingCode.click();
		wait(2);
		More.click();
		wait(2);
		Delete.click();
		wait(2);
		DeleteNote.clearAndType(Note);
		wait(2);
		Deletebutton.click();
		wait(5);
		CustomAsserts.containsString(DeletingTranMsg.getText(), data.get("DeletingTranMsg").toString());
		System.out.println("Charge is deleted successfully");
		return this;
		
	}
	
public StudentLedgerAccountPage ScheduleRefundLedgerCard(StringHash data) throws Exception {

		Link SchldRefundMsg= new Link("Schedule Refund Msg", byXPath("//span[text()='The Refund records were successfully saved.']"));
		Link SelectingRefundOption= new Link(data.get("RefundOption"), byXPath("//span[text()='"+data.get("RefundOption")+"']"));
			
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		LedgerCard.waitTillElementClickable();
		LedgerCard.clickUsingJavaScriptExecutor();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		Refunds.click();
		wait(15);
		RefundFilter.clickUsingJavaScriptExecutor();
		wait(1);
		RefundClearFilter.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, 700);
		wait(2);
		//scrollPage(0, 200);
		FundSource.clickUsingJavaScriptExecutor();
		wait(2);
		Filter1.click();
		wait(2);
		Value1.clearAndType(data.get("FundSource"));
		wait(2);
		Filterbutton.click();
		wait(4);
		//AmountReceived.click();
		//wait(2);
		//SortDescending.click();
		//wait(2);
		//				String sRowValue = "0.00";
		//				WebElement mytable = driver.findElement(By.xpath("//table/tbody[@role='rowgroup']"));
		//				List< WebElement > rows_table = mytable.findElements(By.xpath("//table/tbody[@role='rowgroup']/tr"));
		//				int rows_count = rows_table.size();
		//				System.out.println(rows_count);
		//				List< WebElement > columnss_table = mytable.findElements(By.xpath("//table/tbody[@role='rowgroup']/tr[1]/td"));
		//				int columns_count = columnss_table.size();
		//				System.out.println(columns_count);
		//				for (int i = 1; i <= rows_count; i++) {
		//					String sValue = null;
		//					sValue = driver.findElement(By.xpath("//table/tbody[@role='rowgroup']/tr["+ i +"]/td[4]")).getText();
		//					System.out.println(sValue);
		//					NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
		//					Number number = format.parse(sValue);
		//					System.out.println(number);
		//					double value = number.doubleValue();
		//					System.out.println(value);
		//					if(value>0){
		//				    for(int column = 1; column <= columns_count; column++) {
		//				    	String sColumnValue= driver.findElement(By.xpath("//table/tbody[@role='rowgroup']/tr["+ column +"]/td[5]")).getText();
		//						System.out.println(sColumnValue);
		//						double Cvalue = Double.parseDouble(sColumnValue);
		//						if(Cvalue<value) {
		//						driver.findElement(By.xpath("//table/tbody[@role='rowgroup']/tr[" + i + "]/td["+ column +"]")).click();	
		//						break;
		//				    }
		//				}break;
		//					}
		//					}
		//System.out.println(columns_count);
		HighlightingFundSource.clickUsingJavaScriptExecutor();
		wait(5);
		scrollPage(0, 300);
		wait(2);
		RefundNext.clickUsingJavaScriptExecutor();
		wait(2);
		RefundOption.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingRefundOption.clickUsingJavaScriptExecutor();
		wait(3);
		RefundTerm.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingTerm.click();
		wait(1);
		String SelectedTerm = SelectingTerm.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "selected term is "+SelectedTerm);
		System.out.println(SelectedTerm);
		wait(2);
		DueDate.sendKeys(Date);
		String Duedateentered = DueDate.getText();
		System.out.println(Duedateentered);
		wait(2);
		ReturnMethod.click();
		wait(1);
		SelectingReturnMethod.click();
		String SelectedReturnMethod = SelectingReturnMethod.getText();
		System.out.println(SelectedReturnMethod);
		TestReportsLog.log(LogStatus.INFO, "Selected Return Method is "+SelectedReturnMethod);
		wait(2);
		Amount.sendKeys("10");
		wait(2);
		PostSchedule.click();
		//wait(4);
		//Override.click();
		wait(5);
		CustomAsserts.containsString(SchldRefundMsg.getText(), data.get("SuccessMessage").toString());
		//OverrideCancel.click();
		//wait(2);
		System.out.println("Schedule refund is successfully");
		return this;
		
	}




public StudentLedgerAccountPage ScheduleStipend(StringHash data) throws Exception {
	Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Stipend records were successfully saved.']"));
	Dropbox StatusDropdown = new Dropbox("Status Drpdown", byXPath("//span[contains(@aria-owns,'status')]/span/span[2]/span"));
	Link SelectStatus = new Link("Select Status", byXPath("//li[.=\"Approved\"]"));
	Dropbox FundSourceDropdown = new Dropbox("Fund Source Dropdown", byXPath("//span[@aria-label=\"Fund Source: Dropdown\"]/span/span[2]/span"));
	Link SelectFundSource = new Link("Fund Source", byXPath("//ul[@id='fundSourceId_listbox']/li[1]/span/div/span[1]"));
	Link Dontsave = new Link ("Dontsave",byXPath("//button[@id='cnsDirtyCheckUnsavedChangesDialogNotOkButton']"));
	
	StudentAccounts.waitTillElementClickable();
	StudentAccounts.click();
	scrollPage(0, 200);
	wait(2);
	StipendSchedule.waitTillElementClickable();
	StipendSchedule.click();
	wait(2);
	if(Dontsave.isDisplayed()) {
	Dontsave.waitTillElementClickable();
	Dontsave.clickUsingJavaScriptExecutor();
	}
	wait(18);
	TotalAmount.waitTillElementFound();
	TotalAmount.sendKeys("10");
	wait(2);
//	StatusDropdown.waitTillElementClickable();
//	StatusDropdown.click();
//	SelectStatus.waitTillElementClickable();
//	SelectStatus.click();
//	String StipendStatus = SelectStatus.getText();
//	TestReportsLog.log(LogStatus.INFO, "Stipend Status is selected as " +StipendStatus);
//	wait(1);
	NoOfStipends.waitTillElementFound();
	NoOfStipends.sendKeys("1");
	wait(2);
	scrollPage(0, 500);
	wait(2);
	CalculateSS.waitTillElementClickable();
	CalculateSS.click();
	wait(12);
	SelectLinkFundSource.waitTillElementClickable();
	SelectLinkFundSource.click();
	wait(5);
	FundSourceSpanSS.waitTillElementClickable();
	FundSourceSpanSS.click();
	wait(1);
	SelectFundSource.waitTillElementClickable();
	SelectFundSource.click();
	String FundSourceValue = SelectFundSource.getAttribute("title");
	TestReportsLog.log(LogStatus.INFO, "Term Value is selected as " +FundSourceValue);
	wait(1);
	Ok.waitTillElementClickable();
	Ok.click();
	wait(1);
	scrollPage(0, -500);
	wait(1);
	SaveSS.waitTillElementClickable();
	SaveSS.click();
	wait(5);
	CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
	return this;
}

public StudentLedgerAccountPage AdjustLedgerTransactionReturnedCheck(StringHash data) throws Exception {

	Link ReturnedCHeckMsg= new Link("Returned Check Msg", byXPath("//span[text()='The check was successfully marked as returned.']"));
	Link PaymentMsg= new Link("Payment Msg", byXPath("//span[text()='The Transaction records were successfully saved.']"));
	TextField TransactionField= new TextField("Value",byXPath("//input[@title='Value']"));
	String Password = Encrypt.decodeString(data.get("Password").toString());
	String Username = Encrypt.decodeString(data.get("UserName").toString());
		
	//Login Page Web Elements
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
	StudentAccounts.clickUsingJavaScriptExecutor();
	LedgerCard.waitTillElementClickable();
	LedgerCard.clickUsingJavaScriptExecutor();
	wait(2);
	if(Dontsave.isDisplayed()) {
	Dontsave.waitTillElementClickable();
	Dontsave.clickUsingJavaScriptExecutor();
	}
	wait(18);
	Payment.click();
	wait(15);
//	String currentWindowHandle = driver.getWindowHandle();
//	Set<String> windowHandles = driver.getWindowHandles();
//	windowHandles.remove(currentWindowHandle);
//	driver.switchTo().window(windowHandles.iterator().next());
//	userNameTxt.waitTillElementClickable();
//	userNameTxt.clearAndTypeUandPwd(Username.toString());
//	LoginNext.waitTillElementClickable();
//	LoginNext.click();
//	passwordTxt.waitTillElementClickable();
//	passwordTxt.clearAndTypeUandPwd(Password.toString());
//	SignIn.waitTillElementClickable();
//	SignIn.click();
//	wait(15);
//	driver.switchTo().window(currentWindowHandle);
//	wait(6);
	PaymentType.click();
	wait(1);
	SelectingPayType.click();
	wait(7);
//	AcademicYr.clickUsingJavaScriptExecutor();
//	wait(2);
//	SelectingAYr.clickUsingJavaScriptExecutor();
//	wait(2);
	TermList.click();
	wait(5);
	Term.click();
	wait(2);
	SelectButton.click();
	wait(2);
	CashPaymentCode.clickUsingJavaScriptExecutor();
	wait(2);
	SelectingPayCode.click();
	wait(2);
	CheckNumber.sendkeys("234");
	wait(1);
	Amount.sendkeys("10");
	wait(2);
	CashDrawerDropdown.waitTillElementClickable();
	CashDrawerDropdown.clickUsingJavaScriptExecutor();
	wait(2);
	CashDrawerselect.click();
//	CashDrawerDropdown.waitTillElementClickable();
//	CashDrawerDropdown.clickUsingJavaScriptExecutor();
//	CashDrawerselect.waitTillElementClickable();
	wait(1);
//	CashDrawerselect.click();
//	BankAccountDropDown.waitTillElementClickable();
//	BankAccountDropDown.click();
//	BnakAccount.waitTillElementClickable();
//	BnakAccount.click();
	wait(2);
	SaveAndClose.clickUsingJavaScriptExecutor();
	wait(4);
	System.out.println("Payment is posted successfully");
	scrollPage(0, 600);
	wait(2);
//	Cancel.waitTillElementClickable();
//	Cancel.clickUsingJavaScriptExecutor();
	TranFilter.clickUsingJavaScriptExecutor();
	wait(2);
	TranClearFilter.clickUsingJavaScriptExecutor();
	wait(20);
	//		Transaction.click();
	//		wait(2);
	//		StudentLedgerAccountPage.Filter1.click();
	//		wait(2);
	//		StudentLedgerAccountPage.Value1.clearAndType(data.get("PaymentName"));
	//		wait(2);
	//		StudentLedgerAccountPage.Filterbutton.click();
	//		wait(2);
	HighlightingTransaction.clickUsingJavaScriptExecutor();
	wait(5);
	More.clickUsingJavaScriptExecutor();
	wait(5);
	ReturnedCheck.clickUsingJavaScriptExecutor();
	wait(5);
	ReturnNote.sendkeys(Note);
	wait(2);
	ReturnedCheckOk.click();
	wait(8);
	CustomAsserts.containsString(data.get("RetunerCheckMsg"), ReturnedCHeckMsg.getText());
	System.out.println("Transaction is returned successfully");
//		wait(2);
		return this;
}

public StudentLedgerAccountPage ScheduleRefundDirectToLedger(StringHash data) throws Exception {

	Link SchldRefundMsg= new Link("Schedule Refund Msg", byXPath("//span[text()='The Refund records were successfully saved.']"));
	Link SelectingRefundOption= new Link(data.get("RefundOption"), byXPath("//span[text()='"+data.get("RefundOption")+"']"));
		
	StudentAccounts.waitTillElementClickable();
	StudentAccounts.clickUsingJavaScriptExecutor();
	LedgerCard.waitTillElementClickable();
	LedgerCard.clickUsingJavaScriptExecutor();
	wait(3);
	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
	wait(20);
	Refunds.click();
	wait(15);
	RefundFilter.clickUsingJavaScriptExecutor();
	wait(2);
	RefundClearFilter.clickUsingJavaScriptExecutor();
	wait(2);
	scrollPage(0, 700);
	wait(2);
	//scrollPage(0, 200);
	FundSource.clickUsingJavaScriptExecutor();
	wait(2);
	Filter1.click();
	wait(2);
	Value1.clearAndType(data.get("FundSource"));
	wait(2);
	Filterbutton.click();
	wait(4);
	HighlightingFundSource.clickUsingJavaScriptExecutor();
	wait(5);
	scrollPage(0, 300);
	wait(2);
	RefundNext.clickUsingJavaScriptExecutor();
	wait(2);
	RefundOption.clickUsingJavaScriptExecutor();
	wait(2);
	SelectingRefundOption.clickUsingJavaScriptExecutor();
	wait(3);
	RefundTerm.clickUsingJavaScriptExecutor();
	wait(2);
	SelectingTerm.clickUsingJavaScriptExecutor();
	wait(2);
	String SelectedTerm = SelectingTerm.getAttribute("title");
	TestReportsLog.log(LogStatus.INFO, "selected term is "+SelectedTerm);
	System.out.println(SelectedTerm);
	wait(2);
	DateSend.sendKeys(Date);
	String Duedateentered = DueDate.getText();
	System.out.println(Duedateentered);
	wait(2);
	ReturnMethod.click();
	wait(1);
	SelectingReturnMethod.click();
	String SelectedReturnMethod = SelectingReturnMethod.getText();
	System.out.println(SelectedReturnMethod);
	TestReportsLog.log(LogStatus.INFO, "Selected Return Method is "+SelectedReturnMethod);
	wait(2);
	BankAccountDropdown.click();
	wait(1);
	SelectBankAccount.click();
	wait(2);
	Amount.sendKeys("10");
	wait(2);
	PostSchedule.click();
	//wait(4);
	//Override.click();
	wait(5);
	CustomAsserts.containsString(SchldRefundMsg.getText(), data.get("SuccessMessage").toString());
	//OverrideCancel.click();
	//wait(2);
	System.out.println("Schedule refund is successfully");
	return this;
	
}

}

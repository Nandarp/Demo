package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.util.Set;

import com.framework.elements.AngDropDown;
import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.Encrypt;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentStudentAccountsPage extends BaseLocators{


	public StudentStudentAccountsPage LedgerPaymentPage(StringHash data) throws Exception {

		String Password = Encrypt.decodeString(data.get("Password").toString());
		String Username = Encrypt.decodeString(data.get("UserName").toString());
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Transaction records were successfully saved.']"));
		Link BankAccountDropDown= new Link("Cash Payment code select", byXPath("(//span[@aria-controls=\"bankAccountId_listbox\"]//span)[4]"));
		Link BnakAccount= new Link("Cash Payment code select", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span[1]"));
		Button Cancel = new Button("Cancel", byXPath("//button[@id=\"cancelPrintReceipt\"]"));

		StudentAccounts.click();
		wait(2);
		LedgerCard.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(20);
		NewPaymentButton.clickUsingJavaScriptExecutor();
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
		wait(10);
		driver.switchTo().window(currentWindowHandle);
//		EnterPassword.clearAndType(Password);
		wait(7);
		PaymentTypeDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		SelectCashPaymentType.clickUsingJavaScriptExecutor();
		wait(2);
		TermList.click();
		wait(2);
		CheckTerm.check();
		String TermValue = CheckTerm.getAttribute("aria-label");
		TestReportsLog.log(LogStatus.INFO, "Term Value is selected as " +TermValue);
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, 400);
		wait(2);
		CashPaymentCodeDropdown.click();
		wait(2);
		SelectCashPaymentCode.clickUsingJavaScriptExecutor();
		String CashPaymentCodeValue = SelectCashPaymentCode.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Cash Payment Code Value is selected as " +CashPaymentCodeValue);
		wait(2);
		//		PaymentMethodDropdown.click();
		//		wait(2);
		//		PaymentMethod.click();
		//		String PaymentMethodValue = PaymentMethod.getText();
		//		TestReportsLog.log(Status.INFO, "Payment Method Value is selected as " +PaymentMethodValue);
		//		wait(2);
		CheckNo.sendKeys("1234");
		wait(3);
//		BankAccountDropDown.clickUsingJavaScriptExecutor();
//		wait(1);
//		BnakAccount.clickUsingJavaScriptExecutor();
		wait(1);
		//		BankAccountDropdown.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		BankAccount.click();
		//		String BankAccountValue = BankAccount.getAttribute("title");
		//		TestReportsLog.log(Status.INFO, "Cash Drawer Value is selected as " +BankAccountValue);
		wait(2);
		Amount.sendkeys("10");
		wait(2);
		//		CashDrawerDropdown.waitTillElementClickable();
		//		CashDrawerDropdown.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		CashDrawerselect.click();
		//		TransactionDate.sendKeys(TDate);
		//		TestReportsLog.log(Status.INFO, "Transaction Date " +TDate);
		//		wait(2);
		//		if (ReceiptPrint.isSelected()) {
		//			ReceiptPrint.uncheck();
		//		}else {
		//			ReceiptPrint.check();
		//		}
		wait(2);
		scrollPage(0, -500);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(6);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Payment is successfull");
		return this;

	}

	public StudentStudentAccountsPage LedgerFADisbursementPage(StringHash data) throws Exception {

		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Transaction records were successfully saved.']"));
		Checkbox CheckFundSource = new Checkbox("Fundsource", byXPath("(//tr//td//input)[1]"));
		String Password = Encrypt.decodeString(data.get("Password").toString());
		String Username = Encrypt.decodeString(data.get("UserName").toString());
		TextField Amount = new TextField("Amount", byXPath("//span[@aria-label=\"Amount\"]"));
		Link BankAccountDropDown= new Link("BankAccountDropDown", byXPath("(//span[@aria-controls=\"bankAccountId_listbox\"]//span)[4]"));
		Link BnakAccount= new Link("BnakAccount", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span[1]"));
		Button Cancel = new Button("Cancel", byXPath("//button[@id=\"cancelPrintReceipt\"]"));

		StudentAccounts.click();
		wait(2);
		LedgerCard.click();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(17);
		NewPaymentButton.clickUsingJavaScriptExecutor();
		wait(8);
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
		PaymentDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		SelectPaymentType.click();
		wait(2);
		ScheduledDisburdementSpan.clickUsingJavaScriptExecutor();
		wait(10);
		CheckFundSource.check();
		String Fundsourcevalue = CheckFundSource.getText();
		TestReportsLog.log(LogStatus.INFO, "Fund Source Value is selected as " +Fundsourcevalue);
		wait(3);
		Select.clickUsingJavaScriptExecutor();
		wait(5);
		scrollPage(0, 300);
		wait(2);
		TermList.click();
		wait(2);
		CheckTerm.uncheck();
		wait(3);
		CheckTerm.check();
		wait(2);
		String TermValue = CheckTerm.getText();
		TestReportsLog.log(LogStatus.INFO, "Term Value is selected as " +TermValue);
		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(2);
		//		PaymentMethodDropdown.click();
		//		wait(2);
		//		PaymentMethod.click();
		//		String PaymentMethodValue = PaymentMethod.getText();
		//		TestReportsLog.log(LogStatus.INFO, "Payment Method Value is selected as " +PaymentMethodValue);
		//		wait(2);
		
		BankAccountDropDown.clickUsingJavaScriptExecutor();
		wait(2);
		BnakAccount.clickUsingJavaScriptExecutor();
		//String BankAccountValue = BankAccount.getAttribute("title");
		//TestReportsLog.log(Status.INFO, "Cash Drawer Value is selected as " +BankAccountValue);
		wait(2);
		CheckNo.sendKeys("1234");
		wait(2);
	//	Amount.clearAndType("10");
		scrollPage(0, -300);
		wait(2);
		//		TransactionDate.clearAndType(TDate);
		//		wait(2);
		//		if (PrintReceipt.isSelected()) {
		//			PrintReceipt.check();
		//		}
		//		else
		//			wait(2);
		//		scrollPage(0, -500);
		//		wait(2);
		SaveAndClose.click();
		wait(6);
		//CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("FA disbursement payment is successfull");
		return this;	
	}

	public StudentStudentAccountsPage NewLedgerRefund(StringHash data) throws Exception {

		Button HighlightFundSource = new Button(data.get("FundSourceName"), byXPath("//td[.='"+data.get("FundSourceName")+"']"));
		//Button SelectAYSpan = new Button(data.get("AYStartDate"), byXPath("//span[.='"+data.get("AYStartDate")+"']"));
		//Button SelectTermCode = new Button(data.get("TermCode"), byXPath("//span[.='"+data.get("TermCode")+"']"));
		//Button SelectReturnMethod = new Button(data.get("ReturnMethod"), byXPath("//li[.='"+data.get("ReturnMethod")+"']"));
		//Button SelectRefundBA = new Button(data.get("BankAccount"), byXPath("//li/div/span[.='"+data.get("BankAccount")+"']"));
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Refund records were successfully saved.']"));
		Dropbox Termdropdown = new Dropbox("Term Dropdown", byXPath("(//button[@aria-label=\"expand combobox\"]/span)[2]"));
		Link SelectTerm = new Link("Term", byXPath("//ul[@id=\"termId_listbox\"]/li[1]/span/div/span[1]"));
		Dropbox RetunMethodDopdown = new Dropbox("Return Method Dropdown", byXPath("//span[@aria-label=\"Return Method: Dropdown\"]/span/span[2]/span"));
		Link SelectReturnMethod = new Link("Return Method", byXPath("(//ul[@id='returnMethod_listbox']/li[1])"));
		Dropbox BankAccountDropdown = new Dropbox("Bank Account Dropdown", byXPath("//span[@aria-controls=\"bankAccountId_listbox\"]/span[2]/span"));
		Link BankAccount = new Link("Bank Account", byXPath("//ul[@id=\"bankAccountId_listbox\"]/li[1]/span/div/span[1]"));
		//Dropbox AYDropdown = new Dropbox("Academic Year Dropdown", byXPath("//span[@aria-label=\"Academic Year: Dropdown\"]/span/span[2]/span"));
		//Link SelectAY = new Link("Academic Year Start Date", byXPath("//ul[@id=\"academicYearSequence_listbox\"]/li[1]/div/span[2]"));
		Link Dontsave = new Link ("Dontsave",byXPath("//button[@id='cnsDirtyCheckUnsavedChangesDialogNotOkButton']"));
		TextField TransDate = new TextField("TransactionDate", byXPath("//input[@id='transactionDate']"));
		// New Ledger Refund Web elements	
		Button ButtonRefundTab = new Button("Refund tab",byXPath("//button[.='Refunds']"));
		Button RefundDropdown = new Button("Refund drop down", byXPath("//div[2]/a[@class=\"k-button k-split-button-arrow\"]"));
		Button RefundFilter = new Button("Refund Filter", byXPath("//a[.=\"Clear Filters\"]"));
		AngDropDown FSdropdown = new AngDropDown(" Fund Source drop down", byXPath("//a[@title='Fund Source edit column settings']/span"));
		Button FSFilter = new Button("Filter", byXPath("//span/span[text()='Filter']"));
		TextField FSValue = new TextField("value", byXPath("//input[@title=\"Value\"]"));
		Button FSFilterButton = new Button("Filter Button", byXPath("//button[.=\"Filter\"]"));
		//static Button HighlightFundSource = new Button("HighLight Fund Source", byXPath("//td[.=\"Cash Payment from Student\"]"));
		Button FSNext = new Button("Next",byXPath("//button[text()=\"Next\"]"));
		Dropbox RefundOption = new Dropbox("Refund Option", byXPath("//span[@aria-label=\"Refund Option\"]/span[2]/span[1]"));
		Button SelectRefundOption = new Button("Refund Option", byXPath("//li/span[text()='Post Directly to Ledger Card (No Check Required)']"));
		Button AYSpan = new Button("Academic Year", byXPath("//span[@aria-label=\"Academic Year: Dropdown\"]"));
		Button SelectAYSpan = new Button("AY Start Date", byXPath("//span[.=\"07/01/2022\"]"));
		TextField EnterrefundTerm = new TextField("Term", byXPath("//input[@aria-label=\"termId\" and @aria-owns=\"termId_listbox\"]"));
		TextField RefundDateSent = new TextField("Due Date", byXPath("//input[@name=\"dateSend\"]"));
		TextField RefundName = new TextField("Refund Name", byXPath("//input[@aria-label=\"Refund Name\"]"));
		Button ReturnMethod = new Button("Return Method", byXPath("//span[@aria-label=\"Return Method: Dropdown\"]"));
		TextField EnterReturnMethod = new TextField("Return Method", byXPath("//input[@aria-owns=\"returnMethod_listbox\"]"));
		TextField RefundAmount = new TextField("Refund", byXPath("//span/input[1][@aria-label=\"Amount\"]"));
		Button RefundSaveClose = new Button("Save and Close", byXPath("(//button[@aria-label='Post/Schedule'])[2]"));
		Button RefundBankAccount = new Button("Bank Account", byXPath("//span[@aria-label=\"Bank Account: Dropdown\"]"));
		TextField EnterRefundBankAccount = new TextField("Refund Bank Account", byXPath("//input[@aria-owns=\"bankAccountId_listbox\"]"));
		//TextField RefundTransactionDate = new TextField("Refund Transaction Date", byName("transactionDate"));
		Link FilterDropDown = new Link("FilterDropDown", byXPath("//div[@title=\"Settings\"]//button[2]//span"));
		Link ResetDefaults = new Link("ResetDefaults", byXPath("(//li//span[.='Reset to Default'])[1]"));

		StudentAccounts.waitTillElementClickable();
		StudentAccounts.click();
		LedgerCard.waitTillElementClickable();
		LedgerCard.click();
		wait(20);
		ButtonRefundTab.waitTillElementClickable();
		ButtonRefundTab.clickUsingJavaScriptExecutor();
		wait(10);
		FilterDropDown.clickUsingJavaScriptExecutor();
		wait(1);
		ResetDefaults.clickUsingJavaScriptExecutor();
		wait(3);
		/*	RefundDropdown.waitTillElementClickable();
	RefundDropdown.click();
	wait(4);
	RefundFilter.click();
	wait(2);
		 */
		scrollPage(0, 200);
		FSdropdown.waitTillElementClickable();
		FSdropdown.clickUsingJavaScriptExecutor();
		wait(1);
		FSFilter.waitTillElementClickable();
		FSFilter.click();
		wait(1);
		FSValue.waitTillElementClickable();
		FSValue.clearAndType(data.get("FundSourceName"));
		wait(1);
		FSFilterButton.waitTillElementClickable();
		FSFilterButton.click();
		wait(2);
		HighlightFundSource.waitTillElementClickable();
		HighlightFundSource.clickUsingJavaScriptExecutor();
		wait(4);
		scrollPage(0, 200);
		wait(1);
		FSNext.waitTillElementClickable();
		FSNext.click();
		wait(1);
		scrollPage(0, 300);
		wait(1);
		RefundOption.waitTillElementClickable();
		RefundOption.click();
		wait(1);
		SelectRefundOption.waitTillElementClickable();
		SelectRefundOption.click();
		wait(1);
		Termdropdown.waitTillElementClickable();
		Termdropdown.click();
		wait(1);
		SelectTerm.waitTillElementClickable();
		SelectTerm.click();
		String TermValue = SelectTerm.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Term is selected as " +TermValue);
		wait(1);
		RefundDateSent.waitTillElementFound();
		RefundDateSent.sendKeys(TDate);
		wait(1);
		scrollPage(0, 300);
		//	RetunMethodDopdown.click();
		//	wait(2);
		//	SelectReturnMethod.click();
		//	String ReturnMethodValue = SelectReturnMethod.getText();
		//	System.out.println("Return Method "+ReturnMethodValue);
		//	TestReportsLog.log(LogStatus.INFO, "Return Method is selected as " +ReturnMethodValue);
		BankAccountDropdown.waitTillElementClickable();
		BankAccountDropdown.click();
		BankAccount.waitTillElementClickable();
		BankAccount.click();
		String BankAccountValue = BankAccount.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "Bank Account is selected as " +BankAccountValue);
		wait(2);
		RefundAmount.waitTillElementClickable();
		RefundAmount.sendKeys("5");
		wait(2);
		//	TransDate.waitTillElementFound();
		//	TransDate.clearAndType("04/12/2024");
		//	wait(1);
		RefundSaveClose.waitTillElementClickable();
		RefundSaveClose.click();
		wait(5);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		return this;
	}
}	






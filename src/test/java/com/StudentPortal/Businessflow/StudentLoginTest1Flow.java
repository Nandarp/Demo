package com.StudentPortal.Businessflow;

import com.StudentPortal.Pages.StudentAccountSchoolFieldsPage;
import com.StudentPortal.Pages.StudentConfigurationPage;
import com.StudentPortal.Pages.StudentFinancialAidPage;
import com.StudentPortal.Pages.StudentHomePage;
import com.StudentPortal.Pages.StudentLedgerAccountPage;
import com.StudentPortal.Pages.StudentLoginPage;
import com.StudentPortal.Pages.StudentLoginPage2;
import com.StudentPortal.Pages.StudentProcessesPage;
import com.StudentPortal.Pages.StudentSettingsPage;
import com.StudentPortal.Pages.StudentStudentAccountsPage;
import com.StudentPortal.Pages.StudentStudentPage;
import com.StudentPortal.Pages.StudentSubsidiaryPage;
import com.framework.base.BasePage;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentLoginTest1Flow {
	
	public static void AdjustingSubsidiaryTransaction(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSubsidiaryPage SBpage = new StudentSubsidiaryPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.AdjustSubTransaction(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AdjustingSubTransactionReturnCheck(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSubsidiaryPage SBpage = new StudentSubsidiaryPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.AdjustSubTransactionReturnedCheck(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    Bpage.QuitBrowser();
		}
	}
	public static void PrintingSubsidiaryLedger(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSubsidiaryPage SBpage = new StudentSubsidiaryPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.PrintSubsidiaryLedger(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AddingNewSubsidiary(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSubsidiaryPage SBpage = new StudentSubsidiaryPage();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.AddSubsidiary(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SubLedgerPostCharge(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSubsidiaryPage SBpage = new StudentSubsidiaryPage();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.SubsidiaryPostCharge(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AdjustingLedgerTransaction(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.AdjustLedgerTransaction(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AdjustingLedgerTransactionVoid(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.AdjustLedgerTransactionVoid(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void LedgerCardPostingCharge(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.LedgerCardPostCharge(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AdjustingLedgerTransactionDelete(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.AdjustLedgerTransactionDelete(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SchedulingLedgerCardRefund(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.ScheduleRefundLedgerCard(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SchedulingStipend(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.ScheduleStipend(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void ProcessingScheduledRefund(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentProcessesPage Ppage = new StudentProcessesPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ProcessRefund(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void ProcessingScheduledStipend(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentProcessesPage Ppage = new StudentProcessesPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ProcessStipend(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void PrintingLedgerCard(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.LedgerCardPrinting(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void PrintingLedgerCardDetail(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.LedgerCardPrintDetail(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}	
	
	public static void PrintingLedgerCardSummary(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.LedgerCardPrintSummary(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}	
	
	public static void CreatingLetterForEmployer(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Hpage.CreateLetter(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void PrintingEmployerLetter(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentProcessesPage Ppage = new StudentProcessesPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ProcessLetters(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void ConfiguringApplyPaymentFlag(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentSettingsPage SEpage = new StudentSettingsPage();
		BasePage Bpage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.SettingsButton();
			SEpage.ConfigureApplyPayment(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			Bpage.QuitBrowser();
		}
	}
	public static void LedgerCardApplyingCredit(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage LApage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			LApage.ApplyCreditLedger(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			Bpage.QuitBrowser();
		}
	}
	
	public static void SchoolDefinedFiledStudentAccounts(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage SFSpage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SFSpage.AccountSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SchoolDefinedFieldAdmission(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage SFSpage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SFSpage.AdmissionSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SchoolDefinedFieldStudentServices(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage SFSpage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SFSpage.StudentServiceSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void SchoolDefinedFieldHousingStudentServices(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage SFSpage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SFSpage.StudentServiceHousingSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	public static void SchoolDefinedFieldCareerServices(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage SFSpage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SFSpage.CareerServiceSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	
	public static void SchoolFieldCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSettingsPage Sepage = new StudentSettingsPage();
		BasePage Bpage = new BasePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.SettingsButton();
			Sepage.ConfigureSchoolDefinedFields(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AddingHousingApplication(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Sepage = new StudentStudentPage();
		StudentAccountSchoolFieldsPage Spage = new StudentAccountSchoolFieldsPage();
		BasePage Bpage = new BasePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Spage.AddingHousingApplication(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	

	public static void TaskTemplateCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.CreateTaskTemplate(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	
	public static void DocumentTypeCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);---this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.CreateDocumetType(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AddingDocumenttoStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);--this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Spage.AddDocumentToStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AddingDocumentListtoStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);--this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Spage.AddDocumentListToStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
 
	public static void DocumentScheduleCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);---this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.CreateDocumetSchedule(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void DocumentPolicyCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentSettingsPage Spage = new StudentSettingsPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);---this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.SettingsButton();
			Spage.ConfigureDocumentPolicy(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	public static void SubsidiaryCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.CreateSubsidiary(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			Bpage.QuitBrowser();
		}
	}
	
	public static void FundSourceCreation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Cpage = new StudentStudentPage();
		StudentFinancialAidPage Fpage = new StudentFinancialAidPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);---this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Fpage.CreatingFundSource(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void PostAPayment(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Cpage = new StudentStudentPage();
		StudentStudentAccountsPage Spage = new StudentStudentAccountsPage();
		BasePage Bpage = new BasePage();
		try {
			//Lpage.login(data);---this is used for DTS
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Spage.LedgerPaymentPage(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
		    Bpage.QuitBrowser();
		}
	}
	
	public static void AdjustingLedgerTransactionReturnCheck(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentStudentPage Spage = new StudentStudentPage();
		StudentLedgerAccountPage SBpage = new StudentLedgerAccountPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			SBpage.AdjustLedgerTransactionReturnedCheck(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    Bpage.QuitBrowser();
		}
	}

}

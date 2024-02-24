package com.StudentPortal.Businessflow;

import com.StudentPortal.Pages.PlacestudentsintoaninternshipPosition;
import com.StudentPortal.Pages.StudentAccountSchoolFieldsPage;
import com.StudentPortal.Pages.StudentConfigurationPage;
import com.StudentPortal.Pages.StudentHomePage;
import com.StudentPortal.Pages.StudentLoginPage;
import com.StudentPortal.Pages.StudentLoginPage2;
import com.StudentPortal.Pages.StudentMainPage;
import com.StudentPortal.Pages.StudentProcessessPage;
import com.StudentPortal.Pages.StudentTasksPage;
import com.framework.base.BasePage;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;


//import com.StudentPortal.Pages.StudentLoginPage;

public class StudentFlows {
	
	public static void AddTasksToAStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
    		Mpage.AddTasks(data);					
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void ConfirmPendingTasksToAStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.ConfirmPendingTasks(data);
						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void ConfirmPendingTasksForStaff(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentTasksPage TPage = new StudentTasksPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.TaskButton();			
			TPage.ConfirmPendingTasksForStaff(data);			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void EditPendingTasksByStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.EditTasks(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void EditPendingTasksByStaff(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentTasksPage TPage = new StudentTasksPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.TaskButton();
			TPage.EditTaskByStaff(data);
		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void CloseTheTasksFromStaff(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.CloseTask(data);
			//TPage.ConfirmPendingTasksForStaff(data);						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void UpdateAdminRepForStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);	
			Mpage.UpdatingAdminRep(data);
			//TPage.ConfirmPendingTasksForStaff(data);			
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void UpdateAdminRepInBatch(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.UpdateAdminRepInABatch(data);			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void PerformRevenueRecognition(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.QueueRevenueRecognition(data);			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void AddSMSServiceProvider(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage BPage = new BasePage();
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.AddSMSServiceProvider(data);
		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void VerifySMSConfiguration(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.VerifySMSConfiguration(data);
					
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void AddSchoolFields(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentAccountSchoolFieldsPage Mpage = new StudentAccountSchoolFieldsPage();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.FinancialAidSchoolField(data);
					
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void AddNewEmployers(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.AddNewEmployer(data);
				
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void ApproveUnapprovedAid(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();	
		BasePage BPage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ApproveUnapprovedAid(data);
		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
		
	public static void ScheduleStudentPaymentPlan(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.ScheduleStudentPaymentPlan(data);
				
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void ConfigurePromissoryNote(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentConfigurationPage Cpage = new StudentConfigurationPage();
		BasePage BPage = new BasePage();
		
		
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			Cpage.ConfigurePromissoryNote(data);
		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void AddPromissoryNoteToAStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();		
		BasePage BPage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.AddPromissoryNote(data);		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void PerformRefundCalculation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.PerformRefundCalculation(data);			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void PlaceStudentsIntoExternshipPosition(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		PlacestudentsintoaninternshipPosition Ipage = new PlacestudentsintoaninternshipPosition();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Ipage.PlaceInternshipPosition(data);			
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void AddEstimatedFAPackaging(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.AddEstimatedFAPackaging(data);
						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
		
	public static void VerifyAcademicYearsInformation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.VerifyAcademicYearsInformation(data);
						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void PostFederalWorkStudyDisbursements(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.PostFederalWorkDisbursements(data);
					
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void EditAwardInformation(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
				
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.EditAwardInformation(data);
						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   // Lpage.logOut();
		   BPage.QuitBrowser();
		}
	}
	
	public static void VerifyAwardUpdate(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.VerifyAwardUpdate(data);
						
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void ReleaseToGL(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ReleaseToGeneralLedger(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	public static void ApproveFADisbursements(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessessPage Ppage = new StudentProcessessPage();
		BasePage BPage = new BasePage();
			
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Ppage.ApproveFADisbursements(data);
			
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
	
	public static void AddBillableServices(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.AddBillableServices(data);

		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			//Lpage.logOut();
			BPage.QuitBrowser();
		}
	}

	public static void AddAthletics(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.AddAthletics(data);

		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			//Lpage.logOut();
			BPage.QuitBrowser();
		}
	}


	public static void AddAccomodations(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentMainPage Mpage = new StudentMainPage();
		BasePage BPage = new BasePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			Mpage.AddAccomodations(data);

		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		finally {
			//Lpage.logOut();
			BPage.QuitBrowser();
		}
	}
	
}






package com.StudentPortal.Businessflow;


import com.StudentPortal.Pages.PlacestudentsintoaninternshipPosition;
import com.StudentPortal.Pages.StudentAcademicRecordsPage;
import com.StudentPortal.Pages.StudentAdmissionsPage;
import com.StudentPortal.Pages.StudentCareerServices;
import com.StudentPortal.Pages.StudentConfigurationPage;
import com.StudentPortal.Pages.StudentContactManagerPage;
import com.StudentPortal.Pages.StudentCoursePage;
import com.StudentPortal.Pages.StudentFinancialAidPage;
import com.StudentPortal.Pages.StudentGroupPage;
import com.StudentPortal.Pages.StudentHomePage;
import com.StudentPortal.Pages.StudentLedgerAccountPage;
import com.StudentPortal.Pages.StudentLoginPage;
import com.StudentPortal.Pages.StudentLoginPage2;
import com.StudentPortal.Pages.StudentMainPage;
import com.StudentPortal.Pages.StudentProcessesPage;
import com.StudentPortal.Pages.StudentStudentAccountsPage;
import com.StudentPortal.Pages.StudentStudentPage;
import com.StudentPortal.Pages.StudentStudentServicesPage;
import com.framework.base.BasePage;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentTestFlow {
	
public static void StudentApplicationFlow(StringHash data) throws Exception {
		
		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		StudentAdmissionsPage SApage = new StudentAdmissionsPage();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			SApage.CreateStudentApplication(data);
		}
		
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, " Script Failed due to unhandled Exception " + e.getMessage());
		}
		 finally 
		 {
			 Bpage.QuitBrowser();
		 }
		/*{
			    Lpage.logOut();
			}
		*/
		}

public static void PlacementsIntoJob(StringHash data) throws Exception {
	
	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	StudentCareerServices PIpage= new StudentCareerServices();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		PIpage.AddStudentIntoJob(data);
	}
	
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, " Script Failed due to unhandled Exception " + e.getMessage());
	}
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}
	public static void GraduateInternship(StringHash data) throws Exception {
		
		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		PlacestudentsintoaninternshipPosition PIpage= new PlacestudentsintoaninternshipPosition();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PIpage.PlaceInternshipPosition(data);
		}
		
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, " Script Failed due to unhandled Exception " + e.getMessage());
		}
		
		 finally 
		 {
			 Bpage.QuitBrowser();
		 }
		/*{
			    Lpage.logOut();
			}
		*/
		}

	public static void GraduateExternship(StringHash data) throws Exception {
		
		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		PlacestudentsintoaninternshipPosition PIpage= new PlacestudentsintoaninternshipPosition();
		BasePage Bpage = new BasePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PIpage.PlaceInternshipPosition(data);
		}
		
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, " Script Failed due to unhandled Exception " + e.getMessage());
		}
		
		 finally 
		 {
			 Bpage.QuitBrowser();
		 }
		/*{
			    Lpage.logOut();
			}
		*/
		}

public static void AddCourseToStudent(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.AddCourseToStudentSchedule(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}
public static void RegisterCourseToStudent(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentCoursePage Mpage = new StudentCoursePage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.CourseRegistrationForStudent(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void DropCourseFromStudentSchedule(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.DropCourse(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void ReinstateFlow(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.ReinstateCoursePage(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void DeleteCourse(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.DeleteCourse(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void RecordIndividualAttendence(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.IndividualAttendence(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void RecordIndividualFinalGrades(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.individualFinalGradesPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}
	
public static void RecordBatchAttendance(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage  Hpage = new StudentHomePage();
		StudentProcessesPage Mpage = new StudentProcessesPage();
		BasePage Bpage = new BasePage();
		
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();	
			Mpage.BatchAttendancePage(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
		 finally 
		 {
			 Bpage.QuitBrowser();
		 }
		/*{
			    Lpage.logOut();
			}
		*/
		}

public static void RecordBatchFinalGrades(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentProcessesPage Mpage = new StudentProcessesPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ProcessesButton();
		Mpage.BatchFinalGradesPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void PerformStatusChanges(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.StatusChangePage(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

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

public static void CloseTaskContactManager(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentContactManagerPage Mpage = new StudentContactManagerPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.CloseTask(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void PostChargeforStudent(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentLedgerAccountPage Mpage = new StudentLedgerAccountPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.LedgerCardPostCharge(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void PostRefundforStudent(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentAccountsPage Mpage = new StudentStudentAccountsPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.NewLedgerRefund(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void FAReassignment(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentFinancialAidPage Mpage = new StudentFinancialAidPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.FinancialAidReassignment(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void TransferCredits(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();
		Hpage.SearchStudent1(data);
		Mpage.TransferCreditsPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void VerifySAP(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentProcessesPage Mpage = new StudentProcessesPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ProcessesButton();
		Mpage.SAPCalculationPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void FADocument(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentPage Spage = new StudentStudentPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Spage.AddDocumentToStudent(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void FADocumentList(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentPage Spage = new StudentStudentPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Spage.AddDocumentListToStudent(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}


public static void ApproveDisbursementToPay(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentProcessesPage Mpage = new StudentProcessesPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ProcessesButton();
		Mpage.ApproveDisbursementPage(data);
		
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void AcademicYear(StringHash data) throws Exception {
	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	StudentFinancialAidPage AYCreation = new StudentFinancialAidPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		AYCreation.AcademicYearPage(data);
	}
	catch(Exception e)
	{
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to unhandled exception" + e.getMessage());
	}
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void StipedSchedule(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentLedgerAccountPage Mpage = new StudentLedgerAccountPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.ScheduleStipend(data);
		
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void StudentGroupCreations(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.CreateStudentGroup(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
}
public static void StudentGroupCreation(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.StudentGroupCreationPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
/*{
	    Lpage.logOut();
	}
*/
}

public static void AddStudentToStudentGroup(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.AddStudentToGroupPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
/*{
	    Lpage.logOut();
	}
*/
}

public static void RegistrationLocksCreation(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.CreateRegistrationLocksPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
/*{
	    Lpage.logOut();
	}
*/
}

public static void LedgerPayment(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentAccountsPage Mpage = new StudentStudentAccountsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.LedgerPaymentPage(data);
		
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void LedgerFADisbursement(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentAccountsPage Mpage = new StudentStudentAccountsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.LedgerFADisbursementPage(data);
		
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void PrintAwardSummary(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentFinancialAidPage Mpage = new StudentFinancialAidPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.PrintAwardSummaryPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void PerformProgramChange(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.ProgramChangePage(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void FundSourceCreation(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
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

public static void VerifyDisbursementData(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentFinancialAidPage Mpage = new StudentFinancialAidPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.VerifyDisbursementDataPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void VerifyMinimumRegistrationLimit(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.verifyMinimumLimitPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void VerifyMaximumRegistrationLimit(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.verifyMaximumLimitPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void VerifyScheduleRegistrationLock(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.VerifyScheduleLockPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void deleteStudentGroup(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.StudentGroupDeletionPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
/*{
	    Lpage.logOut();
	}
*/
}

public static void AddCollegeFlow(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentConfigurationPage Mpage = new StudentConfigurationPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ConfigurationButton();
//		Mpage.AddCollegePage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void AddCollegeCourseFlow(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentConfigurationPage Mpage = new StudentConfigurationPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ConfigurationButton();
//		Mpage.AddCollegeCoursePage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void HousingDepositsFlow(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentStudentServicesPage Mpage = new StudentStudentServicesPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();
		Hpage.SearchStudent1(data);
		Mpage.HousingDepositPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}

public static void UpdateSchoolFieldsFlow(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentProcessesPage Mpage = new StudentProcessesPage();
	BasePage Bpage = new BasePage();
	
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ProcessesButton();
		Mpage.UpdateSchoolFieldsPage(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	 finally 
	 {
		 Bpage.QuitBrowser();
	 }
	/*{
		    Lpage.logOut();
		}
	*/
	}
public static void StudentGroupCreation1(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage  Hpage = new StudentHomePage();
	StudentGroupPage Mpage = new StudentGroupPage();
	BasePage Bpage = new BasePage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Mpage.CreateStudentGroup(data);	
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
	
 finally 
 {
	 Bpage.QuitBrowser();
 }
}
}

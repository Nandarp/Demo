package com.StudentPortal.Businessflow;

import com.StudentPortal.Pages.PlacestudentsintoaninternshipPosition;
import com.StudentPortal.Pages.StudentAcademicRecordsPage;
import com.StudentPortal.Pages.StudentAccountSchoolFieldsPage;
import com.StudentPortal.Pages.StudentClassSchedulingPage;
import com.StudentPortal.Pages.StudentConfigurationPage;
import com.StudentPortal.Pages.StudentCoursePage;
import com.StudentPortal.Pages.StudentDegreeCreation;
import com.StudentPortal.Pages.StudentGradebookPage;
import com.StudentPortal.Pages.StudentGroupPage;
import com.StudentPortal.Pages.StudentHomePage;
import com.StudentPortal.Pages.StudentLoginPage;
import com.StudentPortal.Pages.StudentLoginPage2;
import com.StudentPortal.Pages.StudentMainPage;
import com.StudentPortal.Pages.StudentSubsidiaryPage;
import com.StudentPortal.Pages.StudentTrackConfiguration;
import com.framework.base.BasePage;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentLoginFlow {
	

public static void CreateStudentGroup(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentGroupPage SGpage = new StudentGroupPage();

		try {
			Lpage.loginLTC(data);
			SGpage.CreateStudentGroup(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	/*finally {
	    	Lpage.logOut();
		}*/
	}

	
public static void PlaceStudentInternshipPosition(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		PlacestudentsintoaninternshipPosition Ipage = new PlacestudentsintoaninternshipPosition();

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
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}
	
public static void CopyClassSched(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentClassSchedulingPage CCpage = new StudentClassSchedulingPage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ClassSchedulingButton();
			CCpage.CopyClassSchedule(data);
		
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
		      Bpage.QuitBrowser();
		}
	}
	
public static void StudentCourse(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentCoursePage Apage = new StudentCoursePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			Apage.AddStudentCourse(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}
	
public static void StudentCourseUnregister(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentCoursePage Upage = new StudentCoursePage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			Upage.CourseUnRegistrationForStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}

public static void DeleteCourse(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentAcademicRecordsPage Mpage = new StudentAcademicRecordsPage();
	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		Mpage.DeleteCoursePage(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	//Lpage.logOut();
      Bpage.QuitBrowser();
	}
}
public static void StudentCourseRegister(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentCoursePage Mpage = new StudentCoursePage();
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
finally {
	//Lpage.logOut();
      Bpage.QuitBrowser();
	}
}

public static void AddCourseSec(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentClassSchedulingPage CUpage = new StudentClassSchedulingPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ClassSchedulingButton();
			CUpage.CreatingClassScheduleUsingExistingTerm(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		   //Lpage.logOut();
		     Bpage.QuitBrowser();
		}
	}
	
public static void SubLedgerPostaCharge(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentSubsidiaryPage CUpage = new StudentSubsidiaryPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			CUpage.SubsidiaryPostCharge(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}
	
public static void EditExistingCourseSec(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentClassSchedulingPage EUpage = new StudentClassSchedulingPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ClassSchedulingButton();
			EUpage.EditClassScheduleUsingExistingCourse(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
		      Bpage.QuitBrowser();
		}
	}
	
public static void StudentEnrollment(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentMainPage Mpage = new StudentMainPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			Mpage.AddingEnrollmentToStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
		      Bpage.QuitBrowser();
		}
	}
	
public static void SubLedgerDelete(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentSubsidiaryPage PDpage = new StudentSubsidiaryPage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PDpage.SubLedgerPostChargeDelete(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}
	
public static void RecordMakeupHourStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentCoursePage PDpage = new StudentCoursePage();
		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PDpage.RecordMakeupHourForStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}
	
public static void BatchStudentRegestrationTrack(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentMainPage Rpage = new StudentMainPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			Rpage.BatchOfStudentRegestrationTrack(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		//Lpage.logOut();
	      Bpage.QuitBrowser();
		}
	}

public static void CreateTrack(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentTrackConfiguration Rpage = new StudentTrackConfiguration();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.GroupsButton();
		Rpage.StudentGroup(data);
		Hpage.MenuButton();
		Hpage.ConfigurationButton();
		Rpage.RegistrationTrackCreation(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	//Lpage.logOut();
      Bpage.QuitBrowser();
	}
}

public static void BatchStudentUnRegestrationTrack(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentMainPage URpage = new StudentMainPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			URpage.BatchOfStudentUnRegistration(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
 }

public static void BatchCourseRegistration(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage URpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.ProcessesButton();
		URpage.BatchOfStudentRegistration(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
}
		
public static void AddDegreeToStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentDegreeCreation ADpage = new StudentDegreeCreation();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			ADpage.AddDegreeForStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	            Bpage.QuitBrowser();
		}

	}
	
public static void AddHonorToStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentDegreeCreation AHpage = new StudentDegreeCreation();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			AHpage.AddHonorForStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}
	
public static void SubTransactionsVoid(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentSubsidiaryPage AVpage = new StudentSubsidiaryPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			AVpage.SubTransactionVoid(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}
	
public static void AddTermHonerandBadge(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentDegreeCreation ATHBpage = new StudentDegreeCreation();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			ATHBpage.AddTermHonorWithBadge(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}
		
public static void ConfirmDocumentSchedule(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentConfigurationPage CDSpage = new StudentConfigurationPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			CDSpage.ConfirmDocumentCarrierServices(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}
	
public static void RecordMidTermGrades(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentGradebookPage RMpage = new StudentGradebookPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ProcessesButton();
			RMpage.RecordMidTermGrades(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}
	
public static void ConfirmSchoolFields(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentAccountSchoolFieldsPage CSpage = new StudentAccountSchoolFieldsPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();
			Hpage.SearchStudent1(data);
			CSpage.AcademicRecordsSchoolField(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
    }
	
public static void StudentTaskConfiguration(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentConfigurationPage TCSpage = new StudentConfigurationPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			TCSpage.StudentTaskTemplateConfiguration(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}

public static void ConfirmTaskConfigurationEmployeeDropdown(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentConfigurationPage TCSpage = new StudentConfigurationPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.ConfigurationButton();
			TCSpage.ConfirmTaskConfigurationForEmployeeDropdown(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		      //Lpage.logOut();
	      	    Bpage.QuitBrowser();
		}
	}

public static void ConfirmTaskConfigurationStudentDropdown(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentConfigurationPage TCSpage = new StudentConfigurationPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		TCSpage.ConfirmTaskConfigurationStudentDropdown(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
}
public static void EditDegreeProgAudit(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentConfigurationPage TSpage = new StudentConfigurationPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			TSpage.DegreeProgressAudit(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    	//Lpage.logOut();
	      		  Bpage.QuitBrowser();
		}
	}
	
public static void ProgrameTransferForStudent(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentMainPage PTpage = new StudentMainPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PTpage.ProgrameTransferToStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
	      	  Bpage.QuitBrowser();
		}
	}

public static void ProgramReEntry(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage PTpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		PTpage.TransferedProgrameReentry(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	    //Lpage.logOut();
      	  Bpage.QuitBrowser();
	}
}
public static void SubPostRefund(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentSubsidiaryPage PRpage = new StudentSubsidiaryPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PRpage.SubPostRefundForStudent(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
	      	  Bpage.QuitBrowser();
		}
	}
	
public static void SubLedgerPostPayment(StringHash data) throws Exception {

		StudentLoginPage2 Lpage = new StudentLoginPage2();
		StudentHomePage Hpage = new StudentHomePage();
		BasePage Bpage = new BasePage();
		StudentSubsidiaryPage PPpage = new StudentSubsidiaryPage();

		try {
			Lpage.loginLTC(data);
			Hpage.MenuButton();
			Hpage.StudentButton();	
			Hpage.SearchStudent1(data);
			PPpage.SubLedgerPostPayment(data);
		} 
		catch (Exception e) {
			TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
		} 
	finally {
		    //Lpage.logOut();
	      	  Bpage.QuitBrowser();
		}
	}  

public static void VeteranConfirmnewinfo(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage VCSpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		VCSpage.VeteranConfirmnewinfoaddedtofield(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
}

public static void IndicatorsConfirmnewinfo(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage ICSpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		ICSpage.IndicatorsConfnewinfocanbeaddtofield(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
}

public static void DeleteIndicatorsConfirmnewinfo(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage DCSpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		DCSpage.DeleteIndicatorsConfirmnewinformationcanbeaddedtofield(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
  }

public static void InternationalConfirmnewinfo(StringHash data) throws Exception {

	StudentLoginPage2 Lpage = new StudentLoginPage2();
	StudentHomePage Hpage = new StudentHomePage();
	BasePage Bpage = new BasePage();
	StudentMainPage ICSpage = new StudentMainPage();

	try {
		Lpage.loginLTC(data);
		Hpage.MenuButton();
		Hpage.StudentButton();	
		Hpage.SearchStudent1(data);
		ICSpage.InternationalConfirmnewinformationcanbeaddedtofield(data);
	} 
	catch (Exception e) {
		TestReportsLog.log(LogStatus.FAIL, "Script Failed due to Unhandled Exception " + e.getMessage());
	} 
finally {
	      //Lpage.logOut();
      	    Bpage.QuitBrowser();
	}
  }
}





    
	

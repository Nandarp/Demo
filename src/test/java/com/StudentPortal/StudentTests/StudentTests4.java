package com.StudentPortal.StudentTests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.StudentPortal.Businessflow.StudentTestFlow;
import com.framework.base.constants.*;
import com.framework.core.AutomationTestPlan;
import com.framework.util.DataUtil;
import com.framework.util.StringHash;
import com.framework.util.TestCaseFields;
import com.framework.util.Xls_Reader;

public class StudentTests4 extends AutomationTestPlan {

	public StudentTests4() {
		xls = new Xls_Reader(FrameworkConstants.PS_DATA_XLS_PATH);
	}

	// Test 1
	@Test(enabled = true, dataProvider = "getData", priority = 1, alwaysRun = true, description = "Test Script to Verify Student Application Creation", testName = "TC831_Student Application Creation")
	@TestCaseFields(testCaseName = "TC831_Student Application Creation")
	public void TC831_Student_Application_Creation(StringHash data) throws Exception {

		StudentTestFlow.StudentApplicationFlow(data);
	}

	// Test 2
	@Test(enabled = true, dataProvider = "getData", priority = 2, alwaysRun = true, description = "Test Script to Enroll a student", testName = "TC248_Place Graduate Student into Internship")
	@TestCaseFields(testCaseName = "TC248_Place Graduate Student into Internship")
	public void TC248_Place_Graduate_Student_Into_Internship(StringHash data) throws Exception {

		StudentTestFlow.GraduateInternship(data);
	}

	// Test 3
	@Test(enabled = true, dataProvider = "getData", priority = 3, alwaysRun = true, description = "Test Script to Enroll a student", testName = "TC267_Place Graduate Student into Externship")
	@TestCaseFields(testCaseName = "TC267_Place Graduate Student into Externship")
	public void TC267_Place_Graduate_Student_Into_Externship(StringHash data) throws Exception {

		StudentTestFlow.GraduateExternship(data);
	}

	// Test 4
	@Test(enabled = true, dataProvider = "getData", priority = 4, alwaysRun = true, description = "Test Script to place students into job", testName = "TC163_Use the Placement wizard to place students into a job")
	@TestCaseFields(testCaseName = "TC163_Use the Placement wizard to place students into a job")
	public void TC163_Place_Student_Into_Job(StringHash data) throws Exception {

		StudentTestFlow.PlacementsIntoJob(data);
	}

	// Test 5
	@Test(enabled = true, dataProvider = "getData", priority = 5, alwaysRun = true, description = "Test Script to post a charge", testName = "TC845_Post a Charge to Student Ledger card")
	@TestCaseFields(testCaseName = "TC845_Post a Charge to Student Ledger card")
	public void TC845_Post_Charge(StringHash data) throws Exception {

		StudentTestFlow.PostChargeforStudent(data);
	}

	// Test 6
	@Test(enabled = true, dataProvider = "getData", priority = 6, alwaysRun = true, description = "Test Script to post a payment ", testName = "TC847_Post a Payment for a Student")
	@TestCaseFields(testCaseName = "TC847_Post a Payment for a Student")
	public void TC847_Post_Ledger_Payment(StringHash data) throws Exception {

		StudentTestFlow.LedgerPayment(data);
	}

	// Test 7
	@Test(enabled = true, dataProvider = "getData", priority = 7, alwaysRun = true, description = "Test Script to add Housing deposits", testName = "TC1780_Adding_Housing_Deposits")
	@TestCaseFields(testCaseName = "TC1780_Adding_Housing_Deposits")
	public void TC1780_Housing_Deposits(StringHash data) throws Exception {

		StudentTestFlow.HousingDepositsFlow(data);
	}

	// Test 8
	@Test(enabled = true, dataProvider = "getData", priority = 8, alwaysRun = true, description = "Test Script to post a refund directly to Ledger Card", testName = "TC844_Post Refund(directly to Ledger Card)")
	@TestCaseFields(testCaseName = "TC844_Post Refund(directly to Ledger Card)")
	public void TC844_Post_Refund(StringHash data) throws Exception {

		StudentTestFlow.PostRefundforStudent(data);
	}

	// Test 9
	@Test(enabled = true, dataProvider = "getData", priority = 9, alwaysRun = true, description = "Test Script to post enter transfer credits", testName = "TC835_Enter Transfer Credits")
	@TestCaseFields(testCaseName = "TC835_Enter Transfer Credits")
	public void TC835_Enter_Transfer_Credits(StringHash data) throws Exception {

		StudentTestFlow.TransferCredits(data);
	}

	// Test 10
	@Test(enabled = true, dataProvider = "getData", priority = 10, alwaysRun = true, description = "Test Script to add FA document", testName = "TC216_FA Documents to Individual Students")
	@TestCaseFields(testCaseName = "TC216_FA Documents to Individual Students")
	public void TC216_FADocuments_To_Individual_Students(StringHash data) throws Exception {

		StudentTestFlow.FADocument(data);
	}

	// Test 11
	@Test(enabled = true, dataProvider = "getData", priority = 11, alwaysRun = true, description = "Test Script to add FA document List", testName = "TC216_FA Document List to Individual Students")
	@TestCaseFields(testCaseName = "TC216_FA Document List to Individual Students")
	public void TC216_FADocumentList_To_Individual_Students(StringHash data) throws Exception {

		StudentTestFlow.FADocumentList(data);
	}

	// Test 12
	@Test(enabled = true, dataProvider = "getData", priority = 12, alwaysRun = true, description = "Test Script to change student status", testName = "TC840_Perform Status Changes")
	@TestCaseFields(testCaseName = "TC840_Perform Status Changes")
	public void TC840_Student_Status_Change(StringHash data) throws Exception {

		StudentTestFlow.PerformStatusChanges(data);
	}

	// Test 13
	@Test(enabled = true, dataProvider = "getData", priority = 13, alwaysRun = true, description = "Test Script to perform Program Change", testName = "TC223_Perform a Program Change for a Student")
	@TestCaseFields(testCaseName = "TC223_Perform a Program Change for a Student")
	public void TC223_Perform_Program_Change(StringHash data) throws Exception {

		StudentTestFlow.PerformProgramChange(data);
	}

	// Test 14
	@Test(enabled = true, dataProvider = "getData", priority = 14, alwaysRun = true, description = "Test Script to post attendance in a batch", testName = "TC839_Record batch attendance for a course")
	@TestCaseFields(testCaseName = "TC839_Record batch attendance for a course")
	public void TC839_Record_Batch_Attendance(StringHash data) throws Exception {

		StudentTestFlow.RecordBatchAttendance(data);
	}

	// Test 15
	@Test(enabled = true, dataProvider = "getData", priority = 15, alwaysRun = true, description = "Test Script to post final grades in a batch", testName = "TC837_Record batch Final Grades for a course")
	@TestCaseFields(testCaseName = "TC837_Record batch Final Grades for a course")
	public void TC837_Record_Batch_FinalGrades(StringHash data) throws Exception {

		StudentTestFlow.RecordBatchFinalGrades(data);
	}

	// Test 16
	@Test(enabled = true, dataProvider = "getData", priority = 16, alwaysRun = true, description = "Test Script to verify SAP calculation", testName = "TC841_Verify SAP")
	@TestCaseFields(testCaseName = "TC841_Verify SAP")
	public void TC841_SAP_Calculation(StringHash data) throws Exception {

		StudentTestFlow.VerifySAP(data);
	}

	// Test 17
	@Test(enabled = true, dataProvider = "getData", priority = 17, alwaysRun = true, description = "Test Script to verufy Disbursement Approval Criteria ", testName = "TC843_Verify Disbursement Approval Criteria is configured accurately")
	@TestCaseFields(testCaseName = "TC843_Verify Disbursement Approval Criteria is configured accurately")
	public void TC843_Verify_Disbursement_Approval_Criteria(StringHash data) throws Exception {

		StudentTestFlow.ApproveDisbursementToPay(data);
	}

	// Test 18-- *Prerequisite script*
	@Test(enabled = true, dataProvider = "getData", priority = 18, alwaysRun = true, description = "Test Script to add Course To Student Schedule", testName = "Add Course To Student Schedule")
	@TestCaseFields(testCaseName = "Add Course To Student Schedule")
	public void Add_Course_To_Student_Schedule(StringHash data) throws Exception {

		StudentTestFlow.AddCourseToStudent(data);
	}

	// Test 19
	@Test(enabled = true, dataProvider = "getData", priority = 19, alwaysRun = true, description = "Test Script to register a course", testName = "TC833_Register a course to the enrolled student")
	@TestCaseFields(testCaseName = "TC833_Register a course to the enrolled student")
	public void TC833_Register_Course(StringHash data) throws Exception {

		StudentTestFlow.RegisterCourseToStudent(data);
	}

	// Test 20
	@Test(enabled = true, dataProvider = "getData", priority = 20, alwaysRun = true, description = "Test Script to drop a course", testName = "TC834_Drop a course from the student schedule")
	@TestCaseFields(testCaseName = "TC834_Drop a course from the student schedule")
	public void TC834_Drop_Course(StringHash data) throws Exception {

		StudentTestFlow.DropCourseFromStudentSchedule(data);
	}

	// Test 21
	@Test(enabled = true, dataProvider = "getData", priority = 21, alwaysRun = true, description = "Test Script to reinstate course", testName = "Reinstate Course")
	@TestCaseFields(testCaseName = "Reinstate Course")
	public void ReInstate_Course(StringHash data) throws Exception {

		StudentTestFlow.ReinstateFlow(data);
	}

	// Test 22
	@Test(enabled = true, dataProvider = "getData", priority = 22, alwaysRun = true, description = "Test Script to post Individual Attendence for Students", testName = "TC838_Record individual attendance for students")
	@TestCaseFields(testCaseName = "TC838_Record individual attendance for students")
	public void TC838_Record_Individual_Attendance(StringHash data) throws Exception {

		StudentTestFlow.RecordIndividualAttendence(data);
	}

	// Test 23
	@Test(enabled = true, dataProvider = "getData", priority = 23, alwaysRun = true, description = "Test Script to post Individual Final Grades for Students", testName = "TC836_Record individual final grades for a student")
	@TestCaseFields(testCaseName = "TC836_Record individual final grades for a student")
	public void TC836_Record_Individual_FinalGrades(StringHash data) throws Exception {

		StudentTestFlow.RecordIndividualFinalGrades(data);
	}

	// Test 24 -- CleanUp script
	@Test(enabled = true, dataProvider = "getData", priority = 24, alwaysRun = true, description = "Test Script to Delete Course from Student Courses", testName = "Delete Course from Student Courses")
	@TestCaseFields(testCaseName = "Delete Course from Student Courses")
	public void Delete_Course_From_StudentCourses(StringHash data) throws Exception {

		StudentTestFlow.DeleteCourse(data);
	}

	// Test 25
	@Test(enabled = true, dataProvider = "getData", priority = 25, alwaysRun = true, description = "Test Script to add tasks to student", testName = "Contact Manager Task Creation")
	@TestCaseFields(testCaseName = "Contact Manager Task Creation")
	public void TC879_Add_Task_To_Student(StringHash data) throws Exception {

		StudentTestFlow.AddTasksToAStudent(data);
	}

	// Test 26
	@Test(enabled = true, dataProvider = "getData", priority = 26, alwaysRun = true, description = "Test Script to close the task", testName = "TC203_Contact Manager Task Close")
	@TestCaseFields(testCaseName = "TC203_Contact Manager Task Close")
	public void TC203_Student_Task_Close(StringHash data) throws Exception {

		StudentTestFlow.CloseTaskContactManager(data);
	}

	// Test 27
	@Test(enabled = true, dataProvider = "getData", priority = 27, alwaysRun = true, description = "Creation of fund source", testName = "Create Fund Source")
	@TestCaseFields(testCaseName = "Create Fund Source")
	public void Create_Fund_Source(StringHash data) throws Exception {

		StudentTestFlow.FundSourceCreation(data);
	}

	// Test 28
	@Test(enabled = true, dataProvider = "getData", priority = 28, alwaysRun = true, description = "Test Script to print Awards Summary", testName = "TC209_Summary document can be printed for individual students")
	@TestCaseFields(testCaseName = "TC209_Summary document can be printed for individual students")
	public void TC209_Print_Award_Summary(StringHash data) throws Exception {

		StudentTestFlow.PrintAwardSummary(data);
	}

	// Test 29
	@Test(enabled = true, dataProvider = "getData", priority = 29, alwaysRun = true, description = "Test Script to post an FA Disburdement", testName = "TC848_Post an FA Disbursement for a Student")
	@TestCaseFields(testCaseName = "TC848_Post an FA Disbursement for a Student")
	public void TC848_Post_FADisbursement(StringHash data) throws Exception {

		StudentTestFlow.LedgerFADisbursement(data);
	}

	// Test 30
	@Test(enabled = true, dataProvider = "getData", priority = 30, alwaysRun = true, description = "Test Script to verify the disbursement data", testName = "TC848_1_Verify Disbursement Data")
	@TestCaseFields(testCaseName = "TC848_1_Verify Disbursement Data")
	public void TC848_1_Verify_DisbursementData(StringHash data) throws Exception {

		StudentTestFlow.VerifyDisbursementData(data);
	}

	// Test 31
	@Test(enabled = true, dataProvider = "getData", priority = 31, alwaysRun = true, description = "Test Script to schedule a stipend ", testName = "TC846_Schedule a Stipend for a student")
	@TestCaseFields(testCaseName = "TC846_Schedule a Stipend for a student")
	public void TC846_Schedule_Stipend(StringHash data) throws Exception {

		StudentTestFlow.StipedSchedule(data);
	}

	// Test 32
	@Test(enabled = true, dataProvider = "getData", priority = 32, alwaysRun = true, description = "Test Script to reassign FA to other Academic year", testName = "TC194_Reassignment of FA to Other Academic year")
	@TestCaseFields(testCaseName = "TC194_Reassignment of FA to Other Academic year")
	public void TC194_Reassignment_FA_To_OtherAY(StringHash data) throws Exception {

		StudentTestFlow.FAReassignment(data);
	}

	// Test 33
	@Test(enabled = true, dataProvider = "getData", priority = 33, alwaysRun = true, description = "Test Script to create a student group ", testName = "TC1924_1_Process_Test_Student_Groups")
	@TestCaseFields(testCaseName = "TC1924_1_Process_Test_Student_Groups")
	public void TC1924_1_Process_Student_Groups(StringHash data) throws Exception {

		StudentTestFlow.StudentGroupCreation1(data);
	}

	// Test 34
	@Test(enabled = true, dataProvider = "getData", priority = 34, alwaysRun = true, description = "Test Script to update school fields ", testName = "TC1924_2_Update_School_Fields")
	@TestCaseFields(testCaseName = "TC1924_2_Update_School_Fields")
	public void TC1924_2_Update_School_Fields(StringHash data) throws Exception {

		StudentTestFlow.UpdateSchoolFieldsFlow(data);
	}

	// Test 35
	@Test(enabled = true, dataProvider = "getData", priority = 35, alwaysRun = true, description = "Test Script to create a student group ", testName = "TC234_1_Verify Registration Locks_Create a Student Group")
	@TestCaseFields(testCaseName = "TC234_1_Verify Registration Locks_Create a Student Group")
	public void TC234_1_Create_Student_Group(StringHash data) throws Exception {

		StudentTestFlow.StudentGroupCreation(data);
	}

	// Test 36
	@Test(enabled = true, dataProvider = "getData", priority = 36, alwaysRun = true, description = "Test Script to add Student to a Group ", testName = "TC234_2_Add Student to a Group")
	@TestCaseFields(testCaseName = "TC234_2_Add Student to a Group")
	public void TC234_2_Add_Student_To_Group(StringHash data) throws Exception {

		StudentTestFlow.AddStudentToStudentGroup(data);
	}

	// Test 37
	@Test(enabled = true, dataProvider = "getData", priority = 37, alwaysRun = true, description = "Test Script to create Registration locks ", testName = "TC234_3_Create Registration locks for a Student Group")
	@TestCaseFields(testCaseName = "TC234_3_Create Registration locks for a Student Group")
	public void TC234_3_Create_Registration_Locks(StringHash data) throws Exception {

		StudentTestFlow.RegistrationLocksCreation(data);
	}

	// Test 38
	@Test(enabled = true, dataProvider = "getData", priority = 38, alwaysRun = true, description = "Test Script to verify minimum limit", testName = "TC234_5_Verify Minimum Limit Registration Lock")
	@TestCaseFields(testCaseName = "TC234_5_Verify Minimum Limit Registration Lock")
	public void TC234_5_Verify_MinimumLimit_RegistrationLock(StringHash data) throws Exception {

		StudentTestFlow.VerifyMinimumRegistrationLimit(data);
	}

	// Test 39
	@Test(enabled = true, dataProvider = "getData", priority = 39, alwaysRun = true, description = "Test Script to verify maximum limit", testName = "TC234_4_Verify Maximum Limit Registration Lock")
	@TestCaseFields(testCaseName = "TC234_4_Verify Maximum Limit Registration Lock")
	public void TC234_4_Verify_MaximumLimit_RegistrationLock(StringHash data) throws Exception {

		StudentTestFlow.VerifyMaximumRegistrationLimit(data);
	}

	// Test 40
	@Test(enabled = true, dataProvider = "getData", priority = 40, alwaysRun = true, description = "Test Script to verify schedule limit", testName = "TC234_6_Verify Schedule Registration Lock")
	@TestCaseFields(testCaseName = "TC234_6_Verify Schedule Registration Lock")
	public void TC234_6_Verify_Schedule_Registration_Lock(StringHash data) throws Exception {

		StudentTestFlow.VerifyScheduleRegistrationLock(data);
	}

	// Test 41
	@Test(enabled = true, dataProvider = "getData", priority = 41, alwaysRun = true, description = "Test Script to delete Student Group", testName = "Delete Student Group")
	@TestCaseFields(testCaseName = "Delete Student Group")
	public void Delete_Student_Group(StringHash data) throws Exception {

		StudentTestFlow.deleteStudentGroup(data);
	}

	// Test 42 -- *Prerequisite script*
	@Test(enabled = true, dataProvider = "getData", priority = 42, alwaysRun = true, description = "Test Script to create Academic Year", testName = "Creation of Academic Year")
	@TestCaseFields(testCaseName = "Creation of Academic Year")
	public void Creation_Of_AcademicYear(StringHash data) throws Exception {

		StudentTestFlow.AcademicYear(data);
	}

	// Test 43 -- *Prerequisite script*
	@Test(enabled = true, dataProvider = "getData", priority = 43, alwaysRun = true, description = "Test Script to add colleges", testName = "Add College")
	@TestCaseFields(testCaseName = "Add College")
	public void Add_College(StringHash data) throws Exception {

		StudentTestFlow.AddCollegeFlow(data);
	}

	// Test 44-- *Prerequisite script*
	@Test(enabled = true, dataProvider = "getData", priority = 44, alwaysRun = true, description = "Test Script to add college course", testName = "Add College Course")
	@TestCaseFields(testCaseName = "Add College Course")
	public void Add_College_Course(StringHash data) throws Exception {

		StudentTestFlow.AddCollegeCourseFlow(data);
	}

	@DataProvider
	public Object[][] getData(Method method) {

		return DataUtil.getData(xls, method.getAnnotation(TestCaseFields.class).testCaseName());
	}
}
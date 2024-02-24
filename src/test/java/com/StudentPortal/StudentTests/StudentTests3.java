package com.StudentPortal.StudentTests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.StudentPortal.Businessflow.StudentFlows;
import com.StudentPortal.Businessflow.StudentLoginFlow;
import com.framework.base.constants.FrameworkConstants;
import com.framework.core.AutomationTestPlan;
import com.framework.util.DataUtil;
import com.framework.util.StringHash;
import com.framework.util.TestCaseFields;
import com.framework.util.Xls_Reader;

public class StudentTests3 extends AutomationTestPlan {

	public StudentTests3() {
		xls = new Xls_Reader(FrameworkConstants.PS_DATA_XLS_PATH);
	}

	@Test(enabled = true, dataProvider = "getData", priority = 14, alwaysRun = true, description = "Test Script to place students in Externship position", testName = "Place students into an externship Position")
	@TestCaseFields(testCaseName = "Place students into an externship Position")
	public void TC893_1_PLace_Students_Into_ExternshipPosition(StringHash data) throws Exception {

		StudentLoginFlow.PlaceStudentInternshipPosition(data);
	}
	
//Test 9 - Place students into an intern ship Position

	@Test(enabled = true, dataProvider = "getData", priority = 1, alwaysRun = true, description = "Test Script to Place students intoaninternship Position", testName = "Place students into an internship Position")
	@TestCaseFields(testCaseName = "Place students into an internship Position")
	public void TC893_2_Place_Student_Into_InternshipPosition(StringHash data) throws Exception {

		StudentLoginFlow.PlaceStudentInternshipPosition(data);

	}


//Test 10 - Ability to add a course section

	@Test(enabled = true, dataProvider = "getData", priority = 2, alwaysRun = true, description = "Test Script to Ability to add a course section", testName = "Ability to add a course section")
	@TestCaseFields(testCaseName = "Ability to add a course section")
	public void TC895_1_Ability_to_Add_Course_Section(StringHash data) throws Exception {

		StudentLoginFlow.AddCourseSec(data);

	}

//Test 11 - Edit existing course sections on the Master Schedule.

	@Test(enabled = true, dataProvider = "getData", priority = 3, alwaysRun = true, description = "Test Script to Edit existing course sections on the Master Schedule", testName = "Edit existing course sections on the Master Schedule")
	@TestCaseFields(testCaseName = "Edit existing course sections on the Master Schedule")
	public void TC895_2_Edit_Existing_course_section(StringHash data) throws Exception {

		StudentLoginFlow.EditExistingCourseSec(data);

	}

//Test 12 - Copy Class Schedule

	@Test(enabled = true, dataProvider = "getData", priority = 4, alwaysRun = true, description = "Test Script to Copy Class Schedule", testName = "Copy Class Schedule")
	@TestCaseFields(testCaseName = "Copy Class Schedule")
	public void TC908_Copy_Class_Schedule(StringHash data) throws Exception {

		StudentLoginFlow.CopyClassSched(data);

	}

//Test 13 - Add an enrollment for a student

	@Test(enabled = true, dataProvider = "getData", priority = 5, alwaysRun = true, description = "Test Script to Add an enrollment for a student", testName = "Add an enrollment for a student")
	@TestCaseFields(testCaseName = "Add an enrollment for a student")
	public void TC898_Add_Enrollment_to_student(StringHash data) throws Exception {

		StudentLoginFlow.StudentEnrollment(data);

	}

//Test 14 - Add a course to a student's schedule

	@Test(enabled = true, dataProvider = "getData", priority = 6, alwaysRun = true, description = "Test Script to Add a course to a students schedule", testName = "Add a course to a student's schedule")
	@TestCaseFields(testCaseName = "Add a course to a student's schedule")
	public void TC897_Add_course_to_students_schedule(StringHash data) throws Exception {

		StudentLoginFlow.StudentCourse(data);

	}

//Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 7, alwaysRun = true, description = "Test Script to Register a course from a students schedule", testName = "Register Couse to Student")
	@TestCaseFields(testCaseName = "Register Couse to Student")
	public void Register_course_from_students_schedule(StringHash data) throws Exception {

		StudentLoginFlow.StudentCourseRegister(data);

	}

//Test 15 - Unregister a course from a student's schedule.

	@Test(enabled = true, dataProvider = "getData", priority = 8, alwaysRun = true, description = "Test Script to Unregister a course from a students schedule", testName = "Unregister a course from a student's schedule")
	@TestCaseFields(testCaseName = "Unregister a course from a student's schedule")
	public void TC896_Unregister_course_from_students_schedule(StringHash data) throws Exception {

		StudentLoginFlow.StudentCourseUnregister(data);

	}

//Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 9, alwaysRun = true, description = "Test Script to Delete Created Course", testName = "Delete Created Course")
	@TestCaseFields(testCaseName = "Delete Created Course")
	public void Delete_Created_Course(StringHash data) throws Exception {

		StudentLoginFlow.DeleteCourse(data);

	}

//Test 16 - Record makeup hours for a student

	@Test(enabled = true, dataProvider = "getData", priority = 10, alwaysRun = true, description = "Test Script to Record makeup hours for a student", testName = "Record makeup hours for a student")
	@TestCaseFields(testCaseName = "Record makeup hours for a student")
	public void TC901_Record_makeup_hours_for_student(StringHash data) throws Exception {

		StudentLoginFlow.RecordMakeupHourStudent(data);

	}

//Test 17 - Edit Degree Progress Audit

	@Test(enabled = true, dataProvider = "getData", priority = 11, alwaysRun = true, description = "Test Script to Edit Degree Progress Audit", testName = "Edit Degree Progress Audit")
	@TestCaseFields(testCaseName = "Edit Degree Progress Audit")
	public void TC902_Edit_Degree_Progress_Audit(StringHash data) throws Exception {

		StudentLoginFlow.EditDegreeProgAudit(data);

	}

//Test 18 - Add Degrees to a Student

	@Test(enabled = true, dataProvider = "getData", priority = 12, alwaysRun = true, description = "Test Script to Add Degrees to a Student", testName = "Add Degrees to a Student")
	@TestCaseFields(testCaseName = "Add Degrees to a Student")
	public void TC903_1_Add_Degrees_to_Student(StringHash data) throws Exception {

		StudentLoginFlow.AddDegreeToStudent(data);

	}

//Test 19 - Add Honors to a Student

	@Test(enabled = true, dataProvider = "getData", priority = 13, alwaysRun = true, description = "Test Script to Add Honors to a Student", testName = "Add Honors to a Student")
	@TestCaseFields(testCaseName = "Add Honors to a Student")
	public void TC903_2_Add_Honors_to_Student(StringHash data) throws Exception {

		StudentLoginFlow.AddHonorToStudent(data);

	}

//Test 20 - Add Term Honer and Badges to a Student.

	@Test(enabled = true, dataProvider = "getData", priority = 14, alwaysRun = true, description = "Test Script to Add Term Honer and Badges to a Student", testName = "Add Term Honer and Badges to a Student")
	@TestCaseFields(testCaseName = "Add Term Honer and Badges to a Student")
	public void TC903_3_Add_Term_Honer_and_Badges_to_Student(StringHash data) throws Exception {

		StudentLoginFlow.AddTermHonerandBadge(data);

	}

//Test 21 - Confirm new information can be added to School field(s)

	@Test(enabled = true, dataProvider = "getData", priority = 15, alwaysRun = true, description = "Test Script to Confirm new information can be added to Schoolfield(s)", testName = "Confirm new information can be added to Schoolfield(s)")
	@TestCaseFields(testCaseName = "Confirm new information can be added to School field")
	public void TC904_Confirm_new_information_added_to_Schoolfields(StringHash data) throws Exception {

		StudentLoginFlow.ConfirmSchoolFields(data);

	}

	// Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 16, alwaysRun = true, description = "Test Script to Batch student Track Creation", testName = "Batch student Track Creation")
	@TestCaseFields(testCaseName = "Batch student Track Creation")
	public void Batch_student_Track_Creation(StringHash data) throws Exception {

		StudentLoginFlow.CreateTrack(data);

	}

//Test 22 - Batch Register students in a track

	@Test(enabled = true, dataProvider = "getData", priority = 17, alwaysRun = true, description = "Test Script to Batch Register students in a track", testName = "Batch Register students in a track")
	@TestCaseFields(testCaseName = "Batch Register students in a track")
	public void TC909_Batch_Register_students_in_track(StringHash data) throws Exception {

		StudentLoginFlow.BatchStudentRegestrationTrack(data);

	}

//Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 18, alwaysRun = true, description = "Test Script to Batch Register Course", testName = "Batch Register Course")
	@TestCaseFields(testCaseName = "Batch Register Course")
	public void Batch_Register_Course(StringHash data) throws Exception {

		StudentLoginFlow.BatchCourseRegistration(data);

	}

//Test 23 - Ability to batch unregister courses

	@Test(enabled = true, dataProvider = "getData", priority = 19, alwaysRun = true, description = "Test Script to Ability to batch unregister courses", testName = "Ability to batch unregister courses")
	@TestCaseFields(testCaseName = "Ability to batch unregister courses")
	public void TC918_Ability_to_batch_unregister_courses(StringHash data) throws Exception {

		StudentLoginFlow.BatchStudentUnRegestrationTrack(data);

	}

//Test 24 - Record batch Midterm Grades for a course

	@Test(enabled = true, dataProvider = "getData", priority = 20, alwaysRun = true, description = "Test Script to Record batch Midterm Grades for a course", testName = "Record batch Midterm Grades for a course")
	@TestCaseFields(testCaseName = "Record batch Midterm Grades for a course")
	public void TC921_Record_batch_Midterm_Grades_for_course(StringHash data) throws Exception {

		StudentLoginFlow.RecordMidTermGrades(data);

	}

//Test 25 - Confirm documents have been created and associated with the Career Services module

	@Test(enabled = true, dataProvider = "getData", priority = 21, alwaysRun = true, description = "Test Script to Confirm Documents Created with CareerServices Module", testName = "Confirm Documents Created with CareerServices Module")
	@TestCaseFields(testCaseName = "Confirm Documents Created with CareerServices Module")
	public void TC922_Confirm_documents_created_with_Carrier_Service_module(StringHash data) throws Exception {

		StudentLoginFlow.ConfirmDocumentSchedule(data);

	}

//Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 22, alwaysRun = true, description = "Test Script to Task Need to be Configured With Student and Employer", testName = "Task Need to be Configured With Student and Employer")
	@TestCaseFields(testCaseName = "Task Need to be Configured With Student and Employer")
	public void TC919_Task_to_configured_associating_events_with_Students_and_Employeer(StringHash data)
			throws Exception {

		StudentLoginFlow.StudentTaskConfiguration(data);

	}


//Test 27 - Confirm tasks are available in the Dropdown when working with an employer record. 

	@Test(enabled = true, dataProvider = "getData", priority = 23, alwaysRun = true, description = "Test Script to Confirm Tasks are Available in the Employeer Dropdown", testName = "Confirm Tasks are Available in the Employeer Dropdown")
	@TestCaseFields(testCaseName = "Confirm Tasks are Available in the Employeer Dropdown")
	public void TC919_2_Confirm_Configured_Task_Available_in_Employeer_Dropdown(StringHash data) throws Exception {

		StudentLoginFlow.ConfirmTaskConfigurationEmployeeDropdown(data);

	}
	
//Test 26 - Confirm tasks are available in the Dropdown when working with an student record. 

		@Test(enabled = true, dataProvider = "getData", priority = 24, alwaysRun = true, description = "Test Script to Confirm Tasks are Available in the Student Dropdown", testName = "Confirm Tasks are Available in the Student Dropdown")
		@TestCaseFields(testCaseName = "Confirm Tasks are Available in the Student Dropdown")
		public void TC919_1_Confirm_Configured_Task_Available_in_Student_Dropdown(StringHash data) throws Exception {

			StudentLoginFlow.ConfirmTaskConfigurationStudentDropdown(data);

		}

//Test 28 - Subsidiary Ledger - Post a Charge.

	@Test(enabled = true, dataProvider = "getData", priority = 25, alwaysRun = true, description = "Test Script to Subsidiary Ledger - Post a Charge", testName = "TC77_SubsidiaryLedgerPostaCharge")
	@TestCaseFields(testCaseName = "Subsidiary Ledger - Post a Charge")
	public void TC927_Subsidiary_Ledger_Post_Charge(StringHash data) throws Exception {

		StudentLoginFlow.SubLedgerPostaCharge(data);

	}

//Test 29 - Subsidiary Ledger - Post a Payment.

	@Test(enabled = true, dataProvider = "getData", priority = 26, alwaysRun = true, description = "Test Script to Subsidiary Ledger - Post a Payment", testName = "Subsidiary Ledger - Post a Payment")
	@TestCaseFields(testCaseName = "Subsidiary Ledger - Post a Payment")
	public void TC928_Subsidiary_Ledger_Post_Payment(StringHash data) throws Exception {

		StudentLoginFlow.SubLedgerPostPayment(data);

	}

//Test 30 - Subsidiary Ledger Post a Refund    

	@Test(enabled = true, dataProvider = "getData", priority = 27, alwaysRun = true, description = "Subsidiary Ledger Post a Refund", testName = "Subsidiary Ledger Post a Refund")
	@TestCaseFields(testCaseName = "Subsidiary Ledger Post a Refund")
	public void TC929_Subsidiary_Ledger_Post_Refund(StringHash data) throws Exception {

		StudentLoginFlow.SubPostRefund(data);

	}

//Test 31 - Subsidiary Ledger - Adjust Transaction - Delete  

	@Test(enabled = true, dataProvider = "getData", priority = 28, alwaysRun = true, description = "Test Script to Subsidiary Ledger - Adjust Transaction - Delete", testName = "Subsidiary Ledger - Adjust Transaction - Delete")
	@TestCaseFields(testCaseName = "Subsidiary Ledger - Adjust Transaction - Delete")
	public void TC930_Subsidiary_Ledger_Adjust_Transaction_Delete(StringHash data) throws Exception {

		StudentLoginFlow.SubLedgerDelete(data);

	}

//Test 32 - Subsidiary Ledger Adjust Transaction - Void    

	@Test(enabled = true, dataProvider = "getData", priority = 29, alwaysRun = true, description = "Test Script to Subsidiary Ledger Adjust Transaction - Void", testName = "Subsidiary Ledger Adjust Transaction - Void")
	@TestCaseFields(testCaseName = "Subsidiary Ledger Adjust Transaction - Void")
	public void TC931_Subsidiary_Ledger_Adjust_Transaction_Void(StringHash data) throws Exception {

		StudentLoginFlow.SubTransactionsVoid(data);

	}

//Test 33 - Perform a Program Transfer for a Student

	@Test(enabled = true, dataProvider = "getData", priority = 30, alwaysRun = true, description = "Test Script to Perform a Program Transfer for a Student", testName = "Perform a Program Transfer for a Student")
	@TestCaseFields(testCaseName = "Perform a Program Transfer for a Student")
	public void TC900_Perform_Program_Transfer_to_Student(StringHash data) throws Exception {

		StudentLoginFlow.ProgrameTransferForStudent(data);

	}

//Test * --*Prerequisite script*

	@Test(enabled = true, dataProvider = "getData", priority = 31, alwaysRun = true, description = "Test Script to Program ReEntry", testName = "Program ReEntry")
	@TestCaseFields(testCaseName = "Program ReEntry")
	public void Programe_Reentry(StringHash data) throws Exception {

		StudentLoginFlow.ProgramReEntry(data);

	}

//Test 34 - Veteran- Confirm new information can be added to field(s)  

	@Test(enabled = true, dataProvider = "getData", priority = 32, alwaysRun = true, description = "Test Script to Veteran- Confirm new information can be added to field", testName = "Veteran- Confirm new information can be added to field")
	@TestCaseFields(testCaseName = "Veteran- Confirm new information can be added to field")
	public void TC1760_Veteran_Confirm_new_information_added_to_field(StringHash data) throws Exception {

		StudentLoginFlow.VeteranConfirmnewinfo(data);

	}

//Test 35 - Indicators - Confirm new information can be added to field(s) 

	@Test(enabled = true, dataProvider = "getData", priority = 33, alwaysRun = true, description = "Test Script to SubsidiaryLedgerPostaRefund", testName = "Indicators - Confirm new information can be added to field")
	@TestCaseFields(testCaseName = "Indicators - Confirm new information can be added to field")
	public void TC1762_Indicators_Confirm_new_information_added_to_field(StringHash data) throws Exception {

		StudentLoginFlow.IndicatorsConfirmnewinfo(data);

	}

//...........Prerequisite...........

	@Test(enabled = true, dataProvider = "getData", priority = 34, alwaysRun = true, description = "Test Script to Delete Created Indicators", testName = "Delete Created Indicators")
	@TestCaseFields(testCaseName = "Delete Created Indicators")
	public void TC1762_Delete_Created_Indicators(StringHash data) throws Exception {

		StudentLoginFlow.DeleteIndicatorsConfirmnewinfo(data);
	}

//Test 36 - International - Confirm new information can be added to field(s)

	@Test(enabled = true, dataProvider = "getData", priority = 35, alwaysRun = true, description = "Test Script to International - Confirm new information can be added to field", testName = "International - Confirm new information can be added to field")
	@TestCaseFields(testCaseName = "International - Confirm new information can be added to field")
	public void TC1773_International_Confirm_new_information_added_to_field(StringHash data) throws Exception {

		StudentLoginFlow.InternationalConfirmnewinfo(data);

	}

	@DataProvider
	public Object[][] getData(Method method) {

		return DataUtil.getData(xls, method.getAnnotation(TestCaseFields.class).testCaseName());

	}
}

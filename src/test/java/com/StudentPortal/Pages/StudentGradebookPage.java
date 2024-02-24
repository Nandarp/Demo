package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentGradebookPage extends BaseLocators{ 
	
	static String RstName = AppendValue.apendString();
	static String RstCode = AppendValue.apendString();

	public  StudentGradebookPage RecordMidTermGrades(StringHash data) throws Exception{

		//X-path Parameterization
			Checkbox SelectValue = new Checkbox("SelectValue", byXPath("(//tr//td//input)[1]"));
			Link RecordMidTermGradesSaveMessage = new Link("Record MidTerm Grades Save Message", byXPath("//span[. = 'The Midterm records were successfully saved.']"));	
			Link LetterGrade = new Link("Lettter grade", byXPath("//tr/td[6]"));
			Link SelGrade2 = new Link("Lettergrade", byXPath("//div/div/div[3]/ul/li[1]"));
		    Link LetterGrade1 = new Link("Latergrade", byXPath("//td/span/span/span/span"));
		    Link WarningMessage = new Link("WarningMessage", byXPath("//span[text()='The selected campus is not configured to post midterm grades.']"));
		    
		//Method Implementation
		    SearchProcessess.waitTillElementClickable();
		    SearchProcessess.click();
			wait(2);
			SearchProcessess.clearAndType("Gradebook");
			wait(2);
			Gradebook.click();
			wait(8);
			Midterm.click();
			wait(5);
//			campus.clickUsingJavaScriptExecutor();
//			wait(5);
//			SelectCampus.clickUsingJavaScriptExecutor();
//			wait(5);
			if(WarningMessage.isDisplayed()) {
				TestReportsLog.log(LogStatus.FAIL, WarningMessage.getText());
			}else {
			TermList.click();
			wait(2);
			Search.clearAndType(data.get("Term Name").toString());
			wait(5);
			SelectValue.click();
			wait(2);
			Select.clickUsingJavaScriptExecutor();
			wait(7);
			ClickCourseSpan.click();
			wait(2);
			Search.clearAndType(data.get("Course Name").toString());
			wait(5);
			SelectValue.click();
			wait(5);
			Select.clickUsingJavaScriptExecutor();
			wait(2);
			ApplyFilters.click();
//			wait(2);
//			ClsFilterDropDwon.click();
//			wait(2);
//			ClsClearFiltersButton.click();
			wait(15);
			StuNumDropDown.click();
			wait(2);
			FilterOptions.click();
			wait(2);
			value.clearAndType(data.get("Student Name"));
			wait(2);
			FilterButton1.click();
			wait(5);
			LetterGrade.click();
			wait(5);
			LetterGrade1.clickUsingJavaScriptExecutor();
			wait(5);
			SelGrade2.click();
			wait(5);
			FinalSave.click();
			wait(5);
			CustomAsserts.containsString(RecordMidTermGradesSaveMessage.getText(), data.get("SuccessMessage").toString());
			}
			System.out.println("Midterm grade is added successfully");
			return this;
		}
		
}

	

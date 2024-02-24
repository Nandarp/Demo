package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentDegreeCreation extends BaseLocators {
	

  //Random Value  
    static String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
   

    public StudentDegreeCreation AddDegreeForStudent(StringHash data) throws Exception {

    	Link AddDegStdSaveMessage = new Link("Add Degree Save Message", byXPath("//span[. = 'The Degrees records were successfully saved.']"));	

    	AcademicRecords.waitTillElementClickable();
    	AcademicRecords.click();
    	DegreeHonourBadge.waitTillElementClickable();
    	DegreeHonourBadge.click();
    	wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		AddDegree.waitTillElementClickable();
		AddDegree.clickUsingJavaScriptExecutor();
    	wait(3);
    	DegreeDateAward.waitTillElementFound();
    	DegreeDateAward.clearAndType(Date);
    	wait(2);
    	Degree.waitTillElementClickable();
    	Degree.clickUsingJavaScriptExecutor();
    	wait(2);
    	SelDeg.waitTillElementClickable();
    	SelDeg.click();
    	String Selectdeg = SelDeg.getAttribute("title");
    	TestReportsLog.log(LogStatus.INFO, "Degree name is selected as "+Selectdeg);
    	wait(2);
    	SaveDegree.waitTillElementClickable();
    	SaveDegree.clickUsingJavaScriptExecutor();
    	wait(5);
    	CustomAsserts.containsString(AddDegStdSaveMessage.getText(), data.get("SuccessMessage").toString());
    	System.out.println("Degree is added successfully");
    	return this;

    }

    public StudentDegreeCreation AddHonorForStudent(StringHash data) throws Exception {

    	Link AddHonerStdSaveMessage = new Link("Add Honer Save Message", byXPath("//span[. = 'The Honors and Badges records were successfully saved.']"));			

    	AcademicRecords.waitTillElementClickable();
    	AcademicRecords.click();
    	DegreeHonourBadge.waitTillElementClickable();
    	DegreeHonourBadge.click();
    	wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
    	HonerandBadge.waitTillElementClickable();
    	HonerandBadge.click();
    	wait(5);
    	scrollPage(0, 300);
    	AddHonor.waitTillElementClickable();
    	AddHonor.click();
    	wait(5);
    	HBLink.waitTillElementClickable();
    	HBLink.click();
    	wait(1);
    	SelectHonourandBadge.waitTillElementClickable();
    	SelectHonourandBadge.click();
    	String SelectHNB = SelectHonourandBadge.getAttribute("title");
    	TestReportsLog.log(LogStatus.INFO, "Honour and Badge name is selected as "+SelectHNB);
    	wait(1);
    	SaveHonor.waitTillElementClickable();
    	SaveHonor.click();
    	wait(5);
    	CustomAsserts.containsString(AddHonerStdSaveMessage.getText(), data.get("SuccessMessage").toString());
    	System.out.println("Honor is added successfully");
    	return this;
    }

    public StudentDegreeCreation AddTermHonorWithBadge(StringHash data) throws Exception {

    	Link AddTermHonorwithBadgeSaveMessage = new Link("Add Term Honor with Badge SaveMessage", byXPath("//span[. = 'The Term Honors and Badges records were successfully saved.']"));			;

    	AcademicRecords.waitTillElementClickable();
    	AcademicRecords.clickUsingJavaScriptExecutor();
    	DegreeHonourBadge.waitTillElementClickable();
    	DegreeHonourBadge.clickUsingJavaScriptExecutor();
    	wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
    	TermHonerandBadge.waitTillElementClickable();
    	TermHonerandBadge.clickUsingJavaScriptExecutor();
    	wait(2);
    	scrollPage(0, 300);
    	AddTermHonor.waitTillElementClickable();
    	AddTermHonor.clickUsingJavaScriptExecutor();
    	wait(4);
    	THBLink.waitTillElementClickable();
    	THBLink.clickUsingJavaScriptExecutor();
    	//EnterTHB.clearAndType(data.get("Term Honer and Badge").toString());
    	//wait(5);
    	SelectTHB.waitTillElementClickable();
    	SelectTHB.click();
    	String SelectTEHB = SelectTHB.getAttribute("title");
    	TestReportsLog.log(LogStatus.INFO, "Term Honour and Badge name is selected as "+SelectTEHB);
    	wait(1);
    	ClkHonerandBadge.waitTillElementClickable();
    	ClkHonerandBadge.clickUsingJavaScriptExecutor();
    	//EnterHBField.clearAndType(data.get("Enter Honer and Badge").toString());
    	//wait(5);
    	SelectTermHBField.waitTillElementClickable();
    	SelectTermHBField.click();
    	String SelectTermHBFild = SelectTermHBField.getAttribute("title");
    	TestReportsLog.log(LogStatus.INFO, "Term Honour and Badge Field name is selected as "+SelectTermHBFild);
    	wait(1);
    	SaveTermHonor.waitTillElementClickable();
    	SaveTermHonor.click();
    	wait(5);
    	CustomAsserts.containsString(AddTermHonorwithBadgeSaveMessage.getText(), data.get("SuccessMessage").toString());
    	System.out.println("Term Honor is added successfully");
    	return this;

    }
    	
}







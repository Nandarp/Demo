package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.framework.elements.BaseLocators;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.AppendValue;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class PlacestudentsintoaninternshipPosition extends BaseLocators{ 
	
	
//Random Value
	static String RstName = AppendValue.apendString();
	static String RstCode = AppendValue.apendString();
	
	static String Date = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	static String VerificationAgentValue = AppendValue.apendString();
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	String currentDate = formatter.format(date);
	
public PlacestudentsintoaninternshipPosition PlaceInternshipPosition(StringHash data) throws Exception{
		Checkbox SelectEmployer = new Checkbox("Employer", byXPath("//tr[1]/td/input"));
		Link SelectExtJobType = new Link("Ext Job Type", byXPath("//span[text()='"+data.get("JobType")+"']"));
		Link StudentIntershipSaveMessage = new Link("SaveMessage", byXPath("//span[. = 'The Placement records were successfully saved.']"));
		
	//Method Implementation
		
	    CareerServices.click();
		wait(3);
		PlacementsIntern.click();
		wait(2);
    	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
		wait(15);
		NewPlacement.click();
		wait(20);
		scrollPage(0, 500);
		wait(2);
        Employer.click();
		wait(6);
		SelectEmployer.click();
		wait(5);
		Select.click();
		wait(5);
		JobTypeDropdown.click();
		wait(4);
		SelectExtJobType.click();
		wait(4);
		scrollPage(0, 200);
		wait(2);
//		JobTitleDropdown.click();
//		wait(4);
//		SeljobTitle_input.click();
//		wait(4);
//		String SelectjobTitle = SeljobTitle_input.getAttribute("title");
//	    TestReportsLog.log(LogStatus.INFO, "jobTitle_input Name is selected as "+SelectjobTitle);
//		wait(4);
		scrollPage(0, 420);
		wait(4);
		SalAmount.sendKeys("100");
		wait(4);
		InFieldofStudy.click();
		wait(4);
		SelInFieldofStudy.click();
		wait(4);
		String SelInFieldStudy = SelInFieldofStudy.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "InField of StudyName is selected as "+SelInFieldStudy);
		wait(4);
		HowPlaced.click();
		wait(4);
		SelHowPlaced.click();
		String SelPlaced = SelHowPlaced.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "HowPlaced Name is selected as "+SelPlaced);
		wait(4);
		SalaryStatus.click();
		wait(4);
		SelSalaryStatus.click();
		String SelSalarySts = SelSalaryStatus.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "Salary Status Name is selected as "+SelSalarySts);
		wait(4);
		SalaryType.click();
		wait(4);
		SelSalaryType.click();
		String SelSalType = SelSalaryType.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "Salary Type Name is selected as "+SelSalType);
		wait(2);
		DatePlaced.clearAndType(Date);
		wait(2);
		PlacementStartDate.clearAndType(Date);		
		wait(5);
		scrollPage(0, -700);
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(10);
		CustomAsserts.containsString(StudentIntershipSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Internship is added successfully");
		return this;
    }
}

	

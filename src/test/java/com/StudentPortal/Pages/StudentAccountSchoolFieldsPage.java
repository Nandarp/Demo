package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byCSSSelector;
import static com.framework.elements.Locator.byXPath;

import java.util.concurrent.TimeUnit;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentAccountSchoolFieldsPage extends BaseLocators{

	Link SchFieldMsg= new Link("School defined filed Msg", byXPath("//span[text()='The Student records were successfully saved.']"));
	Link AlertMsg= new Link("Capturing alert message", byXPath("//span[@role='status']"));
	
	String NYTAPValue = AppendValue.apendString();
	

	public StudentAccountSchoolFieldsPage AccountSchoolField(StringHash data) throws Exception{
		
		TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		StudentAccounts.waitTillElementClickable();
		StudentAccounts.clickUsingJavaScriptExecutor();
		SchoolFieldsStdAcc.waitTillElementClickable();
		SchoolFieldsStdAcc.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		scrollPage(0, -500);
		wait(2);
		//EDUID.ClearExistingText();
		//wait(2);
		//EDUID.backSpace();
		//wait(2);
		//SchoolFields.click();
		SchoolField.click();
		SchoolField.clearAndType(NYTAPValue.toString());
		wait(2);
//		SelectingINTSTU.enter();
//		String SelectedINTSTU = SelectingINTSTU.getText().toString();
//		System.out.println(SelectedINTSTU);
//		TestReportsLog.log(Status.INFO, "Selected Value is "+SelectedINTSTU);
//		wait(2);
//		scrollPage(0, -800);
//		wait(2);
		scrollPage(0, -200);
		Save.click();
		wait(8);
		String AlertMessage = AlertMsg.getText();
		if(AlertMessage.equalsIgnoreCase(data.get("SchFieldMsg"))){
		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SchFieldMsg").toString());
		}else {
			System.out.println("Error message displayed is "+AlertMessage);
			TestReportsLog.log(LogStatus.INFO, "Error message displayed is "+AlertMessage);
		}
//		scrollPage(0, 500);
//		String INTSTU = InternationalStudent.getText();
//		System.out.println(INTSTU);
		System.out.println("School field added successfully for Student Accounts");
		return this;
		
	}
	
    public StudentAccountSchoolFieldsPage AdmissionSchoolField(StringHash data) throws Exception{
    	
    	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
    	
    	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		Admissions.clickUsingJavaScriptExecutor();
		SchoolFieldsAdmission.waitTillElementClickable();
		SchoolFieldsAdmission.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		scrollPage(0, -500);
//		wait(2);
//		EDUID.backSpace();
//		wait(2);
		//CSIGlobalId.click();
		SchoolField.click();
		SchoolField.clearAndType(NYTAPValue.toString());
		wait(2);
		//SelectingFGS.click();
		//String SelectedFGS = SelectingFGS.getText();
		//System.out.println(SelectedFGS);
		//TestReportsLog.log(Status.INFO, "Selected Value is "+SelectedFGS);
		scrollPage(0, -800);
		wait(2);
		Save.click();
		wait(8);
		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SchFieldMsg").toString());
//		FirstGenerationStudent.waitTillElementFound();
//		String FGS = FirstGenerationStudent.getText();
//		System.out.println(FGS);
		System.out.println("School field added successfully for Admissions");

		return this;
		
	}
    
    public StudentAccountSchoolFieldsPage StudentServiceSchoolField(StringHash data) throws Exception{
    	
    	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
    	
    	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
//    	StudentServices.waitTillElementClickable();
		StudentServices.clickUsingJavaScriptExecutor();
		wait(2);
		SchoolFieldsStdserv.waitTillElementClickable();
		SchoolFieldsStdserv.clickUsingJavaScriptExecutor();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		SchoolField.click();
		SchoolField.clearAndType(NYTAPValue.toString());
		wait(2);
//		SelectingDisreq.click();
//		String SelectedDisreq = SelectingDisreq.getText();
//		System.out.println(SelectedDisreq);
//		TestReportsLog.log(Status.INFO, "Selected Value is "+SelectedDisreq);
//		wait(2);
//		scrollPage(0, -500);
//		wait(2);
		scrollPage(0, -800);
		wait(2);
		Save.click();
		wait(8);
		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SchFieldMsg").toString());
//		DisabilityRequest.waitTillElementFound();
//		String DR = DisabilityRequest.getText();
//		System.out.println(DR);
		System.out.println("School field added successfully for Student Services");
		return this;
		
	}
    
    public StudentAccountSchoolFieldsPage StudentServiceHousingSchoolField(StringHash data) throws Exception{

    	Link HouSchFieldMsg= new Link("Housing School defined filed Msg", byXPath("//span[text()='The Student Services Housing School Fields were successfully saved.']"));
    	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
    	
    	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
//    	StudentServices.waitTillElementClickable();
		StudentServices.clickUsingJavaScriptExecutor();
		SchoolFieldsStdserv.waitTillElementClickable();
		SchoolFieldsStdserv.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		HousingSchoolFields.clickUsingJavaScriptExecutor();
		wait(5);
		scrollPage(0, -800);
		SchoolField.click();
		SchoolField.clearAndType(NYTAPValue.toString());
		wait(2);
//		SelectingLeftHand.enter();
//		String SelectedLeftHand = SelectingLeftHand.getText();
//		System.out.println(SelectedLeftHand);
//		TestReportsLog.log(Status.INFO, "Selected Value is "+SelectedLeftHand);
//		wait(2);
		scrollPage(0, -500);
		Save.waitTillElementClickable();
		Save.click();
		wait(4);
		CustomAsserts.containsString(HouSchFieldMsg.getText(), data.get("HouSchFieldMsg").toString());
//		scrollPage(0, 200);
//		LeftHanded.waitTillElementFound();
//		String LH = LeftHanded.getText();
//		System.out.println(LH);
		System.out.println("School field added successfully for Student Services Housing Fileds");
		return this;
		
	}
    
    	public StudentAccountSchoolFieldsPage CareerServiceSchoolField(StringHash data) throws Exception{

    	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
    	
    	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;	
//    	CareerServices.waitTillElementClickable();
		CareerServices.clickUsingJavaScriptExecutor();
		SchoolFieldsCarserv.waitTillElementClickable();
		SchoolFieldsCarserv.clickUsingJavaScriptExecutor();
		wait(2);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		SchoolField.click();
		SchoolField.clearAndType(NYTAPValue.toString());
		wait(2);
//		SelectingGenIden.click();
//		String SelectedGenIden = SelectingGenIden.getText();
//		System.out.println(SelectedGenIden);
//		TestReportsLog.log(Status.INFO, "Selected Value is "+SelectedGenIden);
//		wait(2);
		//scrollPage(0, -500);
		scrollPage(0, -800);
		wait(2);
		Save.click();
		wait(8);
		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SchFieldMsg").toString());
//		GenderIdentity.waitTillElementFound();
//		String GI = GenderIdentity.getText();
//		System.out.println(GI);
		System.out.println("School field added successfully for Career Services");
		return this;
    	}	
    	
    	public StudentAccountSchoolFieldsPage FinancialAidSchoolField(StringHash data) throws Exception{

        	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name='ID']"));
        	
        	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;	
    		FinancialAid.clickUsingJavaScriptExecutor();
    		SchoolFieldsFinAid.waitTillElementClickable();
    		SchoolFieldsFinAid.clickUsingJavaScriptExecutor();
    		wait(2);
        	if(Dontsave.isDisplayed()) {
        		Dontsave.waitTillElementClickable();
        		Dontsave.clickUsingJavaScriptExecutor();
        		}
    		wait(15);
    		scrollPage(0, -500);
    		wait(2);
    		SchoolField.click();
    		SchoolField.clearAndType(NYTAPValue.toString());
    		wait(2);
    		scrollPage(0, -800);
    		wait(2);
     		Save.click();
    		wait(4);
    		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SuccessMessage").toString());
    		System.out.println("School field added successfully for Financial Aid");
    		return this;
        	}	
    	
    	public StudentAccountSchoolFieldsPage AcademicRecordsSchoolField(StringHash data) throws Exception{

        	TextField SchoolField = new TextField("SchoolField", byXPath("//textarea[@name=\"TEST1\"]"));
        	
        	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;	
    		AcademicRecords.clickUsingJavaScriptExecutor();
    		SchoolFieldsAcademic.waitTillElementClickable();
    		SchoolFieldsAcademic.clickUsingJavaScriptExecutor();
    		wait(3);
        	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
    		wait(15);
    		scrollPage(0, -500);
    		wait(2);
    		SchoolField.click();
    		SchoolField.clearAndType(NYTAPValue.toString());
    		wait(2);
    		scrollPage(0, -800);
    		wait(2);
    		Save.click();
    		wait(8);
    		CustomAsserts.containsString(SchFieldMsg.getText(), data.get("SuccessMessage").toString());
    		System.out.println("School field added successfully for Academic Records");
    		return this;
        	}	
    	
    	
    	public StudentAccountSchoolFieldsPage AddingHousingApplication(StringHash data) throws Exception{

    		Link HousingMsg= new Link("Housing application Msg", byXPath("//span[text()='The Housing Application records were successfully saved.']"));
    		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
    		waitForPageToLoad();
    		StudentServices.clickUsingJavaScriptExecutor();
    		wait(1);
    		HousingApplications.clickUsingJavaScriptExecutor();
    		wait(2);
        	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
    		wait(15);
//    		ProgramVersion.click();
//    		wait(1);
//    		SelectingAllProgramVersion.click();
    		wait(3);
    		scrollPage(0, -500);
    		wait(2);
    		New.click();
    		wait(8);
    		BuildingCategory.clickUsingJavaScriptExecutor();
    		wait(2);
    		SelectingBuildCategory.click();
    		wait(2);
    		RoomCategory.click();
    		wait(2);
    		SelectingRoomCategory.click();
    		wait(2);
    		Building.click();
    		wait(2);
    		SelectingBuilding.click();
    		wait(2);
    		NoRoomates.clickUsingJavaScriptExecutor();
    		wait(2);
    		HousingTerm.click();
    		wait(2);
    		SelectingHousingTerm.click();
    		wait(2);
    		SaveAndClose3.clickUsingJavaScriptExecutor();
    		wait(8);
    		CustomAsserts.containsString(HousingMsg.getText(), data.get("HousingMsg").toString());
    		wait(2);
    		return this;
    	}
}

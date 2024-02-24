package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.util.concurrent.TimeUnit;

import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextBulletColorFollowTextImpl;

import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentConfigurationPage extends BaseLocators{ 
	//Login Page Web Elements	
	static String SubNameValue = AppendValue.apendString();
	static String SubCodeValue = AppendValue.apendString();
	static String TaskTempNameValue = AppendValue.apendString();
	static String TaskTempCodeValue = AppendValue.apendString();
	static String TaskSchNameValue = AppendValue.apendString();
	static String DocNameValue = AppendValue.apendString();
	static String DocCodeValue = AppendValue.apendString();
	static String DocSchNameValue = AppendValue.apendString();
	static String RstName = AppendValue.apendString();
	static String RstCode = AppendValue.apendString();
	static String SMSNameValue = AppendValue.apendString();
	static String SMSCodeValue = AppendValue.apendString();	
	static String EmployerNameValue = AppendValue.apendString();
	static String EmployerCodeValue = AppendValue.apendString();
	static String EmailAddressValue = AppendValue.apendString();	
	
	//--------Validation Message----
	Link DocScheduleMsg= new Link("Document Schedule Msg", byXPath("//span[text()='The Document Schedule records were successfully saved.']"));
	Link DocTypeMsg= new Link("Document Type Msg", byXPath("//span[text()='The Document Type records were successfully saved.']"));
	Link SubsidiaryMsg= new Link("Subsidiary Msg", byXPath("//span[text()='The Subsidiary records were successfully saved.']"));

	static String TDate = DatesUtil.getCurrentDatebyFormat("mm/dd/yyyy");
	static String TCode = AppendValue.apendString();  
	static String EmailSubject1 = AppendValue.apendString();
	static String Description1 = AppendValue.apendString();

	static String TaskCode = AppendValue.apendString();
	static String TaskName;

	
public StudentConfigurationPage CreateTaskTemplate(StringHash data) throws Exception{
		Link SelectingEventType1 = new Link("Selecting Event Type", byXPath("//span[. = '"+data.get("EventType")+"']"));
		//Campuses.sendKeys(StudentStudentPage.LastNameValue);
		
		waitForPageToLoad();
		SearchConfiguration.clearAndType(data.get("Component").toString());
		TaskTemplates.waitTillElementClickable();
		TaskTemplates.click();
		waitForPageToLoad();
		New.click();
		waitForPageToLoad();
		wait(5);
		//Name.clearAndType(data.get("TaskTemplateName").toString());
		Name.clearAndType(TaskTempNameValue);
		wait(2);
		//Code.clearAndType(data.get("TaskTemplateCode").toString());
		Code.clearAndType(TaskTempCodeValue);
		wait(2);
		EventType.clearAndType(data.get("EventType").toString());;
		wait(2);
		SelectingEventType1.click();
		wait(2);
//		SaveAndClose1.waitTillElementClickable();
//		SaveAndClose1.clickUsingJavaScriptExecutor();
		return this;
	}
	
	
	public StudentConfigurationPage CreateDocumetType(StringHash data) throws Exception{
	    Link SelectingModule1 = new Link("Selecting Module", byXPath("//span[text()='"+data.get("ModuleName")+"']"));
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
	    
		//wait(10);
	    SearchConfiguration.waitTillElementClickable();
		SearchConfiguration.click();
		SearchConfiguration.clearAndType(data.get("Component").toString());
		wait(2);
		Documents.waitTillElementClickable();
		Documents.click();
		wait(15);
		New.click();
		//waitForPageToLoad();
		wait(15);
		Name.waitTillElementClickable();
		Name.clearAndType(DocNameValue);
		Code.waitTillElementClickable();
		Code.clearAndType(DocCodeValue);
		ModuleInput.waitTillElementClickable();
		ModuleInput.sendKeys(data.get("ModuleName"));
		wait(3);
		SelectingModule1.click();
		String SelectedModule = SelectingModule1.getText();
		System.out.println(SelectedModule);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedModule);
		DocumentType.click();
		SelectingDocumentType1.clickUsingJavaScriptExecutor();
		String SelectedDocType = SelectingDocumentType1.getText();
		System.out.println(SelectedDocType);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedDocType);
		//Campuses.clickUsingJavaScriptExecutor();---this is used for DTS
		CampusesGroup.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Campus").toString());
		wait(2);
		SelectingCampus1.click();
		String SelectedCampus = SelectingCampus1.getAttribute("aria-label");
		System.out.println(SelectedCampus);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedCampus);
		wait(2);
		SelectButton.clickUsingJavaScriptExecutor();
		Thread.sleep(2000);
		wait(2);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(5);
		CustomAsserts.containsString(DocTypeMsg.getText(), data.get("DocTypeMsg").toString());
		System.out.println("Document is created successfully");
		return this;
	}
   
	public StudentConfigurationPage CreateDocumetSchedule(StringHash data) throws Exception{
		
	    SearchConfiguration.waitTillElementClickable();
		SearchConfiguration.click();
		SearchConfiguration.clearAndType(data.get("Component").toString());
		wait(5);
		DocumentSchedules.waitTillElementClickable();
		DocumentSchedules.click();
		wait(12);
		New.click();
		wait(20);
		//wait(2);
		Name.clearAndType(DocSchNameValue);
		wait(2);
		campus.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("Campus"));
		wait(2);
		Uncheck.click();
		wait(2);
		cacheckcampus.check();
		wait(2);
		SelectButton.clickUsingJavaScriptExecutor();
//		}
		wait(1);
//		if(cacheckcampus.isSelected()) {
//		wait(2);
//		CancelButton.clickUsingJavaScriptExecutor();
//		}else {
//			wait(2);
//			Select.clickUsingJavaScriptExecutor();
//		}
//		wait(1);
		//Name.clearAndType(DocSchNameValue);
		//wait(2);
		scrollPage(0, 500);
		wait(2);
		ScheduleCriteria.click();
		//SearchCriteria.clearAndType(data.get("Status").toString());
		SelectingSearchCriteria1.click();
		String SelectedCriteria = SelectingSearchCriteria1.getText();
		System.out.println(SelectedCriteria);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedCriteria);
		Arrowmark.clickUsingJavaScriptExecutor();
		Value.clickUsingJavaScriptExecutor();
		//SearchName.clearAndType(data.get("DependentStatus").toString());
		DependentStatus1.clickUsingJavaScriptExecutor();
		String SelectedDocumentStatus = DependentStatus1.getAttribute("aria-label");
		System.out.println(SelectedDocumentStatus);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedDocumentStatus);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(2);
		ScheduleCriteria.clickUsingJavaScriptExecutor();
		wait(2);
		DocumentCriteria.clickUsingJavaScriptExecutor();
		wait(3);
		AddDocument.clickUsingJavaScriptExecutor();
		//SearchName.clearAndType(data.get("DocumentType").toString());
		wait(2);
		SelectingDocument1.clickUsingJavaScriptExecutor();
		String SelectedDocument = SelectingDocument1.getAttribute("aria-label");
		System.out.println(SelectedDocument);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedDocument);
		wait(2);
		SelectButton.clickUsingJavaScriptExecutor();
		wait(2);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		//waitForPageToLoad();
		wait(5);
		CustomAsserts.containsString(DocScheduleMsg.getText(), data.get("DocScheduleMsg").toString());
//		Filtericon.clickUsingJavaScriptExecutor();
//		wait(2);
//		ClearFilters.clickUsingJavaScriptExecutor();
//		wait(2);
//		Listdrpdwn.click();
//		wait(2);
//		Filteroption.click();
//		wait(2);
//		FilterValue.clearAndType(DocSchNameValue);
//		wait(2);
//		Filterbutton.click();
//		wait(2);
//		String DocumentschName = Tablevalue.getText();
//		System.out.println(DocumentschName);
//		if(DocumentschName.equalsIgnoreCase(DocSchNameValue))
//		{
//			System.out.println("Document schedule is matching");
//		}else {
//			System.out.println("Document schedule is not matching");
//		}
		System.out.println("Document is scheduled successfully");
		
		return this;
	}

	public StudentConfigurationPage CreateSubsidiary(StringHash data) throws Exception {
		
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
	   
	    SearchConfiguration.waitTillElementFound();
		SearchConfiguration.clearAndType(data.get("Component").toString());
		Subsidiaries.waitTillElementClickable();
		Subsidiaries.click();
		wait(15);
		New.waitTillElementClickable();
		New.click();
		wait(15);
		Name.waitTillElementFound();
		Name.clearAndType(SubNameValue);
		Code.waitTillElementFound();
		Code.clearAndType(SubCodeValue);
		scrollPage(0, 300);
		wait(2);
		TransactionCodes.waitTillElementClickable();
		TransactionCodes.click();
		wait(1);
		//SearchCode.clearAndType(data.get("TransactionCode"));
		SelectingCode.waitTillElementClickable();
		SelectingCode.click();
		String SelectedCode = SelectingCode.getAttribute("aria-label");
		System.out.println(SelectedCode);
		TestReportsLog.log(LogStatus.INFO, "Selected value is "+SelectedCode);
		Select.waitTillElementClickable();
		Select.click();
		wait(1);
		scrollPage(0, -300);
		wait(1);
		SaveAndClose1.waitTillElementClickable();
		SaveAndClose1.click();
		wait(5);
		CustomAsserts.containsString(SubsidiaryMsg.getText(), data.get("SubsidiaryMsg").toString());
		return this;
   }
  
public StudentConfigurationPage AddSMSServiceProvider(StringHash data) throws Exception{
	   
	   Link SMSProvidersSaveMessage = new Link("SMSProvidersSaveMessage", byXPath("//span[. = 'The Sms Service Provider records were successfully saved.']"));
	   
	    int MaxLengthValue = AppendValue.apendShortNumber();
	    String DomainNameValue = AppendValue.apendString();
	    
	    SearchConfiguration.waitTillElementClickable();
		SearchConfiguration.click();
		wait(2);
		SearchConfiguration.clearAndType("SMS Service Providers");
		wait(3);
		SMSProvidersSpan.click();
		waitForPageToLoad();
		New.click();
		waitForPageToLoad();
		scrollPage(0,300);
		Name.click();
		wait(2);
		Name.clearAndType(SMSNameValue.toString());
		wait(2);
		Code.click();
		wait(2);
		Code.clearAndType(SMSCodeValue.toString());
		wait(2);
		DomainName.click();
		wait(2);
		DomainName.clearAndType(DomainNameValue.toString());
		wait(2);
		MaxLength.click();
		wait(2);
		MaxLength.sendKeys(String.valueOf(MaxLengthValue));
		TestReportsLog.log(LogStatus.INFO, "Max length is entered as "+MaxLengthValue);
		wait(2);
		SaveAndClose1.click();
		wait(8);
		CustomAsserts.containsString(SMSProvidersSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("SMS service provider is created successfully");

		return this;
	}	
   
  
 public StudentConfigurationPage AddNewEmployer(StringHash data) throws Exception{

	   Link EmployerSuccessMessage = new Link("EmployerSuccessMessage", byXPath("//span[. = 'The Employer records were successfully saved.']"));
	   //String EmployerNameValue = AppendValue.apendString();
	   //String EmailAddressValue = AppendValue.apendString();
	  // String EmployerNameValue = AppendValue.apendString();
	  // String EmailAddressValue = AppendValue.apendString();
	   int PhoneNumValue = AppendValue.apendNumber();
	   int ExtensionValue = AppendValue.apendNumber();
	   
	   waitForPageToLoad();
		SearchConfiguration.click();
		SearchConfiguration.clearAndType("Employers");
		wait(3);
		EmployersSpan.click();
		waitForPageToLoad();
		New.click();
		waitForPageToLoad();
		EmployerName.click();
		wait(3);
		EmployerName.clearAndType(EmployerNameValue.toString());
		wait(3);
		EmployerCode.click();
		wait(3);
		EmployerCode.clearAndType(EmployerCodeValue.toString());
		wait(2);
		scrollPage(0,300);
		EMailAddress.click();
		wait(3);
		EMailAddress.clearAndType(EmailAddressValue+"@SIS.com".toString());
		StreetAdress.click();
		wait(2);
		StreetAdress.clearAndType(data.get("StreetAdress").toString());
		wait(2);
		City.click();
		wait(3);
		City.clearAndType(data.get("City").toString());
		//wait(2);
		//PIN.click();
		wait(4);
		//PIN.
		//PIN.type("12345");
		//PIN.clearAndType(data.get("PIN").toString());
		//wait(2);
		scrollPage(0,100);
		PhoneNum.click();
		wait(3);
		//JavascriptExecutor js = JavaScriptExecutor(driver);
		//js.executeScript(document.getElementById('phoneNumber').value='testuser');
		PhoneNum.sendKeys(String.valueOf(PhoneNumValue));
		TestReportsLog.log(LogStatus.INFO, "Phone num is entered as "+PhoneNumValue);
		//PhoneNum.type(data.get("PhoneNum").toString());
		//PhoneNum.clearAndType(data.get("PhoneNum").toString());
		scrollPage(0,200);
		EmployeeExtension.click();
		wait(3);
		//EmployeeExtension.clearAndType(data.get("EmployeeExtension").toString());
		EmployeeExtension.sendKeys(String.valueOf(ExtensionValue));
		TestReportsLog.log(LogStatus.INFO, "Employee extension is entered as "+ExtensionValue);
		scrollPage(0,-700);
//		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(EmployerSuccessMessage.getText(), data.get("EmployerSuccessMessage").toString());		
		System.out.println("Employer is added successfully");
		return this;
	}	


 public StudentConfigurationPage ConfigurePromissoryNote(StringHash data) throws Exception{
	   
	   Link PaymentTypeLink = new Link("PaymentTypeLink", byXPath("//a[. = '"+data.get("PaymentType")+"']"));
	   Link FundSourceSuccessMessage = new Link("FundSourceSuccessMessage", byXPath("//span[. = 'The Fund Source records were successfully saved.']"));
	   Link CampusName = new Link("Campus", byXPath("//li[.='"+data.get("Campus")+"']"));
 
	    SearchConfiguration.click();
		SearchConfiguration.clearAndType("Fund Sources");
		FundSourcesSpan.waitTillElementClickable();
		FundSourcesSpan.click();
		wait(10);
		PromCampusDropdown.waitTillElementClickable();
		PromCampusDropdown.clickUsingJavaScriptExecutor();
		CampusName.waitTillElementClickable();
		CampusName.click();
		wait(1);
		CodeSpan.waitTillElementClickable();
		CodeSpan.click();
		Filter1.waitTillElementClickable();
		Filter1.click();
		Value.click();
		Value.waitTillElementFound();
		Value.clearAndType(data.get("FundSource").toString());
		wait(1);
		Filterbutton.waitTillElementClickable();
		Filterbutton.click();
		PaymentTypeLink.waitTillElementClickable();
		PaymentTypeLink.click();
		wait(5);
		scrollPage(0,1000);
		RulesAndAttributesCollapse.waitTillElementClickable();
		RulesAndAttributesCollapse.click();
		scrollPage(0,500);
		wait(3);
		if(PromissoryNote.isSelected())			
		{
			System.out.println("Promissory Note is already selected");
		}else {
			PromissoryNote.clickUsingJavaScriptExecutor();
			//System.out.println("Task template is not matching");
		}
		wait(2);
		Save1.waitTillElementClickable();
		scrollPage(0,-900);
		Save.click();
		wait(5);
		CustomAsserts.containsString(FundSourceSuccessMessage.getText(), data.get("FundSourceSuccessMessage").toString());	
		System.out.println("Promisory note is configured successfully");
		return this;
	}	

   
// public StudentConfigurationPage ConfdocsschedCorrierService(StringHash data) throws Exception{
//	    
//	    
//	 	Link ClickStudentName = new Link("Selecting Student", byXPath("//span[text()='"+data.get("LastName")+", "+data.get("FirstName")+"']"));
//	 	Link SelectModule = new Link("select module", byXPath("(//span[text()='"+data.get("Module Name")+"'])[1]"));
//	 	Link SelectDocument = new Link("select module", byXPath("//span[@title='"+data.get("Document Name")+"']"));
//	 	Link SelectDocumentStatus = new Link("select DocumentStatus", byXPath("//span[@title='"+data.get("Document Status")+"']"));
//	 	Link SelectDocument1 = new Link("select module", byXPath("//span[@title='"+data.get("Document List")+"']"));
//		//Login Page Web Elements
//		//waitForPageToLoad();
//		//MenuButton.click();
//		//wait(5);
//		//Students.click();
//		waitForPageToLoad();
//		wait(15);
//		FilterDropDwon.click();
//		wait(2);
//		ClearFiltersButton.click();
//		waitForPageToLoad();
//		wait(10);
//		StuNumDropDown.click();
//		waitForPageToLoad();
//		wait(2);
//		StuNumDropDown.click();
//		waitForPageToLoad();
//		wait(2);
//		value.clearAndType(data.get("Student Number"));
//		waitForPageToLoad();
//		wait(2);
//		FilterButton.click();
//		waitForPageToLoad();
//		wait(5);
//		ClickStudentName.click();
//		waitForPageToLoad();
//		wait(5);
//		ContactManager.clickUsingJavaScriptExecutor();
//		wait(5);
//		Documents.clickUsingJavaScriptExecutor();
//		wait(5);
//		NewDocument.clickUsingJavaScriptExecutor();
//		waitForPageToLoad();
//		wait(5);
//		Module.clearAndType(data.get("Module Name").toString());
//		wait(5);
//		SelectModule.clickUsingJavaScriptExecutor();
//		wait(5);
//		EnterDocument.clearAndType(data.get("Document Name").toString());
//		wait(5);
//		SelectDocument.clickUsingJavaScriptExecutor();
//		wait(5);
//		DocumentStatus.clearAndType(data.get("Document Status").toString());
//		wait(5);
//		SelectDocumentStatus.clickUsingJavaScriptExecutor();
//		wait(5);
//		SaveAndClose1.clickUsingJavaScriptExecutor();
//		wait(5);
//		NewDocumentList.clickUsingJavaScriptExecutor();
//		wait(2);
//		scrollPage(0, 500);
//		wait(5);
//		/*Entermodule.clearAndType(data.get("Module Name").toString());
//		wait(5);
//		SelectModule.clickUsingJavaScriptExecutor();
//		wait(5);*/
//		EnterDocument.clearAndType(data.get("Document List").toString());
//		wait(5);
//		SelectDocument1.clickUsingJavaScriptExecutor();
//		wait(5);
//		DocumentStatus.clearAndType(data.get("Document Status").toString());
//		wait(5);
//		SelectDocumentStatus.clickUsingJavaScriptExecutor();
//		wait(5);
//		SaveAndClose3.clickUsingJavaScriptExecutor();
//		waitForPageToLoad();
//		wait(5);
//		return this;
//}	
// 
// 
// public StudentConfigurationPage TskConfEmp(StringHash data) throws Exception{
//	   
//		//Login Page Web Elements
//		waitForPageToLoad();
//		wait(15);
//		SearchContactManager.clearAndType(data.get("Search Name").toString());
//		wait(3);
//		TaskTemplets.clickUsingJavaScriptExecutor();
//		wait(10);
//		NewButton1.clickUsingJavaScriptExecutor();
//		wait(10);
//		Description.clearAndType(data.get("Description").toString());
//		wait(5);
//		Code1.clearAndType(data.get("Code").toString());
//		wait(3);
//		Catogery.clearAndType(data.get("Catogery").toString());
//		wait(3);
//		SelCatogery.clickUsingJavaScriptExecutor();
//		wait(3);
//		scrollPage(0, 200);
//		wait(2);
//		EventType1.clearAndType(data.get("Select EventType").toString());
//		wait(3);
//		SelEventType1.clickUsingJavaScriptExecutor();
//		wait(3);
//		EmailSubject.clearAndType(data.get("Email Subject").toString());
//        wait(3);
//		scrollPage(0, -200);
//		wait(2);
//		SaveAndClose2.clickUsingJavaScriptExecutor();
//		waitForPageToLoad();
//		wait(7);
//		return this;
//	}
// 
// 
// public StudentConfigurationPage ConTskConfEmp(StringHash data) throws Exception{
//	 
//	//Login Page Web Elements
//			waitForPageToLoad();
//			wait(15);
//			SearchContactManager.clearAndType(data.get("Search Name").toString());
//			wait(3);
//			Employeer.clickUsingJavaScriptExecutor();
//			wait(10);
//			Filtericon.clickUsingJavaScriptExecutor();
//			wait(2);
//			ClearFilters.clickUsingJavaScriptExecutor();
//			wait(15);
//			TeDropDown.click();
//			wait(2);
//			TerNumFilter.click();
//			wait(2);
//			value.clearAndType(data.get("Employer Name"));
//			wait(3);
//			CFilterButton.clickUsingJavaScriptExecutor();
//			wait(5);
//			ClkEmpName.clickUsingJavaScriptExecutor();
//			wait(7);
//			Task.clickUsingJavaScriptExecutor();
//			wait(5);
//			NewButton1.clickUsingJavaScriptExecutor();
//			wait(5);
//			TaskTemplet.clearAndType(data.get("Search TaskTemplet").toString());
//			wait(5);
//			SelTask.clickUsingJavaScriptExecutor();
//			wait(5);
//			Student.click();
//			wait(5);
//			Search.clearAndType(data.get("Student Name").toString());
//			wait(5);
//			SelectStudent.click();
//			wait(5);	
//			Select.click();
//			wait(2);
//			SaveAndClose2.clickUsingJavaScriptExecutor();
//			waitForPageToLoad();
//			wait(7);
//		    return this;
//	}	
 
 public StudentConfigurationPage DegreeProgressAudit(StringHash data) throws Exception{
	 
	 Link ClikCourseCode = new Link("Course Code", byXPath("//td[text()='"+data.get("Course Code")+"']"));
	  Link SelectRequirement = new Link("SelectRequirement", byXPath("(//li[@id=\"RequiredCoursePanelItem0\"]//a//span//span)[1][1]"));
	  Link FilterDropDown = new Link("FilterDropDown", byXPath("(//div[@title=\"Settings\"]//button)[4]//span"));
	  Link ResetDefaults = new Link("ResetDefaults", byXPath("(//span[.='Reset to Default'])[3]"));
	  Link CourseDropdown = new Link("CourseDropdown", byXPath("(//a[@title=\"Course Code edit column settings\"]//span)[1]"));
	  
		//Method Implementation
		AcademicRecords.click();
		wait(3);
		DegreeProgressAudit.click();
		wait(18);
		if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
		wait(15);
		scrollPage(0, 500);
		wait(1);
		//CourseRequirement.clickUsingJavaScriptExecutor();
		wait(5);
		SelectRequirement.clickUsingJavaScriptExecutor();
		wait(3);
		FilterDropDown.clickUsingJavaScriptExecutor();
		wait(2);
		ResetDefaults.clickUsingJavaScriptExecutor();
		wait(4);
		CourseDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		FilterOptions.click();
		wait(2);
		value.clearAndType(data.get("Course Code"));
		wait(3);
		FilterButton.click();
		wait(5);
		ClikCourseCode.click();
		wait(2);
		if (Clikwaive.isDisplayed()) {
			Clikwaive.click();

		} else {
			Arrow.click();
			wait(2);
			HighLight.click();
			wait(2);
			Clikwaive.click();
		}
		wait(3);
		Clikwaive1.click();
		wait(2);
//				wait(5);
		System.out.println("Degree progress audit is edited successfully");
			return this;
		}
 
 
 public StudentConfigurationPage ConfirmDocumentCarrierServices(StringHash data) throws Exception{
	    
	 Link SelectingModule= new Link(data.get("ModuleName"), byXPath("(//span[text()='"+data.get("ModuleName")+"'])[1]"));
		Link AddDocStudMsg= new Link("Add Document to Student", byXPath("//span[text()='The Document records were successfully saved.']"));
		
		Link Awardyear= new Link("Award year", byXPath("(//button[@aria-label='expand combobox'])[8]"));
		Link SelectingAwardYear= new Link("Selecting AwardYear", byXPath("(//span[text()='2023-24'])[1]"));
		Link SelectingDocumentStatus1= new Link("Selecting Document Status", byXPath("//ul[@id=\"studentDocStatus_listbox\"]/li/span/div/span[1]"));
		//Link SelectingStudent2 = new Link("Selecting Student", byXPath("//span[text()='"+LastNameValue+", "+FirstNameValue+"']"));
		//Link SelectingDocumentStatus1= new Link("Selecting Document Status", byXPath("//span[text()='"+data.get("DocumentStatus")+"']"));
		//Link SelectingStudent2 = new Link("Selecting Student", byXPath("//span[text()='"+LastNameValue+", "+FirstNameValue+"']"));
		//Link SelectingModule= new Link(data.get("ModuleName"), byXPath("(//span[text()='"+data.get("ModuleName")+"'])[2]"));
		Link SelectingDocument= new Link("Selecting document", byXPath("//ul[@id='studentDocName_listbox']/li[1]//div/span[1]"));
		TextField DocListStatus = new TextField("Doc List Status", byXPath("//input[@name='studentDocStatus_input']"));
		Link DoclistDropdown= new Link("DoclistDropdown", byXPath("(//button[@aria-label=\"expand combobox\"]//span)[6]"));
		Link SelectingDocumentList= new Link("Selecting document", byXPath("//ul[@id='studentDocName_listbox']/li[1]//div/span[1]"));
		
		ContactManager.clickUsingJavaScriptExecutor();
		wait(2);
		Documents.clickUsingJavaScriptExecutor();
		wait(3);
		if(Dontsave.isDisplayed()) {
			Dontsave.waitTillElementClickable();
			Dontsave.clickUsingJavaScriptExecutor();
			}
		wait(15);
		NewDocument.clickUsingJavaScriptExecutor();
		wait(15);
		//Module.clickUsingJavaScriptExecutor();
		DocModule.clearAndType(data.get("ModuleName"));
		wait(2);
		SelectingModule.clickUsingJavaScriptExecutor();
		String SelectedModule = SelectingModule.getAttribute("title");
		System.out.println(SelectedModule);
		TestReportsLog.log(LogStatus.INFO, "Selected Module is "+SelectedModule);
		wait(2);
		Document.click();
		wait(2);
		SelectingDocument.click();
		String SelectedDocument = SelectingDocument.getAttribute("title");
		System.out.println(SelectedDocument);
		TestReportsLog.log(LogStatus.INFO, "Selected Document is "+SelectedDocument);
		wait(2);
		DocumentStatus.clearAndType(data.get("DocumentStatus"));
		wait(3);
		SelectingDocumentStatus1.clickUsingJavaScriptExecutor();
		String SelectedDocumentStatus = SelectingDocumentStatus1.getAttribute("title");
		System.out.println(SelectedModule);
		TestReportsLog.log(LogStatus.INFO, "Selected Document status is "+SelectedDocumentStatus);
		wait(2);
		SaveAndCloseDocument.clickUsingJavaScriptExecutor();
		wait(6);
		CustomAsserts.containsString(AddDocStudMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document is added successfully");
		wait(5);
		NewDocumentList.click();
		wait(10);
		scrollPage(0, 500);
		wait(2);
		DocModule.clearAndType(data.get("ModuleName"));
		wait(2);
		SelectingModule.clickUsingJavaScriptExecutor();
		String SelectedModule1 = SelectingModule.getAttribute("title");
		System.out.println(SelectedModule1);
		TestReportsLog.log(LogStatus.INFO, "Selected Module is "+SelectedModule1);
		wait(3);
		DoclistDropdown.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingDocumentList.click();
		wait(2);
		DocListStatus.clearAndType(data.get("DocumentStatus"));
		wait(2);
		SelectingDocumentStatus1.click();
		wait(2);
		SaveAndCloseDocumentList.click();
		wait(6);
		CustomAsserts.containsString(AddDocStudMsg.getText(), data.get("SuccessMessage").toString());
		System.out.println("Document List is added successfully");
		return null;
			}
 
 
 public StudentConfigurationPage ConfirmTaskConfigurationForEmployee(StringHash data) throws Exception{

		//X-path Parameterization
		Link SelCatogery = new Link("Select SelCatogery", byXPath("//ul[@id='taskCategoryId_listbox']/li[1]/div/span[1]"));
		Link SelEventType1 = new Link("Select SelEventType1", byXPath("//ul[@id='taskTypeId_listbox']/li[1]/div/span[1]"));
		Link TaskConfigEmployeeSaveMessage = new Link("TaskConfigEmployeeSaveMessage", byXPath("//span[. = 'The Task Template records were successfully saved.']"));			
		Link EventType1 = new Link("Search EventType1", byXPath("//span[contains(@aria-controls,'taskTypeId')]/span"));
		//Method Implementation
        waitForPageToLoad();
		wait(20);
		SearchConfiguration.clearAndType(data.get("Search Name").toString());
		wait(3);
		TaskTemplets.click();
		wait(10);
		New.click();
		wait(10);
		Name.clearAndType(data.get("Description").toString());
		wait(5);
		Code.clearAndType(TCode);
		wait(3);
//		Catogery.click();
		wait(5);
		SelCatogery.clickUsingJavaScriptExecutor();
		wait(3);
		String SelCatogey = SelCatogery.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "SelCatogeryName is selected as "+SelCatogey);
		wait(2);
		scrollPage(0, 500);
		wait(2);
		EventType1.click();
		wait(3);
		SelEventType1.click();
		wait(3);
		String SelEveentType1 = SelEventType1.getAttribute("title");
	    TestReportsLog.log(LogStatus.INFO, "SelEventType1Name is selected as "+SelEveentType1);
		wait(2);
		EmailSubject.clearAndType(EmailSubject1);
		wait(3);
		scrollPage(0, -200);
		wait(2);
//		SaveAndClose1.click();
		wait(5);
		CustomAsserts.containsString(TaskConfigEmployeeSaveMessage.getText(), data.get("SuccessMessage").toString());
		wait(2);
		return this;
			}
      
 public StudentConfigurationPage ConfirmTaskConfigurationForEmployeeDropdown(StringHash data) throws Exception{

			Link ConfirmTskConfEmployeeDropdownSaveMessage = new Link("Confirm Task Employee Dropdown SaveMessage", byXPath("//span[. = 'The Task records were successfully saved.']"));			
			Link ClkEmpName = new Link("Employee Name", byXPath("//a[text()='"+data.get("Employer Name")+"']"));	
			Checkbox SelectStudent = new Checkbox("Select Student", byXPath("//input[@aria-label='"+data.get("StudentName")+"']"));	
		    Link TaskClearFilter = new Link("Clear Filter",byXPath("(//span[.='Clear All'])[3]"));
			
			SearchConfiguration.clearAndType("Employers");
			wait(3);
			Employers.click();
			wait(10);
			TaskSettings.clickUsingJavaScriptExecutor();
			wait(2);
			TaskClearFilter.clickUsingJavaScriptExecutor();
			wait(10);
			NameDropDown.click();
			wait(2);
			FilterOptions.click();
			wait(2);
			value.clearAndType(data.get("Employer Name"));
			wait(3);
			FilterButton.click();
			wait(5);
			ClkEmpName.click();
			wait(20);
			Task.click();
			wait(12);
			New.click();
			wait(12);
			TaskTemplateName.clearAndType("Student Job Interest Notification");
			wait(3);
			SelectTaskTemplate.clickUsingJavaScriptExecutor();
			wait(5);
			Student.click();
			//wait(5);
			//EnterStudent.click();
			wait(5);
			FirstInput.click();
			wait(2);	
			Select.click();
			wait(2);
			SaveAndClose1.click();
			wait(7);
			CustomAsserts.containsString(ConfirmTskConfEmployeeDropdownSaveMessage.getText(), data.get("SuccessMessage").toString());
//			CustomAsserts.containsString(ConfirmTskConfEmployeeDropdownSaveMessage.getText(), data.get("SuccessMessage").toString());
			System.out.println("Task is configured for employers successfully");
			return this;
			}
 
// public StudentConfigurationPage AddCollegePage(StringHash data) throws Exception{
//	 
//	 	Link SuccessMessage = new Link("Validation Message", byXPath("//span[. = 'The College records were successfully saved.']"));
//		String ClgName = AppendValue.apendString();
//		String ClgCode = AppendValue.apendString();
//	 
//		SearchConfiguration.waitTillElementClickable();
//		SearchConfiguration.sendKeys("Colleges");
//		ClickColleges.waitTillElementClickable();
//		ClickColleges.click();
//		wait(8);
//		newButton.waitTillElementClickable();
//		newButton.click();
//		wait(8);
//		CollegeName.waitTillElementFound();
//		CollegeName.clearAndType(ClgName);
//		wait(1);
//		CollegeCode.waitTillElementFound();
//		CollegeCode.clearAndType(ClgCode);
//		SaveAndClose.waitTillElementClickable();
//		SaveAndClose.click();
//		wait(5);
//		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
////		wait(2);
//		return this;
//		
//          }
//public StudentConfigurationPage AddCollegeCoursePage(StringHash data) throws Exception{
//	 
//	 Link SuccessMessage = new Link("Validation Message", byXPath("//span[. = 'The College Course records were successfully saved.']"));
//	 Link ClickCollege = new Link(data.get("CollegeName"), byXPath("//a[.='"+data.get("CollegeName")+"']"));
//	 String clgCourseName = AppendValue.apendString(); 
//	 String clgCourseCode = AppendValue.apendString(); 
//	 Link NewCollegeCourse = new Link("Click New", byXPath("//a[@id='newButton_CollegeCourse']"));
//	 TextField GradeRequired = new TextField("Grade", byXPath("//input[@id='minGradeRequired']"));
//	 
//	 SearchConfiguration.waitTillElementClickable();
//		SearchConfiguration.sendKeys("Colleges");
//		ClickColleges.waitTillElementClickable();
//		ClickColleges.click();
//		wait(10);
//		FilterDropDown.waitTillElementClickable();
//		FilterDropDown.click();
//		ClearFilter.waitTillElementClickable();
//		ClearFilter.click();
//		wait(5);
//		CollegeNameDropDown.waitTillElementClickable();
//		CollegeNameDropDown.click();
//		wait(2);
//		Filter.waitTillElementClickable();
//		Filter.click();
//		Collegevalue.waitTillElementClickable();
//		Collegevalue.clearAndType(data.get("CollegeName"));
//		Filter1.waitTillElementClickable();
//		Filter1.click();
//		wait(2);
//		ClickCollege.waitTillElementClickable();
//		ClickCollege.click();
//		wait(8);
//		//CollegeZipCode.clearAndType(data.get("CollegeZipCode"));
//		scrollPage(0, 1000);
//		scrollPage(0, 300);
//		wait(1);
//		NewCollegeCourse.waitTillElementClickable();
//		NewCollegeCourse.click();
//		wait(5);
//		CourseName.waitTillElementFound();
//		CourseName.sendKeys(clgCourseName);
//		System.out.println("Course Name is"+clgCourseName);
//		wait(2);
//		CourseCode.waitTillElementFound();
//		CourseCode.sendKeys(clgCourseCode);
//		wait(1);
//		System.out.println("Course Name is"+clgCourseCode);
//		CourseStartDate.waitTillElementFound();
//		CourseStartDate.clearAndType(TDate);
//		wait(2);
//		GradeRequired.waitTillElementFound();
//		GradeRequired.clearAndType("C");
//		CourseSaveClose.waitTillElementClickable();
//		CourseSaveClose.click();
//		wait(4);
//		scrollPage(0, -1000);
//		CustomAsserts.containsString(SuccessMessage.getText(), data.get("SuccessMessage").toString());
//		SaveAndClose.waitTillElementClickable();
//		SaveAndClose.click();
//		wait(2);
//		return this;
//		
//	}


public StudentConfigurationPage StudentTaskTemplateConfiguration(StringHash data) throws Exception{

		Link TaskConfigEmployeeSaveMessage = new Link("Task Config Employee SaveMessage", byXPath("//span[. = 'The Task Template records were successfully saved.']"));			
		Link SelCampus = new Link("Campus", byXPath("//li[text()='"+data.get("Campus")+"']"));
		
	//Method Implementation
		SearchConfiguration.waitTillElementClickable();
		SearchConfiguration.click();
		SearchConfiguration.clearAndType("Task Templates");
		wait(3);
		TaskTemplets.click();
		wait(10);
		New.click();
		wait(10);
		Name.clearAndType(Description1);
		TaskName=Description1;
		wait(2);
		Code.clearAndType(TaskCode);
		wait(2);
//		Campus.click();
//		wait(3);
//		SelCampus.clickUsingJavaScriptExecutor();
//		wait(3);
//		Select.clickUsingJavaScriptExecutor();
//		wait(5);
		/*Catogery.click();
    wait(5);
    SelCatogery.clickUsingJavaScriptExecutor();
    wait(3);
    String SelCatogey = SelCatogery.getAttribute("title");
    TestReportsLog.log(Status.INFO, "SelCatogeryName is selected as "+SelCatogey);
    wait(2);*/
		scrollPage(0, 500);
		wait(2);
		EventType1.clearAndType("E-Mail To Employer");
		wait(3);
		SelEventType1.click();
		wait(3);
		String SelEveentType1 = SelEventType1.getAttribute("title");
		TestReportsLog.log(LogStatus.INFO, "EventType Name is selected as "+SelEveentType1);
		wait(2);
		    EmailSubject.clearAndType(EmailSubject1);
		    wait(3);
		scrollPage(0, -200);
		wait(2);
		SaveAndClose1.click();
		wait(5);
		CustomAsserts.containsString(TaskConfigEmployeeSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Task is configured successfully");
		return this;
			}



public StudentConfigurationPage ConfirmTaskConfigurationStudentDropdown(StringHash data) throws Exception{
	
	 //X-path Parameterization
		Link ConfirmTskConfStudentDropdownSaveMessage = new Link("Confirm Task Employee Dropdown SaveMessage", byXPath("//span[. = 'The Task records were successfully saved.']"));			

		
		ContactManager.click();
		wait(5);
		TasksSpan.click();
		wait(3);
    	if(Dontsave.isDisplayed()) {
		Dontsave.waitTillElementClickable();
		Dontsave.clickUsingJavaScriptExecutor();
		}
		wait(15);
		New.click();
		wait(15);
		TaskTemplateName.clearAndType(TaskName);
		wait(2);
		SelectTaskTemplate.click();
		wait(5);
		/*Subject.click();
		scrollPage(0, 300);
		StatusSpan.click();
		wait(2);
		Status.click();*/
		EmployerInput.click();
		wait(3);
		EmployerButton.click();
		wait(3);
		Select.clickUsingJavaScriptExecutor();
		wait(2);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(ConfirmTskConfStudentDropdownSaveMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Configured task available for student");
//		New.click();
//		wait(25);
//		TaskTemplateName.clearAndType(Description1);
//		wait(2);
//		SelectTaskTemplate.click();
//		wait(5);
//		/*Subject.click();
//		scrollPage(0, 300);
//		StatusSpan.click();
//		wait(2);
//		Status.click();*/
//		Employer.click();
//		wait(3);
//		EmployerButton.click();
//		wait(2);
//		Select.clickUsingJavaScriptExecutor();
//		wait(2);
//		SaveAndClose.clickUsingJavaScriptExecutor();
//		wait(7);
		//CustomAsserts.containsString(ConfirmTskConfStudentDropdownSaveMessage.getText(), data.get("SuccessMessage").toString());
		//wait(5);
		return this;
	}

}

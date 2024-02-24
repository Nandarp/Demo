package com.framework.elements;

import static com.framework.elements.Locator.byCSSSelector;
import static com.framework.elements.Locator.byId;
import static com.framework.elements.Locator.byXPath;

import org.apache.tools.ant.taskdefs.MacroDef.Text;
import org.openqa.selenium.By;

import com.framework.base.BasePage;
import com.framework.util.DatesUtil;

public class BaseLocators extends BasePage{
	
//Generic Xpath
	protected Link StudentAccounts = new Link("Student Accounts", byXPath("//a[@aria-label='Student Accounts']"));
	protected Link Dontsave = new Link ("Dontsave",byXPath("//button[@id='cnsDirtyCheckUnsavedChangesDialogNotOkButton']"));
	protected Link ContactManager = new Link("Contact Manager", byXPath("//a[@aria-label='Contact Manager']"));
	protected Link Admissions = new Link("Admissions", byXPath("//a[@aria-label='Admissions']"));
	protected Link AcademicRecords = new Link("Academic Records", byXPath("//a[@aria-label='Academic Records']"));
	protected Link CareerServices = new Link("Career Services", byXPath("//a[@aria-label='Career Services']"));
	protected Link FinancialAid = new Link("Financial Aid", byXPath("//a[@aria-label='Financial Aid']"));
	protected Link StudentServices = new Link("Student Services", byXPath("(//a[@aria-label='Student Services'])[1]"));
	
//Xpath for Login

	protected TextField userNameTxt = new TextField("User Name", byXPath("//input[@name='loginfmt']"));
	protected Button LoginNext = new Button("Next", byXPath("//input[@id='idSIButton9']"));
	protected TextField passwordTxt = new TextField("Password", byXPath("//input[@name='passwd']"));
	protected Link SignIn = new Link("SignIn", byXPath("//input[@id='idSIButton9']"));
			
//Xpath for HomePage
	protected Link Menu = new Link("Main Menu", byXPath("//button[@id='menuButton']"));
	protected Link Students = new Link("Student tile", byXPath("//a[. = 'Students']"));
	protected Link Settings = new Link("Settings tile", byXPath("//a[text()='Settings']"));
	protected Link Groups = new Link("Groups", byXPath("//a[@title='Groups']"));
	protected Link Configuration = new Link("Configuration", byXPath("//a[@title='Configuration']"));
	protected Link Processes =  new Link("Processes",byXPath("//a[@title='Processes']"));
	protected Link Tasks =  new Link("Tasks",byXPath("//a[@title='Tasks']"));
	protected Link ClassScheduling =  new Link("ClassScheduling",byXPath("//a[@title='Class Scheduling']"));
	
//Xpath for StudentSelection
	protected Button FilterDropDwon = new Button("Filter Drop Down", byXPath("//div[@id='listSettingsButton_wrapper']/button[2]"));
	protected Button ClearFiltersButton = new Button("Filter Button", byId("listClearFiltersButton"));
	protected Dropbox StuNumDropDown = new Dropbox("Student Number Dropdown", byXPath("//th[@data-field='StudentNumber']//a/span"));
	protected Button FilterOptions = new Button("Filter", byXPath("(//span[.='Filter'])[1]"));
	protected TextField value = new TextField("Value", byXPath("//input[@title='Value']"));
	protected Button FilterButton = new Button("Filter Button", byXPath("(//span[text()='Filter'])[2]"));
	protected Dropbox CampusDropdown = new Dropbox("Campus Dropdown", byXPath("//span[@aria-owns='studentCampusIdDropDown_listbox']"));
	protected Button ApplyFilter= new Button("Apply Filter", byXPath("//button[.='Apply Filter']"));
	protected TextField StudentSearch = new TextField("Student Name Search", byXPath("//input[@id='basicSearchSearchField']"));
	
	
//XPath for Ledger post a charge
	protected Link LedgerCard = new Link("Ledger card", byXPath("//span[text()='Ledger Card']"));
	protected Link TranFilter= new Link("Setting Filter", byXPath("//*[@id='transactionGrid_cnsToolbar_kendoToolBar_settingsButton']"));
	protected Link TranClearFilter= new Link("Clear Filters", byXPath("//*[@id='transactionGrid_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
	protected Button AddCharge= new Button("Add charger", byXPath("//*[@id='newChargeButton']"));
	protected Link TermList= new Link("Term list", byXPath("//div[@id='search_display_termId']"));
	protected TextField SearchCode = new TextField("Search code", byXPath("//input[@placeholder='Search Code']"));
	protected Button SelectButton = new Button("Select button", byXPath("//button[text()='Select']"));
	protected Checkbox Term = new Checkbox("Selecting Term", byXPath("//tbody[@role='rowgroup']/tr[1]/td[1]//input[1]"));
	protected AngDropDown BillCode = new AngDropDown("Bill code", byXPath("//span[contains(@aria-controls,'billingTransactionCode')]//span[2]"));
	protected Link SelectingBillCode= new Link("Selectecting billcode", byXPath("//div[@id='billingTransactionCode-list']//li[1]//span[1]//span[1]"));
	protected TextField Amount = new TextField("Amount", byXPath("(//input[@aria-label='Amount'])[1]"));
	protected Button SaveAndClose = new Button("Save & Close", byXPath("(//button[@aria-label='Save & Close'])[2]"));
	
//Xpath for Ledger AdjustTransaction
	protected Link HighlightingCode= new Link("Highlighting Code", byXPath("(//tr/td[6])[1]"));
	protected Link SelectingTransaction = new Link("Selecting Transaction", byXPath("(//td/a)[1]"));
	protected Button CancelButton = new Button("Cancel button", byXPath("(//button[text()='Cancel'])[1]"));
	protected TextField TransactionNote = new TextField("Transaction note", byXPath("(//div/textarea[@aria-label='Note'])[1]"));
	
//Xpath for LedgerCard ReturnedCheck
	protected Link Payment = new Link("Add payment", byXPath("//*[@id='newPaymentButton']"));
	protected AngDropDown AcademicYr = new AngDropDown("Academic year dropdown", byXPath("//span[contains(@aria-owns,'academicYear')]/span/span[2]/span"));
	protected Link SelectingAYr = new Link("Selecting Academic year", byXPath("//ul[@id='academicYearSequence_listbox']/li/div/span[1]"));
	protected AngDropDown PaymentType = new AngDropDown("Payment Type", byXPath("//span[contains(@aria-controls,'paymentMethod')]/span[2]/span"));
	protected Link SelectingPayType = new Link("Selecting Payment type", byXPath("//span[text()='Cash Payment']"));
	protected AngDropDown CashPaymentCode = new AngDropDown("Cash Payment Code", byXPath("//span[contains(@aria-controls,'transactionNameDropDown')]/span[2]/span"));
	protected Link SelectingPayCode = new Link("Selecting Payment code", byXPath("//ul[@id='transactionNameDropDown_listbox']/li[1]//div//span[1]"));
	protected TextField CheckNumber = new TextField("Check number", byXPath("//input[@name='checkNumber']"));
	protected Link ReturnedCheck = new Link("Retruned Check", byXPath("//*[@id='returnedCheckTransactionButton']"));
	protected Button ReturnedCheckOk = new Button("Retruned Check Ok", byXPath("//button[@id='okReturnedCheck']"));
	protected TextField ReturnNote = new TextField("Retruned Check Note", byXPath("//textarea[@name='studentTransactionReturnedCheckNote']"));
	protected Link CashDrawerDropdown= new Link("CashDrawerDropdown",byXPath("//span[@aria-controls='cashDrawerSessionId_listbox']/span[2]/span"));
	protected Link CashDrawerselect = new Link("CashDrawerselect",byXPath("//ul[@id='cashDrawerSessionId_listbox']/li[1]"));
	protected Link Highligthing1= new Link("Highlighting record", byXPath("(//tr[1]/td[2])[1]"));
	protected Link More= new Link("More", byXPath("//*[@id='ledgerCardMoreButton']"));
	protected Link Void= new Link("Void", byXPath("//*[@id='voidTransactionButton']"));
	protected TextField VoidNote = new TextField("Void note", byXPath("//textarea[@id='studentTransactionVoidPaymentNote']"));
	protected Button Voidbutton = new Button("Void button", byXPath("//*[@id='okVoidPayment']"));
	protected Link AlertMsg= new Link("Capturing alert message", byXPath("//span[@role='status']"));
	
	
//Xpath for LedgerCard Delete
	protected Button Delete = new Button("Delete icon", byXPath("//*[@id='deleteTransactionButton']"));
	protected TextField DeleteNote = new TextField("Delete note", byXPath("(//div/textarea[@aria-label='Note'])[1]"));
	protected Button Deletebutton = new Button("Delete button", byXPath("//*[@id='okDelete']"));
	

//Xpath for Ledger Print
	protected Link PrintLedger = new Link("PrintLedger", byXPath("//*[@id='printLedgerButton']"));
	protected TextField IncludeCourseDetail = new TextField("Include Course Detail", byXPath("//span[contains(@aria-controls,'includeCourseDetail')]/span[2]"));
	protected Link SelectingIncCorDet= new Link("Selecting Include Course deatails", byXPath("(//ul[@id='includeCourseDetail_listbox']/li[1])"));
	protected Button PrintButton = new Button("Print button", byXPath("(//button[@id='okVoid'])[2]"));
	protected Link PrintRegistrationBill = new Link("Print Registration Bill", byXPath("//*[@id='printRegistrationBillButton']"));Link SubTransVoidSaveMessage = new Link("SubTransVoidSaveMessage", byXPath("//span[. = 'The Student Subsidiary records were successfully voided.']"));			
	protected Button PrintDetail = new Button("Print Detail", byXPath("//button[@id='printRegBillDetail']"));
	protected Button PrintSummary = new Button("Print Summary", byXPath("//button[@id='printRegBillSummary']"));
	protected Button Cancel = new Button("Cancel", byXPath("//button[@id='cancelPrintReceipt']"));
	protected Link Printicon = new Link("Print icon", byXPath("//*[@id='ReportViewer1_ctl09_ctl04_ctl00_ButtonImg']"));
	protected Button PrintOK = new Button("Print Ok", byXPath("(//p[text()='Print'])[2]"));
	protected Link PDFdownload = new Link("PDF download", byXPath("//a[@title='PDF']"));
	protected Button Done = new Button("Done", byXPath("//p[text()='Done']"));
	
//Xpath for ApplyCredits
	protected Button ApplyCreditsButton = new Button("Apply credits button", byXPath("//button[text()='Apply Credits']"));
	protected Link TransatcionList1 = new Link("Transaction List", byXPath("//span[contains(@aria-controls,'transactionTypeId')]/span[2]"));
	protected Link CreditFiler = new Link("Filter icon", byXPath("(//*[@id='cnsApplyCreditGrid_cnsToolbar_kendoToolBar_settingsButton_wrapper'])"));
	protected Link CreditClearFilters= new Link("Clear Filters", byXPath("//*[@id='cnsApplyCreditGrid_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
	protected AngDropDown TranDate = new AngDropDown("TranDate", byXPath("//th[@data-field='TransactionDate']//a"));
	protected Button Filter1 = new Button("Click Filter", byXPath("(//span[.='Filter'])[1]"));
	protected TextField Value1 = new TextField("Enter filter value1", byXPath("//input[@title='Value'][1]"));
	protected Button Filterbutton = new Button("Filter icon", byXPath("(//span[text()='Filter'])[2]"));
	protected Link HighlightingTransaction= new Link("Highlighting transaction", byXPath("(//tr[4]/td[5])[1]"));
	protected Button ApplyCredit= new Button("Apply credit button", byXPath("//*[@id='applyCredit']"));
	protected Link SelectingAmount= new Link("SelectingAmount", byXPath("//div[@id='manualApplyDialog']//tr[1]/td[4]"));
	protected TextField EnteringAmount= new TextField("EnteringAmount", byXPath("//td[@id='cnsManualApplyGrid_cmcGrid_active_cell']//input[2]"));
	protected Button ApplyButton= new Button("Apply Button", byXPath("//button[@id='manualApplySaveButton']"));
	protected Checkbox ApplyAmount= new Checkbox("Apply Button", byXPath("//div[@id='cnsAutoApplyGrid_cmcGrid']//tr[1]/td[1]/input"));
	
//Xpath for Schedule refund
	protected Link RefundFilter = new Link("Filter Setting", byXPath("//*[@id='refundFundSourceGrid_cnsToolbar_kendoToolBar_settingsButton']"));
	protected Button Refunds = new Button("Refunds", byXPath("//button[text()='Refunds']"));
	protected Link RefundClearFilter= new Link("Clear Filters", byXPath("//*[@id= 'refundFundSourceGrid_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
	protected AngDropDown FundSource = new AngDropDown("Fund Source", byXPath("(//th[1]//span)[1]//a"));
	protected Link HighlightingFundSource= new Link("Highlighting Fund Source", byXPath("(//tr[1]/td[1])[1]"));
	protected Button RefundNext = new Button("Next button", byXPath("//button[text()='Next']"));
	protected Link RefundOption = new Link("Refund option", byXPath("//span[contains(@aria-controls,'type')]//span[2]"));
	protected Link RefundTerm= new Link("Term dropdown", byXPath("(//*[@aria-label='expand combobox'])[2]"));
	protected Link SelectingTerm= new Link("Selecting term", byXPath("//ul[@id='termId_listbox']/li[1]//div/span[1]"));
	protected TextField DueDate= new TextField("Due Date", byXPath("//input[@id='dueDate']"));
	protected TextField DateSend= new TextField("DateSend", byXPath("//input[@id='dueDate']"));
	protected Link ReturnMethod = new Link("Return Method", byXPath("//span[contains(@aria-controls,'returnMethod')]/span[2]"));
	protected Link SelectingReturnMethod= new Link("Selecting Return Method", byXPath("(//ul[@id='returnMethod_listbox']/li[1]/span)"));
	protected Button PostSchedule = new Button("Post schedule", byXPath("(//button[@aria-label='Post/Schedule'])[2]"));
//	protected TextField DateSend= new TextField("DateSend", byXPath("//input[@id='dueDate']"));
	
//Xpath for Schedule Stipend
	protected Link StipendSchedule = new Link("Stipend Schedule", byXPath("//span[text()='Stipend Schedule']"));
	protected Link NewStipend = new Link("New Stipend", byXPath("//*[@id='newScheduledStipendButton']"));
	protected Link SelectingFundSourceST= new Link("Selecting FundSource", byXPath("//ul[@id='fundSourceId_listbox']/li[1]//div/span[1]"));
	protected AngDropDown TermDropDown = new AngDropDown("Term", byXPath("(//button[@aria-label='expand combobox'])[3]"));
//			protected Link SelectingReturnMethod= new Link("Selecting return method", byXPath("(//ul[@id='returnMethod_listbox']/li[2]/span)"));
	protected TextField Datescheduled= new TextField("Date scheduled", byXPath("//input[@name='scheduledDate']"));
	protected Button ScheduleOk = new Button("Schedule Ok", byXPath("//button[@id='scheduledStipendSaveButton']"));
	protected TextField NetAmount= new TextField("Net Amount", byXPath("(//input[@aria-label='Net Amount'])[1]"));
	protected Button Save = new Button("Save", byXPath("(//button[@aria-label='Save'])[2]"));
	protected Link FundSourceDrp = new Link("FundSource Dropdown", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link StipendTerm= new Link("Term dropdown", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link StatusDropdown = new Link("Status", byXPath("//span[@aria-label='Status']/span[2]"));
	
//Xpath for School Defined Fields
	protected Link SchoolFieldsStdAcc = new Link("School fields", byXPath("(//span[text()='School Fields'])[5]"));
	protected Link SchoolFieldsAdmission = new Link("School fields", byXPath("(//span[text()='School Fields'])[1]"));
	protected Link SchoolFieldsStdserv = new Link("School fields", byXPath("(//span[text()='School Fields'])[6]"));
	protected Link SchoolFieldsCarserv = new Link("School fields", byXPath("(//span[text()='School Fields'])[3]"));
	protected Link SchoolFieldsFinAid = new Link("School fields", byXPath("(//span[text()='School Fields'])[4]"));
	protected Link SchoolFieldsAcademic = new Link("School fields", byXPath("(//span[text()='School Fields'])[2]"));
	protected Button HousingSchoolFields = new Button("Housing School Fields", byXPath("//button[text()='Housing School Fields']"));

//Xpath for HousingApplication
	protected Link HousingApplications = new Link("School fields", byXPath("//span[text()='Housing Applications']"));
	protected AngDropDown BuildingCategory = new AngDropDown("Desired building category", byXPath("//span[contains(@aria-controls,'actionNumber0')]/span"));
	protected Link SelectingBuildCategory = new Link("Selecting Category", byXPath("(//ul[@id='actionNumber0_listbox']/li/div/span[1])[1]"));
	protected AngDropDown RoomCategory = new AngDropDown("Desired room category", byXPath("//span[contains(@aria-controls,'actionNumber1')]/span"));
	protected Link SelectingRoomCategory = new Link("Selecting room Category", byXPath("(//ul[@id='actionNumber1_listbox']/li/div/span[1])[1]"));
	protected AngDropDown Building = new AngDropDown("Desired building", byXPath("//span[contains(@aria-controls,'actionNumber2')]/span"));
	protected Link SelectingBuilding = new Link("Selecting Building", byXPath("(//ul[@id='actionNumber2_listbox']/li/div/span[1])[1]"));
	protected TextField NoRoomates = new TextField("No Roomates", byXPath("//label/span[text()='No']"));
	protected AngDropDown HousingTerm = new AngDropDown("Term List", byXPath("//span[contains(@aria-controls,'actionNumber4')]/span"));
	protected Link SelectingHousingTerm = new Link("Selecting Term", byXPath("(//ul[@id='actionNumber4_listbox']/li/div/span[1])[1]"));
	protected Button SaveAndClose3 = new Button("Save and Close", byXPath("(//button[@aria-label='Save & Close'])[3]"));
	protected Link ProgramVersion = new Link("Program versions", byXPath("(//span[@id='programVersionDropDown'])[1]"));
	protected Link SelectingAllProgramVersion = new Link("Selecting All Program versions", byXPath("//a[text()='All Program Versions']"));
	protected Button New = new Button("New Button", byXPath("//*[@id='newButton']"));
	
//Xpath for Configure Apply PaymentFlag
	protected TextField SearchSettings = new TextField("Search Settings", byXPath("//input[@placeholder='Search Settings']"));
	protected TextField Name = new TextField("Name", byXPath("//input[@id='name']"));
	protected TextField Code = new TextField("Code", byXPath("//input[@id='code']"));
	protected Link GeneralSA = new Link("General Student Accounts", byXPath("(//span[text()='General'])[1]"));
	protected Button Filtericon = new Button("Filter icon", byXPath("//button[contains(@id,'cnsToolbar_kendoToolBar_settingsButton')]"));
	protected Link ClearFilters= new Link("Clear Filters", byXPath("//*[text()= 'Reset to Default']"));
	protected Link SettingsList= new Link("Settings List", byXPath("//th[@data-field='ShortDisplayText']//a[1]"));
	protected Button SettingsFilter = new Button("Click Filter", byXPath("(//span[.='Filter'])[1]"));
	protected TextField SettingsValue = new TextField("Enter value", byXPath("(//input[@title='Value'])[2]"));
	protected Button SettingsFilterButton = new Button("Click Settings Filter", byXPath("(//button[.='Filter'])"));
	protected Link SelectingApplyPayment= new Link("Selecting apply payment flag link", byXPath("//*[text()='Apply Payment Flag']"));
	protected Link ApplyPaymentFlag= new Link("Apply payment flag dropdown", byXPath("//span[contains(@aria-controls,'settingValueDrp')]/span[2]"));
	protected Link SelectingFlag= new Link("Selecting apply payment flag", byXPath("//ul[@id='settingValueDrp_listbox']/li[2]/span"));
	protected Button Save1 = new Button("Save",byXPath("(//button[text()='Save'])[1]"));
	
//Xpath for Document Policy
	protected Link DocumentPolicies = new Link("Document Policies", byXPath("//span[text()='Document Policies']"));
	protected Link Module= new Link("Module", byXPath("//span[contains(@aria-controls,'module')]/span[2]"));
	protected Button SaveAndClose1 = new Button("Save & CLose",byXPath("//button[@aria-label='Save & Close']"));
	
//Xpath for School Defined Field New
	protected Link SchoolDFields = new Link("School Defined Fields", byXPath("//span[text()='School Defined Fields']"));
	protected TextField NameSchl = new TextField("School field Name", byXPath("//input[@name='fieldDescription']"));
	protected AngDropDown DataType= new AngDropDown("Data Type", byXPath("//span[contains(@aria-controls,'dataType')]/span[2]"));
	protected Link SelectingDataType = new Link("Selecting data type", byXPath("//span[text()='Character']"));
	protected AngDropDown TypeValidation= new AngDropDown("Type validation", byXPath("//span[contains(@aria-controls,'validationType')]/span[2]"));
	protected Link SelectingValidType = new Link("Selecting validation type", byXPath("//span[text()='None']"));
	protected TextField Length = new TextField("Length", byXPath("//input[@aria-label='Length'][1]"));
	protected Checkbox SelectingView = new Checkbox("Selecting View Checkbox", byXPath("//input[@aria-label='Select All View']"));
	protected Checkbox SelectingEdit = new Checkbox("Selecting Edit Checkbox", byXPath("//input[@aria-label='Select All Edit']"));
	
//Xpath for Document Schedule
	protected TextField SearchConfiguration = new TextField("Search Configuration", byXPath("//input[@placeholder='Search Configuration']"));
	protected Link DocumentSchedules = new Link("Document schedules", byXPath("//span[text()='Document Schedules']"));
	protected Link campus= new Link("campus", byXPath("//div[@id='search_display_campusIdList']"));
	protected TextField Search= new TextField("search", byXPath("//input[@id='search']"));
	protected Checkbox Uncheck= new Checkbox("check", byXPath("//input[@id='checkAll']"));
	protected Link SelectingSearchCriteria1 = new Link("Selecting Search Criteria", byXPath("//div[@id='schedDocSchedCriteriaItem']/div/ul/li[1]/div/span"));
	protected Checkbox DependentStatus1 = new Checkbox("Dependent status", byXPath("//div[@id='searchModel_searchgrid}']//tr[1]/td[1]/input"));
	protected Checkbox SelectingDocument1 = new Checkbox("Selecting document", byXPath("//div[@id='$ctrl.cmcId}']//tr[1]/td[1]/input"));
	protected Link Select= new Link("Select", byXPath("//button[.='Select']"));
	protected Checkbox cacheckcampus= new Checkbox("campus", byXPath("//tr/td/input"));
	protected Link ScheduleCriteria = new Link("Schedule Criteria", byXPath("//a[contains(text(),'Schedule Criteria')]"));
	protected TextField SearchCriteria = new TextField("Search Criteria", byXPath("//input[@id='schedDocSchedCriteriaItem-filter']"));
	protected Link SelectingSearchCriteria = new Link("Selecting Search Criteria", byXPath("//span[. = 'Dependency Status']"));
	protected Link Arrowmark = new Link("Arrow mark", byXPath("//div[@id='schedDocSchedCriteriaMoveButton']//i[2]"));
	protected TextField Value = new TextField("Value", byXPath("//div[@id='search_display_MODEL']"));
	protected Checkbox DependentStatus = new Checkbox("Dependent status", byXPath("//input[@aria-label='Dependent']"));
	protected Link DocumentCriteria = new Link("Document Criteria", byXPath("//div/a[contains(text(),'Documents')]"));
	protected Link AddDocument= new Link("Add document", byXPath("//span[text()='Document']"));
	
//Xpath for TaskTemplate
	protected Link TaskTemplates = new Link("Task Templates", byXPath("//span[text()='Task Templates']"));		
	protected TextField EventType = new TextField("EventType", byXPath("//input[@name='taskTypeId_input']"));
	protected Link SelectingEventType = new Link("Selecting Event Type", byXPath("//span[. = 'Meeting']"));	
	protected Checkbox FirstInput = new Checkbox("Select", byXPath("//tr[1]/td[1]/input"));
	
//Xpath for DocumentType
	protected Link Documents = new Link("Documents", byXPath("//span[text()='Documents']"));
	protected TextField CampusesGroup = new TextField("Campuses DCRC", byXPath("//div[contains(@aria-label,'Campus Group')]"));
	protected Checkbox SelectingCampus1 = new Checkbox("Selecting campus", byXPath("(//tr/td/input)[1]"));
	protected Link SelectingDocumentType1 = new Link("Selecting DocumentType", byXPath("//ul[@id='directionType_listbox']/li[1]"));
	protected TextField DocumentType = new TextField("DocumentType", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected AngDropDown ModuleInput = new AngDropDown("Module", byXPath("//input[@name='moduleId_input']"));
	
//Xpath for Subsidiary
	protected Link Subsidiaries = new Link("Subsidiaries", byXPath("//span[text()='Subsidiaries']"));
	protected Checkbox SelectingCode = new Checkbox("Selecting Code", byXPath("(//td[@role='gridcell']/input)[1]"));
	protected Link TransactionCodes = new Link("Transaction codes", byXPath("//div[@id='search_display_transactionCode']"));
	
//Xpath for AddSMS
	protected Link SMSProvidersSpan = new Link("SMSProvidersSpan", byXPath("//span[. = 'SMS Service Providers']"));
	protected TextField DomainName = new TextField("DomainName", byCSSSelector("#domainName"));
	protected TextField MaxLength = new TextField("MaxLength", byCSSSelector("#maximumMessageLength"));
	protected Button SaveButton1 = new Button("Save", byXPath("(//button[@aria-label='Save'])[1]"));
	
//Xpath for Add New Employer
	protected Link EmployersSpan = new Link("EmployersSpan", byXPath("//span[. = 'Employers']")); 
	protected TextField EmployerName = new TextField("EmployerName", byCSSSelector("#employerName"));
	protected TextField EmployerCode = new TextField("EmployerCode", byXPath("//input[@id='employerCode']"));
	protected TextField EMailAddress = new TextField("EMailAddress", byCSSSelector("#employerEmailAddress"));
	protected TextField StreetAdress = new TextField("StreetAdress", byCSSSelector("#streetAddress"));
	protected TextField City = new TextField("City", byCSSSelector("#city"));
	protected TextField PIN = new TextField("PIN", byXPath("(//input[@aria-label='Postal Index Number'])[1]"));
	protected TextField PhoneNum = new TextField("PhoneNum", byCSSSelector("#phoneNumber"));
	protected TextField EmployeeExtension = new TextField("EmployeeExtension", byCSSSelector("#employeExtension"));
	
//Xpath for Configuring Promisory Note
	protected Link FundSourcesSpan = new Link("FundSourcesSpan", byXPath("//span[. = 'Fund Sources']"));
	protected Link CodeSpan = new Link("CodeSpan", byXPath("//th[2]/a/span"));
	protected Link RulesAndAttributesCollapse = new Link("RulesAndAttributesCollapse", byXPath("//a[contains(text(),'Rules and Attributes')]"));
	protected Link PromissoryNote = new Link("PromissoryNote", byXPath("//input[@id='isPromissoryNoteAllowed']"));
	protected Dropbox PromCampusDropdown = new Dropbox("Campus Dropdown", byXPath("//span[contains(@aria-owns,'campusDropDown')]/span/span[2]/span"));
	
//Xpath for Add Promisory Note
	protected Link PromissoryNoteButton = new Link("PromissoryNote", byXPath("//button[. = 'Promissory Note']"));
	protected Button CancelProm = new Button("Cancel", byXPath("//button[@id='cancelPromissoryNoteLetterPrint']"));
	
//Xpath for Add Document and DocumentList
	protected Link NewDocument = new Link("New Document", byXPath("//*[text()='New Document']"));
	protected Link NewDocumentList = new Link("New DocumentList", byXPath("//*[text()='New Document List']"));
	protected TextField DocModule = new TextField("Module", byXPath("//input[@name='studentDocModule_input']"));
	protected Link SelectingModule= new Link("Selecting Module", byXPath("(//span[text()='Career Services'])[1]"));
	protected TextField DocumentList = new TextField("Document List", byXPath("//input[@name='studentDocName_input']"));
	protected Link SelectingDocumentList= new Link("Selecting Document List", byXPath("//span[text()='Fakey Doc List']"));
	protected TextField Document = new TextField("Document", byXPath("(//button[@aria-label='expand combobox'])[6]"));
	//static Link SelectingDocument= new Link("Selecting Document", byXPath("//span[text()='NewDocument']"));
	protected TextField DocumentStatus = new TextField("Document Status", byXPath("//input[@name='studentDocStatus_input']"));
	protected Link SelectingDocumentStatus= new Link("Selecting Document Status", byXPath("//span[text()='NOTSENT']"));
	protected Link SaveAndCloseDocument= new Link("Save and close document", byXPath("//*[@id='studentDocumentSaveAnCloseButton']"));
	protected Link SaveAndCloseDocumentList= new Link("Save and close document", byXPath("//*[@id='studentDocumentListSaveAnCloseButton']"));
	protected Link SelectingDocument= new Link("Selecting document", byXPath("//ul[@id='studentDocName_listbox']/li[1]//div/span[1]"));
	protected Link SelectingDocumentStatus1= new Link("Selecting Document Status", byXPath("//ul[@id='studentDocStatus_listbox']/li[1]//div/span[1]"));
	protected TextField DocList = new TextField("Doc List", byXPath("//input[@name='studentDocName_input']"));
	
//Xpath for Add Task To Student   
	protected Link TasksSpan = new Link("TasksSpan", byXPath("//span[text()='Tasks']"));
	protected Button TaskTemplateSpan = new Button("TaskTemplateSpan", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected TextField Subject = new TextField("Subject", byCSSSelector("[name='subject']"));
	protected Button StatusSpan = new Button("StatusSpan", byXPath("//span[contains(@aria-controls,'taskStatusId')]/span[2]/span"));
	protected Link TaskSettings = new Link("Settings",byXPath("//button[contains(@id,'cnsToolbar_kendoToolBar_settingsButton')]"));
	protected Link TaskClearFilter = new Link("Clear Filter",byXPath("//*[contains(@id,'cnsToolbar_kendoToolBar_clearPreferencesButton')]")); 
	protected TextField Subjectdropdown = new TextField("Subject Dropdown",byXPath("//th[@data-field='Subject']//a[1]/span"));
	
//Xpath for Edit Pending Task by Student
	protected TextField Statusdropdown = new TextField("Status Dropdown",byXPath("//th[@data-field='TaskStatusName']//a[1]/span"));
	protected Button FilterOptions2 = new Button("Filter options", byXPath("(//span[text()='Filter'])[3]"));
	protected TextField Value2 = new TextField("Enter filter value", byXPath("(//input[@title='Value'])[2]"));
	protected Button Filterbutton2 = new Button("Filter icon", byXPath("(//span[text()='Filter'])[4]"));
	protected Link SelectStatus = new Link("StatusDropdownValue", byXPath("//div/ul[@id='taskStatusId_listbox']/li[2]//div/span[1]"));
	protected TextField Note = new TextField("Note", byCSSSelector("[name='noteTextArea']"));
	
//Xpath for CLose Task
	protected Button ActivityResultSpan = new Button("ActivityResultSpan", byXPath("//span[contains(@aria-controls,'taskResultId')]/span[2]/span"));
	protected Link ActivityResultDropDown = new Link("Activity result", byXPath("//div/ul[@id='taskResultId_listbox']/li[1]"));
	
//Xpath for Tasks for Staff
	protected Link StaffTaskSettings = new Link("Filter Settings", byXPath("//div[@id='listSettingsButton_wrapper']"));
	protected Link StaffTaskClearFilter = new Link("Clear Filter", byXPath("//*[@id='listClearFiltersButton']"));
	protected TextField SearchSubject = new TextField("Search subject", byXPath("//input[@id='basicSearchSearchField']"));
	protected Button TaskSaveAndClose = new Button("SaveAndClose", byCSSSelector("#formSaveCloseButton"));
	
//Xpath for Update Admin Rep for Student
	protected Link RecruitInformationSpan = new Link("RecruitInformationSpan", byXPath("//a[contains(text(),'Recruitment Information')]"));
	protected TextField AdminRepSpan = new TextField("AdminRepSpan", byXPath("//div[@id='search_display_recruitAssignedAdmissionsRep']/div"));
	protected Link AdminRepCheckBox1 = new Link("AdminRepCheckBox", byXPath("(//td/input)[1]"));
	protected Link AdminRepCheckBox2 = new Link("AdminRepCheckBox", byXPath("(//td/input)[2]"));
	protected Button SaveAgain = new Button("SaveAgain", byXPath("//button[@id='reassignLeadSaveButton']"));
	
//Xpath for Batch Admin Rep Reassignment
	protected TextField SearchProcessess = new TextField("SearchProcessess", byCSSSelector("#daily-processes-treeview-filter"));
	protected Link ReassignProspectsSpan = new Link("ReassignProspectsSpan", byXPath("//span[. = 'Reassign Prospects']"));
	protected TextField ProspectStartDate = new TextField("StartDate", byCSSSelector("#prospectStartDate"));
	protected TextField ProspectEndDate = new TextField("EndDate", byCSSSelector("#prospectEndDate"));
	protected Button Next = new Button("Next", byXPath("//button[. = 'Next']"));
	protected Link QueueApprove = new Link("QueueApprove", byCSSSelector("#queueApproveButton"));
	protected Button Queue = new Button("Queue button", byXPath("//button[@id='saveSubmitBatchPackingJob']"));
	
//Xpath for Revenue Recognization
	protected Link RevenueRecognitionSpan = new Link("RevenueRecognitionSpan", byXPath("//span[. = 'Revenue Recognition']"));
	protected Dropbox RevenueCampusDropdown = new Dropbox("Campus Dropdown", byXPath("//th[@data-field='CampusName']//a"));
	protected Button FilterButton1 = new Button("Filter", byXPath("//button[.='Filter']"));
	protected TextField StartDateTableCell = new TextField("StartDateTableCell", byXPath("//td[3]"));
	protected TextField RevenueStartDate = new TextField("StartDateTableCell", byXPath("//td[@id='revenueBatchGrid_cmcGrid_active_cell']//input"));
	protected TextField EndDateTableCell = new TextField("EndDateTableCell", byXPath("//td[4]"));
	protected TextField RevenueEndDate = new TextField("EndDate", byXPath("//td[@id='revenueBatchGrid_cmcGrid_active_cell']//input"));
	protected Link QueueBatches = new Link("QueueBatches", byXPath("//*[@id='queueButton']"));
	protected Button OpenBatches = new Button("OpenBatches", byXPath("//button[. = 'Open Batches']"));
	protected Link ErrorMessage = new Link("Error Message", byXPath("//span[@role='alert']"));
	protected Checkbox Input = new Checkbox("Input", byXPath("(//label[@class='k-checkbox-label k-no-text'])[2]"));
	protected Link QueuePost = new Link("QueuePost", byXPath("//*[@id='queuePostButton']"));
	protected Button QueueOpenBatch = new Button("Queue", byXPath("//button[@id='openBatchNameJob']"));
	
//Xpath for Verify SMS Configuration
	protected Link ContactInformationSpan = new Link("ContactInformationSpan", byXPath("//a[contains(text(),'Contact Information')]"));
	protected Link SubscribeToSMSCheckBox = new Link("SubscribeToSMS", byXPath("//input[@id='subscribeToSms']"));
	protected TextField SMSServiceProvider = new TextField("SMSServiceProvider", byCSSSelector("[name='smsProvider_input']"));
	protected TextField AddressType = new TextField("AddressType", byXPath("//input[@name='oldAddrAddressType_input']"));
	protected Button SaveAddress = new Button("Save", byXPath("//button[@id='oldAddressSaveButton']"));
	
//Xpath for RefundCalculation
	protected Link RefundCalculationsSpan = new Link("RefundCalculationsSpan", byXPath("//span[. = 'Refund Calculations']"));
	protected Link NewCalculation = new Link("New", byXPath("//*[@id='newRefundCalculationButton']"));
	protected TextField CalculationName = new TextField("CalculationName", byCSSSelector("[name='refundCalcDescription']"));
	protected Button Calculate = new Button("Calculate", byXPath("//button[. = 'Calculate']"));	
	protected TextField LastDayAttended = new TextField("LastDayAttended", byXPath("//input[@name='lastDayAttended']"));
	protected Button Update = new Button("Update", byXPath("//button[@id='focusedButton']"));
	protected TextField RefundCalTerm = new TextField("Term", byXPath("//span[@aria-controls='institutionTerm_listbox']/span[2]"));
	protected Link SelectingRefundTerm = new Link("New", byXPath("//ul[@id='institutionTerm_listbox']//li[1]//div/span"));
	
//Stipend Schedule
	
	protected Link StipendScheduleSS = new Link("Stipend Schedule", byXPath("//span[.=\"Stipend Schedule\"]"));
	protected Button FAStudentAY = new Button("FA Student AY", byXPath("//span[@aria-label=\"FA Student AY: Dropdown\"]"));
	protected TextField TotalAmount = new TextField("Total Amount", byXPath("//input[1][@aria-label=\"Total Amount\"]"));
	protected Button Status = new Button("Status", byXPath("//span[@aria-label=\"Status: Dropdown\"]"));
	//static Button SelectApproved = new Button("Select Status", byXPath("//li[.=\"Approved\"]"));
	protected TextField NoOfStipends = new TextField("Number of Stipends", byXPath("//input[1][@aria-label=\"Number of Stipends\"]"));
	protected TextField FirstScheduledDate = new TextField("First Scheduled Date", byId("firstPaymentDate"));
	protected Button CalculateSS = new Button("Calculate Button", byId("calculateScheduledStipendButton"));
	protected Link SelectLinkFundSource = new Link("Select Fund Source", byXPath("//a[text()='<Select>']"));
	protected Button FundSourceSpanSS = new Button("Fund Source Span", byXPath("(//button[@aria-label='expand combobox'])[2]/span[1]"));
	protected TextField EnterFundSource = new TextField("Fund Source", byXPath("//input[@aria-owns=\"fundSourceId_listbox\"]"));
	//static TextField EnterFundSource = new TextField(" Fund Source", byXPath("//input[@aria-owns=\"fundSourceId_listbox\"]"));
	//static Button SelectFundSource = new Button(" Fund source", byXPath("//span[.=\"Direct PLUS Loan\"]"));
	//protected TextField DateScheduled = new TextField("Date Scheduled", byName("scheduledDate"));
	protected Button Ok = new Button("Ok", byId("scheduledStipendSaveButton"));
	protected Button SaveSS = new Button("Save", byXPath("(//button[@aria-label=\"Save\"])[2]"));
	protected TextField StipendAmount = new TextField("Stipend Amount", byXPath("//input[1][@aria-label=\"Net Amount\"]"));
	protected String TDate = DatesUtil.getCurrentDatebyFormat("M/dd/yyyy");
	
//XPath for Release to General Ledger
	protected Link ReleaseToGeneralLedger = new Link("ReleaseToGeneralLedger", byXPath("//span[. = 'Release to General Ledger']"));
	protected TextField CampusGroupSearch = new TextField("CampusGroupSearch", byXPath("//div[@id='search_display_campusGroup']"));
	protected TextField CampusGroup = new TextField("CampusGroup", byXPath("//input[@placeholder = 'Search Name']"));
	protected Checkbox CampusSelect = new Checkbox("Campus", byXPath("//td/input"));
	protected TextField GLFromDate = new TextField("FromDate", byXPath("//input[@id='releaseToGLstartDate']"));
	protected TextField GLToDate = new TextField("ToDate", byXPath("//input[@id='releaseToGLEndDate']"));
	protected Link QueueGL = new Link("QueueBatch", byXPath("//*[@id='queueGeneralLedgerButton']"));
	protected Link QueueRelease = new Link("QueueRelease", byXPath("//*[. = 'Queue Release']"));
	protected Button Submit = new Button("Submit", byXPath("//button[text()='Submit']"));
	
//Xpath for Verify Unapproved Aid
	protected Link ApprovePackagedAidSpan = new Link("ApprovePackagedAidSpan", byXPath("//span[. = 'Approve Packaged Aid']"));
	protected Checkbox StudentSelection1 = new Checkbox("StudentSelection1", byXPath("//tr[1]/td/input"));
	protected Checkbox StudentSelection2 = new Checkbox("StudentSelection2", byXPath("//tr[2]//input"));
	protected Checkbox StudentSelection3 = new Checkbox("StudentSelection3", byXPath("//tr[3]//input"));
	protected Checkbox StudentSelection4 = new Checkbox("StudentSelection4", byXPath("//tr[4]//input"));
	protected Checkbox StudentSelection5 = new Checkbox("StudentSelection5", byXPath("//tr[5]//input"));
	protected Link ResultsArrowCollapse = new Link("ResultsArrowCollapse", byXPath("//a[contains(text(),'Results')]"));
	protected Button QueueButton = new Button("Queue", byXPath("//button[. = 'Queue']"));
	protected Button History = new Button("History", byXPath("//button[. = 'History']"));
	protected Link Reload = new Link("Reload", byXPath("//*[@title='Reload']"));
	protected Link BatchStatus = new Link("BatchStatus", byXPath("//tr[1]/td[12][. = ' Succeeded']"));
	
//Xpath for SchedulePaymentPlan
	protected Link PaymentScheduleSpan = new Link("PaymentScheduleSpan", byXPath("//span[. = 'Payment Schedule']"));
	protected Button CalculateButton = new Button("Calculate", byXPath("//*[@id='calculateButton']"));
	protected Button SavePaymentSch = new Button("Save", byXPath("(//*[@id='cashOthersSaveButton'])"));
	protected TextField AwardYearInput = new TextField("AwardYear", byXPath("//input[@aria-owns='awardYearId_listbox']"));
	protected TextField FundSourceInput = new TextField("FundSource", byXPath("//input[@aria-owns='sourceId_listbox']"));
	protected TextField GrossAmountSpan = new TextField("GrossAmount", byXPath("(//input[@aria-label='Gross Amount'])[1]"));
	protected TextField GrossAmount = new TextField("GrossAmount", byXPath("//input[@name='grossAmount']"));

//Xpath for Billable Service
	protected Link BillableServicesSpan = new Link("BillableServicesSpan", byXPath("//span[. = 'Billable Services']"));
	protected Button TermSpan = new Button("TermSpan", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link SelectBillTerm = new Link("Term", byXPath("//ul[@id='TermId_listbox']/li[1]/span//span[1]"));
	protected Button ProgramVersionSpan = new Button("ProgramVersionSpan", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link SelectBillProgramVersion = new Link("ProgramVersion", byXPath("//ul[@id='EnrollmentId_listbox']/li[1]/span//span[1]"));
	protected Button ServiceCategorySpan = new Button("ServiceCategorySpan", byXPath("//span[contains(@aria-controls,'CategoryId')]/span[2]"));
	protected Link ServiceCategory = new Link("ServiceCategory", byXPath("//ul[@id='CategoryId_listbox']/li[1]/span//span[1]"));
	protected Button ServiceSpan = new Button("ServiceSpan", byXPath("//span[contains(@aria-controls,'ServiceId')]/span[2]"));
	protected Link Service = new Link("Service", byXPath("//ul[@id='ServiceId_listbox']/li[1]"));
	
//Xpath for Estimated FA packaging
	protected Link EstimatesSpan = new Link("EstimatesSpan", byXPath("//span[text()='Estimates']"));
	protected Button FAProgramVersionSpan = new Button("ProgramVersionSpan", byXPath("//span[@aria-label='Program Version']/span[2]/span"));
	protected Link ProgramVersionDropDown = new Link("ProgramVersion", byXPath("//ul[@id='estimateProgramVer_listbox']/li[1]"));
	protected AngDropDown BeginningAwardYear = new AngDropDown("BeginningAwardYear", byXPath("//span[contains(@aria-controls,'estimateFirstAwardYear_listbox')]/span[2]/span"));
	protected TextField EnterBeginningAwardYear = new TextField("EnterBeginningAwardYear", byXPath("//input[@aria-controls='estimateFirstAwardYear_listbox']"));
	protected TextField TotalProgramCOAValue = new TextField("TotalProgramCOAValue", byCSSSelector("[name='estimateTotalCoa']"));
	protected TextField TotalProgramCOAValueInput = new TextField("TotalProgramCOAValue", byCSSSelector("(//input[@aria-label='Total Program COA'])[1]"));
	protected Button Recalculate = new Button("Recalculate", byXPath("//button[@id='estimateCoaChangeConfirmationDialogOkButton']"));
	protected Button CalculateEFC = new Button("CalculateEFC", byCSSSelector("#calculateEfcBtn"));
	protected Button CalculatePell = new Button("CalculatePell", byCSSSelector("#calculatePellBtn"));	
	protected Button SaveFA = new Button("Save", byId("studentEstimateSaveButton"));
	
//Xpath for Post Federal Work Disbursement
	protected Link PostWorkStudyDisbursements = new Link("PostWorkStudyDisbursements", byXPath("//span[. = 'Post Work Study Disbursements']"));
	protected Button CampusSpan = new Button("CampusSpan", byXPath("(//button[contains(@aria-label,'expand combobox')]/span)[1]"));
	protected Button FundSourceSpan = new Button("FundSourceSpan", byXPath("(//button[contains(@aria-label,'expand combobox')]/span)[2]"));
	protected TextField HoursSpan = new TextField("HoursSpan", byXPath("//span[@aria-label='Hours']/span"));
	protected TextField HoursWorked = new TextField("HoursWorked", byCSSSelector("[name='hoursWorked']"));
	protected TextField AmountPaidSpan = new TextField("AmountPaidSpan", byXPath("//span[@aria-label='Gross Amount Paid']/span"));
	protected TextField AmountPaid = new TextField("AmountPaid", byCSSSelector("[name='amountPaid']"));
	protected Button UpdateFederal = new Button("Update", byXPath("//button[. = 'Update']"));
	protected Button SaveFederal = new Button("Save", byId("#save"));
	
//Xpath for Verify Award Update
	protected Link Audit = new Link("Audit", byXPath("(//span[text()='Audit'])[5]"));
	
//Xpath for Verify Academic Year Info
	protected Button EstimatedAwards = new Button("EstimatedAwards", byXPath("//button[. = 'Estimated Awards']"));
	
//XPath for Approving FA disbursement to Pay in Batch
	protected Link ApproveDisbursementsToPay = new Link("ApproveDisbursementsToPay", byXPath("//span[. = 'Approve Disbursements to Pay']"));
	protected Button CampusDropDown = new Button("CampusDropDown", byXPath("(//button[@aria-label='expand combobox']/span)[1]"));
	protected Link AwardYear = new Link("AwardYear", byXPath("//input[@aria-label='Award Year']"));
	protected TextField DisbursementFromDate = new TextField("DisbursementFromDate", byXPath("//input[@id='disbursementFromDateDatePicker']"));
	protected TextField DisbursementToDate = new TextField("DisbursementToDate", byXPath("//input[@id='disbursementToDateDatePicker']"));
	protected Link AwardYear1Value = new Link("AwardYear1Value", byXPath("//div/ul[@id='awardYearDropDown_listbox']/li[1]"));
	protected Link AwardYear2Value = new Link("AwardYear2Value", byXPath("//div/ul[@id='awardYearDropDown_listbox']/li[4]"));
	protected Link AwardYear3Value = new Link("AwardYear3Value", byXPath("//div/ul[@id='awardYearDropDown_listbox']/li[3]"));
	protected Link AwardYear4Value = new Link("AwardYear4Value", byXPath("//div/ul[@id='awardYearDropDown_listbox']/li[4]"));
	protected Button FundTypeDropDown = new Button("FundTypeDropDown", byXPath("(//button[@aria-label='expand combobox']/span)[2]"));
	protected TextField AwardLabel = new TextField("AwardLabel", byXPath("//div[2]/cmc-multi-select[1]//label"));
	protected Link FundTypeValue = new Link("FundTypeValue", byXPath("//span[. = 'All Fund Sources']"));
	protected Button ApproveNext = new Button("Next", byXPath("//button[contains(text(),'Next')]"));
	protected Link CheckBoxforDisburse = new Link("CheckBoxforDisburse", byXPath("//td/input"));
	protected Button ApproveToPost = new Button("ApproveToPost", byXPath("//button[@id='saveSubmitJob']"));
	protected Button ApproveAll = new Button("ApproveAll", byXPath("//*[@id='autoApproveButton']"));
	protected Button ApproveToPostConfirmation = new Button("ApproveToPostConfirmation", byXPath("//button[@id='approveBatchConfirmationOkButton']"));
	
//Xpath for Accomodation
	protected Link AccomodationsSpan = new Link("AccomodationsSpan", byXPath("//span[text()='Accommodation']"));
	protected Button DisabledSpan = new Button("DisabledSpan", byXPath("//span[contains(@aria-controls,'isDisabled')]/span[2]"));
	protected Link Disabled = new Link("Disabled", byXPath("//ul[@id='isDisabled_listbox']/li[1]"));
	protected Button AccomStatusSpan = new Button("StatusSpan", byXPath("//span[contains(@aria-controls,'disabilityStatusId')]/span[2]"));
	protected Link AccomStatus = new Link("Status", byXPath("//div/ul[@id='disabilityStatusId_listbox']/li[1]"));
	protected Button SearchDisabilityTypes = new Button("SearchDisabilityTypes", byCSSSelector("#search_display_disabilityTypes"));
	protected Checkbox DisabilityType = new Checkbox("DisabilityType", byXPath("//tr[1]/td/input"));
	protected Checkbox DisabilityTypeValue = new Checkbox("DisabilityTypeValue", byXPath("//tr[2]/td/input"));
	protected Button AssistanceDuringRegistrationSpan = new Button("AssistanceDuringRegistrationSpan", byXPath("//span[contains(@aria-controls,'isRegistrationAssistanceNeeded')]/span[2]"));
	protected Link AssistanceDuringRegistration = new Link("AssistanceDuringRegistration", byXPath("//ul[@id='isRegistrationAssistanceNeeded_listbox']/li[1]"));
	protected Button PriorityRegistrationSpan = new Button("PriorityRegistrationSpan", byXPath("//span[contains(@aria-controls,'isPriorityRegistration')]/span[2]"));
	protected Link PriorityRegistration = new Link("PriorityRegistration", byXPath("//ul[@id='isPriorityRegistration_listbox']/li[1]"));
	protected TextField Note1 = new TextField("Note", byXPath("//textarea[@name='note']"));
	protected Button AccomServiceSpan = new Button("ServiceSpan", byXPath("//span[contains(@aria-controls,'serviceTypeId')]/span[2]"));
	protected Link AccomService = new Link("Service", byXPath("//ul[@id='serviceTypeId_listbox']/li[1]"));
	protected TextField ServiceStartDate = new TextField("StartDate", byXPath("//input[@id='serviceBeginDate']"));
	protected TextField ServiceEndDate = new TextField("EndDate", byXPath("//input[@id='serviceEndDate']"));
	protected Button SaveService = new Button("SaveService", byCSSSelector("#studentServiceTypeSaveButton"));
	
//Xpath for Edit award Information
	protected Link Awarding = new Link("Awarding", byXPath("//span[text()='Awarding']"));
	protected Button Awards = new Button("Awards", byXPath("//button[text()='Awards']"));
	protected TextField Number = new TextField("Number", byXPath("(//input[@aria-label='Number'])[1]"));
	
//Xpath for Process Refund/Stipend
	protected Link RefundsStipends = new Link("Refunds/Stipends", byXPath("//span[text()='Refunds/Stipends']"));
	protected Link Campus= new Link("campus", byXPath("(//button[@aria-label='expand combobox']/span[1])[1]"));
	protected Link Process = new Link("Process", byXPath("//span[contains(@aria-controls,'processType')]/span[2]"));
	protected Link ProcessReturnMethod = new Link("Return Method", byXPath("//span[contains(@aria-controls,'returnMethodType')]/span[2]"));
	protected Link PrintChecks = new Link("Print Checks", byXPath("//span[contains(@aria-controls,'printChecksType')]/span[2]"));
	protected Link RecordSelection = new Link("Record selection", byXPath("//span[contains(@aria-controls,'recordSelectionType')]/span[2]"));
	protected Link BankAccount = new Link("Bank Account", byXPath("//div[contains(@aria-label,'Bank Account')]"));
	protected Checkbox SelectingBankAccount= new Checkbox("SelectingBancAct", byXPath("//ul[@id=\"bankAccountId_listbox\"]//li[1]//div//span"));
	protected Button QueueProcess = new Button("Queue Post", byXPath("//*[@id='queueProcessButton']"));
	protected Link StipendSelection = new Link("Stipend selection", byXPath("//span[contains(@aria-controls,'stipendSelectionType')]/span[2]"));
	protected Link SelectingStipendSelection= new Link("Selecting Stipend", byXPath("//ul[@id='stipendSelectionType_listbox']/li[1]"));
	
//Xpath for Internship, externship and Placement wizard
	protected Link PlacementsIntern = new Link("Placements & Internship", byXPath("//span[.='Placements & Internships']"));
	protected Link NewPlacement = new Link("New",byId("studentPlacementNewButton"));
	protected Link Employer = new Link("Select Employer", byXPath("//*[@id='search_display_employerSearch']"));
	protected Dropbox JobTypeDropdown = new Dropbox("Job Type Dropdown", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Dropbox JobTitleDropdown = new Dropbox("jobTitle_input'", byXPath("(//button[@aria-label='expand combobox'])[8]"));
	protected TextField SalAmount = new TextField("Enter Salary Amount'", byXPath("(//input[@aria-label='Salary Amount'])[1]"));
	protected Link InFieldofStudy = new Link("Field od Study'", byXPath("(//button[@aria-label='expand combobox'])[13]"));
	protected Link HowPlaced = new Link("HowPlaced Value'", byXPath("(//button[@aria-label='expand combobox'])[14]"));
	protected Link SalaryStatus = new Link("Salary Status'", byXPath("(//button[@aria-label='expand combobox'])[15]"));
	protected Link SalaryType = new Link("Salary Type'", byXPath("(//button[@aria-label='expand combobox'])[16]"));
	protected Link SeljobTitle_input = new Link("jobTitle_input", byXPath("//ul[@id='jobTitle_listbox']/li[1]//div/span[1]"));
	protected Link SelInFieldofStudy = new Link("InFieldofStudy", byXPath("//ul[@id='inFieldOfStudy_listbox']/li[1]//div/span[1]"));
	protected Link SelHowPlaced = new Link("HowPlaced", byXPath("//ul[@id='howPlaced_listbox']/li[1]//div/span[1]"));
	protected Link SelSalaryStatus = new Link("SalaryStatus", byXPath("//ul[@id='salaryOption_listbox']/li[1]//div/span[1]"));
	protected Link SelSalaryType = new Link("SalaryType", byXPath("//ul[@id='salaryType_listbox']/li[1]//div/span[1]"));
	protected TextField DatePlaced = new TextField("Enter Date Placed'", byXPath("//*[@id='datePlaced']"));
	protected TextField PlacementStartDate = new TextField("Enter Start Date'", byXPath("//*[@id='startDate']"));
	
//Xpath for ClassSection Creation
	protected Link TermDropdown = new Link("Term", byXPath("(//button[@aria-label='expand combobox'])[1]"));
	protected Link CourseDropdown = new Link("Course", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link CourseSpan = new Link("SelectCourse", byXPath("//ul[@id='courseId_listbox']/li[2]//div/span[1]"));
	protected TextField SectionCode = new TextField("Section code", byCSSSelector("#sectionCode"));
	protected Link Instructor = new Link("Instructor", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link InstructorSpan = new Link("Instructor", byXPath("//ul[@id='instructorId_listbox']/li[1]//div/span[1]"));	
	protected Link SelDeliveryMethod = new Link("Delivery Method", byXPath("//ul[@id='deliveryMethodId_listbox']/li[1]//div/span[1]"));
	protected TextField MaxStudents = new TextField("Maximum Students", byXPath("(//input[@aria-label='Max. Studs.'])[1]"));
	protected Link DeliveryMethodField = new Link("Delivery Method", byXPath("(//button[@aria-label='expand combobox'])[5]"));
	
//Xpath for Edit Class Section
	protected Link TermInput = new Link("Term1", byXPath("//div[@id='search_display_termId']"));
	protected Link CourseInput = new Link("Course", byXPath("//div[@id='search_display_courseId']"));
	protected Link ApplyFilters = new Link("Apply Filter", byXPath("//button[text()='Apply Filters']"));
	protected Button ClassSectionFilter = new Button("Filter Drop Down", byXPath("//*[@id='classScheduleGrid_cnsToolbar_kendoToolBar_settingsButton']"));
	protected Link ClassSectionClearFilter = new Link("Filter Button", byXPath("//*[@id='classScheduleGrid_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
	protected TextField UpdSecCode = new TextField("Section Code", byXPath("//input[@id='sectionCode']"));
	protected Link CopyClassSchedule = new Link("Copy class schedule", byXPath("//*[@id='copyButton']"));
	protected TextField SecCode = new TextField("Section", byXPath("//input[@id='sectionName']"));
	protected Button CopyButton = new Button("Copy ", byXPath("//button[@id='saveModelContentButton']")); 
	
//Xpath for Add Enrollment
	protected Link EnrollmentSpan = new Link("Enrollment", byXPath("//span[text()='Enrollments']"));
	protected Button StudentNext = new Button("Next", byXPath("//button[@id='studentSelectionProceedButton']"));
	protected Link StudentStatusSpan1 = new Link("Student Status", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link SelectStudentStatus1 = new Link("Student Status", byXPath("//ul[@id='SchoolStatusId_listbox']/li[1]//div/span[2]"));
	protected Link ProgramSpan = new Link("Program Code", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link Program = new Link("Program Code", byXPath("(//ul[@id='ProgramId_listbox']/li//div/span[2])[1]"));
	protected Link ProgramVersionCodeSpan = new Link("Program Version Code", byXPath("//span[@aria-controls='ProgramVersionId_listbox']/span[2]/span"));
	protected Link ProgramVersionCode = new Link("Program Version Code", byXPath("//ul[@id='ProgramVersionId_listbox']/li[1]//div/span[2]"));
	protected Link VersionStartDate = new Link("Version StartDate", byXPath("//span[@aria-controls='StartDateId_listbox']/span[2]/span"));
	protected Link SelVersionStartDate = new Link("Version StartDate", byXPath("(//ul[@id='StartDateId_listbox']/li[1]//div/span[1])[1]"));
	protected Link Billingcodespan = new Link("Billingcode", byXPath("(//button[@aria-label='expand combobox'])[7]"));
	protected Link SelBillingcodespan = new Link("Billingcode", byXPath("(//ul[@id='billingMethodId_listbox']/li[2]//div/span[2])[1]"));
	protected Link Shift = new Link("Shift", byXPath("(//button[@aria-label='expand combobox'])[4]"));
	protected Link SelShift = new Link("Shift", byXPath("(//ul[@id='shiftId_listbox']/li[1]//div/span[2])[1]"));
	protected Link GradelevelSpan = new Link("Grade Scale", byXPath("(//button[@aria-label='expand combobox'])[5]"));
	protected Link Gradelevel = new Link("Grade Scale", byXPath("(//ul[@id='gradeLevelId_listbox']/li[1]//div/span[2])[1]"));
	protected Button ProgramNext = new Button("Next1", byXPath("//button[@id='programSelectionProceedButton']"));
	protected Button EnrollNext = new Button("Next2", byXPath("//button[@id='enrollmentNumbersProceedButton']"));
	protected Button Enroll = new Button("Enroll", byXPath("(//*[@id='enrollmentPeriodSaveButton'])[2]"));
	
//Xpath for AddCourse to Student
	protected Link StudentCourse = new Link("Student Courses", byXPath("//span[. = 'Student Courses']"));
	protected Link AddCourse = new Link("add", byXPath("//*[@id='addCourseButton']"));
	protected Button addcoursewithoutCatogery = new Button("addcoursewithoutCatogery", byXPath("//*[contains(text(),'Add Course without Category')]"));
	protected Button AddCourse1 = new Button("Add Course", byXPath("//button[@id='schedueCourseDialogOkButton']"));
	protected Button AddSaveClose = new Button("SaveClose", byXPath("(//button[@aria-label='Save & Close'])[2]"));
	
	
//Xpath for Register Course
	protected Link CourseClearFilters = new Link("Filter Button", byXPath("//*[@id='cnsGrid_cnsToolbar_kendoToolBar_clearPreferencesButton']"));
	protected Link CourseFilter = new Link("Settings", byXPath("(//div[@title='Settings']/button[2])[1]"));
	protected Link CourseDropDown = new Link("Dropdown", byXPath("//th[@data-field='CourseCode']//a"));
	protected Button Register = new Button("Register", byId("courseUnRegisterButton"));
	protected TextField RegisterTerm = new TextField("Term", byXPath("//input[@name='termId_input']"));
	protected Link CourseNext = new Link("Next", byId("courseInformationProceedButton"));
	protected Link InstructorTableCell = new Link("Section Selection", byXPath("(//div[@id='classSectionGrid_cmcGrid']//td[3])[1]"));
	protected Button RegisterButton = new Button("Register", byXPath("(//*[@id='registerSaveButton'])[2]"));
	protected Link SelRegister = new Link("Click on SelReg", byXPath("//button[@id='schedueCourseDialogOkButton']"));
	protected Button SaveAndRegister = new Button("Save and Register", byXPath("//button[@aria-label='Save & Register']"));
	protected Button Overide = new Button("Click on Overide ", byXPath("//button[. = 'Override']"));
	
//Xpath for Reinstate Course
	protected Button Reinstate = new Button("Reinstate", byXPath("//*[text()='Reinstate']"));
	protected Button ReinstatePopUpButton = new Button("ReinstatePopUpButton", byXPath("//button[@id='confirmReinstateCourseWindowOkButton']"));
	protected Button Override1 = new Button("Override button", byXPath("//button[@id='confirmOverrideRegistrationHoldWindowOkButton']"));
	
//Xpath for Unregister Course
	protected Link UnregisterCourse = new Link("Unregister", byXPath("//*[@id='courseUnRegisterButton']"));
	protected Link Clickreasonspan = new Link("reason span", byXPath("//span[contains(@aria-controls,'reason')]/span[2]/span"));
	protected Link SelReasonName = new Link("Select Reason Name", byXPath("//ul[@id='reason_listbox']/li[1]/span"));
	protected Link Unregister1 = new Link("Unregister", byXPath("//button[text()='Unregister']"));
	protected Button ConfirmUnregister = new Button("Register", byXPath("//button[text()='Unregister']"));
	
//Xpath for RecordMakeup Hours
	protected Button Attendance = new Button("Attendance", byXPath("//button[. = 'Attendance']"));
	protected Link SelectAttendance = new Link("Select Attendance", byXPath("//span[. = 'Attendance Recorded']"));
	protected Button PostRecord = new Button("PostRecord", byXPath("//*[@id='postMakeUpHoursButton']"));
	protected TextField MakeupDate = new TextField("Date", byXPath("//input[@id='makeupHrDate']"));
	protected Button SaveAttendance = new Button("Save", byId("attendanceDetailSaveButton"));
	
//Xpath for DegreeProgressAudit
	protected Link DegreeProgressAudit = new Link("Degree Progress Audit", byXPath("//span[text()='Degree Progress Audit']"));
	protected Link CourseRequirement = new Link("Course Requierement ", byXPath("//a[contains(text(),'Course Requirements')]"));
	protected Link ProgramRequirements = new Link("Program Requirements", byXPath("//span[contains(text(),'Program Requirements')]"));
	protected Link DPAFilterSettings = new Link("settings", byXPath("//li[1]/div[1]/cns-grid/div[1]/cns-grid-toolbar/cmc-common-toolbar/div/div[2]/a[2]"));
	protected Link DPAClearFilter = new Link("reset to default", byXPath("//a[@id='n.courseDetail.gridId_cnsToolbar_kendoToolBar_clearFiltersButton']"));
	protected AngDropDown DegDropDown = new AngDropDown("Course name filter", byXPath("(//a[@title='Column Settings'])[13]"));
	protected Link Clikwaive = new Link("waive ", byXPath("(//span[text()='Waive'])[1]"));
	protected Link Clikwaive1 = new Link("waive1 ", byXPath("//button[text()=' Waive ']"));
	protected Link Arrow = new Link("Arrow", byXPath("(//a[@aria-label='Expand'])[1]"));
	protected Link HighLight = new Link("Highlight", byXPath("(//tbody[1]/tr[1]/td[4])[3]"));
	
//Xpath for Add Degree, honor and badges
	protected Link DegreeHonourBadge = new Link("degree,Honers,Badges", byXPath("//span[. ='Degrees Honors Badges']"));
	protected Button AddDegree = new Button("New", byXPath("//*[@id='addDegreeButton']"));
	protected TextField DegreeDateAward = new TextField("Select Degree Award", byXPath("//input[@name='awardedDate']"));
	protected Link Degree = new Link("Degree", byXPath("//span[contains(@aria-controls,'degreeDropDown')]/span[2]/span"));
	protected Link SelDeg = new Link("Degree Name", byXPath("//ul[@id='degreeDropDown_listbox']/li[1]/span"));
	protected Button SaveDegree = new Button("save", byXPath("//button[@id='saveDegree']"));
	protected Link HonerandBadge = new Link("Honour and Badge", byXPath("(//span[contains(text(),'Honors and Badges')])[1]"));
	protected Button AddHonor = new Button("New", byXPath("//*[@id='addEnrollHonorButton']"));
	protected Link HBLink = new Link("Honour and Badge ", byXPath("//span[contains(@aria-controls,'honorsDropDown')]/span[2]/span"));
	protected Link SelectHonourandBadge = new Link("Honer and Badge", byXPath("//ul[@id='honorsDropDown_listbox']/li[1]/span"));
	protected Button SaveHonor = new Button("save1", byXPath("//button[@id='saveEnrollHonor']"));
	protected Link TermHonerandBadge = new Link("click on HB", byXPath("//span[contains(text(),'Term Honors and Badges')]"));
	protected Button AddTermHonor = new Button("New", byXPath("//*[@id='addTermHonorButton']"));
	protected Link THBLink = new Link("Term Honour and Badge", byXPath("//span[contains(@aria-controls,'termDropDown')]//span[2]//span"));
	protected Link ClkHonerandBadge = new Link("Term Honour and Badge", byXPath("//span[contains(@aria-controls,'honorsTermDropDown')]/span[2]/span"));
	protected Button SaveTermHonor = new Button("save1", byXPath("//button[@id='saveTermHonor']"));
	protected Link SelectTHB = new Link("Term Honer and Badge", byXPath("(//ul[@id='termDropDown_listbox'])//li[1]//div/span[1]"));
	protected Link SelectTermHBField = new Link("Enter Honer and Badge", byXPath("//ul[@id='honorsTermDropDown_listbox']/li[1]/span"));
	
//Xpath for Batch Track Creation And Track Registration
	protected Link Add = new Link("New/Add",byXPath("//*[@id='listAddButton']"));
	protected Checkbox SelectStudent= new Checkbox("SelectStudent", byXPath("//tr[1]//td[1]//input"));
	protected Link RegTrack = new Link("Click on Registration Track", byXPath("//div/span[.='Registration Tracks']"));
	protected Link Campusdropdown = new Link("Select campus", byXPath("(//button[@aria-label='expand combobox'])[1]"));
	protected Link SelectCampus= new Link("Select campus", byXPath("//ul[@id='campusGroupId_listbox']//li[1]//div/span[1]"));
	protected Link ClassSection = new Link("Click on class section", byXPath("//a[contains(text(),'Class Sections')]"));
	protected Link TermFieldCLick = new Link("Click on Term", byXPath("//div[@id='search_display_classSectionSearch']"));
	protected Link TermCheckBox = new Link("Select CheckBox", byXPath("(//tr//td//input)[1]"));
	protected Button AddtoList = new Button("Click on AddToList",byXPath("//button[.='Add to List']"));
	protected Link AlltermCheckBox = new Link("Select CheckBox", byXPath("//div[@id='classSectionListCnsGrid']//input[@id='checkAll']"));//click twice
	protected Link ClassSections = new Link("Click on class section", byXPath("//span[contains(text(),'Class Sections')]"));
	protected Link ClassSectionScroll = new Link("Class Section Scroll", byXPath("//div[@id='detailPane']"));
	
//Xpath for Batch Unregister
	protected Link Registration = new Link("Registration Type", byXPath("//span[text()='Registration']"));
	protected Button Unregister = new Button("Unregister", byXPath("//button[text()='Unregister']"));
	protected TextField EnterInstructor = new TextField("Enter Instructor", byXPath("//input[@name='InstructorId_input']"));
	protected Link SelInstructor = new Link("Instructor Name", byXPath("//ul[@id=\"InstructorId_listbox\"]//li[1]//div//span"));
	protected Checkbox SelectAll = new Checkbox("Select all student", byXPath("//input[@aria-label='Select all']"));
	protected Link UnReas = new Link("Reason", byXPath("(//button[@aria-label='expand combobox'])[6]"));
	protected Link SelReass = new Link("Reason", byXPath("//ul[@id='ReasonId_listbox']/li[1]//div/span[1]"));
	protected Link QueueUnregiter = new Link("Queue Register", byXPath("//*[@id='queueUnregistrationButton']"));
	
//Xpath for Add Veteran
	protected Link Veteran = new Link("Veteran", byXPath("(//span[. ='Veteran'])[2]"));
	protected Link AddVeteran = new Link("Add Veteran", byXPath("//*[contains(text(),'Add as Veteran')]"));
	protected TextField Branch = new TextField("Branch", byXPath("//div[@id='search_display_veteranTypes']"));
	protected Checkbox SelectBranch = new Checkbox("Select Branch", byXPath("//tr[1]/td/input"));
	protected TextField Benefit = new TextField("Benefit", byXPath("//div[@id='search_display_benefitsReceived']"));
	protected Checkbox SelectBenefit = new Checkbox("Select Benefit", byXPath("//tr[1]/td/input"));
	protected Link CertificateType = new Link("Certificate Type", byXPath("//span[contains(@aria-controls,'veteranAffairsCertificationTypeId')]/span[2]/span"));
	protected Link SelCertificateType = new Link("Certificate Type", byXPath("//ul[@id='veteranAffairsCertificationTypeId_listbox']/li[1]/span"));
	protected Link CertifiedTerm = new Link("Certified Term", byXPath("//span[contains(@aria-owns,'lastCertifiedTermId')]/span[2]/span"));
	protected Link SelCertifiedTerm = new Link("Selecting Certified Term", byXPath("//ul[@id='lastCertifiedTermId_listbox']/li[1]//div/span[1]"));
	
//Xpath for Add and Delete Indicator	
	protected Link Indicator = new Link("Indicators", byXPath("//span[. ='Indicators']"));
	protected AngDropDown IndicatorDropdown = new AngDropDown("Indicator Dropdown", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link SelIndicator1 = new Link("Selecting Indicator Dropdown", byXPath("//ul[@id='indicatorId_listbox']//li[1]//div/span[1]"));
	protected TextField EffectiveDate = new TextField("Effective Date", byXPath("//input[@id='effectiveDate']"));
	protected TextField EndDate = new TextField("End Date", byXPath("//input[@id='endDate']"));
	protected Link SelectIndicator = new Link("Indicator", byXPath("//div[2]//td[2]"));
	protected Button DeleteButton = new Button("Delete", byXPath("//*[@id='deleteButton']"));
	protected Button ConfirmDeleteButton = new Button("Confirm Delete", byXPath("(//button[contains(text(),'Delete')])[2]"));
	
//Xpath for Student Application Creation
	protected Link StudentApplications =  new Link(" Student Application", byXPath("//span[. = 'Student Applications']"));
	protected Dropbox ApplicationTypeSpan = new Dropbox("Application Type Span", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link SelectApplicationType = new Link("Application Type", byXPath("//ul[@id='applicantTypeId_listbox']/li[1]//div/span[1]"));
	protected TextField AdminRep = new TextField("Admin Rep", byXPath("//*[@name='assignedAdmissionsRepId_input']"));
	protected TextField SchoolStatus = new TextField("School Status", byXPath("//input[@name='schoolStatusId_input']"));
	protected Dropbox StudentStatusSpan = new Dropbox("Status Span", byXPath("(//button[@aria-label='expand combobox'])[13]"));
	protected Link SelectStudentStatus = new Link("Student Status", byXPath("//*[@id='schoolStatusId_listbox']/li[2]//div/span[1]"));
	
//Xpath for Ledger Payment
	protected Link NewPaymentButton = new Link("New", byId("newPaymentButton"));
	protected Dropbox PaymentTypeDropdown = new Dropbox("Payment Dropdown", byXPath("(//span[@aria-controls=\"paymentMethod_listbox\"]//span)[4]"));
	protected Checkbox CheckTerm = new Checkbox("Term", byXPath("//tr[1]/td[1]/input"));
	protected Dropbox CashPaymentCodeDropdown = new Dropbox("Cash Payment Code Dropdown", byXPath("//span[contains(@aria-controls,'transactionNameDropDown')]/span[2]/span"));
	protected Link SelectCashPaymentCode = new Link("Cash Payment Code", byXPath("//ul[@id='transactionNameDropDown_listbox']/li[1]//div//span[1]"));
	protected Link SelectCashPaymentType = new Link("Payment Type", byXPath("//ul[@id=\"paymentMethod_listbox\"]//li[1]//span"));
	protected TextField CheckNo = new TextField("Check Number",byXPath("//input[@name='checkNumber']"));
	protected Dropbox PaymentMethodDropdown = new Dropbox("Payment Method Dropdown", byXPath("//span[contains(@aria-owns,'paymentType')]span[2]/span"));
	protected Link PaymentMethod = new Link("Payment Method", byXPath("(//ul[@id='paymentType_listbox']/li[1])[1]"));
	protected Link SelectCashDrawerSession = new Link("Cash Drawer Session", byXPath("//ul[@id='cashDrawerSessionId_listbox']/li[1]//div/span[2]"));
	protected Dropbox BankAccountDropdown = new Dropbox("Bank Account Dropdown", byXPath("//span[contains(@aria-controls,'bankAccountId')]/span[2]/span"));
	protected Link SelectBankAccount = new Link("Bank Account", byXPath("//ul[@id='bankAccountId_listbox']/li[1]//div/span[1]"));

//Xpath for Job Placement
	protected TextField JobType = new TextField("Job Type", byXPath("//input[@name='jobType_input']"));
	protected TextField PlacementStatus = new TextField("Placement Status", byXPath("(//button[@aria-label='expand combobox']/span)[3]"));
	protected Link SelectPlacementStatus = new Link("Select Placement Status", byXPath("//ul[@id='placementStatus_listbox']/li[1]//div/span[1]"));
	protected Dropbox JobStatusSpan = new Dropbox("Job Status DropDown", byXPath("(//button[@aria-label='expand combobox']/span)[11]"));
	protected Link SelectJobStatus = new Link("Select Job Status", byXPath("//ul[@id='jobStatus_listbox']/li[1]//div/span[1]"));
	
	
//Xpath for Transfer credits
	protected Link TransderCredits = new Link("Transfer Credits", byXPath("//span[. ='Transfer Credits']"));
	protected Dropbox TransferTypesDropdown = new Dropbox("Transfer Types Dropdown",byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link SelectTransferTypes = new Link("Transfer Types", byXPath("//ul[@id='transferCreditType_listbox']/li[1]//span[2]"));
	protected Dropbox TransferStatusDropdown = new Dropbox("Transfer Status Dropdown", byXPath("(//button[@aria-label='expand combobox'])[3]"));
	protected Link SelectTransferStatus = new Link("Transfer Status", byXPath("//ul[@id='transferCreditStatus_listbox']/li[3]//div/span[1]"));
	protected Link TransferTerm = new Link("Term Span", byXPath("//div[@id='search_display_termIdAdvance']"));
	protected Link New2 = new Link("New External Institutuion", byXPath("(//*[@id='newButton'])[2]"));
	protected Dropbox ExInsDropdown = new Dropbox("External Institution Dropdown", byXPath("(//button[@aria-label='expand combobox'])[4]"));
	protected Link SelectExInst = new Link("External Institution", byXPath("//ul[@id='institutionId_listbox']/li[1]//div/span[1]"));
	protected Dropbox ExInstCourseDrodown = new Dropbox("External Institution Dropdown", byXPath("(//button[@aria-label='expand combobox'])[5]"));
	protected Link SelectExInstCourse = new Link("External Institutuion Course", byXPath("//ul[@id='institutionCourseId_listbox']/li[1]//div/span[1]"));
	protected Dropbox CampusCourseDropdown = new Dropbox("Campus Course Dropdown", byXPath("(//button[@aria-label='expand combobox'])[4]"));
	protected Link SelectCampusCourse = new Link("Campus Course", byXPath("//ul[@id='campusCourseId_listbox']/li[1]//div/span[2]"));
	protected TextField DateCompleted= new TextField("Date Completed", byId("dateCompletedId"));
	protected TextField GradeReceived = new TextField("Grade Received", byXPath("//input[@id='extCollegeGradeReceivedId']"));
	protected Button ExOk = new Button("External OK", byId("saveInstitutionId"));
	protected Link New3 = new Link("Add Internal Institute", byXPath("(//*[@id='newButton'])[3]"));
	protected Button ClickOk = new Button("OK", byId("saveCampusCourseId"));
	protected Dropbox GradeDropDown = new Dropbox("GradeDropDown", byXPath("//*[@id=\"transferCreditStatus\"]/div/div/span/button/span"));
	protected Link SelectTCGrade = new Link("Select grade", byXPath("//*[@id=\"gradeAdvance_listbox\"]/li/span"));
	
	
//Xpath for Status Change
	protected Link StudentStatusHistory = new Link("Status Change", byXPath("//span[text()='Student Status History']"));
	protected Link ChangeStatus = new Link("Change Status", byId("studentStatusChangeButton"));
	protected Button NewStatus = new Button("New Status", byXPath("//span[@aria-controls='newStatus_listbox']"));
	protected TextField EnterNewStatus = new TextField("New Status", byXPath("//input[@aria-controls='newStatus_listbox']"));
	protected Button ChangeButton = new Button("Change Button", byXPath("//button[.='Change']"));
	protected Dropbox ReasonsDropdown = new Dropbox("Reasons Dropdown", byXPath("//span[contains(@aria-owns,'changeReason')]/span/span[2]/span"));
	protected Link SelectReasons = new Link("Reason", byXPath("//ul[@id='changeReason_listbox']/li[1]/div/span[1]"));
	
//Xpath for Program Change
	protected Link Enrollments = new Link("Enrollments", byXPath("//span[. ='Enrollments']"));
	protected Dropbox Enroldropdown = new Dropbox("Enrollment drop down", byXPath("//th[@data-field='ProgramVersionName']//a"));
	protected Button FilterButton3 = new Button("Filter Button", byXPath("(//span[.='Filter'])[3]"));
	protected AngDropDown EnrollMore = new AngDropDown("More", byXPath("//div[@id='moreEnrollmentButton_wrapper']/button[1]/span"));
	protected Link ProgramChange = new Link("Program Change", byId("programChangeButton"));
	protected Button EnrollProgramSpan = new Button("Program Span", byXPath("//span[contains(@aria-controls,'ProgramId')]/span[2]/span"));
	protected TextField EnterProgramName = new TextField("Program", byXPath("//input[@aria-controls='ProgramId_listbox']"));
	protected TextField EnterPVName = new TextField("Program Version", byXPath("//input[@aria-controls='ProgramVersionId_listbox']"));
	protected Dropbox ShiftDropdown = new Dropbox("Shift Dropdown", byXPath("//span[contains(@aria-controls,'shiftId')]/span[2]/span"));
	protected Link SelectShift = new Link("Shift", byXPath("//ul[@id='shiftId_listbox']/li[1]//div/span[1]"));
	protected Dropbox GradeLevelDropdown = new Dropbox("Grade Level Dropdown"	, byXPath("//span[contains(@aria-controls,'gradeLevelId')]/span[2]/span"));
	protected Link SelectGradeLevel = new Link("Grade Level", byXPath("//ul[@id='gradeLevelId_listbox']/li[1]//div/span[1]"));
	protected Dropbox CatalogDropdown = new Dropbox("Catalog Dropdown", byXPath("//span[contains(@aria-controls,'catalogYearId')]/span[2]/span"));
	protected Link SelectCatalog = new Link("Catalog", byXPath("//ul[@id='catalogYearId_listbox']/li[1]//div/span[1]"));
	protected Dropbox BillingMethodDropdown = new Dropbox("Catalog Dropdown", byXPath("(//button[@aria-label='expand combobox'])[7]"));
	protected Link SelectBillingMethod = new Link("Catalog", byXPath("//ul[@id='billingMethodId_listbox']/li[1]//div/span[1]"));
	protected Button PVNext = new Button("PVNext", byId("programSelectionProceedButton"));
	protected Button CourseProceedNext = new Button("CourseNext", byId("studentCourseProceedButton"));
	protected Button FeeNext = new Button("FeeNext", byId("feeProceedButton"));
	protected Link Change = new Link("Change Button", byXPath("(//*[@id='programChangeSaveButton'])[2]"));
	
//Xpath for Batch Attendance
	protected Link BatchAttendance = new Link("Attendance", byXPath("//span[.='Attendance']"));
	protected Link ClickCourseSpan = new Link("Course Span", byId("search_display_courseSearch"));
	protected Button ClickAttendanceField = new Button("Attendance field", byXPath("//tr[1]/td[5]"));
	protected TextField EnterAttendance = new TextField("Attendance in Minutes", byXPath("//tr[1]/td[5]/span/input[1]"));
	protected Button SaveButton = new Button("Save", byXPath("(//*[@id='saveButton'])[2]"));
	protected Link Gradebook = new Link("Gradebook", byXPath("//span[text()='Gradebook']"));
	protected TextField LetterGrade = new TextField("Letter Grade", byXPath("(//tbody)[2]/tr[1]/td[2]"));
	protected Link LetterGradeDrop = new Link("Letter Grade dropdown", byXPath("(//tbody)[2]/tr[1]/td[2]/span/span[2]/span[1]"));
	protected Link FinalSave = new Link("Save", byXPath("//*[@id='saveButton']"));
	protected Link SAPCalculation = new Link("SAP calculation", byXPath("//span[.='SAP Calculation']"));
	
//Xpath for Drop a course
	protected Link Drop = new Link("Drop Link", byXPath("//*[@id='courseDropButton']"));
	protected Dropbox DropGradeSpan = new Dropbox("Drop Grade Span", byXPath("//span[contains(@aria-controls,'letterGrade')]/span[2]"));
	protected Link SelectDropGrade = new Link("Drop Grade", byXPath("//ul[@id='letterGrade_listbox']/li[1]/span[1]"));
	protected Dropbox DropReasonsSpan = new Dropbox("Drop Reasons Dropdown", byXPath("//span[contains(@aria-controls,'dropReason')]/span[2]/span"));
	protected Link SelectDropReason = new Link("Drop Reason", byXPath("//ul[@id='dropReason_listbox']/li[1]/span[1]"));
	protected Button DropButton = new Button("Drop Button", byXPath("//button[@id='dropCourse']"));
	
//Xpath for Individual Attendance
	protected TextField Minutes = new TextField("Attendence in Minutes", byXPath("(//input[@aria-label='Minutes'])[1]"));
	protected Link FinalGrades = new Link("Final Grades", byXPath("//li[@aria-controls='Final Grades']"));
	protected Dropbox LetterGradeDropdown = new Dropbox("Letter Grade Dropdown", byXPath("(//button[@aria-label='expand combobox'])[2]"));
	protected Link SelectGrade = new Link("Select Letter Grade", byXPath("//ul[@aria-labelledby='letterGrade_label']/li[1]/span[1]"));
	protected Button PostGrade = new Button("PostGrade", byXPath("//button[@id='confirmPostGradeWindowOkButton']"));

	
//XPath for CLose task
	protected Button CloseTask = new Button("Close Task", byXPath("//button/span[text()='Close Task']"));
	protected TextField Comments = new TextField("Comments", byXPath("//textarea[@id='note']"));
	protected Button TaskSaveClose = new Button("Save and Close", byXPath("//button[@id=\"studentTaskCloseDialogButton\"]"));
	protected Button ConfirmCloseTask = new Button("Close Task", byId("studentTaskCloseDialogButton"));	
	protected Button CloseAndFolloup = new Button("Close & Follow Up", byId("studentTaskCloseAndFollowUpDialogButton"));	
	protected TextField TaskNote = new TextField("Note", byXPath("//textarea[@id=\"note\"]"));
	
//XPath for Print Summary 
	protected Button Printsummary = new Button("Print Button", byId("printButton"));
	protected Link RegistrationLock = new Link("Registration Lock", byXPath("//a[text()='Registration Lock']"));
	
//Xpath for Group page
	protected Button GroupFilterDropDown = new Button("Filter Drop Down", byId("//div[1]/button[@aria-label=\"arrow-button\"]"));
	protected Button GroupFilterButton = new Button("Filter", byId("cnsGroupGridList_cnsToolbar_kendoToolBar_clearPreferencesButton"));
	protected AngDropDown NameDropDown = new AngDropDown("Name Drop Down", byXPath("//th[@data-field='Name']//a"));
	protected Link RegistrationLocks = new Link("Registration Locks", byId("studentGroupsRegisterLockButton"));
	protected Button TermType = new Button("Term Type", byXPath("//span[contains(@aria-controls,'termType')]/span[2]/span"));
	protected Dropbox SelectTermType = new Dropbox("Term Type", byXPath("//ul[@id='termType_listbox']/li[1]/span"));
	protected Dropbox LockTypeDropdown=new Dropbox("Lock Type Dropdown", byXPath("//span[@aria-controls='ruleType_listbox']/span[2]/span[1]"));
	protected Button UnitTypes = new Button("Unit Type", byXPath("//span[contains(@aria-controls,'UnitTypeId')]/span[2]/span"));
	protected Dropbox SelectUnitTypes = new Dropbox("Unit Types", byXPath("//ul[@id='UnitTypeId_listbox']/li[1]/span"));
	protected TextField EnterLimit = new TextField("Limit", byXPath("//input[1][@aria-label='Limit']"));
	protected Link Cancel1 = new Link("Cancel", byXPath("//*[@id='cancelButton']"));
	protected Link DeleteGroup = new Link("Delete", byXPath("//a[@id='studentGroupListDeleteButton']"));
	protected Button ConfirmDelete = new Button("Delete", byXPath("//button[@id='deletedialogOkButton']"));
	
//Xpath for Update School Field
	protected Link UpdateSchoolFields = new Link("School Defined Fields", byXPath("//span[.='Update School Fields']"));
	protected TextField GroupName = new TextField("Group Name", byXPath("//input[@name='group_input']"));
	protected TextField SchoolField = new TextField("SchoolField", byXPath("//input[@name='schoolDefinedField_input']"));
	protected Link UpdateSF = new Link("Update School fields", byXPath("//*[@id='updateSchoolFieldsButton']"));
	protected TextField SFValue = new TextField("School field value", byXPath("//textarea[@name='schoolDefinedFieldValue']"));
	protected Button OkButton = new Button("Ok", byXPath("//button[@id='OKButton']"));
	protected Link SFQueue = new Link("Queue batch", byXPath("//*[@id='queueUpdateButton']"));
	
//Xpath for Verify Approve disbursemtn criteria
	protected Dropbox ADCampusDropdown = new Dropbox("Campus Dropdown", byXPath("(//button[@aria-label='expand combobox'])[1]"));
	protected Link SelectingCampus = new Link("Campus", byXPath("//ul[@id='campusDropDown_listbox']/li[1]//div/span[1]"));
	protected TextField ADAwardYear = new TextField("Eter Disbursement Award year", byXPath("//input[@aria-label='Award Year']"));
	protected TextField DisDateFrom = new TextField("Disbursement Date from", byId("disbursementFromDateDatePicker"));
	protected TextField DisDateTo = new TextField("Disbursement Date to", byId("disbursementToDateDatePicker"));
	protected TextField ADFundType = new TextField("Fund Source", byXPath("//input[@name='fundTypeDropDown_input']"));
	
//Xpath for Verify Disbursement data
	protected AngDropDown FSdropdown = new AngDropDown("Fund Source drop down", byXPath("(//th[@data-field='FundSourceCode']//a)[1]"));
	protected Button PaymentReceived = new Button("Payment Received tab", byXPath("//button[.='Payments Received']"));
	
//Xpath for Creating New Academic Year
	protected Button AcademicYear = new Button("Academic Year", byXPath("//button[.='Academic Years']"));
	protected Button Manual = new Button("Manual", byId("autoAwardingYearDialogNotOkButton"));
	protected TextField AYStartdate = new TextField("AY startdate", byId("startDate"));
	protected TextField AYEnddate = new TextField("AY Enddate", byId("endDate"));
	protected Button AwardYearSpan = new Button("Award Year Span", byXPath("//span[@aria-controls='firstAwardYear_listbox']/span[2]"));
	protected TextField EnterAwardYear = new TextField("Award Year", byXPath("//input[@aria-controls='firstAwardYear_listbox']"));
	protected Dropbox HousingDropdown = new Dropbox("Housing Dropdown"	, byXPath("//span[contains(@aria-controls,'housingStatusCode')]/span[2]/span"));
	protected Link SelectHousing = new Link("Select Housing", byXPath("//ul[@id='housingStatusCode_listbox']/li[1]//div/span[1]"));
	protected Dropbox PackagingStatusDropdown = new Dropbox("PackagingStatus Dropdown"	, byXPath("//span[contains(@aria-controls,'awardYear1PackageStatus')]/span[2]/span"));
	protected Link SelectPackagingStatus = new Link("Select PackagingStatus", byXPath("//ul[@id='awardYear1PackageStatus_listbox']/li[1]//div/span[1]"));
	protected TextField EnterPackagingStatus = new TextField("Packaging Status", byXPath("//input[@aria-controls='awardYear1PackageStatus_listbox']"));
	protected Dropbox BudgetDropdown = new Dropbox("Budget Dropdown"	, byXPath("//span[contains(@aria-controls,'budgetId')]/span[2]/span"));
	protected Link SelectBudget = new Link("Select Budget", byXPath("//ul[@id='budgetId_listbox']/li[1]//div/span[1]"));
	protected Button ConfirmOK = new Button("Confirm", byXPath("//button[@id=/weeksEnrolledInAcademicYearDialogOkButton/]"));
	
//Xpath for FA reassignment
	protected Link Reassign = new Link("Reassign", byId("awardReassignButton"));
	protected Button OkReassign = new Button("Reassign", byId("okTransferSectionr"));
	protected Button ConfirmReassign = new Button("Confirm Reassign", byXPath("//button[@aria-label='Reassign']"));
	
//Xpath for Midterm Grade
	protected Button Midterm = new Button("Midterm", byXPath("//button[text()='Midterm']"));
	
//Xpath for Task configuration
	protected Link TaskTemplets = new Link("TaskTemplets", byXPath("//span[text()='Task Templates']"));
	protected TextField EventType1 = new TextField("Search EventType1", byXPath("//input[@name='taskTypeId_input']"));
	protected Link SelEventType1 = new Link("Select EventType1", byXPath("(//ul[@id='taskTypeId_listbox']/li//div/span)[1]"));
	protected TextField EmailSubject = new TextField("Select EmailSubject", byXPath("//input[@name='emailSubject']"));
	
//Xpath for Task for Student and Employer
	protected TextField TaskTemplateName = new TextField("Enter Task Template", byXPath("//input[@name='taskTemplateId_input']"));
	protected Link SelectTaskTemplate = new Link("Task Template", byXPath("//ul[@id='taskTemplateId_listbox']/li/span/div/span[1]"));
	protected Link EmployerInput = new Link("Select Employer", byXPath("//*[@id='search_display_employerId']"));
	protected Checkbox EmployerButton = new Checkbox("Select Employer Button", byXPath("(//input[@type='checkbox'])[2]"));
	protected Link Employers = new Link("Employers", byXPath("//span[text()='Employers']"));
	protected Link Task = new Link("Click Task", byXPath("//div[. = 'Tasks']"));
	protected Link Student = new Link("Click on Student", byXPath("//div[@id='search_display_studentId']"));
	protected Dropbox Dropdown = new Dropbox("Dropdown", byXPath("//a[@title='Name edit column settings']/span[1]"));
	protected Link Filter = new Link("Filter", byXPath("//span/span[text()='Filter']"));
	protected TextField EmployerValue = new TextField("Value", byXPath("//input[@title='Value']"));
	protected Button FilButton = new Button("Filter", byXPath("//button/span[text()='Filter']"));
	protected Button Newtask = new Button("New", byXPath("//button/span[text()='New']"));
	
//Xpath for Program Transfer
	protected Link Transfer = new Link("Transfer", byXPath("(//li[@id='transferButton'])"));
	protected Link TransferType = new Link("TransferType", byXPath("//span[contains(@aria-controls,'transferTypeId')]/span[2]/span"));
	protected Link SelTransferType = new Link("SelTransferType", byXPath("//span[text()='To Enrollment']"));
	protected Link ProgrameVersion = new Link("Programe Version", byXPath("//span[contains(@aria-controls,'transferToProgramVersionId')]/span[2]/span"));
	protected Link SelPrgver = new Link("Programe Versions", byXPath("//ul[@id='transferToProgramVersionId_listbox']/li//div/span"));
	protected Button Proceed = new Button("Proceed", byXPath("(//button[text()='Proceed'])[2]"));
	protected Button Next3 = new Button("Next3", byXPath("//button[@id='transferInformationProceedButton']"));
	protected Button Next4 = new Button("Next4", byXPath("//button[@id='studentCourseProceedButton']"));
	protected Button Next5 = new Button("Next5", byXPath("//button[@id='feeProceedButton']"));
	protected Link Transfer2 = new Link("Transfer2", byXPath("(//*[@id='transferSaveButton'])[2]"));
	protected Link Transfer3 = new Link("Transfer3", byXPath("//button[@id='enrollAcademicYearDialogOkButton']"));  
	protected Button TransferButton = new Button("Next3", byXPath("//button[@aria-label='Transfer']"));
	
//Xpath for Batch Track Registration
	protected Button Track = new Button("Track", By.xpath("//button[contains(text(),'Track')]"));
	protected TextField EnterSgroup= new TextField("Student Group", By.xpath("//input[@name='studentGroupDropDown_input']"));
	protected Checkbox AllstuCheck= new Checkbox("Student Group", By.xpath("//input[@aria-label='Select All StudentId']"));
	protected Button QueueRegistration = new Button("Queue Registration", By.xpath("//*[@id='queueRegistrationButton']"));
	protected Button Override = new Button("Override", By.xpath("//div//button[(text()='Override')]"));
	
//Xpath for Add Athletic
	
	
//Xpath for Process Letters
	protected Link Letters = new Link("Letters", byXPath("//span[text()='Letters']"));
	protected Link Type = new Link("Type", byXPath("//span[@aria-controls='letterType_listbox']/span[2]"));
	protected Link ClearLetters = new Link("ClearLetters", byXPath("//span[@aria-controls='ClearLetterRequestAfterPrinting_listbox']/span[2]"));
	protected Button QueueLetters = new Button("Queue Letters", byXPath("//*[@id='queueLetterButton']"));
	
//Xpath for Post FA Disbursement
	protected Dropbox PaymentDropdown= new Dropbox("Payment Type Dropdown", byXPath("//span[@aria-controls='paymentMethod_listbox']/span[2]/span[1]"));
	protected Link SelectPaymentType = new Link("Payment Type", byXPath("//span[.='Scheduled FA Disbursements/Student Cash Payments']"));
	protected Button ScheduledDisburdementSpan = new Button("Scheduled Disbursement", byId("search_display_scheduledPaymentId"));
	
//Xpath for Housing Deposit
	protected Link Housingdeposits = new Link("Housing deposits", byXPath("//span[. = 'Housing Deposits']"));
	protected Dropbox DepositTypes = new Dropbox("Deposit Types", 	byXPath("//span[@aria-controls='depositType_listbox']/span[2]"));
	protected Link SelectDepositType = new Link("Deposit Type", byXPath("//ul[@id='depositType_listbox']/li[1]/span"));
	protected Dropbox PaymentTypeDrop = new Dropbox("Payment Type Dropdown", byXPath("//span[contains(@aria-controls,'paymentType')]span[2]/span"));
	protected Link SelectHousingPaymentType = new Link("Select Payment Type", byXPath("//ul[@id='paymentType_listbox']/li[1]/span[1]"));
	
//Xpath for Add Subsidiary
	protected Link Subsidiary = new Link("Subsidiary", byXPath("//span[. = 'Subsidiary']"));
	protected Button AddSubsidiary = new Button("Add subsidiary", byXPath("(//div/div[1]/button)[2]"));
	protected Dropbox SubsidiaryList = new Dropbox("Subsidiary List", byXPath("//span[contains(@aria-controls,'subsidiaryDialogAccountTypeId_listbox')]span[2]/span"));
	protected Link SelectingNewSubsidiary = new Link("Selecting Subsidiary", byXPath("//ul[@id='subsidiaryDialogAccountTypeId_listbox']/li[1]//div/span[1]"));
	protected TextField MaintainedBalance = new TextField("Maintained Balance", byXPath("(//input[@aria-label='Maintained Balance'])[1]"));
	protected Button SaveSubsidiary = new Button("Save button", byXPath("//button[@id='maintainedBalanceSaveButton']"));
	protected Dropbox GettingSubsidiaryName = new Dropbox("Subsidiary Dropdown", byXPath("//span[contains(@aria-controls,'subsidiaryAccountTypeId_listbox')]/span[2]/span"));
	protected Link SelectingSubsidiary = new Link("Selecting Subsidiary", byXPath("//ul[@id='subsidiaryAccountTypeId_listbox']/li[1]//div/span[1]")); 
	
//Xpath for Subsidiary Print
	protected Link ExporttoExcelorPDF = new Link("Export to excel or pdf", byXPath("//button[@id='cnsSubsidiaryTransactionGrid_cnsToolbar_kendoToolBar_exportButton']"));
	protected Link PDFExport = new Link("Export to pdf", byXPath("//span[text()='PDF (All Results)']"));
	protected Button SubsidiaryFiltericon = new Button("Filter icon", byXPath("//button[contains(@id,'cnsSubsidiaryTransactionGrid_cnsToolbar_kendoToolBar_settingsButton')]"));
	protected Link ClearAll= new Link("Clear Filters", byXPath("//*[text()= 'Clear All']"));
	
//XPath for Subsidiary Add Payment
	protected TextField PaymentNameSub = new TextField("Payment Name", byXPath("//input[@id='paymentName']"));
}

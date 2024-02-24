package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byXPath;

import java.util.concurrent.TimeUnit;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;

public class StudentSettingsPage extends BaseLocators {
	
	static String StatusNameValue = AppendValue.apendString();
	static String StatusCodeValue = AppendValue.apendString();

	
	public StudentSettingsPage ConfigureApplyPayment(StringHash data) throws Exception {
		Link AppPaymentMsg= new Link("Apply Payment Msg", byXPath("//span[text()='The General settings were successfully saved.']"));
		
		
//		wait(8);
		SearchSettings.waitTillElementClickable();
		SearchSettings.click();
		wait(2);
		SearchSettings.clearAndType(data.get("Component").toString());
		wait(10);
		GeneralSA.clickUsingJavaScriptExecutor();
		wait(2);
		Filtericon.clickUsingJavaScriptExecutor();
		//wait(1);
		ClearFilters.clickUsingJavaScriptExecutor();
		//wait(5);
        SettingsList.click();
        wait(2);
        SettingsFilter.click();
        wait(2);
        SettingsValue.sendKeys("Apply Payment Flag");
        wait(2);
        SettingsFilterButton.click();
        wait(3);
		SelectingApplyPayment.clickUsingJavaScriptExecutor();
		wait(2);
		ApplyPaymentFlag.clickUsingJavaScriptExecutor();
		wait(3);
//		ApplyPaymentFlag.click();
//		wait(3);
		SelectingFlag.clickUsingJavaScriptExecutor();
		String SelectedFlag = SelectingFlag.getText();
		System.out.println(SelectedFlag);
		TestReportsLog.log(LogStatus.INFO, "Selected Flag is "+SelectedFlag);
		wait(3);
		Save1.clickUsingJavaScriptExecutor();
		wait(4);
		CustomAsserts.containsString(AppPaymentMsg.getText(), data.get("AppPaymentMsg").toString());
		System.out.println("Configure Apply flag is successfull");
		return this;
		
	}

	public StudentSettingsPage ConfigureDocumentPolicy(StringHash data) throws Exception {
		Link SelectingModule= new Link(data.get("ModuleName"), byXPath("//span[text()='"+data.get("ModuleName")+"']"));	
		Link DocPolicyMsg= new Link("Document Policy Msg", byXPath("//span[text()='The Document Policy records were successfully saved.']"));
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
	
		SearchSettings.waitTillElementClickable();
		SearchSettings.click();
		SearchSettings.clearAndType(data.get("Component").toString());
		wait(2);
		DocumentPolicies.clickUsingJavaScriptExecutor();
		wait(10);
        New.click();
        wait(10);
        scrollPage(0, -500);
        wait(3);
        Name.clearAndType(StatusNameValue);
        wait(2);
        Code.clearAndType(StatusCodeValue);
        wait(2);
        Module.click();
        wait(2);
        SelectingModule.click();
        TestReportsLog.log(LogStatus.INFO, "Selected Module is "+data.get("ModuleName"));
        wait(2);
        scrollPage(0, -500);
        wait(2);
        SaveAndClose1.click();
        wait(3);
        CustomAsserts.containsString(DocPolicyMsg.getText(), data.get("DocPolicyMsg").toString());
		System.out.println("Document Policy is added successfully");
		return this;
        
}
	
	public StudentSettingsPage ConfigureSchoolDefinedFields(StringHash data) throws Exception {
		Link SchlFieldMsg= new Link("School Defined Field Msg", byXPath("//span[text()='The School Defined Field records were successfully saved.']"));
		String FieldName = AppendValue.apendString();
		String FieldCode = AppendValue.apendString();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

		//waitForPageToComplete();
		SearchSettings.waitTillElementClickable();
		SearchSettings.click();
		wait(2);
		SearchSettings.clearAndType(data.get("Component").toString());
		wait(12);
		SchoolDFields.clickUsingJavaScriptExecutor();
		wait(8);
		New.click();
		wait(10);
		scrollPage(0, -500);
		wait(10);
		NameSchl.click();
		NameSchl.clearAndType(FieldName);
		wait(6);
		Code.click();
		wait(1);
		Code.clearAndType(FieldCode);
		wait(1);
		scrollPage(0, 500);
		wait(1);
		DataType.clickUsingJavaScriptExecutor();
		wait(1);
		SelectingDataType.click();
		wait(2);
		TypeValidation.clickUsingJavaScriptExecutor();
		wait(2);
		SelectingValidType.click();
		wait(2);
		Length.sendkeys(data.get("Length"));
		wait(10);
		//SelectingView.clickUsingJavaScriptExecutor();
		//wait(2);
		SelectingEdit.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0, -800);
		wait(2);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(8);
		CustomAsserts.containsString(SchlFieldMsg.getText(), data.get("SchlFieldMsg").toString());
		System.out.println("School field is created successfully");
		return this;
	}
}
	
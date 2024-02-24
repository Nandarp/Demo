package com.StudentPortal.Pages;


import static com.framework.elements.Locator.byXPath;

import com.framework.elements.BaseLocators;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.StringHash;
public class StudentStudentServicesPage  extends BaseLocators{
	
	
	public StudentStudentServicesPage HousingDepositPage(StringHash data) throws Exception{
		
		Link ValidationMessage = new Link("Validation Message", byXPath("//span[. = 'The Housing Deposit records were successfully saved.']"));
		 TextField Amount = new TextField("Amount", byXPath("(//span[@aria-label=\"Amount\"]//input[@aria-label=\"Amount\"])[1]"));
		  Dropbox PaymentTypeDropdown = new Dropbox("Payment Dropdown", byXPath("(//span[@aria-controls=\"paymentType_listbox\"]//span)[4]"));
		 Link SelectHousingPaymentType = new Link("Select Payment Type", byXPath("//ul[@id=\"paymentType_listbox\"]//li[1]//span"));
		  
		StudentServices.waitTillElementClickable();
		StudentServices.click();
		Housingdeposits.waitTillElementClickable();
		Housingdeposits.click();
		wait(2);
    	if(Dontsave.isDisplayed()) {
    		Dontsave.waitTillElementClickable();
    		Dontsave.clickUsingJavaScriptExecutor();
    		}
		wait(15);
		New.waitTillElementClickable();
		New.click();
		wait(15);
		DepositTypes.waitTillElementClickable();
		DepositTypes.clickUsingJavaScriptExecutor();
		SelectDepositType.waitTillElementClickable();
		SelectDepositType.clickUsingJavaScriptExecutor();
		wait(3);
		//Amount.waitTillElementFound();
		//Amount.click();
//		Amount.click();
//		wait(1);
//		Amount.click();
//		wait(2);
		Amount.sendkeys("100");
		wait(3);
		PaymentTypeDropdown.clickUsingJavaScriptExecutor();
		wait(1);
		SelectHousingPaymentType.clickUsingJavaScriptExecutor();
		wait(1);
		scrollPage(0, -200);
		SaveAndClose.clickUsingJavaScriptExecutor();
		wait(7);
		CustomAsserts.containsString(ValidationMessage.getText(), data.get("SuccessMessage").toString());
		System.out.println("Housing deposit is successfull");
		return this;
		
	}		
}

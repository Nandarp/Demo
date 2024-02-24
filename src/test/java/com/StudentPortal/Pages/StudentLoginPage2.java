package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byId;

import static com.framework.elements.Locator.byXPath;
import static com.framework.elements.Locator.byLinkText;
import static com.framework.elements.Locator.byCSSSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.framework.base.BasePage;
import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Label;
import com.framework.elements.Link;
import com.framework.elements.Table;
import com.framework.elements.TextField;
import com.framework.util.Encrypt;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class StudentLoginPage2 extends BaseLocators{
		
		public StudentLoginPage2 loginLTC(StringHash data) throws Exception {
			 String Password = Encrypt.decodeString(data.get("Password").toString());
	            String Username = Encrypt.decodeString(data.get("UserName").toString());
	           
	            
//	            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	            userNameTxt.waitTillElementClickable();
	            userNameTxt.clearAndTypeUandPwd(Username.toString());
	            LoginNext.waitTillElementClickable();
	            LoginNext.click();
	            passwordTxt.waitTillElementClickable();
	            passwordTxt.clearAndTypeUandPwd(Password.toString());
	           // SignIn.waitTillElementFound();
	            SignIn.click();
	            wait(7);
			return this;
		}
		
	}


	



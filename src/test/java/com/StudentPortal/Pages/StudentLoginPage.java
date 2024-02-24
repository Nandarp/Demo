package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byId;
import static com.framework.elements.Locator.byXPath;
import static com.framework.elements.Locator.byLinkText;
import static com.framework.elements.Locator.byCSSSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.framework.base.BasePage;
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

public class StudentLoginPage extends BasePage
{
	//Login Page Web Elements
	//static Link useanotheracct = new Link("User Name Field", byId("otherTileText"));
		static TextField userNameTxt = new TextField("User Name Field", byCSSSelector("#i0116"));
		static Button Next = new Button("Click Next", byCSSSelector("#idSIButton9"));
		static TextField passwordTxt = new TextField("Password Field", byCSSSelector("#passwordInput"));
//		static Button Next = new Button("Click Next", byXPath("//input[@type=\"submit\"]"));
		static Link SignIn = new Link("Click SignIn", byCSSSelector("#submitButton"));
////		static Link SignIn = new Link("Click SignIn", byXPath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		static Checkbox DontShowThisAgain = new Checkbox("Don't Show This Again", byCSSSelector("#KmsiCheckboxField"));
		static Link ClickYes= new Link("Click Yes", byCSSSelector("#idSIButton9"));

	//Method Implementation
	
		public StudentLoginPage loginRC(StringHash data) throws Exception {
            //setImplicitWaitTimeout(30);
            String Password = Encrypt.decodeString(data.get("Password").toString());
            String Username = Encrypt.decodeString(data.get("UserName").toString());
            TextField userNameTxt = new TextField("User Name", byXPath("//input[@name=\"loginfmt\"]"));
            Button Next = new Button("Next", byXPath("//input[@id=\"idSIButton9\"]"));
            TextField UserName = new TextField("Username", byXPath("//input[@id=\"userNameInput\"]"));
            TextField password = new TextField("Password", byXPath("//input[@name=\"Password\"]"));
            Link SignIn = new Link("SignIn", byXPath("//span[@id=\"submitButton\"]"));
            Checkbox DontShowThisDailogAgain = new Checkbox("Don't Show This Dailog Again", byXPath("//input[@name=\"DontShowAgain\"]"));
            Button No = new Button("No", byXPath("//input[@id=\"idBtn_Back\"]"));
            Button CloseNewFeature = new Button("Close new feature", byXPath("(//button[.=\"Cancel\"])[1]"));
            Button SetDefault = new Button("Set default", byXPath("/button[text()='Set Default']"));
            
            wait(30);
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
            userNameTxt.waitTillElementClickable();
            wait(2);
            userNameTxt.clearAndTypeUandPwd(Username.toString());
            Next.waitTillElementClickable();
            Next.click();
            wait(2);
            UserName.waitTillElementClickable();
            UserName.clearAndTypeUandPwd(Username.toString());
            wait(2);
            password.waitTillElementClickable();
            password.clearAndTypeUandPwd(Password.toString());
            wait(2);
            SignIn.waitTillElementClickable();
            SignIn.click();
            wait(2);
            DontShowThisDailogAgain.waitTillElementClickable();
            DontShowThisDailogAgain.click();
            wait(2);
            No.waitTillElementClickable();
            No.click();
            wait(30);
            return this;
        }

	
	public StudentLoginPage login(StringHash data) throws Exception {
	
		waitForPageToLoad();	
		//Thread.sleep(25000);
		//Thread.sleep(60000);
	    //useanotheracct.click();
		userNameTxt.clearAndType(data.get("UserName").toString());
		
		Next.waitTillElementFound();
		Next.click();
		passwordTxt.clearAndType(data.get("Password").toString());
		SignIn.waitTillElementFound();
		SignIn.click();
		DontShowThisAgain.waitTillElementClickable();
		DontShowThisAgain.click();
	    ClickYes.waitTillElementClickable();
	    ClickYes.click();
//		ClickNo.waitTillElementClickable();
//		ClickNo.click();
//		ClickCancel.waitTillElementClickable();
//		ClickCancel.click();
		//LoginSuccess.waitTillElementFound();
		//CustomAsserts.containsString(LoginSuccess.getText(), data.get("Page Title").toString());
		wait(2);
		return this;

	}
	
	

	//Click Log Out
	public StudentLoginPage logOut() throws InterruptedException {
		wait(2);
//		ClickAPITest.waitTillElementClickable();
//		ClickAPITest.click();
//		logoutUserMenu.waitTillElementClickable();
//		logoutUserMenu.click();
		return this; // end of Log Out Method



    }
}


	



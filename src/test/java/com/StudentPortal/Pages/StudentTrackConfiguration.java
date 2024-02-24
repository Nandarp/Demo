package com.StudentPortal.Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.base.BasePage;
import com.framework.elements.BaseLocators;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.AppendValue;
import com.framework.util.StringHash;

public class StudentTrackConfiguration extends BaseLocators{

	static String Groupname = AppendValue.apendString();
	static String TrackName = AppendValue.apendString();
	static String TrackCode = AppendValue.apendString();
	Link Groupvalidation = new Link("Validation Message", By.xpath("//span[text()='The Student records were successfully saved.']"));
	Link Validation = new Link("Validation Message", By.xpath("//span[text()='The Registration Track records were successfully saved.']"));

	public StudentTrackConfiguration StudentGroup(StringHash data) throws Exception {
		//		arr.add(0,443184);
		//		arr.add(1, 489220);
		//		waitForPageToLoad();
		Add.clickUsingJavaScriptExecutor();
		wait(12);
		scrollPage(0,-270);
		wait(4);
		Name.clickUsingJavaScriptExecutor();
		wait(1);
		Name.clearAndType(Groupname);
		wait(2);
		System.out.println( "New group name:"+Groupname);
		SaveButton1.clickUsingJavaScriptExecutor();
		wait(5);
		Add.clickUsingJavaScriptExecutor();
		wait(5);
		Search.clearAndType(data.get("FirstStudent"));
		wait(2);
		SelectStudent.click();
		wait(2);
		//		Search.clearAndType(data.get("SecondStudent"));
		//		wait(2);
		//		SelectStudent.click();
		//		wait(2);
		Select.clickUsingJavaScriptExecutor();
		wait(3);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(3);
		//	CustomAsserts.containsString(Groupvalidation.getText(), data.get("SuccessMessage1").toString());
		System.out.println("Group creation is successfull");
		return this;
	}
	public StudentTrackConfiguration RegistrationTrackCreation(StringHash data) throws Exception{
		//		String CreatedGrp;

		SearchConfiguration.sendkeys("Registration Tracks");
		wait(3);
		RegTrack.clickUsingJavaScriptExecutor();
		wait(6);
		New.clickUsingJavaScriptExecutor();
		wait(15);
		Name.clearAndType(TrackName);
		System.out.println("Created Track Name:"+TrackName);
		wait(3);
		Code.clearAndType(TrackCode);
		//String TrackRegiCode=Code.getText();
		wait(3);
		Campusdropdown.clickUsingJavaScriptExecutor();
		wait(1);
		SelectCampus.clickUsingJavaScriptExecutor();
		wait(1);
		scrollPage(0,30);
		ClassSections.clickUsingJavaScriptExecutor();
		//		wait(2);
		//		ClassSectionScroll.dragScrollbar(70);
		//		wait(2);
		TermFieldCLick.clickUsingJavaScriptExecutor();
		wait(2);
		Search.clearAndType(data.get("TermCode").toString());
		wait(2);
		TermCheckBox.clickUsingJavaScriptExecutor();
		wait(1);
		Select.clickUsingJavaScriptExecutor();
		wait(3);
		AddtoList.clickUsingJavaScriptExecutor();
		wait(2);
		scrollPage(0,25);
		AlltermCheckBox.clickUsingJavaScriptExecutor();
		AlltermCheckBox.clickUsingJavaScriptExecutor();
		wait(3);
		SaveAndClose1.clickUsingJavaScriptExecutor();
		wait(3);
	//	CustomAsserts.containsString(Validation.getText(), data.get("SuccessMessage").toString());
		System.out.println("Track creation is successfull");
		return this;
	}
}



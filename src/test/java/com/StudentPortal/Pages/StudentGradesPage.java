package com.StudentPortal.Pages;

import static com.framework.elements.Locator.byCSSSelector;
import static com.framework.elements.Locator.byXPath;

import com.framework.base.BasePage;
import com.framework.elements.Button;
import com.framework.elements.Link;
import com.framework.elements.TextField;
import com.framework.util.StringHash;

public class StudentGradesPage extends BasePage {
	
	static TextField SearchConfig = new TextField("Search Configuration", byCSSSelector("#lists-treeview-filter"));
	static Link GradeScaleSpan = new Link("GradeScaleSpan", byXPath("//span[. = 'Grade Scales']"));

public StudentGradesPage AddLetterGradeUnderGradeScale(StringHash data) throws Exception{
	
	Link GradeScaleName = new Link("GradeScaleName", byXPath("//a[text()='"+data.get("GradeScaleName")+"']"));
	Link New = new Link("New", byXPath("//a[@id='NewLetterGrade']"));
	TextField LetterGradeBox = new TextField("LetterGradeBox", byXPath("//input[@aria-label='Letter Grade']"));
	TextField LetterNameBox = new TextField("LetterNameBox", byXPath("(//input[@aria-label='Name'])[1]"));
	Button Save = new Button("Save", byXPath("(//button[text()='Save'])[1]"));
	
	waitForPageToLoad();
	SearchConfig.waitTillElementClickable();
	SearchConfig.click();
	SearchConfig.clearAndType("grade");
	GradeScaleSpan.waitTillElementClickable();
	GradeScaleSpan.click();
	wait(5);
	GradeScaleName.waitTillElementClickable();
	GradeScaleName.click();
	waitForPageToLoad();
	scrollPage(0, 500);
	New.waitTillElementClickable();
	New.click();
	wait(6);
	LetterGradeBox.waitTillElementClickable();
	LetterGradeBox.click();
	LetterGradeBox.clearAndType(data.get("LetterGrade").toString());
	LetterNameBox.waitTillElementClickable();
	LetterNameBox.click();
	wait(3);
	LetterNameBox.clearAndType(data.get("LetterName").toString());
	Save.waitTillElementClickable();
	Save.click();
	
	return this;

}

}


package com.StudentPortal.Pages;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

public static void main(String[] args) throws InterruptedException {

String encrptData= "n6LeSsANeSPoRDSTrUcInGersOBacuRB";

byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());

		
System.out.println("encodedBytes --------------->" + new String(encodedBytes));
	
	
//	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
//	Date date = new Date();
//	String currentDate = formatter.format(date);
////	String[] dateArray = currentDate.split("/");
////	int year = Integer.parseInt(dateArray[2]);
////	year = year+1;
////	System.out.println(year);
////	String replaceDate = currentDate.replace(dateArray[2], String.valueOf(year));
////	System.out.println(replaceDate);
//	
//	
//	String[] dateArray = currentDate.split("/");
//	int year = Integer.parseInt(dateArray[2]);
//	int EndDateValue = year+1;
//	String EndDateActual = currentDate.replace(dateArray[2], String.valueOf(EndDateValue));
//	System.out.println(EndDateActual);
	
//	Date d=new Date();
//	System.out.println(d);

}
}
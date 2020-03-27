package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.SuperTestClass;
import pages.ContactUsPage;

public abstract class ContactUsTest extends SuperTestClass {
	
	
  @Test
  public void ContactUs() {
	  //As a User 
	  //I want to connect to website's customer support
	  //with my emailId and message text
	  //so that I can get assistant with my quaries
	  
	  
	  //Data 
	  final String url = "http://automationpractice.com";
	  String emailId = "rajqtx@gmail.com";
	  String message = "hello";
	  String subjectHeadline = "Customer service";
	  String actualMessage = "Your message has been successfully sent to our team.";
	  
	  //act
	  String confirmationMessage = new ContactUsPage(webDriver,url).
			  navigate("?controller=contact").
			  SelectHeading(subjectHeadline).
			  EnterEmailId(emailId).
			  EnterMessageText(message).
			  SendMessage().
			  ConfirmationText();
			  
			  
	  //navigate
	  //Select subjectHeadline from dropdownlist
	  //enter emailId 
	  //Enter MesstageText
	  //Click Send Button
	  //Explicit wait for greenbox message pop up 
	  //Grab the Greenbox Test 
	  
	  
	  //Asset with the greenbox test
	  Assert.assertEquals(actualMessage, confirmationMessage);
	  
  }
}

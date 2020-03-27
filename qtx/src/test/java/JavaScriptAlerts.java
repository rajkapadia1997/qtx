import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.JavaScriptAlertPage;

public class JavaScriptAlerts extends TestSuperClass{
  @Test
  public void JSAlert() {
	  String expected = "You successfuly clicked an alert";
	  String Result = new JavaScriptAlertPage(driver,BaseUrl)
			  .ClickJSAlert()
			  .HandleJSAlert()
			  .ReturnConfirmation();
	  Assert.assertEquals(Result, expected);
	  
  }
  @Test
  public void JSConfirm() {
	  String expected = "You clicked: Ok";
	  String Result = new JavaScriptAlertPage(driver,BaseUrl)
			  .ClickJSConfirm()
			  .HandleJSAlert()
			  .ReturnConfirmation();
	  Assert.assertEquals(Result, expected);
	  
  }
  @Test
  public void JSPrompt() {
	  String Text = "raj";
	  String expected = "You entered: " + Text;
	  String Result = new JavaScriptAlertPage(driver,BaseUrl)
			  .ClickJSPrompt()
			  .EnterText(Text)
			  .HandleJSAlert()
			  .ReturnConfirmation();
	  Assert.assertEquals(Result, expected);
	  
  }
}


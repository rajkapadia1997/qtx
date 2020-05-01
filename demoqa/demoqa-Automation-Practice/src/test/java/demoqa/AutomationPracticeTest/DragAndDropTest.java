package demoqa.AutomationPracticeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.pages.DroppablePage;
import demoqa.pages.ResizeablePage;
import demoqa.pages.SelectablePage;

public class DragAndDropTest extends ZZSuperTest{
  @Test
  public void DragAndDrop() {
	  String expectedText = "Dropped!";
	  String confirmation = new DroppablePage(driver, BaseUrl)
			  .navigate()
			  .dragAndDrop()
			  .getConfirmation();
	  
	  Assert.assertEquals(confirmation, expectedText);
  }
  
  @Test
  public void Resizable() {
	  String expectedText = "(150, 150)";
	  String confirmation = new ResizeablePage(driver, BaseUrl)
			  .navigate()
			  .dragAndDrop()
			  .getConfirmation();
	  
	  Assert.assertNotEquals(confirmation, expectedText);
  }
  
  @Test
  public void Selectable() {
	  String itemName = "Item 3";
	  String selectedClassName = "ui-widget-content ui-selectee ui-selected";
	  String receivedClassName = new SelectablePage(driver, BaseUrl)
			  .navigate()
			  .selectElementByName(itemName);
	  
	  Assert.assertEquals(receivedClassName, selectedClassName);
  }
}

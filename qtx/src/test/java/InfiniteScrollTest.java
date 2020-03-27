import org.testng.annotations.Test;

import com.qtx.pages.InfiniteScrollPage;

public class InfiniteScrollTest extends TestSuperClass{
  @Test
  public void FirstDynamicParagraph() {
	  String paragraph = new InfiniteScrollPage(driver, BaseUrl)
			  .navigate()
			  .ScrollAndGrab();
	  
	  System.out.println(paragraph);
  }
}

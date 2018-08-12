package asdfsaf;

import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium.Basepage;
import Selenium.DressespageObjects;
import Selenium.Homepageobjects;

public class DressespageTest {
	DressespageObjects Dressespage;
	Homepageobjects homepage;
	public DressespageTest(){
		Dressespage=new DressespageObjects();
		homepage=new Homepageobjects();
		homepage.clickdresses();
		}
	@Test
public void verifysize(){
	Assert.assertTrue(Dressespage.getsizeS().isDisplayed());
	Assert.assertTrue(Dressespage.getsizeM().isDisplayed());
	Assert.assertTrue(Dressespage.getsizeL().isDisplayed());
}
@Test
	public void checkcount(){
		Assert.assertTrue(Dressespage.getcount()== Dressespage.productmatch());
	}
	
	@Test
public void productadd(){
	Dressespage.getaddtocart();
	System.out.println(Dressespage.getproduct());
	Assert.assertTrue(Dressespage.getproduct().contains("Product successfully added to your shopping cart"));
}
}

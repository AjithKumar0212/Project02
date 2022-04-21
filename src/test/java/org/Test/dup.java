package org.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dup extends BaseClass{
	public dup() {
		PageFactory.initElements(driver,this);
	}
@FindBy(name="q")
private WebElement txtSearch;
@FindBy(xpath="//button[@class=\"L0Z3Pu\"]")
private WebElement btnSearch;
@FindBy(xpath="//div[@class=\"_4rR01T\"]")
private List<WebElement> productWebElement;
@FindBy(xpath="//div[@class=\"_30jeq3 _1_WHN1\"]")
private List<WebElement> priceWebElement;


public void productSearch(String Product) throws InterruptedException {
sendKeys(txtSearch, Product);
btnclick(btnSearch);
threadSleep(2000);
List<WebElement> products = productWebElement;
List<String> li=new ArrayList<String>();
Set<String> sd=new TreeSet<>();
for(int i=0;i<products.size();i++) {
	WebElement pro = products.get(i);
	System.out.println(pro.getText());
}
List<WebElement> productPrices = priceWebElement;
CharSequence subSequence=null;
String dss=null;
for(int i=0;i<productPrices.size();i++) {
	WebElement prices = productPrices.get(i);
	String text = prices.getText();
	subSequence = text.subSequence(1,text.length());
	li.add((String) subSequence);
	}
//System.out.println(subSequence);
for(int j=0;j<li.size();j++) {
	String sds = li.get(j);
	System.out.println(sds);
	for(int k=0;k<sds.length();j++) {
	char charr = sds.charAt(k);
	if(charr >='0' && charr <='9'){

	}
	
}


//for(int j=0;j<subSequence.length();j++) {
//char charA2 = subSequence.charAt(j);
//if(charA2 >='0' && charA2 <='9'){
//	
//	dss=""+charA2;
//System.out.print(dss);
//
//}
////li.add(dss);
//}
//li.add(dss);
//System.out.println();
//li.add(dss);
//}
//System.out.println("---------------");
System.out.println(li);
}}}
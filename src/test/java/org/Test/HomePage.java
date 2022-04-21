package org.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	public HomePage() {
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
		Set<String> sss=new TreeSet<>();
		for(int i=0;i<products.size();i++) {
			WebElement pro = products.get(i);
			String text = pro.getText();
			sss.add(text);
		}
		System.out.println(sss);
		for(String x:sss) {
			System.out.println(x);
		}
		List<Integer> li=new ArrayList<>();
		List<WebElement> productPrices = priceWebElement;
		for(int i=0;i<productPrices.size();i++) {
			WebElement prices = productPrices.get(i);
			String text = prices.getText();
				if(text.contains("₹")) {
				text= text.replace("₹","");}
				if(text.contains(",")) {
					text= text.replace(",","");}
				int parseInt = Integer.parseInt(text);
				li.add(parseInt);
			}
		for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
		}
		Collections.sort(li);
		System.out.println(li);
		System.out.println("min "+Collections.min(li));
		System.out.println("max "+Collections.max(li));
		Collections.reverse(li);
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		}

		}

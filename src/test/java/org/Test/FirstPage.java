package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends BaseClass {
	public FirstPage() {
PageFactory.initElements(driver,this);

}
@FindBy(xpath="(//button)[2]")
private WebElement btnclose;
public  void btnclose() {
btnclick(btnclose);
}
}

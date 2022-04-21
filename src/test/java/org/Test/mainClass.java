package org.Test;

import org.Base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class mainClass extends BaseClass {
@Test
private void t2() throws InterruptedException {
System.out.println("yes");
launchBrowser("chrome");
launchUrl("https://www.flipkart.com");
FirstPage f=new FirstPage();
f.btnclose();
HomePage h=new HomePage();
h.productSearch("samsung mobiles");
}
@AfterMethod
private void am() {
	System.out.println("-----------Program End11-----------------");
browserQuit();
}
}
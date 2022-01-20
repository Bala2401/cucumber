package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.outstationui;
import com.mindtree.utility.Logs;

public class outstationpageobject {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	outstationui outui;

	public outstationpageobject() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickonoutstation() throws WebDriverHelperException {
		helper.clickButton(outstationui.outstation);
		helper.switchHandles(1);
	}

	public void clickoneway() {
		helper.radiobutton(outstationui.oneradio, 0);
	}

	public void roundtrip() {
		helper.radiobutton(outstationui.oneradio, 1);
	}

	public void fromcityname(String s) throws WebDriverHelperException, InterruptedException {

		helper.sendText(outstationui.fromcity, s);
		Thread.sleep(5000);
		helper.clickButton(outstationui.fromcityclick);
	}

	public void tocityname(String s) throws WebDriverHelperException, InterruptedException {

		helper.sendText(outstationui.tocity, s);
		Thread.sleep(1000);
		helper.clickButton(outstationui.tocityclick);
	}

	public void roundtocityname(String s) throws WebDriverHelperException, InterruptedException {

		helper.sendText(outstationui.tocity, s);
		Thread.sleep(1000);
		helper.clickButton(outstationui.roundtocity);
	}

	public void date(String s1, String s2) throws InterruptedException {
		helper.selectdate(outstationui.calender, outstationui.dmonth, outstationui.Month, outstationui.date, s1, s2);

	}

	public void returndate(String s1, String s2) throws InterruptedException {
		helper.selectdate(outstationui.calender2, outstationui.dmonth, outstationui.Month, outstationui.date, s1, s2);

	}

	public void time(String s) {
		helper.select(outstationui.time, s);

	}

	public void selectcarbutton() throws WebDriverHelperException {
		helper.clickButton(outui.selectbutton);
	}

	public void firstcarselect() throws InterruptedException, WebDriverHelperException {
		Thread.sleep(5000);
		helper.clickButton(outstationui.selectcar);
	}

	public void validate() throws WebDriverHelperException {
		String Expectedprice = "₹ 5124";
		String Actualprice = helper.getText(outstationui.price);
		Assert.assertEquals(Expectedprice, Actualprice);
		// if(Actualprice.contains(Expectedprice)) {
		log = loggerUtil.createLog("Price Validated : " + Actualprice);
		// }
	}
}

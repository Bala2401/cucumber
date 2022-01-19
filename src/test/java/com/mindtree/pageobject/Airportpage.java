package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.AirportPageUI;
import com.mindtree.utility.Logs;

public class Airportpage {
	static WebDriverHelper helper;
	static Logs loggerUtil;
	static Logger log;
	static AirportPageUI airpage;

	public Airportpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	
	  public void airport() throws WebDriverHelperException {
		  log = loggerUtil.createLog("AirportPage.java");
		  helper.clickButton(AirportPageUI.airport);
	  
	 } 
	  

	public void Switchtab(int i) {
		try {
			helper.switchHandles(i);
			log.debug("Switched to new Tab");
		} catch (Exception e) {
			log.debug("Cannot Switched to new Tab");
		}
	}

	public void SelectSrc(String source) {
		try {
			helper.sendText(AirportPageUI.src, source);
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.srcclick);
			log.debug("Source location filled");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Source location");
		}
	}

	public void SelectDest(String Destination) {
		try {
			helper.sendText(AirportPageUI.dest, Destination);
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.destclick);
			log.debug("Destination location filled");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Destination location");
		}
	}

	public void SelectTripType() {
		try {
			helper.selectByIndex(AirportPageUI.trip, 2);
			log.debug("TripType  selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select TripType ");
		}
	}

	public void SelectDate(String Month,String Date) {
		try {
			helper.applicationWait(2000);
			helper.clickButton(
					AirportPageUI.datepicker);
			helper.applicationWait(5000);
			helper.Datepicker(AirportPageUI.mon, Month,
					AirportPageUI.nxt,
					AirportPageUI.date, Date);
			log.debug("Date  selected");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot select Date ");
		}
	}

	public void SelectPickuptime(String time) {
		try {
			helper.selectByText(AirportPageUI.pickup,time );
			log.debug("Pickuptime  selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select Pickuptime ");
		}
	}

	public void ClickOnSearchCar() {
		try {
			helper.actionClick(AirportPageUI.searchcar);
			log.debug("SearchCar Clicked");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Click SearchCar ");
		}
	}

	public void SelectFirstCar() {
		try {
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.firstcar);
			log.debug("First Car Selected in the result page");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Select Car ");
		}
	}

	public void ValidateCarDetails() {
		try {
			helper.applicationWait(5000);
			String Expectedprice = "921";
			String Actualprice = helper.getText(AirportPageUI.price);
			if (Actualprice.contains(Expectedprice)) {
				log.info("Price Validated : " + Actualprice);
			} else {
				log.info("Price Validation Failed : " + Actualprice);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Validate Car Details");
		}
	}
}

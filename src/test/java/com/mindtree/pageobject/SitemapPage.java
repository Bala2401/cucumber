package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.AirportPageUI;
import com.mindtree.uistore.SitemapPageUI;
import com.mindtree.utility.Logs;



public class SitemapPage {
	
		static WebDriverHelper helper;
		static Logs loggerUtil;
		static Logger log;
		static AirportPageUI airpage;

		public SitemapPage() {
			helper = new WebDriverHelper();
			loggerUtil = new Logs();
		}

		
		  public void site() {
			  log = loggerUtil.createLog("SitemapPage.java");
			  try {
					helper.actionClick(SitemapPageUI.sitemap);
					log.debug("Clicked on Sitemap under Get in touch section");
				} catch (WebDriverHelperException e) {
					e.printStackTrace();
				}
	}

		public void cabtype() {
			try {
				helper.switchHandles(1);
				helper.actionClick(SitemapPageUI.cabtype);
				log.debug("Clicked on Cab Types");
				
			} catch (WebDriverHelperException e) {
				e.printStackTrace();
			}
		}

		public void tatindica() {
			try {
				helper.switchHandles(2);
				helper.actionClick(SitemapPageUI.tataindica);
				log.debug("Clicked on Tata indica cab");
				
			} catch (WebDriverHelperException e) {
				e.printStackTrace();
			}
		}
		public void heading() {
			try {
				helper.switchHandles(3);
				helper.getText(SitemapPageUI.heading);
				log.debug("Heading of the page is verified");
			} catch (WebDriverHelperException e) {
				e.printStackTrace();
			}
		}

}

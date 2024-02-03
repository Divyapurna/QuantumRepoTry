package modules;

import java.lang.module.Configuration;

import com.qmetry.qaf.automation.core.ConfigurationManager;

public class Global {

	public static ThreadLocal<String> testngXMLThreadType=ThreadLocal.withInitial(()->"");//the thread type to run as zelium from the executed TestNG.xml file
	public final static	String SELENIUM_GRID_URL=ConfigurationManager.getBundle().getPropertyValue("SeleniumGridURL").replace("SeleniumGridURL","");
	public static ThreadLocal<String> zaleniumURL=ThreadLocal.withInitial(()->ConfigurationManager.getBundle().getPropertyValue("zaleniumURL").replace("zaleniumURL",""));//xBrowser eding URL in quantum ie: @va1pldockxbrow3:4444/wd/hub

}

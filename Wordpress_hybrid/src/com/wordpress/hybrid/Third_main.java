package com.wordpress.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third_main {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.gecko.driver", "/home/luser/Desktop/Selenium_PlugIns/geckodriver");
		WebDriver wd =new FirefoxDriver();
		second_ReadData sd= new second_ReadData();
		sd.readdata(wd);
		

	}

}

package com.qa.fb.tests;

import org.apache.log4j.Logger;
import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.fb.keyword.base.Base;
import com.qa.fb.keyword.engine.KeyWordEngine;

public class LoginTest extends Base {
	public KeyWordEngine keyWordEngine;
	Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeMethod
	public void setUp() {
		log.info("*** Starting test cases execution  ****");
	}

	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		try {
			keyWordEngine.startExecution("login");
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			e.printStackTrace();
		}

	}

}
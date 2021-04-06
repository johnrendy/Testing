package com.brispotritel.prakarsa

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Analisa5C {
	@Keyword
	public void openApplication(Integer screenWidth, Integer screenHeight){

		Mobile.startApplication('E:\\KATALON DRIVE\\01_APK\\BrispotDevKemendagri_02.apk', false, FailureHandling.CONTINUE_ON_FAILURE)
		screenWidth = Mobile.getDeviceWidth()
		screenHeight = Mobile.getDeviceHeight()

		Mobile.waitForElementPresent(findTestObject('01_HOME/012_PRAKARSA/012C_PRAKARSA'), GlobalVariable.timeOut)
	}
}

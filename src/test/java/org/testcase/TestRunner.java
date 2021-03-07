package org.testcase;

import org.data.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",monochrome=true,dryRun=false,glue="org.stepcase",
snippets=SnippetType.CAMELCASE,plugin= {"pretty","html:src\\test\\resources","json:C:\\Users\\Acer\\eclipse-workspace\\CucumberOption\\src\\test\\resources\\jvmreport\\dinu.json"})

public class TestRunner { 
	
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("C:\\Users\\Acer\\eclipse-workspace\\CucumberOption\\src\\test\\resources\\jvmreport\\dinu.json");

	}

}

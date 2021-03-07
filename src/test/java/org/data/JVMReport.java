package org.data;



import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String json) {
		File f=new File("C:\\Users\\Acer\\eclipse-workspace\\CucumberOption\\src\\test\\resources\\jvmreport");
		Configuration configuration=new Configuration(f, "facebook");
		configuration.addClassifications("sprint", "50");
		configuration.addClassifications("platform", "win-8");
		configuration.addClassifications("browser", "chrome");
		
		
		List<String> li=new ArrayList<String>();
		li.add(json);
		
		ReportBuilder bulider=new ReportBuilder(li, configuration);
		bulider.generateReports();
		

	}
	

}

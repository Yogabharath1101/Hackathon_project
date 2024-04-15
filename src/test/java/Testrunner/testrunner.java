package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@io.cucumber.testng.CucumberOptions( 
					features= {".//Features"}, 
					glue="stepDefinitions",
							plugin= {"pretty", "html:reports/myreport.html", 
									  "rerun:target/rerun.txt",
									  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
									}
		    )
public class testrunner extends AbstractTestNGCucumberTests {

}

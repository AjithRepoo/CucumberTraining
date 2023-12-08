package comtestrunner;

import org.junit.runner.RunWith;

import com.Testbase.TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\1000066986\\eclipse-workspace\\CucumberTrainProject\\Features"},
		glue = {"com.step"},dryRun = false,
		monochrome = true,
	tags = "@Login ",
		plugin = {"pretty","html:target/test_results","json:target/cucumberReports.json","junit:junit_xml/cucumberReports.xml"},
		stepNotifications = true ,publish = true
		
		
		
		)
public class TestRunner{

}

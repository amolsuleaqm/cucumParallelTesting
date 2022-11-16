package cucumberlearning;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions
(
		dryRun=false,
		//strict=true,
		monochrome=true,
		/*features ={"src/test/resources/cucumberlearning/login2.feature",
				"src/test/resources/cucumberlearning/mail2.feature"},
		glue="cucumberlearning",
		plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json",
			"junit:target/cukes.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}*/
		
		features="classpath:cucumberlearning",
		glue="",
		
	plugin= {"pretty","json:target/MyReports/report.json",
				  "junit:target/MyReports/report.xml",	
               "html:target/MyReports/report.html",
                
                }

		//tags= {"@loginfunctionality"}
		
		
		
		
		)


public class TestRunner1 extends AbstractTestNGCucumberTests 
{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios()
	{
        return super.scenarios();
        
	}
}

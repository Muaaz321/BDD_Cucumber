package testRunner;

import io.cucumber.junit.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resource/AppFeature/Search.feature"},
				 glue = {"stepDefinition","Hooks"},
				 tags = "@Smoke or @Regression",
				 plugin = {"pretty",
						 	"json:target/Myreports/report.json",
						 	"junit:target/Myreports/report.xml",						
							},
				 //publish = true
				monochrome=true, // for alignment
				dryRun = false // just to check step definitions have defined
	
		)

public class SearchTest {
	
	
}

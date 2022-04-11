package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resource/AppFeature/Registration.feature"},
				 glue = {"stepDefinition"},
				 //tags = "@Regression or @Smoke",
				 //tags = "not @LiveTest"
				 //tags = "@All",
				 plugin = {"pretty",
						 	"json:target/Myreports/report.json",
						 	"junit:target/Myreports/report.xml",						
							},
				 publish = true

		)
public class Registration {

}

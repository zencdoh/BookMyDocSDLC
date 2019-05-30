/*package CucumberReport; 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = (features = {/src/test/java/features/}, format = {" json :target/cucumber.json"}, glue = "steps")
)
/*    public class CucumberReport extends AbstractTestNGCucumberTests
    {
}*/
package CucumberReport; 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
/*@RunWith(Cucumber.class)
 @CucumberOptions(format = (features = {/src/test/java/features/}, format = {" json :target/cucumber.json"}, glue = "steps")
)*/
 
public class CucumberReport {
 
@RunWith(Cucumber.class)
@CucumberOptions(
dryRun=true,
strict=true,
features={"/src/test/java/features/user.feature"},
glue={"stepDefinition"},
tags={"@automated"},
plugin={"json:src/test/cucumber.json"}
)

public class CucumberReport { }
}

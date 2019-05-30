package CucumberReport; 

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions( format={"json:target/Destination/cucumber.json"}) 

//When we specify json:target/Destination/cucumber.json - It will generate the JSON  
//report inside the Destination folder, in the target folder of the maven project//

public class runTest {}

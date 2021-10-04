package step;


	
import cucumber.api.CucumberOptions;

	@CucumberOptions(features = { "src/test/resources/featureFile" }, glue = { "step"}) 
	
					
	public class Runner{

	}
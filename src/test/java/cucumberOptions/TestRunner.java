package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// using features functions i have given the path for all my feature files
@CucumberOptions(features = "src\\test\\java\\Features",
// using glue function i am attaching stepdefinitions with ny feature files
glue= {"stepdefinitions"},

tags="@credentials")

public class TestRunner 
{
	
}

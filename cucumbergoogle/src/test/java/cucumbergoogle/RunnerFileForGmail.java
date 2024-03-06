package cucumbergoogle;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",glue={})
public class RunnerFileForGmail extends AbstractTestNGCucumberTests {

}

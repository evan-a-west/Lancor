package google;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.CucumberOptions;

@Suite
@IncludeEngines("cucumber")
@CucumberOptions(
    tags = "@GoogleSearch"
)
@SelectClasspathResource("/features/google")
public class CucumberTestSuite_Google {
}
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions (features = "src/test/resources/features",
		glue = "stepdefs",
		snippets = SnippetType.CAMELCASE,
		plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})

public class TestRunner {

	private TestNGCucumberRunner testNGCucumberRunner;

	static {
		System.setProperty("extent.reporter.spark.start", "true");
		System.setProperty("extent.reporter.spark.config", "src/main/resources/config/spark-config.xml");
		System.setProperty("extent.reporter.spark.out", "test-output/SparkReport/Index.html");
	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		RestAssured.baseURI = "http://www.omdbapi.com";
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		//	Uncomment this section to enable logging
		//	RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
	}

	@Test(groups = "cucumber", description = "Run Cucumber Scenario", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickleEventWrapper, FeatureWrapper featureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEventWrapper.getPickle());
	}

	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}
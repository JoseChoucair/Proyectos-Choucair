package pa.com.ptb.wfu.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/plataformaTransferenciaBancaria.feature",	
		tags= "@Caso1",
		glue="pa.com.ptb.wfu.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}

package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary","html:Relatorio-html.html","json:Relatorio.json"},
        monochrome = true,
        features = {"src/main/java/feature/"},
        glue = {"Steps"},
        dryRun = false)

public class RunnerTestJunit {
}

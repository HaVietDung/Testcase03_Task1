package smartosc.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/testcase3",
        glue = {"smartosc.hook", "smartosc.page"},
        tags = ""
//        tags = "@testcase3_vn"
//        tags = "@testcase3_cac_en"
)

public class Testcase3TestSuite {

}

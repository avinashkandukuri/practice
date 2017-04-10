package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
public class Practice01 {
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "json:target/"},
				features = {"src/Cucumber/"})

	

}

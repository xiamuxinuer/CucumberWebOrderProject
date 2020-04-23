package com.WebOrders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class CucumberRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = "com\\WebOrders\\Step_definitions",
            features = "src\\test\\resources\\features",
            dryRun = false,
            strict = true,
            tags  ="",
            plugin = {"html:target\\default-report",
                    "json:target\\cucumber1.json"}
    )
    public class LoginTestCucumberRunner {


    }
}

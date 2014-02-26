package com.merchantwarehouse.zucchini;

import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

/**
 * This class tests whether we can name the glue class differently than the feature file.
 *
 * @author dominicl
 */
@RunWith(Zucchini.class)
@Zucchini.Options(features = "DifferentlyNamedFeature.feature")
public class GlueClassNamedDifferentlyThanTheFeatureFileTest extends InheritanceTestBase {

    @Then("^the total should be (\\d+)$")
    public void then_the_total_should_be(Integer total) {
        assertEquals("total", total, getTotal());
    }
}

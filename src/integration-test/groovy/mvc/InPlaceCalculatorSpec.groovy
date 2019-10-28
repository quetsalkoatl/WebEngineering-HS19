package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class InPlaceCalculatorSpec extends GebSpec {

    void "Calculate in place with a self-refreshing view"() {
        when: "Go to start GSP page by calling it disguised as HTML"
        go '/InPlaceCalculator.html'
        then:
        title == "In-Place Calculator"

        when: "set valid input"
        $("form").en = 5
        $("form").exam = 6
        $("input", type: "submit").click()

        then: "Result is displayed with proper rounding up"
        $("output").text() == "6"

    }
}

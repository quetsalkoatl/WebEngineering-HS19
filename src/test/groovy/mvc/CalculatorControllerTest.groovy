package mvc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CalculatorControllerTest extends Specification
        implements ControllerUnitTest<CalculatorController> {

    def "simple average of #en and #exam should be #result"() {
        when:
        controller.calc(4.5, 5.3)
        then:
        model.result == 4.9
    }

}

package mvc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CalculatorControllerTest extends Specification
        implements ControllerUnitTest<CalculatorController> {

    def "simple average of #en and #exam should be #result"() {
        given:
        CalculatorModel model = new CalculatorModel();
        model.en = 4.5
        model.exam = 5.3
        when:
        controller.calc(model)
        then:
        model.result == Double.valueOf(4.9)
    }

}

package mvc

import grails.validation.Validateable

class CalculatorController {

    def calc(CalculatorModel model) {
        if (!gradeIsValid(model.en)) {
            model.result = "'en' input is invalid"
            model.error = true
        } else if (!gradeIsValid(model.exam)) {
            model.result = "'exam' input is invalid"
            model.error = true
        } else {
            double result = (model.en + model.exam) / 2
            model.result = result
        }
        render view: "CalculatorOutput", model: [model: model]
    }

    private static boolean gradeIsValid(double grade) {
        if (grade < 1 || grade > 6) {
            return false
        }
        return true
    }
}

class CalculatorModel implements Validateable {
    double en
    double exam
    boolean error = false
    String result

    static constraints = {
        en min:1d, max:6d, scale:1
        exam min:1d, max:6d, scale:1
        result nulleable: true
    }

}

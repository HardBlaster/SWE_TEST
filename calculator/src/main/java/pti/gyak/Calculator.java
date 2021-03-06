package pti.gyak;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static final String SEPARATOR = " ";

    private Number result = 0;
    private String expression = "";
    private List<String> history = new ArrayList<>();

    private Operation lastOperation;

    public Calculator enter(Number number) {
        if (number != null) {
            if (lastOperation != null) {
                if (lastOperation.equals(Operation.ADD)) {
                    result = result.doubleValue() + number.doubleValue();
                } else if (lastOperation.equals(Operation.SUBSTRACT)) {
                    result = result.doubleValue() - number.doubleValue();
                } else if (lastOperation.equals(Operation.MULTIPLY)) {
                    result = result.doubleValue() * number.doubleValue();
                } else if (lastOperation.equals(Operation.DIVIDE)) {
                    result = result.doubleValue() / number.doubleValue();
                } else if (lastOperation.equals(Operation.REMAINDER)) {
                    result = result.doubleValue() % number.doubleValue();
                } else if (lastOperation.equals(Operation.POWER)) {
                    result = Math.pow(result.doubleValue(), number.doubleValue());
                }
                expression = expression + SEPARATOR + lastOperation + SEPARATOR + number;
                history.add(expression + " = " + resultString());
                lastOperation = null;
            } else {

                result = number;
                expression = "" + number;
                return this;

            }
        }

        return this;
    }

    public Calculator enter(Operation operation) {
        if (operation != null) {
            if (operation == Operation.ADD || operation == Operation.SUBSTRACT || operation == Operation.MULTIPLY
                    || operation == Operation.DIVIDE || operation == Operation.REMAINDER || operation == Operation.POWER) {
                lastOperation = operation;
            } else if (operation == Operation.SQRT) {
                result = Math.sqrt(result.doubleValue());
                expression = operation + "(" + expression + ")";
                lastOperation = null;
            } else if (operation == Operation.CLEAR) {
                result = 0;
                expression = "";
                lastOperation = null;
            }
            return this;
        }

        return this;
    }

    public String getHistory() {
        StringBuilder s = new StringBuilder();
        if (!history.isEmpty())
            for (String h : history) {
                s.append(h).append("\n");
            }


        return s.toString();
    }

    public Number getResult() {
        return result;
    }

    private String resultString() {
        return result.doubleValue() % 1 == 0 ? "" + result.intValue() : result.toString();
    }
}
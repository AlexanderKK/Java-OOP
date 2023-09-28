package _05Polymorphism._02Exercises._04Calculator;

import java.util.ArrayList;
import java.util.List;

public class DivisionOperation implements Operation {

    private List<Integer> operands;
    private int result;

    public DivisionOperation() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        operands.add(operand);

        if(operands.size() == 2) {
            result = operands.get(0) / operands.get(1);
        }
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public boolean isCompleted() {
        return operands.size() == 2;
    }

}

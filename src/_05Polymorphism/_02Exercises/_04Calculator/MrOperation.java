package _05Polymorphism._02Exercises._04Calculator;

import java.util.Deque;

public class MrOperation implements Operation {

    private Deque<Integer> memory;

    public MrOperation(Deque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {
        //we only extract from memory
    }

    @Override
    public int getResult() {
        return memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }

}

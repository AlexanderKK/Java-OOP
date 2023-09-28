package _07ReflectionAndAnnotations._02Exercise.barracksWars.core.commands;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {

    private String[] data;

    public Command(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }

}

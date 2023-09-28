package _07ReflectionAndAnnotations._02Exercise.barracksWars.core.commands;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.annotations.Inject;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Repository;

public class RetireCommand extends Command {

    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            repository.removeUnit(unitType);

            return String.format("%s retired!", unitType);
        } catch(IllegalStateException e) {
            return e.getMessage();
        }
    }

}

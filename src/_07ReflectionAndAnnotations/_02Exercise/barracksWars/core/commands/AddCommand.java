package _07ReflectionAndAnnotations._02Exercise.barracksWars.core.commands;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.annotations.Inject;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Repository;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Unit;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command {

    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = unitFactory.createUnit(unitType);
        repository.addUnit(unitToAdd);

        return unitType + " added!";
    }

}

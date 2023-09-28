package _07ReflectionAndAnnotations._02Exercise.barracksWars;

import _07ReflectionAndAnnotations._02Exercise.barracksWars.core.Engine;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.core.commands.CommandInterpreterImpl;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.core.factories.UnitFactoryImpl;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.data.UnitRepository;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.CommandInterpreter;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.Repository;
import _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Repository repository = new UnitRepository();

        UnitFactory unitFactory = new UnitFactoryImpl();

        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}

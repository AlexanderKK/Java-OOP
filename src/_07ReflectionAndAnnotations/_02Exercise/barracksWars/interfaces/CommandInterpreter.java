package _07ReflectionAndAnnotations._02Exercise.barracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}

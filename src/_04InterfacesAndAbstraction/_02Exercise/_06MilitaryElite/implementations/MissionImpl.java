package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.Mission;

public class MissionImpl implements Mission {
    private String codeName;
    private State state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    private void setState(String state) {
        if(!state.equals("finished") && !state.equals("inProgress")) {
            throw new IllegalStateException("Invalid mission state!");
        }

        this.state = State.valueOf(state);
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("  Code Name: %s State: %s", codeName, state.toString());
    }
}

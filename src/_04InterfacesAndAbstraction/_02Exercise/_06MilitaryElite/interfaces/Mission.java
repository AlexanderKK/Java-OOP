package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations.State;

public interface Mission {

    String getCodeName();

    State getState();

}

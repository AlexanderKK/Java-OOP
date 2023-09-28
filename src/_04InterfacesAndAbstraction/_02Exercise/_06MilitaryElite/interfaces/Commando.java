package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}

package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces;

import java.util.Collection;

public interface LieutenantGeneral extends Private {

    void addPrivate(Soldier soldier);
    Collection<Soldier> getPrivates();

}

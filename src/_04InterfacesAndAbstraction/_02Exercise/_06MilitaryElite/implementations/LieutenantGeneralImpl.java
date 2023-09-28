package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.LieutenantGeneral;
import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.Soldier;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<Soldier> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>((f, s) -> s.getId() - f.getId());
    }
    @Override
    public void addPrivate(Soldier soldier) {
        privates.add(soldier);
    }

    @Override
    public Collection<Soldier> getPrivates() {
        return Collections.unmodifiableSet(privates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator())
                .append("  ")
                .append(privates.stream()
                        .map(Soldier::toString)
                        .collect(Collectors.joining(System.lineSeparator() + "  ")));

        return sb.toString().trim();
    }
}

package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.Engineer;
import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.Repair;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableSet(repairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append("Repairs:")
                .append(System.lineSeparator())
                .append(repairs.stream()
                        .map(Repair::toString)
                        .collect(Collectors.joining(System.lineSeparator())));

        return sb.toString().trim();
    }
}

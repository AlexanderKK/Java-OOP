package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corp corp;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        setCorp(corp);
    }

    private void setCorp(String corp) {

        if (!corp.equals("Airforces") && !corp.equals("Marines")) {
            throw new IllegalStateException("Invalid corp!");
        }

        this.corp = Corp.valueOf(corp);
    }

    @Override
    public Corp getCorp() {
        return corp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("Corps: %s", corp.toString()))
                .append(System.lineSeparator());

        return sb.toString();
    }
}

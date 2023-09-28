package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(String.format(" Salary: %.2f", salary));

        return sb.toString();
    }
}

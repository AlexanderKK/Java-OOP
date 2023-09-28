package _04InterfacesAndAbstraction._02Exercise._06MilitaryElite;

import java.util.*;

import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.interfaces.*;
import _04InterfacesAndAbstraction._02Exercise._06MilitaryElite.implementations.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Soldier> soldiers = new ArrayList<>();

        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String[] cmdParts = command.split("\\s+");

            String soldierType = cmdParts[0];
            int id = Integer.parseInt(cmdParts[1]);
            String firstName = cmdParts[2];
            String lastName = cmdParts[3];
            double salary = Double.parseDouble(cmdParts[4]);

            switch (soldierType) {
                case "Private":
                    Private privateSoldier = new PrivateImpl(id, firstName, lastName, salary);

                    soldiers.add(privateSoldier);

                    break;
                case "LieutenantGeneral":
                    LieutenantGeneral lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);

                    int[] ids = getIds(cmdParts);

                    addPrivate(soldiers, lieutenantGeneral, ids);

                    break;
                case "Engineer":
                    String corpsNameEngineer = cmdParts[5];

                    try {
                        Engineer engineer = new EngineerImpl(id, firstName, lastName, salary, corpsNameEngineer);

                        String[] repairParts = getParts(cmdParts);

                        addRepair(engineer, repairParts);

                        soldiers.add(engineer);

                    } catch (Exception ignored) {}

                    break;
                case "Commando":
                    String corpsNameCommando = cmdParts[5];

                    try {
                        Commando commando = new CommandoImpl(id, firstName, lastName, salary, corpsNameCommando);

                        String[] missions = getParts(cmdParts);

                        addMission(commando, missions);

                        soldiers.add(commando);
                    } catch (Exception ignored) {}

                    break;
                case "Spy":
                    String codeNumber = cmdParts[4];
                    SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);

                    soldiers.add(spy);

                    break;
            }
        }

        soldiers.forEach(System.out::println);
    }

    private static void addMission(Commando commando, String[] missions) {
        for (int i = 0; i < missions.length; i += 2) {
            String codeName = missions[i];
            String missionState = missions[i + 1];

            try {
                Mission mission = new MissionImpl(codeName, missionState);
                commando.addMission(mission);

            } catch(Exception ignored) {}
        }
    }

    private static void addRepair(Engineer engineer, String[] repairParts) {
        for (int i = 0; i < repairParts.length; i += 2) {
            String partName = repairParts[i];
            int hoursWorked = Integer.parseInt(repairParts[i + 1]);

            Repair repair = new RepairImpl(partName, hoursWorked);
            engineer.addRepair(repair);
        }
    }

    private static String[] getParts(String[] cmdParts) {
        String[] repairParts = new String[cmdParts.length - 6];
        System.arraycopy(cmdParts, 6, repairParts, 0, repairParts.length);

        return repairParts;
    }

    private static void addPrivate(List<Soldier> soldiers, LieutenantGeneral lieutenantGeneral, int[] ids) {
        for (int privateId : ids) {
            Soldier currentPrivate = soldiers.stream()
                    .filter(s -> s.getId() == privateId)
                    .findFirst()
                    .get();

            lieutenantGeneral.addPrivate(currentPrivate);
        }

        soldiers.add(lieutenantGeneral);
    }

    private static int[] getIds(String[] cmdParts) {
        String[] privateIds = new String[cmdParts.length - 5];
        System.arraycopy(cmdParts, 5, privateIds, 0, privateIds.length);
        int[] ids = Arrays.stream(privateIds).mapToInt(Integer::parseInt).toArray();

        return ids;
    }
}

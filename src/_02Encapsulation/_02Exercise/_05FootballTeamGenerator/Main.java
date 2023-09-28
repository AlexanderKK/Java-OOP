package _02Encapsulation._02Exercise._05FootballTeamGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new LinkedHashMap<>();

        //1. Until END - Read Team | Add Player to Team | Remove Player From Team
        String command;
        while (!"END".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split(";");
            String teamName = commandParts[1];

            try {
                if (command.startsWith("Team")) {
                    Team team = new Team(teamName);
                    teams.put(teamName, team);
                } else if (command.startsWith("Add")) {
                    String playerName = commandParts[2];
                    int endurance = Integer.parseInt(commandParts[3]);
                    int sprint = Integer.parseInt(commandParts[4]);
                    int dribble = Integer.parseInt(commandParts[5]);
                    int passing = Integer.parseInt(commandParts[6]);
                    int shooting = Integer.parseInt(commandParts[7]);

                    if (!teams.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    } else {
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(player);
                    }
                } else if (command.startsWith("Remove")) {
                    String playerName = commandParts[2];

                    teams.get(teamName).removePlayer(playerName);
                } else {
                    if (!teams.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    } else {
                        Team team = teams.get(teamName);
                        System.out.printf("%s - %.0f%n", teamName, team.getRating());
                    }
                }
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

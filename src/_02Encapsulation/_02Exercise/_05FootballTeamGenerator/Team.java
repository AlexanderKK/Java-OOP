package _02Encapsulation._02Exercise._05FootballTeamGenerator;

import java.util.*;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalStateException("A name should not be empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean isRemoved = players.removeIf(e -> e.getName().equals(playerName));

        if(!isRemoved) {
            throw new IllegalStateException(String.format("Player %s is not in %s team.", playerName, this.name));
        }
//        Player currentPlayer = players.stream().filter(e -> e.getName().equals(playerName)).findAny().orElse(null);
//        if(currentPlayer == null) {
//            throw new IllegalStateException(String.format("Player %s is not in %s team.", playerName, this.name));
//        }
//
//        players.remove(currentPlayer);
    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}

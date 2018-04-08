package de.university.gui.score;

import java.util.ArrayList;

public class UserScore {
    private ArrayList<UserScore> userScores= new ArrayList<UserScore>();
    private String name;
    private Integer score;

    public UserScore(String name, Integer score){
        this.name = name;
        this.score = score;
    }

    public ArrayList<UserScore> getUserScores() {
        return userScores;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}

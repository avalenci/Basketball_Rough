package com.company;

import java.util.Scanner;
import java.io.*;
public class Team
{
    public Team(int teamNum) throws IOException
    {
        String teamName = Integer.toString(teamNum);
        Scanner sc = new Scanner(new File("Teams.csv"));
        sc.useDelimiter(",|\n");
        while (sc.hasNext()) {
            if (sc.next().equals(teamName)) {
                NAME = sc.next();
                System.out.println(NAME);
            }
        }
    }

    public double offensiveScore()
    {
        return 0;
    }

    public double defensiveScore()
    {
        return 0;
    }
    public String NAME;
    public  double SEASON_WINS; //avg
    public  double POST_SEASON_WINS; //avg
    public  double POINTS_PER_GAME;
    public  double THREE_POINT_PERCENT;
    public  double FIELD_GOAL_PERCENT;
    public  double FREE_THROW_PERCENT;
    public  double TURN_OVER_AVERAGE; //avg turnovers per game
    public  double STEALS_AVERAGE; //avg steals per game
    public double BLOCKS_AVERAGE; //avg blocks per game
}

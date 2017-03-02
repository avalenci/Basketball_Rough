package com.company;

import java.io.*;
import java.util.*;
public class Team
{
    public Team(int teamNum) throws IOException
    {
        ID = Integer.toString(teamNum);
        Scanner sc = new Scanner(new File("Teams.csv"));
        sc.useDelimiter(",|\n");
        while(sc.hasNext())
        {
            if(sc.next().equals(ID))
            {
                name = sc.next();
                break;
            }
        }
        getSeason_wins();
    }

    public String getSeason_wins() throws IOException
    {
        Scanner sc = new Scanner(new File("RegularSeasonDetailedResultsE.csv"));
        sc.nextLine();
        ArrayList line = new ArrayList();
        for (int j = 2015;)
        int countwins = 0;
        for (int i = 0; i < 13; i++)
        {
            line.add(i, sc.next());
        }
        if (line.get(1) == ID)
        {
            countwins++;
        }
        return "";
    }

    public String name;
    public String ID;
    public String season_wins; //ave
}

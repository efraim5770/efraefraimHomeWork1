package com.company;

public class Team {
    String name;
     Player[] players;
    public Team(Player player1,Player player2,Player player3,Player player4)
    {
        this.players= new Player[]{player1, player2, player3, player4};
    }

    public void showResults(){
for (int i=0; i< players.length;i++)
System.out.println(players[i].name+ " "+players[i].passed);
    }

    public void showPlayers(){
        for (int i=0; i< players.length;i++)
            System.out.println(players[i].name);
    }

}

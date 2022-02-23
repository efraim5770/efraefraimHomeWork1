package com.company;

public class Course {
    Obstacle[] obstacles;
    public Course(Obstacle[]obstacles)
    {
        this.obstacles=obstacles;
    }
    public void doIt(Team team){
           for (int i=0; i< team.players.length;i++) {
               Player player = team.players[i];
               player.passed = true;


               for (int s = 0; s < obstacles.length; s++) {
                   Obstacle obstacle = obstacles[s];
                   if (obstacle.complexity > player.skill)
                       player.passed = false;
               }
           }


    }
}

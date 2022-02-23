package com.company;

public class Main {

    public static void main(String[] args) {
           Course c = new Course(new Obstacle[]{
                   new Obstacle("pit", 5),  new Obstacle("wall", 10),
           }); // Создаем полосу препятствий
        Team team = new Team(new Player("Efraim",10),new Player("Ivan",5),new Player("Sergey",8),new Player("Natan",9)); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}

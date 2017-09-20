package com.will;

import java.util.Random;

public class Encounter {
    private String currentEnemy;
    private String currentHero;

    public Encounter() {
        this.currentEnemy = currentEnemy;
        this.enemies = enemies;
    }

    private String[] enemies = {"Ranged Monster", "Close Range Monster", "Flying Monster"};

    public void randomEnemy() {
        Random random = new Random();
        int index = random.nextInt(enemies.length);
        currentEnemy = enemies[index];
        System.out.println(currentEnemy);
    }

    public String getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentHero(String currentHero) {
        this.currentHero = currentHero;
    }
}

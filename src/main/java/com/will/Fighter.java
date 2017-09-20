package com.will;

public class Fighter{
    private double lifePoints = 20;
    private double attackDamage = 3;

    public Fighter() {
        this.lifePoints = lifePoints;
        this.attackDamage = attackDamage;
    }

    public void attack(CloseRangeMonster monster) {
        monster.takeDamage(attackDamage);
    }

    public void escape() {

    }

    public void takeDamage(double damage) {
        lifePoints -= damage;
    }

    public double getLifePoints() {
        return lifePoints;
    }

    public void death() {
        if (lifePoints <= 0) {
            System.out.println("Your hero's quest has ended.");
        }
    }
}

package com.will;

public class CloseRangeMonster {
    private double lifePoints = 1;
    private double attackDamage = 5;



    public CloseRangeMonster() {
        this.lifePoints = lifePoints;
        this.attackDamage = attackDamage;
    }

    public void attack(Fighter fighter) {
        fighter.takeDamage(attackDamage);
    }

    public void takeDamage(double damage) {
        lifePoints -= damage;
    }

    public double getLifePoints() {
        if (lifePoints <= 0){
            death();
        }
        return lifePoints;
    }

    public void death() {
        System.out.println("You have defeated this enemy!");
    }
}

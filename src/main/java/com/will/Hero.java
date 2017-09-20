package com.will;

public abstract class Hero {
    private double lifePoints = 20;
    private double attackDamage = 0;


    public abstract void attack();
    public abstract void escape();

    public double getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(double lifePoints) {
        this.lifePoints = lifePoints;
    }


    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }


}

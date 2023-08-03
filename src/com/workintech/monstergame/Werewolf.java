package com.workintech.monstergame;

public class Werewolf extends Monster implements Poisonable {
    private boolean canPoison;

    public Werewolf(String name, int hitPoints, double damage, boolean canPoison) {
        super(name, hitPoints, damage);
        this.canPoison = canPoison;
    }

    @Override
    public double attack() {
        double totalDamage = getDamage();
        if (canPoison) {
            totalDamage += poison();
        }
        return totalDamage;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}

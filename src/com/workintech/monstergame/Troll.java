package com.workintech.monstergame;

public class Troll extends Monster implements Bleedable {
    private boolean canBleed;

    public Troll(String name, int hitPoints, double damage, boolean canBleed) {
        super(name, hitPoints, damage);
        this.canBleed = canBleed;
    }

    @Override
    public double attack() {
        double totalDamage = getDamage();
        if (canBleed) {
            totalDamage += bleed();
        }
        return totalDamage;
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}


package com.workintech.monstergame;

public class Main {
    public static void main(String[] args) {
        // Troll nesnesi oluşturuldu ve attack metodu çağrıldı
        Troll troll = new Troll("Troll1", 100, 20.0, true);
        double trollAttackDamage = troll.attack();
        System.out.println(troll.getName() + " has attacked with " + trollAttackDamage + " damage.");

        // Werewolf nesnesi oluşturuldu ve attack metodu çağrıldı
        Werewolf werewolf = new Werewolf("Werewolf1", 120, 25.0, false);
        double werewolfAttackDamage = werewolf.attack();
        System.out.println(werewolf.getName() + " has attacked with " + werewolfAttackDamage + " damage.");
    }
}

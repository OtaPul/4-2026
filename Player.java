package main;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void attack(Monster target) {
        System.out.println(name + " hyökkää " + target.getType() + " hirviöön!");
        boolean alive = target.takeDamage(10);
        if (!alive) {
            System.out.println(target.getType() + " on kuollut!");
        }
    }

    public String getName() {
        return name;
    }
}

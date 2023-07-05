package game;

import live.lib;

public class Hero {
    // Статы не должны быть больше стартовых значений
    private String name;
    private int skill;
    private int endurance;
    private int luckiness;

    public Hero(String name) {
        this.name = name;
        this.skill = lib.rnd(1, 6) + 6;
        this.endurance = lib.rnd(1, 6) + lib.rnd(1, 6) + 12;
        this.luckiness = lib.rnd(1, 6);
    }

    public int getEndurance() {
        return endurance;
    }

    public int getLuckiness() {
        return luckiness;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setLuckiness(int luckiness) {
        this.luckiness = luckiness;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}

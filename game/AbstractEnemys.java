package game;

public abstract class AbstractEnemys {
    protected String name;
    protected int skill;
    protected int endurance;

    public AbstractEnemys(String name, int skill, int endurance) {
        this.name = name;
        this.skill = skill;
        this.endurance = endurance;
    }

    public abstract void getDamage();

    public abstract void parry();

}

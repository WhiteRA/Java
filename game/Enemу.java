package game;

public class Enemу extends AbstractEnemys {

    public Enemу(String name, int skill, int endurance) {
        super(name, skill, endurance);
    }

    @Override
    public void getDamage() {
        endurance = endurance - 2;
    }

    @Override
    public void parry() {
        System.out.println("Удары не достигли целей ");
    }

}

package game;

import live.lib;

public class Hero {
    // Статы не должны быть больше стартовых значений, за исключением тех редких
    // случаев, когда это будет специально оговорено.
    private String name;
    private int skill; // Уровень МАСТЕРСТВА отражает степень твоего ис-кусства владения мечом и общий
                       // уровень боевой подго-товки; чем он выше, тем лучше.
    private int endurance; // Уровень ВЫНОСЛИ-ВОСТИ отражает состояние твоего здоровья, твою волю к победе,
                           // способность отражать удары и переносить ране-ния; чем выше уровень
                           // ВЫНОСЛИВОСТИ, тем дольше ты можешь сопротивляться ударам врагов.
    private int luckiness; // Уровень УДАЧЛИВОСТИ показывает, насколько ты везуч.

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

    public void getInfoOfHero() {
        System.out.println("Имя: " + name + "\n" + "Мастерство: " + skill + "\n" + "Выносливость: " + endurance + "\n"
                + "Удачливость: " + luckiness);
    }

    public void luckCheck() {
        int i = 0;
        int badluck = lib.rnd(1, 6) + lib.rnd(1, 6);
        if (luckiness >= badluck) {
            System.out.println("В этот раз тебе повезло " + name + ". Но вледующий раз удача отвернётся от тебя... ");
            System.out.println("Помини моё слово, герой...");
            i++;
        } else {
            System.out.println("У теябя выпало - " + badluck);
            System.out.println("Я же говорил... Ехехехе...");
        }
        if (i == 4) {
            System.out.println(i);
        }
    }
}

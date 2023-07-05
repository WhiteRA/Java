package game;

import java.util.concurrent.TimeUnit;

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
        int win = 0;
        int lose = 0;
        int badluck = lib.rnd(1, 6) + lib.rnd(1, 6);
        if (luckiness >= badluck) {
            switch (win) {
                case 1:
                    System.out.println(luckiness);
                    System.out
                            .println("В этот раз тебе повезло " + name
                                    + ". Но вледующий раз удача отвернётся от тебя... ");
                    System.out.println("Помини моё слово, герой...");
                    break;
                case 2:
                    System.out.println(luckiness);
                    System.out.println("А ты везучий");
                    break;
                case 3:
                    System.out.println(luckiness);
                    System.out.println("Что ?! Опять ?! Не может быть !");
                    break;
                case 4:
                    System.out.println(luckiness);
                    System.out.println("Ты жульничаешь !");
                    break;
                case 5:
                    System.out.println(luckiness);
                    System.out.println("Тебя Тимора в зад поцеловала чтоли ?!");
                    break;

                default:
                    break;
            }
            win++;
        } else {

            switch (lose) {
                case 1:
                    System.out.println("У теябя выпало - " + badluck);
                    System.out.println("Я же говорил... Ехехехе...");
                    break;
                case 2:
                    System.out.println(luckiness);
                    System.out.println("Сегодня просто не твой день. Ехехехе...");
                    break;
                case 3:
                    System.out.println(luckiness);
                    System.out.println(" Оооо ! Приятель ! Да тебе крупно не везёт ! Ехехехе...");
                    break;
                case 4:
                    System.out.println(luckiness);
                    System.out.println("Ахахахахах ! Да ! Вот это я называю отличным деньком !");
                    break;
                case 5:
                    System.out.println(luckiness);
                    System.out.println("Ой, ой, ой. Посмотри те на него ! Он сейчас расплачется ! Ахахахахах !");
                    break;

                default:
                    break;
            }
            lose++;
        }
    }
}

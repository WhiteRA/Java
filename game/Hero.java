package game;

import lib.tools;

public class Hero {
    // Статы не должны быть больше стартовых значений, за исключением тех редких
    // случаев, когда это будет специально оговорено.
    private String name;
    private int skill; // Уровень МАСТЕРСТВА отражает степень твоего искусства владения мечом и общий
                       // уровень боевой подготовки. Чем он выше, тем лучше.
    private int endurance; // Уровень ВЫНОСЛИВОСТИ отражает состояние твоего здоровья, твою волю к победе,
                           // способность отражать удары и переносить ранения. Чем выше уровень
                           // ВЫНОСЛИВОСТИ, тем дольше ты можешь сопротивляться ударам врагов.
    private static int luckiness; // Уровень УДАЧЛИВОСТИ показывает, насколько ты везуч.
    private int win = 0; // для игр на удачу
    private int loss = 0; // для игр на удачу

    public Hero(String name) {
        this.name = name;
        this.skill = tools.rnd(1, 6) + 6;
        this.endurance = tools.rnd(1, 6) + tools.rnd(1, 6) + 12;
        this.luckiness = tools.rnd(1, 6);
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
        int badluck = tools.rnd(1, 6) + tools.rnd(1, 6);
        if (luckiness >= badluck) {
            System.out.println();
            System.out.println("Бросок шуллера " + badluck + " Ваш бросок " + luckiness);
            switch (win) {
                case 1:
                    win++;
                    System.out
                            .println("В этот раз тебе повезло " + name
                                    + ". Но вледующий раз удача отвернётся от тебя... ");
                    System.out.println("Помини моё слово, герой...");
                    break;
                case 2:
                    win++;
                    System.out.println("А ты везучий");
                    break;
                case 3:
                    win++;
                    System.out.println("Что ?! Опять ?! Не может быть !");
                    break;
                case 4:
                    win++;
                    System.out.println("Ты жульничаешь !");
                    break;
                case 5:
                    win++;
                    System.out.println("Тебя Тимора в зад поцеловала чтоли ?!");
                    break;
                default:
                    System.out.println("Хм...");
                    win++;
                    break;
            }
        } else {
            System.out.println();
            System.out.println("Бросок шуллера " + badluck + " Ваш бросок " + luckiness);
            switch (loss) {
                case 1:
                    loss++;
                    System.out.println("Удача на моей стороне... Ехехехе...");
                    break;
                case 2:
                    loss++;
                    System.out.println("Сегодня просто не твой день. Ехехехе...");
                    break;
                case 3:
                    loss++;
                    System.out.println(" Оооо ! Приятель ! Да тебе крупно не везёт ! Ехехехе...");
                    break;
                case 4:
                    loss++;
                    System.out.println("Ахахахахах ! Да ! Вот это я называю отличным деньком !");
                    break;
                case 5:
                    loss++;
                    System.out.println("Ой, ой, ой! Посмотри те на него ! Он сейчас расплачется ! Ахахахахах !");
                    break;
                default:
                    System.out.println("Интересно...");
                    loss++;
                    break;
            }
        }
    }
}

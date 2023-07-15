package live;

public class Cat extends Animal {

    public Cat(String voice, String name) {
        super(voice, name);
    }

    @Override
    public void getVoice() {
        System.out.println("Сказал " + voice);
    }

    @Override
    public void getJamp() {
        System.out.println(name + " Прыгнул");
    }

    @Override
    public void getName() {
        System.out.println("Зовут " + name);
    }

}

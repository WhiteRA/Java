package live;

public abstract class Animal {
    protected String jamp;
    protected String voice;
    protected String name;

    public Animal(String voice, String name) {
        this.voice = voice;
        this.name = name;
    }

    public abstract void getVoice();

    public abstract void getJamp();

    public abstract void getName();

}

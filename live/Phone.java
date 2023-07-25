package live;

public class Phone {
    private Integer number;
    private String model;
    private Integer weight;
    private String name;

    public Phone(String model, Integer weight, Integer number) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, Integer number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {

    }

    public String receiveCall(String name) {
        return "Звонит {name}";
    }

    public Integer getNumber() {
        return number;
    }

    public String receiveCall(String name, Integer number) {
        return "Звонит " + name + " " + number;
    }

    public String sendMessage(Integer number) {
        return "SMS to " + number;
    }

}

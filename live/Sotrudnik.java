package live;

public class Sotrudnik {
    String FIO;
    String doljnost;
    String email;
    String telefon;
    int zarplata;
    int vozrast;

    public Sotrudnik(String FIO, int vozrast) {
        this.FIO = FIO;
        this.vozrast = vozrast;
    }

    public void print() {
        System.out.println("ФИО " + FIO + " Должность " + doljnost + " Возраст " + vozrast);
        System.out.println();
    }

    public int getAge() {
        return vozrast;
    }

}

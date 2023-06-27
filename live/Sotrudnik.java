package live;

public class Sotrudnik {
    String FIO;
    String doljnost;
    String email;
    String telefon;
    int zarplata;
    int vozrast;

    public Sotrudnik(String FIO, String doljnost, int vozrast) {
        this.FIO = FIO;
        this.doljnost = doljnost;
        this.vozrast = vozrast;
    }

    public void print() {
        System.out.printf("ФИО " + FIO + " Должность " + doljnost + " Возраст " + vozrast);
    }
}

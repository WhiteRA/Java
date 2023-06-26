package live;

public class Sotrudnik {
    String FIO;
    String doljnost;
    String email;
    String telefon;
    int zarplata;
    int vozrast;

    public void print() {
        System.out.printf(FIO, doljnost, vozrast);
    }
}

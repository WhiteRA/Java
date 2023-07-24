package end;

import java.util.List;

public class Main {
    public static void Main(String[] args) {

        ToyStore<ActionFigure> toyStore = new ToyStore<>();

        ActionFigure toy1 = new ActionFigure("Супергерой 1");
        ActionFigure toy2 = new ActionFigure("Супергерой 2");

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);

        List<ActionFigure> allToys = toyStore.getAllToys();

        for (ActionFigure toy : allToys) {
            System.out.println(toy.getName());
        }
    }
}

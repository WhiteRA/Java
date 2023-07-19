package end;

import java.util.List;

public class Main {
    public static void Main(String[] args) {
        // Создание экземпляра магазина игрушек
        ToyStore<ActionFigure> toyStore = new ToyStore<>();

        // Создание игрушек
        ActionFigure toy1 = new ActionFigure("Супергерой 1");
        ActionFigure toy2 = new ActionFigure("Супергерой 2");

        // Добавление игрушек в магазин
        toyStore.addToy(toy1);
        toyStore.addToy(toy2);

        // Получение списка всех игрушек из магазина
        List<ActionFigure> allToys = toyStore.getAllToys();

        // Вывод игрушек
        for (ActionFigure toy : allToys) {
            System.out.println(toy.getName());
        }
    }
}

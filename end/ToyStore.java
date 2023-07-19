package end;

import java.util.ArrayList;
import java.util.List;

public class ToyStore<T extends Toy> {
    private List<T> toys;

    public ToyStore() {
        this.toys = new ArrayList<T>();
    }

    public void addToy(T toy) {
        toys.add(toy);
    }

    public void removeToy(T toy) {
        toys.remove(toy);
    }

    public List<T> getAllToys() {
        return toys;
    }
}

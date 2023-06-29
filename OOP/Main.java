package OOP;

public class Main {
    public static void main(String[] args) {
        Product[] prn = new Product[3];
        prn[0] = new Product("Product 1", 19.99, 1.2);
        prn[1] = new Product("Product 2", 29.99, 2.2);
        prn[2] = new Product("Product 3", 39.99, 3.2);
        for (int i = 0; i < prn.length; i++) {
            System.out.println(prn[i].prnProduct());
        }
    }
}

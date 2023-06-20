package T_3;

import java.util.ArrayList;

public class t_3_3 {

    public class Book {
        private String title;
        private String author;
        private double price;
        private int year;
        private int pages;

        public Book(String title, String author, double price, int year, int pages) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.year = year;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public int getYear() {
            return year;
        }

        public int getPages() {
            return pages;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "John Smith", 29.99, 2015, 400));
        books.add(new Book("Python for Beginners", "Alice Brown", 24.99, 2012, 300));
        books.add(new Book("C++ Crash Course", "Bob Adams", 34.99, 2013, 500));
        books.add(new Book("JavaScript Essentials", "David Lee", 19.99, 2011, 250));

        ArrayList<String> result = new ArrayList<>();

        for (Book book : books) {
            boolean isPrimePages = true;

            for (int i = 2; i <= Math.sqrt(book.getPages()); i++) {
                if (book.getPages() % i == 0) {
                    isPrimePages = false;
                    break;
                }
            }

            if (isPrimePages && book.getAuthor().contains("A") && book.getYear() >= 2010) {
                result.add(book.getTitle());
            }
        }

        System.out.println("Books matching criteria:");
        for (String title : result) {
            System.out.println(title);
        }
    }
}

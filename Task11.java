
class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    
    public Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return
               "Title: " + title +
               "\nAuthor: " + author +
               "\nYear Published: " + yearPublished +
               "\nPrice: $" + price + "\n"
        ;
    }
}

// separate class (?)
class TestClass{
    public static void main(String[] args) {
        // instantiate, code style from Task 10
        Book [] books = new Book[]{
            new Book("Java Programming","John Smith", 2021, 39.99),
            new Book("Python Basics","Jane Doe", 2020, 29.99),
            new Book("C++ Essentials","Michael Johnsons", 2019, 49.99)
            };
            for (int i = 1; i <= books.length; i++){
                System.out.println("Book " + i);
                System.out.println(books[i-1]);
            }
    }
}

public class Task11 {

}

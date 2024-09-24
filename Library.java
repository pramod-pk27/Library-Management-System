import java.util.ArrayList;
import java.util.Iterator;

class Library {
    ArrayList<Book> books; // Specify that books is an ArrayList of Book

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        // Use an iterator to avoid ConcurrentModificationException
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.ISBN.equals(ISBN)) {
                iterator.remove(); // Safely remove the book
                break; // Exit after removing the book
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Availability: " + book.availability);
            System.out.println();
        }
    }
}
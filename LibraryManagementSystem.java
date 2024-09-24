import java.util.Scanner;


public class LibraryManagementSystem { // Make sure this class is public
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("Enter availability (true/false): ");
                boolean availability = scanner.nextBoolean();
                library.addBook(new Book(title, author, ISBN, availability));
            } else if (choice == 2) {
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                library.removeBook(ISBN);
            } else if (choice == 3) {
                library.displayBooks();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}

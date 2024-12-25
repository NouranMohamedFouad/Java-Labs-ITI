import packageLibrary.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library<LibraryItem> library = new Library<>();
        
        Client client1 = new Client(1, "nouran", "nouran@gmail.com");
        Client client2 = new Client(2, "shahd", "shahd@gmail.com");
        library.addClient(client1);
        library.addClient(client2);
        
        

        
        boolean running = true;
        while (running)
        {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Retrieve Book by ID");
            System.out.println("4. Delete Book by ID");
            System.out.println("5. Add Magazine");
            System.out.println("6. Display Magazines");
            System.out.println("7. Retrieve Magazine by ID");
            System.out.println("8. Delete Magazine by ID");
            System.out.println("9. Add Client");
            System.out.println("10. Display Clients");
            System.out.println("11. Retrieve Client by ID");
            System.out.println("12. Delete Client by ID");
            System.out.println("13. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    library.addItem(new Book(bookId, bookTitle, bookAuthor));
                    break;
                case 2: // Display Books
                    System.out.println("Books in the system:");
                    library.displayBooks();
                    break;
                case 3: // Retrieve Book by ID
                    try
                    {
                        System.out.print("Enter book ID to retrieve: ");
                        int bookRetrieveId = scanner.nextInt();
                        library.getItemById(bookRetrieveId);
                    } catch (CustomException e) {
                        System.err.println(e.getMessage());
                    }
                    
                    break;
                case 4: // Delete Book by ID
                    System.out.print("Enter book ID to delete: ");
                    int bookDeleteId = scanner.nextInt();
                    library.deleteItem(bookDeleteId);
                    break;
                case 5: // Add Magazine
                    System.out.print("Enter magazine ID: ");
                    int magazineId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter magazine title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter magazine publisher: ");
                    String magazinePublisher = scanner.nextLine();
                    library.addItem(new Magazine(magazineId, magazineTitle, magazinePublisher));
                    break;
                case 6: // Display Magazines
                    System.out.println("Magazines in the system:");
                    library.displayMagazines();
                    break;
                case 7: // Retrieve Magazine by ID  
                    try
                    {
                         System.out.print("Enter magazine ID to retrieve: ");
                        int magazineRetrieveId = scanner.nextInt();
                        library.getItemById(magazineRetrieveId);
                    } catch (CustomException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 8: // Delete Magazine by ID
                    System.out.print("Enter magazine ID to delete: ");
                    int magazineDeleteId = scanner.nextInt();
                    library.deleteItem(magazineDeleteId);
                    break;
                case 9: // Add Client
                    System.out.print("Enter client ID: ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter client name: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Enter client email: ");
                    String clientEmail = scanner.nextLine();
                    library.addClient(new Client(clientId, clientName, clientEmail));
                    break;
                case 10: // Display Clients
                    System.out.println("Clients in the system:");
                    library.displayClients();
                    break;
                case 11: // Retrieve Client by ID
                    try
                    {
                        System.out.print("Enter client ID to retrieve: ");
                        int clientRetrieveId = scanner.nextInt();
                        library.getClientById(clientRetrieveId);
                    
                    } catch (CustomException e) {
                        System.err.println(e.getMessage());
                    }
                   
                    break;
                case 12: // Delete Client by ID
                    System.out.print("Enter client ID to delete: ");
                    int clientDeleteId = scanner.nextInt();
                    library.deleteClient(clientDeleteId);
                    break;
                case 13: // Exit
                    System.out.println("Exiting system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

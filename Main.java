import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialize a scanner object to scan in inputs for the program
        Scanner scanner = new Scanner(System.in);

        //we create an instance of the ContactManager object called "manager" to hold contacts
        ContactManager manager = new ContactManager();

        //keeping a while loop going until calling an option to break out of it
        while(true){

            //print out your menu/options on what you want to do
            System.out.println("CONTACT BOOK APPLICATION\n");
            System.out.println("Select an Option:");
            System.out.println("1. Add a Contact");
            System.out.println("2. Search for a Contact");
            System.out.println("3. List all Contacts");
            System.out.println("4. Delete a Contact");
            System.out.println("5. Exit the Application");

            //this allows us to scan in an input/selection from above, into the option variable
            int option = scanner.nextInt();

            scanner.nextLine(); //consume a new line

            if(option == 1){
                //send in the scanner object to allow scanning within the function
                //also send in the manager list object to store in a contact
                ContactManagerUtility.addContact(scanner, manager);
            }
            else if(option == 2){
                //send in the scanner object to allow scanning within the function
                //also send in the manager list object to search for a contact
                ContactManagerUtility.searchContact(scanner, manager);
            }
            else if(option == 3){
                //send in the manager list object to check and print if it has contacts
                ContactManagerUtility.listContacts(manager);
            }
            else if(option == 4){
                //send in the scanner object to allow scanning within the function
                //also send in the manager list object to store in a contact
                ContactManagerUtility.deleteContact(scanner, manager);
            }
            else if(option == 5){
                System.out.println("Exiting application.");
                break;
            }
            else{
                System.out.println("Invalid option! Try again with a proper selection.");
            }
        }
    }
}

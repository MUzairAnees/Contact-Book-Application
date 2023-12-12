import java.util.List;
import java.util.Scanner;

public class ContactManagerUtility {

    /*
    * FUNCTION: addContact(scanner object, manager list object)
    * This function will take a scanner object that is initialized in main()
    * and it will take the instance of the ContactManager list object that we
    * name as manager, which was initialized in main().
    *
    * Within this function we ask the user for the name, phoneNumber, email input
    * With this input we make a new Contact object and addContact() to the
    * ContactManager list object.
    */
    public static void addContact(Scanner scanner, ContactManager manager){

        //asking user for inputs
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        //make a new Contact object and add it to the manager list object
        manager.addContact(new Contact(name, phoneNumber, email));

        System.out.println("Contact added successfully.\n");
    }

    /*
    * FUNCTION: searchContact(scanner object, manager list object)
    * This function will take a scanner object that is initialized in main()
    * and it will take the instance of the ContactManager list object that we
    * name as manager, which was initialized in main().
    *
    * Within this function we will ask for a name String input that we will use
    * to search for a contact within the manager list object that was passed in.
    *
    * If found then we print out the contact details. If not found then we print
    * "not found" and main loops back to the menu.
    */
    public static void searchContact(Scanner scanner, ContactManager manager){

        //asking user for input and pass input as parameter for the search
        System.out.print("Enter the Name to Search:");
        String name = scanner.nextLine();
        Contact returnedContact = manager.searchContact(name);

        if(returnedContact != null){
            System.out.println("Contact Found!\n" + returnedContact + "\n");
        }
        else{
            System.out.println("Contact not found.\n");
        }
    }

    /*
    * FUNCTION: listContacts(manager list object)
    * This function will take the instance of the ContactManager list object
    * that holds all the contacts, which we named originally as manager,
    * which was initialized in main().
    *
    * Within this function we will declare and initialize a new List Contact object
    * called contacts. We will then call getAllContacts() on the manager list object
    * and this will return a new copied list of contacts into the "contacts" variable
    * we declared earlier.
    *
    * We will then check if "contacts" isEmpty() or not. If not empty we will proceed
    * to print out all the contacts one by one.
    */
    public static void listContacts(ContactManager manager){

        //returning a new copied list into contacts
        List<Contact> contacts = manager.getAllContacts();

        //check if empty or not
        if(contacts.isEmpty()){
            System.out.println("No contacts are found.");
        }
        //print all the contacts so far
        else{
            System.out.println("All contacts:");
            for(Contact contact: contacts){
                System.out.println(contact);
            }
        }

        System.out.println("\n");
    }

    /*
    * FUNCTION: deleteContact(scanner object, manager list object)
    * This function will take the scanner object that was initialized in main()
    * and it will take the manager list object that was instantiated in
    * main().
    *
    * Within this function you will be asked to give the "name" String input
    * and once you do so, so that it can be passed in to the ContactManager class
    * method called deleteContact() to find any matched contacts and delete them.
    */
    public static void deleteContact(Scanner scanner, ContactManager manager){
        System.out.println("Enter the Name of the contact you want to delete:");
        String name = scanner.nextLine();
        manager.deleteContact(name);
        System.out.println("Any instance of that contact with that name has been deleted.");
    }
}

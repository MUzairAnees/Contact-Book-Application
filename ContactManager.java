//"Optimize imports on the fly" option is selected
//Imports should show as you add the methods for them
//during coding sessions

import java.util.ArrayList;
import java.util.List;

public class ContactManager {       //this class can be accessed by other classes (ex. Main())

    //-----------Privately Accessed Fields------------//
    //DECLARING private field of type List that holds multiple Contact objects and is named "contacts"
    private List<Contact> contacts;

    //------------Constructor------------//
    /*
    * Our recipe for our object calls for a specific type of list called the ArrayList.
    * We will INITIALIZE a List called contacts as a ArrayList specifically.
    */
    public ContactManager(){
        this.contacts = new ArrayList<>();
    }

    //---------------Methods---------------//
    /*
    METHOD: addContact(Contact)
    * We make a method that would allow us to add a Contact obj to the contacts list.
    * Based on the regular methods of the List interface.
    */
    public void addContact(Contact contact){
        contacts.add(contact);
    }

    /*
    METHOD: searchContact(String)
    * We make a method that would take a String name parameter and return a Contact type.
    * This method has a for-each loop that checks the name of each "contact" through the contacts list.
    * In the if-statement, we use the getName() method created in the Contact class to check the name of
    * each contact and compare to what was passed in as a parameter.
    * If it checks out then it returns the Contact contact variable.
    * If it doesn't then it returns null, and we will have something in Main() to handle for that.
    */
    public Contact searchContact(String name){
        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    /*
    METHOD: getAllContacts()
    * We make a method that would return the entire contacts list when requested.
    * We would actually return a newly copied contacts list only because we don't
    * want to alter the original list accidentally.
    */
    public List<Contact> getAllContacts(){
        return new ArrayList<>(contacts);
    }

    /*
    METHOD: deleteContact(String)
    * We make a method that would remove a contact from the contacts list if the String name passed matches
    * The code is written like this :::
    * 1)"contacts" is the list of all the contacts.
    * 2)".removeIf" is a special list method that would iterate through "contacts" and remove an element if some
    * condition is true.
    * 3)"contact" is a temporary variable name, and it is assigned to each contact in the "contacts" list in each
    * iteration that is conducted through the special method ".removeIf()". If put into words, just this specific
    * word would be read as "For each contact..."
    * 5)"contact.getName()" would be retrieving the name of each contact. This would be read as "...check if the
    * name of this contact..."
    * 6)".equalsIgnoreCase(name)" would be checking if the contact matches the name, regardless of the letter casing.
    * This would be read as "...is the same as the name that I am looking for, while ignoring the letter casing."

    * All put together this method is basically read as "For each contact in the list "contacts", check through all
    * and remove if the name of this contact is the same as the name that I had passed in as a parameter, while
    * ignoring the lower and upper letter casing."
    */
    public void deleteContact(String name){
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }
}

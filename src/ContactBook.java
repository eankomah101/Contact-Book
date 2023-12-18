import java.util.ArrayList;

public class ContactBook {
    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String email) {
        contactList.add(new Contact(name, email));
        System.out.println("Contact has been added successfully\n");
    }

    public void updateContact(String name, String newName,String newEmail){
        boolean contactFound = false;

        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                // Contact found, update the email
                contact.setName(newName);
                contact.setEmail(newEmail);
                contactFound = true;
                System.out.println("Contact has been updated successfully\n");
                break; // Exit the loop since the contact has been found and updated
            }

        }

        if (!contactFound) {
            System.out.println("Contact not found. Unable to update\n");
        }


    }
    public void displayContact(){
        System.out.println("Displaying all Contacts");
        System.out.println("***********************");
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + ", " + contact.getEmail());
        }
    }

    public void deleteContact(String name, String email) {
        Contact contactToDelete = new Contact(name, email); // Creating a temporary contact for comparison

        if (contactList.contains(contactToDelete)) {
            contactList.remove(contactToDelete);
            System.out.println("Contact has been deleted successfully\n");
        } else {
            System.out.println("Contact not found. Unable to delete\n");
        }
    }
}

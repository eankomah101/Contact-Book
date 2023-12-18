import java.util.ArrayList;

public class ContactBook {
    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String email) {
        contactList.add(new Contact(name, email));
        System.out.println("Contact has been added successfully\n");
    }

    public void updateContact(String name, String newEmail){
        boolean contactFound = false;

        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                // Contact found, update the email
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
}

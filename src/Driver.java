public class Driver {
    public static void main(String[] args) {
        //Instantiating the class
        ContactBook contactBook = new ContactBook();

        //Using object to call out a method

        //Create contact to the Contact book
        contactBook.addContact("Evans Ankomah","evansankomah@gmail.com");
        contactBook.addContact("Michael Agyemang", "michaelagyemang@yahoo.com");

        //Read or See all contacts in ContactBook
        contactBook.displayContact();

        //Update contact in ContactBook
        contactBook.updateContact("Evans Ankomah", "David","ankomahevans640@gmail.com");
        contactBook.updateContact("Michael Agyemang", "David", "Daniel@gmail.com");


        //Delete contact
        contactBook.deleteContact("Micheal Agyemang","michealagyemang@yahoo.com");




    }
}
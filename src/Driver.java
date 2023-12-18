public class Driver {
    public static void main(String[] args) {
        //Instantiating the class
        ContactBook contactBook = new ContactBook();

        //Using object to call out a method

        //Create contact to the Contact book
        contactBook.addContact("Evans Ankomah","evansankomah@gmail.com");
        contactBook.addContact("Michael Agyemang", "michaelagyemang@yahoo.com");

        //Read or See all contacts in ContactBook

        //Update contact in ContactBook



        //Displaying all contacts in Contact book
        contactBook.displayContact();


    }
}
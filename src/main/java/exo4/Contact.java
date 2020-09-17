package exo4;

public class Contact {

    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
   }

}

class ContactBuilder {

	static Contact JESSIE_JAMES = new Contact(1, "Jessie", "James");

	static Contact JESSIE_KISSINGER = new Contact(2, "Jessie", "Kissinger");

	static Contact AMY_KISSINGER = new Contact(3, "Amy", "Kissinger");

	static Contact AMY_JAMES = new Contact(4, "Amy", "James");

}


import java.util.ArrayList;

public class ContactCollection extends ContactInfomation{

    private ArrayList<ContactInfomation> list;
    public ContactCollection(String name, String email, int phoneNumber) {
        super(name, email);
        this.list = new ArrayList<>();
    }

    public void addContact(ContactInfomation contact) {
        list.add(contact);
    }

    @Override
    public String toString() {
        return "ContactCollection{" +
                "list=" + list +
                '}';
    }

    @Override
    public void display() {
        for (ContactInfomation c : this.list) {
            c.display();
        }
    }

    /* @Override
    public void display() {
        super.display();
        for (int i = 0; i <= list.size(); i++) {

        }
    }*/
}

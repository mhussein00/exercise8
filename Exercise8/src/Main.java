import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {


        ContactInfomation contact1 = new ContactInfomation("baka", "baka@bakamail.com");
        BusinessContact business1 = new BusinessContact("eren", "erenyeager@aot.com", "614-614-614");
        contact1.display();
        business1.display();

        ContactCollection book = new ContactCollection("ContactBook", "testing@gmail.com", 1);
        //book.addContact(contact1);
        //book.addContact(business1);
        book.display();







    }
}
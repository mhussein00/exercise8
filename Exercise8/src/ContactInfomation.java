public class ContactInfomation {
    private String name;
    private String email;

    public ContactInfomation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "ContactInfomation{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public  void display() {
        System.out.println("Their name is: " + name + " Their email is: " + email );
    }
}

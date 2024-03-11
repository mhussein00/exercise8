public class BusinessContact extends ContactInfomation{
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "BusinessContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Their business number is: " + phoneNumber);
    }
}

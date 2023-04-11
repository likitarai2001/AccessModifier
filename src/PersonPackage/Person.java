package PersonPackage;

public class Person {
    public String name;
    private int aadhar_no;
    protected int phone_no;
    String address;
    private String joining_date = "7th Feb, 2023";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(int aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void display() {
        System.out.println("Simform joining date " + this.joining_date);
    }

    protected void info() {
        System.out.println("Protected method");
    }

    void show(){
        System.out.println("Default method");
    }
}

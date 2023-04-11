package Mainpackage;

import PersonPackage.Person;

public class Main {
    public static void main (String args[]) {
        Person p1 = new Person();
        p1.name = "Likita";
        p1.setAadhar_no(123456);
        p1.setAddress("A4, Vasundhara Society, Ahmedabad, Gujarat");
        p1.setPhone_no(999567894);

        System.out.println("Details");
        System.out.println("Name: " + p1.getName());
        System.out.println("Aadhaar No.: " + p1.getAadhar_no());
        System.out.println("Address: " + p1.getAddress());
        System.out.println("Phone No.: " + p1.getPhone_no());

//        p1.display(); //error: private method accessible only in same class
//        p1.info();    //error: accessible within same package or subclass of different package
//        p1.show();    //error: default method can be accessed only in same package
    }
}

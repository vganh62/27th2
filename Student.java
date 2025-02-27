package Assigment15;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float gpa;
    String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
        System.out.println("Enter major: ");
        major = sc.nextLine();
    }

    public void updatePerson() {
        super.updatePerson(id);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
        System.out.println("Enter major: ");
        major = sc.nextLine();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}

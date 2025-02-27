package Assigment15;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    String department;
    String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department: ");
        department = sc.nextLine();
        System.out.println("Enter teaching subject: ");
        teachingSubject = sc.nextLine();
    }

    public void updatePerson() {
        super.updatePerson(id);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department: ");
        department = sc.nextLine();
        System.out.println("Enter teaching subject: ");
        teachingSubject = sc.nextLine();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA: " + department);
        System.out.println("Major: " + teachingSubject);
    }
}

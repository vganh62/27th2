package Assigment15;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    String id;
    String fullName;
    Date dateOfBirth;
    Date bookBorrowDate;
    Date bookReturnDate;

    public Person() {

    }

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public void addPerson() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter person ID: ");
            id = sc.nextLine();
            System.out.println("Enter fullname: ");
            fullName = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("Enter date of birth (dd/MM/YYYY):");
            String dateOfBirthString = sc.nextLine();
            dateOfBirth = sdf.parse(dateOfBirthString);
            System.out.print("Enter book borrow date (dd/MM/YYYY):");
            String bookBorrowDateString = sc.nextLine();
            bookBorrowDate = sdf.parse(bookBorrowDateString);
            System.out.print("Enter book return date (dd/MM/YYYY):");
            String bookReturnDateString = sc.nextLine();
            bookReturnDate = sdf.parse(bookReturnDateString);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public void updatePerson(String id) {
        if (this.id.equals(id)) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter person ID: ");
                id = sc.nextLine();
                System.out.println("Enter fullname: ");
                fullName = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
                System.out.print("Enter date of birth (dd/MM/YYYY):");
                String dateOfBirthString = sc.nextLine();
                dateOfBirth = sdf.parse(dateOfBirthString);
                System.out.print("Enter book borrow date (dd/MM/YYYY):");
                String bookBorrowDateString = sc.nextLine();
                bookBorrowDate = sdf.parse(bookBorrowDateString);
                System.out.print("Enter book return date (dd/MM/YYYY):");
                String bookReturnDateString = sc.nextLine();
                bookReturnDate = sdf.parse(bookReturnDateString);
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId() + ", Fullname: " + getFullName() + ", Date of birth: " + sdf.format(dateOfBirth) + ", bookBorrowDate: " + sdf.format(bookBorrowDate) + ", bookReturnDate: " + sdf.format(bookReturnDate));
    }

//    public Boolean isBookOverdue() {
//        
//    }
}

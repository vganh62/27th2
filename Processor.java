package Assigment15;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();
        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add new person"
                    + "\n2. Update person"
                    + "\n3. Delete person by ID"
                    + "\n4. Find person by ID"
                    + "\n5. Display everyone"
                    + "\nChoose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
    }
}

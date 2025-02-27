package Assigment15;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> PersonList = new ArrayList<>();

    public void addPerson(Person person) {
        person.addPerson();
        PersonList.add(person);
        System.out.println("Added");
    }

    public void updatePerson(String id) {
        for (Person person : PersonList) {
            if (person.id.equals(id)) {
                person.updatePerson(id);
            }
            return;
        }
        System.out.println("Not found ID: " + id);
    }

    public void deletePersonById(String id) {
        for (Person object : PersonList) {
            if (id.equals(object.id)) {
                PersonList.remove(id);
                System.out.println("Delete ID: " + id);
            } else {
                System.out.println("Not found ID: " + id);
            }
        }
    }

    public Person findPersonById(String id) {
        for (Person person : PersonList) {
            if (person.id.equals(id)) {
                return person;
            }
        }
    }

    public void displayEveryone() {
        if (PersonList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Person person : PersonList) {
                person.displayInfo();
            }
        }
    }
//    public Student findTopStudent(){
//        
//    }

    public Teacher findTeacherByDeparment(String deparment) {
        for (Person teacher : PersonList) {
            if (teacher.department.equals(deparment)) {
                return teacher;
            }
        }
    }
//    public void checkBookBorrowing(){
//        
//    }
}

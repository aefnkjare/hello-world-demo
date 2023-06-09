package com.personExercise2;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private boolean ownsHouse;
    private int age;

    Person(String firstName, String lastName, boolean ownsHouse, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ownsHouse = ownsHouse;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isOwnsHouse() {
        return ownsHouse;
    }

    public void setOwnsHouse(boolean ownsHouse) {
        this.ownsHouse = ownsHouse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person pe){
        int last = this.lastName.compareTo(pe.lastName);
        return last == 0 ? this.firstName.compareTo(pe.firstName) : last; // ternary statement
    }

}

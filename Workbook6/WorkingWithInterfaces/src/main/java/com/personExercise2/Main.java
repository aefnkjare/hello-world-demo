package com.personExercise2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> pe = new ArrayList<>();
        pe.add(new Person("Isaiah", "Vang", false, 21));
        pe.add(new Person("Seolah", "Byun", false, 20));
        pe.add(new Person("Kaya", "Fisher", false, 18));
        pe.add(new Person("Braynel", "Liz", true, 29));

        Collections.sort(pe);
        for (Person str : pe) {
            System.out.println(str.getFirstName() + " " + str.getLastName() + " " + "House owner: " + str.isOwnsHouse() + " " + "Age: " + str.getAge());
        }
    }
}

//        Person person1 = new Person("Isaiah", "Vang", false, 21);
//        Person person2 = new Person("Seolah", "Byun", false, 20);
//        Person person3 = new Person("Kaya", "Fisher", false, 18);
//        Person person4 = new Person("Braynel", "Liz", true, 29);
//
//        System.out.println();
//    }
//}

package com.xworkz.prog;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDetails personDetails = new PersonDetails("person_details.txt");

        personDetails.openFile();
    }
}

package com.maria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMaria {
    String Maria61677_Firstname;
    String Maria61677_lastname;
    String Maria61677_street;
    String Maria61677_zipcode;
    String Maria61677_city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input your lastname");
        Maria61677_lastname = br.readLine();
        System.out.println("Input your name");
        Maria61677_Firstname = br.readLine();
        System.out.println("Input your street");
        Maria61677_street = br.readLine();
        System.out.println("Input your zipcode");
        Maria61677_zipcode = br.readLine();
        System.out.println("Input your city");
        Maria61677_city = br.readLine();


    }

    public void Maria1_61677() {
        System.out.println("Display the data");
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Lastname :" + Maria61677_lastname);
        System.out.println("Name :" + Maria61677_Firstname);
        System.out.println("Street :" + Maria61677_street);
        System.out.println("Zipcode :" + Maria61677_zipcode);
        System.out.println("City :" + Maria61677_city);

    }
}
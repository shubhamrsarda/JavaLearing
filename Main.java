package com.company;

import static com.company.FuleCalculator.calculateNumber;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
	// write your code here
//    Theater theater = new Theater("H2M",5,5);
//    theater.getSeats();
//    theater.reserveSeat("E05");

         Theater theater = new Theater("H2M",5,5);
        System.out.println(Theater.a);
        Theater theater2 = new Theater("H2M",5,5);
        System.out.println(Theater.a);
        Theater theater3 = new Theater("H2M",5,5);
        System.out.println(Theater.a);
        Theater theater4 = new Theater("H2M",5,5);
        System.out.println(Theater.a);

        calculateNumber(5);
        System.out.println(FuleCalculator.calculateNumber(5));

        FuleCalculator f = new FuleCalculator();

        f.logMessage("Hello");
        f.logMessage("Hello2");
        f.logMessage("Hello3");
        f.logMessage("Hello4");



        File file = new File("C:\\MyProjects\\Java-Learnig\\src\\com\\company\\text.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}

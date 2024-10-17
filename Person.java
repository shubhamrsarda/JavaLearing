package Streams;

import java.util.Locale;

public class Person {

    private  int age;

    private String name;

    private String country;

    public Person(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public  int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName().toUpperCase()+" " + this.getCountry() + " "+ this.getAge();
    }



    public String getName() {
        return name;
    }



    public String getCountry() {
        return country;
    }


}

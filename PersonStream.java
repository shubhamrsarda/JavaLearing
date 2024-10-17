package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class PersonStream {

    public static void main(String[] args) {
        List<Person> PERSONS = ExampleData.getPrrsonList();

//        averageAge(PERSONS);     // average age of all the persons
//
//        ageCondition(PERSONS);  // age greater than 20 or conrains a in name
//
          sorted(PERSONS);
//
//        countByCountry(PERSONS);
//
//        averageByCountry(PERSONS);

       // sortedByAge(PERSONS);


    }



    public static void averageAge(List<Person> PERSONS){

        Double average = PERSONS.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Average Age of all persons : "+average);
    }

    public static void ageCondition(List<Person> PERSONS){

    List<Person> personList =  PERSONS.stream().filter(person -> person.getAge() > 20 && person.getName().toUpperCase().contains("ER"))
             .collect(Collectors.toList());

        System.out.println("Age > 20 and contains ER : "+personList);
    }

    public static void sorted(List<Person> PERSONS){

        List<Person> personList = PERSONS.stream().sorted(

                Comparator.comparing(Person::getAge).reversed()
                .thenComparing(Person::getName,Comparator.reverseOrder())

        )
                .skip(2).collect(Collectors.toList());

        System.out.println(personList);
        System.out.println("Sorted top 3 : "+personList.get(0));

    }

    public static void countByCountry(List<Person> PERSONS){
        Map<String,Long> map = PERSONS.stream()
                .collect(
                        Collectors.groupingBy(Person::getCountry,Collectors.counting())
                );

        System.out.println("Map by Country : "+map);

    }

    public static void averageByCountry(List<Person> PERSONS){

        Map<String,Double> map = PERSONS.stream()
                .collect(
                        Collectors.groupingBy(Person::getCountry,Collectors.averagingDouble(Person::getAge))
                );

        System.out.println("Average Age by Country : " +map );

    }



}

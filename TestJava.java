package code;

import DesignPatterns.interfaces.Function;

import java.util.*;
import java.util.logging.FileHandler;
import java.util.stream.Collectors;

public class TestJava {

    public static void main(String[] args) {


        List<Integer> integerArrayList = Arrays.asList(1,23,45,6,7,9,7,90);

                 List<Integer> sorted =   integerArrayList.stream()
                            .sorted()
                         .distinct()
                            .collect(Collectors.toList());

        System.out.println("DIstinct  List : " + sorted);


        List<Employee> employeeList = Arrays.asList(

                new Employee(1,"shubham","India", 20000),
                new Employee(1,"shubham","India", 20000),

        new Employee(1,"shubham","India", 20000),

        new Employee(1,"Akash","India", 20000)

        );


       List<Employee> employees = employeeList.stream()
                .distinct().collect(Collectors.toList());



        System.out.println(employees);


        Employee e1 = new Employee(1,"Akash","India", 20000);


        MyInterface myInterface = new Employee(1,"Akash","India", 20000);


//        HashSet set  = new HashSet();
//
//        set.addAll(employeeList);
//
//        set.forEach(System.out::println);
//        System.out.println();



    }


}



package code;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
           List<Employee> Employee_LIST = Arrays.asList(
                new Employee(1,"jhon", "USA",2000),
                new Employee(2,"Sam", "ITALY",30030),
                new Employee(3,"jamie", "ENGLAND",676768),
                new Employee(4,"Robert", "ITALY",8989),
                new Employee(5,"james", "IRELAND",878),
                new Employee(6,"peter", "USA",9090),
                new Employee(7,"jessica", "NORWAY",7674),
                new Employee(8,"Roger", "NETHERLAND",303230),
                new Employee(9,"jim", "USA",6776)
        );

           TestJava.main(args);

         //  Employee_LIST.forEach(e -> System.out.println(e));

         List<Employee> sortedBySalary =  Employee_LIST.stream()
                   .sorted(Comparator.comparing(Employee::getSalary).reversed())
                 .limit(3)
                   .collect(Collectors.toList());

        System.out.println("Employee Sorted by Salary");
        System.out.println(sortedBySalary);


         List<String > names =   Employee_LIST.stream()
                    .sorted(Comparator.comparing(Employee::getName).reversed())
                 .map(Employee::getName).collect(Collectors.toList());

        System.out.println("Employee Names in sorted" + names);

       Map<String,Long> empByCountry = Employee_LIST.stream()
                .collect(Collectors.groupingBy(Employee::getCountry,Collectors.counting()));

        System.out.println("Employee Count By Country" );

        System.out.println(empByCountry);

      Double avgUsaSal =  Employee_LIST.stream()
                .filter(e-> e.getCountry().equalsIgnoreCase("USA"))
                .mapToInt(Employee::getSalary).average().getAsDouble();

        System.out.println("Average Usa Salary :" +avgUsaSal);


       List<String> empNames = Employee_LIST.stream()
                .collect(ArrayList::new,(list, employee) -> list.add(employee.getName()),ArrayList::addAll);

        System.out.println("Employee Names in new List : " +empNames);


        List<String> empNames2 = Employee_LIST.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());


        System.out.println("Employee Names List using Map  : " +empNames);

        List<Integer> integerList = Arrays.asList(1,2,34,5,6,7,6,6,66,5,43,44,44,1);

        HashSet<Integer> uniqueElements =integerList.stream()
                .collect(LinkedHashSet::new, LinkedHashSet::add,LinkedHashSet::addAll);

        System.out.println("Unique Elements in List in same insertion order: " + uniqueElements);


    }

}

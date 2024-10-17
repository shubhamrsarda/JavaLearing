package Streams;

import StreamsAndLambda.Category;
import StreamsAndLambda.Products;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExampleData {

    private static final List<Products> PRODUCTS_LIST = Arrays.asList(

            new Products("Chips", new BigDecimal(10), Category.FOOD),
            new Products("Cloth", new BigDecimal(3), Category.CLEANING),
            new Products("Burger", new BigDecimal(1), Category.FOOD),
            new Products("Pan", new BigDecimal(37), Category.UTENCILS),
            new Products("Choclate", new BigDecimal(19), Category.FOOD),
            new Products("Pen", new BigDecimal(377), Category.OFFICE),
            new Products("Penuts", new BigDecimal(177), Category.FOOD),
            new Products("Cooker", new BigDecimal(90), Category.UTENCILS)

    );

    private static final List<Person> PERSON_LIST = Arrays.asList(

            new Person(20,"jhon", "USA"),
            new Person(35,"Sam", "ITALY"),
            new Person(15,"jamie", "ENGLAND"),
            new Person(30,"Robert", "ITALY"),
            new Person(20,"james", "IRELAND"),
            new Person(25,"peter", "USA"),
            new Person(5,"jessica", "NORWAY"),
            new Person(40,"Roger", "NETHERLAND"),
            new Person(50,"jim", "USA")



    );

    public static List<Person> getPrrsonList(){
        return PERSON_LIST;
    }


    public static List<Products> getProductsList(){
        return PRODUCTS_LIST;
    }

    public String getStr() {
        return str;
    }

    String str = "Facebook";
    private void myValue(String str2){
        System.out.println(str2);
    }


}

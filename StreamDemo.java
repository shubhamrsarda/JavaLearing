package Streams;

import StreamsAndLambda.Category;
import StreamsAndLambda.Products;


import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

    List<Products> Product_List = ExampleData.getProductsList();



        BigDecimal opt = Product_List.stream()
                .map(Products::getPrice)
                .reduce(BigDecimal.ZERO,BigDecimal::add);



        System.out.println("Total of All price :"+opt);

        List<String> produtNames = Product_List.stream()  // immutable reduction with reduce
                .reduce(new ArrayList<>(),
                        (list,product)->{
                    ArrayList<String> newList = new ArrayList<>(); //Accumulator
                    newList.add(product.getName());
                    return newList;
                        },
                        (list1,list2)-> {
                            ArrayList<String> newList = new ArrayList<>(list1); //Combiner
                            newList.addAll(list2);
                            return newList;
                        });
        System.out.println("Product Names reduce method");
        System.out.println(produtNames);

        List<String> productnames2 = Product_List.stream()  // mutable reduction woith collect
                .collect(ArrayList::new,
                        (list,product)-> list.add(product.getName()),
                        ArrayList::addAll);

        System.out.println("Product Names Collect method");
        System.out.println(productnames2);



    Product_List.stream()
            .filter(p->p.getCategory() == Category.FOOD)  //intermediate Operation
            .map(Products::toString)        //intermediate Operation
            .forEach(System.out::println); // Termination Operation


        Product_List.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());

        System.out.println("new Stream List");
        Stream<Products> strem_product = Product_List.stream()
                .map(products -> {
                    System.out.println(products);
                    return products;
                });

        strem_product.forEach(products -> {});

        System.out.println("10 UUID's Random");  // factory Methods to create Streams
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
        uuids.limit(10).forEach(System.out::println);


        Stream<BigInteger> powerOfTwo = Stream.iterate(BigInteger.ONE, n -> n.multiply(BigInteger.TWO));
        powerOfTwo.limit(10).forEach(System.out::println);


       // BigInteger added = powerOfTwo.limit(10).reduce(BigInteger.ZERO,BigInteger::add);
        //System.out.println("Added powers pf 2" + added);

        System.out.println("Alphabets...");

        Stream<Character> alphabet = Stream.iterate('A',letter->letter <= 'Z',letter -> (char) (letter+1));
        alphabet.forEach(alp -> System.out.print(" " +alp.charValue()));

        Product_List.stream()
                .filter(products -> products.getCategory() == Category.OFFICE)
                        .map(Products::getName)
                        .forEach(System.out::println);

     Long i = Product_List.stream()
                .filter(p-> p.getCategory() == Category.FOOD)
                .map(Products::getName)
                .count();

        System.out.println(i);





    }

}

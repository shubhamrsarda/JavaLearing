package com.company;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class New {

    public static void main(String[] args) {

        // non repeated caracter in string


        String str = "avncdbacn";

        Map<String,List<String>> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy( s -> s));


        Map<String,Long> map1 = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        System.out.println(map1);

       List<String> uniqueElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uniqueElements);
        List<Integer> numArr = Arrays.asList(1,23,5,6,4,0,null,34,7);


      List<  Optional<Integer> > optionalInteger =numArr.stream().map(Optional::ofNullable)
              .collect(Collectors.toList())
              .stream().filter(Optional::isPresent)
              .collect(Collectors.toList());


        System.out.println(optionalInteger);



      optionalInteger.forEach(
              System.out::println
      );

        int[] numbers = {1,44 ,165,7 , 434, 8};

        Integer secondHignNum  = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHignNum);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,2,3,4,5,5,6,7,7));

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);

        String[] strArr = {"java" ,"MicroServices", "Spring", "ORM"};

        String longestString =  Arrays.stream(strArr)
                .reduce( (w1,w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();

        System.out.println("Longest String : " +longestString);


        IntStream intStream = IntStream.rangeClosed(1, 10);

        intStream.skip(1).limit(8).forEach(System.out::print);


        System.out.println("-----------------------");

        List<String> list3 = Arrays.stream(numbers).boxed()
                .map( n -> n +"")
                .filter(n -> n.startsWith("1") )
                .collect(Collectors.toList());

        System.out.println(list3);


        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer sum = numList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println(sum);


        Stream.iterate(1, n -> n+ 2)
                .limit(5)
                .collect(Collectors.toList());

        List<Integer> bigList = Arrays.asList(2,55,32,7,5,8,8,9,0,2,23,4,8);

//        bigList.stream()
//                .collect(Comparator.reverseOrder())
//
//        Integer i = bigList.stream()
//                .collect(Comparator.reverseOrder())
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .orElse(null);

    }

}

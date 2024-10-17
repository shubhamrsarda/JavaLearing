package code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Human implements Audiable{

    private Gender gender;

    public Human(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public  boolean  isAnagram(String str1, String str2){


        Map<String,Long> mapOfStr1 = Arrays.asList(str1.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String,Long> mapOfStr2 = Arrays.asList(str2.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        if(mapOfStr1.entrySet().containsAll(mapOfStr2.entrySet())){

            return true;
        }

        return false;



//        if(str1.length() == str2.length()){
//
//            str1.toCharArray();
//
//            for( Character c : str1.toCharArray()){
//
//                for (Character c2 : str2.toCharArray()){
//                    if(c == c2){
//                        break;
//                    }
//                }
//
//            }
//        }


    }


    @Override
    public void speak() {

        System.out.println("Human is Speaking...");

    }
}

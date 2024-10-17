package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FuleCalculator {

     static final int NEW_NUM = 10;

     public static int integerb = 6;

     public static int calculateNumber(int num){
         return  NEW_NUM+1;

     }

     private List<Entity> list = new ArrayList<>();

     public void logMessage(String msg){
         list.add(new Entity(LocalDateTime.now(),msg));
         list.stream().forEach(s -> System.out.print(s.getMessage() + " "));
     }


     private static class Entity{

         private LocalDateTime ldt;
         private String message;

         private Entity(LocalDateTime ldt,String msg){
             this.ldt = ldt;
             this.message = msg;
         }

         public LocalDateTime getLdt() {
             return ldt;
         }

         public String getMessage() {
             return message;
         }
     }
}

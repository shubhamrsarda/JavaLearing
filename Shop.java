package StreamsAndLambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Shop {

    interface ProductFilter {
        boolean accept(Products p);
    }

    static public void printProducts(List<Products> products, ProductFilter filter){
        for(Products p : products){
            if(filter.accept(p)){
                System.out.println(p);
            }
        }
    }

    static boolean isExpencive(Products pr){
        return pr.getPrice().compareTo(new BigDecimal(10)) >= 0;
    }
    public static void main(String[] args) {
        List<Products> PRODUCTS = Arrays.asList(

                new Products("A", new BigDecimal(10), Category.FOOD),
                new Products("B", new BigDecimal(3), Category.CLEANING),
                new Products("C", new BigDecimal(1), Category.FOOD),
                new Products("D", new BigDecimal(37), Category.UTENCILS),
                new Products("E", new BigDecimal(19), Category.FOOD),
                new Products("F", new BigDecimal(377), Category.OFFICE),
                new Products("G", new BigDecimal(177), Category.FOOD),
                new Products("H", new BigDecimal(90), Category.UTENCILS)

        );

        // all 6 lines as plumming code
        // we implemented Anonymous Class

//        PRODUCTS.sort(new Comparator<Products>() {
//                          @Override
//                          public int compare(Products o1, Products o2) {
//                              return o1.getPrice().compareTo(o2.getPrice());
//                          }
//                      }
//
//        );

        // Lambda Expression
        //      PRODUCTS.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        //PRODUCTS.sort(Comparator.comparing(Products::getPrice));

        ProductFilter filter = p -> p.getPrice().compareTo(new BigDecimal(50)) < 0;
        System.out.println(filter);

        printProducts(PRODUCTS,filter);

        ProductFilter filter1 = p -> p.getPrice().compareTo(new BigDecimal(5)) >0 ;

        List<Products> cheapProducts = new ArrayList<>();
        Integer COUNT=0;
        PRODUCTS.forEach(products -> {
            if(filter.accept(products)){
                cheapProducts.add(products);

            }
        });

        System.out.println(cheapProducts);

        System.out.println("Expensive than 100");

        PRODUCTS.removeIf(Shop::isExpencive);

        PRODUCTS.forEach(System.out::println);



    }
}

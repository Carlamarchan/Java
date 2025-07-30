package com.ironhack.mascotas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class ejerciciosStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .toList();
        System.out.println(twoEvenSquares);

        ArrayList<String> transactions= new ArrayList<>();
        transactions.add("GROSERY");
        transactions.add("MEAT");
        transactions.add("GROSERY");
        transactions.add("FRUIT");

        Predicate<String> predicateTransactions= t->(t.equalsIgnoreCase("GROSERY"));
        Function<String, Integer> functionTransactions= String::length;
        System.out.println(
                transactions.stream()
                        //.filter(predicateTransactions)
                        .map(functionTransactions)
                        .reduce(Integer::sum));

                //.findAny()
               // .ifPresent(System.out::println);
    }

}

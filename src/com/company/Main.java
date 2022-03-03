package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
        }

        for (Integer number:numbers) {
            if(number%2==0){
                evens.add(number);
            }else{
                odds.add(number);
            }
        }
        System.out.print("Odd numbers arrayList: "+odds);
        System.out.println();
        System.out.print("Even numbers arrayList: "+evens);



    }
}

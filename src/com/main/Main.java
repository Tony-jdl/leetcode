package com.main;

import com.ex.functional.Functional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeri = Arrays.asList(5, 2, 8, 3, 1, 9, 4, 6, 7, 10);
        print(Functional.pari(numeri));
    }

    public static void print(Object... valori) {
        for (Object valore : valori) {
            System.out.println(valore);
        }
    }

}

package com.ex.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional {
    public static List<Integer> pari(List<Integer> numeri){
        List<Integer> numeriPari = numeri.stream()
                .filter(n -> n%2 == 0)
                .sorted()
                .collect(Collectors.toList());
        return numeriPari;
    }

    public static List<String> parole(List<String> parole){
//        List<String> paroleOrdinate = parole.stream().sorted((p1, p2) -> );
        return parole;
    }
}

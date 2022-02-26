package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(fibonacci(200));
    }

    public static BigInteger fibonacci(int num) {
        List<BigInteger> list = new ArrayList<>();
        list.add(BigInteger.valueOf(0));
        list.add(BigInteger.valueOf(1));
        while (list.size() != num) {
            BigInteger n1 = list.get(list.size() - 1);
            BigInteger n2 = list.get(list.size() - 2);
            list.add(list.size(), n1.add(n2));
        }
        return list.get(list.size() - 1);
    }
}